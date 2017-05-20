/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.szamologepmvc.model;

import com.mycompany.szamologepmvc.model.dao.Szamitas;
import com.mycompany.szamologepmvc.model.dao.SzamitasDAO;
import com.mycompany.szamologepmvc.model.dao.SzamitasDAOFactory;

/**
 *
 * @author Roland
 */
public class SzamologepModel {

    private SzamitasDAO szd;

    public SzamologepModel() {

        szd = SzamitasDAOFactory.getInstance().createSzamitasDAO();

    }

    public String binarisOsszeadas(String szam1, String szam2) {

        Szamitas sz = new Szamitas(szam1, szam2, "+");

        szd.saveSzamitas(sz);

        return Integer.toBinaryString(Integer.parseInt(szam1, 2) + Integer.parseInt(szam2, 2));
    }

    public String binarisKivonas(String szam1, String szam2) {

        Szamitas sz = new Szamitas(szam1, szam2, "-");

        szd.saveSzamitas(sz);

        return Integer.toBinaryString(Integer.parseInt(szam1, 2) - Integer.parseInt(szam2, 2));
    }

    public String binarisSzorzas(String szam1, String szam2) {

        Szamitas sz = new Szamitas(szam1, szam2, "*");

        szd.saveSzamitas(sz);

        return Integer.toBinaryString(Integer.parseInt(szam1, 2) * Integer.parseInt(szam2, 2));
    }

    public String binarisOsztas(String szam1, String szam2) {

        Szamitas sz = new Szamitas(szam1, szam2, "/");

        szd.saveSzamitas(sz);

        return Integer.toBinaryString(Integer.parseInt(szam1, 2) / Integer.parseInt(szam2, 2));
    }

}
