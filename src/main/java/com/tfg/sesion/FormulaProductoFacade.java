/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.sesion;

import com.tfg.modelos.FormulaProducto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Willian
 */
@Stateless
public class FormulaProductoFacade extends AbstractFacade<FormulaProducto> implements FormulaProductoFacadeLocal {
    @PersistenceContext(unitName = "com.lugar_TESIS_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormulaProductoFacade() {
        super(FormulaProducto.class);
    }
    @Override
    public FormulaProducto findFormulaByProducto(int idProduct){
        Query q = em.createQuery("select f from FormulaProducto f where f.idProducto=?1");
        return (FormulaProducto)q.setParameter(1, idProduct).getSingleResult();
    }
    
}
