/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.sesion;

import com.tfg.modelos.FormulaProducto;
import com.tfg.modelos.Produccion;
import com.tfg.modelos.ProduccionMateria;
import com.tfg.modelos.Producto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willian
 */
@Stateless
public class ProduccionesFacade extends AbstractFacade<Produccion> implements ProduccionesFacadeLocal {
    @PersistenceContext(unitName = "com.lugar_TESIS_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduccionesFacade() {
        super(Produccion.class);
    }
    @Override
    public Produccion guardarProduccion(int idProducto, int cantidad,Date horaInicio){
        List<FormulaProducto> listaFormulaProductos = em.createQuery("select fm from FormulaProducto fm where fm.idProducto.idProducto=?1").setParameter(1, idProducto).getResultList();
        ProduccionMateria produccionMateria;
        List<ProduccionMateria> listaMaterias=new ArrayList<>();
        Produccion produccion = new Produccion();
        for(FormulaProducto formulaProducto:listaFormulaProductos){
            produccionMateria = new ProduccionMateria();
            produccionMateria.setMateria(formulaProducto.getIdMateria());
            produccionMateria.setCantidad(formulaProducto.getCantidad().multiply(new BigDecimal(cantidad)));
            produccionMateria.setIdProduccion(produccion);
            listaMaterias.add(produccionMateria);
        }
       
        produccion.setIdProduccion(0);
        produccion.setProducto(new Producto(idProducto));
        produccion.setHoraInicio(horaInicio);
        produccion.setHoraFin(new Date());
        produccion.setFecha(new Date());
        produccion.setProduccionesMateriasList(listaMaterias);
        produccion.setCantidad(cantidad);
        em.persist(produccion);
        em.flush();
        System.out.println("guardado");
        produccion.setProducto(em.find(Producto.class, idProducto));
        return produccion;
    }
    
}
