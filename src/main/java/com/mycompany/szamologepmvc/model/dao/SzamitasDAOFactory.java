/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.szamologepmvc.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Roland
 */
public class SzamitasDAOFactory implements AutoCloseable {
    
    private static EntityManagerFactory emf;
    
    private static EntityManager em;
    
    private static SzamitasDAOFactory instance;

    private SzamitasDAOFactory() {
    }
    
    public static SzamitasDAOFactory getInstance() {
        
        if (instance==null) {
            instance = new SzamitasDAOFactory();            
        }
        
        if (emf==null) {
            emf = Persistence.createEntityManagerFactory("db");
        }
        
        if (em==null) {
            em = emf.createEntityManager();
        }
        
        return instance;
        
    }
    
    public SzamitasDAO createSzamitasDAO() {
        
        return new SzamitasDAOImpl(em);
        
    }

    @Override
    public void close() throws Exception {
    
        em.close();
        emf.close();
    
    }
    
    
    
    
    
}
