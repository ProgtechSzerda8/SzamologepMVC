/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.szamologepmvc.model.dao;

import java.util.List;

/**
 *
 * @author Roland
 */
public interface SzamitasDAO {
    
    public void saveSzamitas(Szamitas sz);
    
    public List<Szamitas> readSzamitas(String operator); 
    
}
