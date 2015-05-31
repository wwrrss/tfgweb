/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.sesion;

import com.tfg.modelos.ProduccionMateria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Willian
 */
@Local
public interface ProduccionesMateriasFacadeLocal {

    void create(ProduccionMateria produccionesMaterias);

    void edit(ProduccionMateria produccionesMaterias);

    void remove(ProduccionMateria produccionesMaterias);

    ProduccionMateria find(Object id);

    List<ProduccionMateria> findAll();

    List<ProduccionMateria> findRange(int[] range);

    int count();
    
}
