package com.mycompany.szamologepmvc.controller;

import com.mycompany.szamologepmvc.model.SzamologepModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Label eredmeny;

    @FXML
    private TextField szam1;

    @FXML
    private TextField szam2;
    
    private SzamologepModel model;

    @FXML
    private void osszeadAction(ActionEvent event) {
        eredmeny.setText(model.binarisOsszeadas(szam1.getText(), szam2.getText()));
    }

    @FXML
    private void kivonAction(ActionEvent event) {
        eredmeny.setText(model.binarisKivonas(szam1.getText(), szam2.getText()));
    }

    @FXML
    private void szorozAction(ActionEvent event) {
        eredmeny.setText(model.binarisSzorzas(szam1.getText(), szam2.getText()));
    }

    @FXML
    private void osztAction(ActionEvent event) {
        eredmeny.setText(model.binarisOsztas(szam1.getText(), szam2.getText()));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new SzamologepModel();
    }
}
