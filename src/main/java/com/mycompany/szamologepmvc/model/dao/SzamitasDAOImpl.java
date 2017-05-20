/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.szamologepmvc.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Roland
 */
public class SzamitasDAOImpl  implements SzamitasDAO {
    
    private EntityManager em;

    SzamitasDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    

    @Override
    public void saveSzamitas(Szamitas sz) {
        
    em.getTransaction().begin();
    em.persist(sz);
    em.getTransaction().commit();
    
    }

    @Override
    public List<Szamitas> readSzamitas(String operator) {
        
    TypedQuery<Szamitas> query = em.createQuery("SELECT sz FROM Szamitas sz WHERE sz.operator'" + operator + "'", Szamitas.class);

        return query.getResultList();

     
    }
    
}
