/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.szamologepmvc.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "szamitas")
public class Szamitas {
    
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="szekgen") 
    @SequenceGenerator(name="szekgen", sequenceName = "szekvencia", allocationSize=1)
    private int id;
    
    @Column(name = "operandus1")
    private String operandus1;
    
    @Column(name = "operandus2")
    private String operandus2;
    
    @Column(name = "operator")
    private String operator;

    public Szamitas(String operandus1, String operandus2, String operator) {
        this.operandus1 = operandus1;
        this.operandus2 = operandus2;
        this.operator = operator;
    }
    
    public Szamitas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperandus1() {
        return operandus1;
    }

    public void setOperandus1(String operandus1) {
        this.operandus1 = operandus1;
    }

    public String getOperandus2() {
        return operandus2;
    }

    public void setOperandus2(String operandus2) {
        this.operandus2 = operandus2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    
    
}
