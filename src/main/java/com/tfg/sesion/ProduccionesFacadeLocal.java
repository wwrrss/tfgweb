/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.sesion;

import com.tfg.modelos.Produccion;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Willian
 */
@Local
public interface ProduccionesFacadeLocal {

    void create(Produccion producciones);

    void edit(Produccion producciones);

    void remove(Produccion producciones);

    Produccion find(Object id);

    List<Produccion> findAll();

    List<Produccion> findRange(int[] range);

    int count();

    public Produccion guardarProduccion(int idProducto, int cantidad, Date horaInicio);
    
}
