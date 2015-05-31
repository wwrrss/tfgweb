/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.sesion;

import com.tfg.modelos.ProduccionMateria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Willian
 */
@Stateless
public class ProduccionesMateriasFacade extends AbstractFacade<ProduccionMateria> implements ProduccionesMateriasFacadeLocal {
    @PersistenceContext(unitName = "com.lugar_TESIS_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduccionesMateriasFacade() {
        super(ProduccionMateria.class);
    }
    
}
