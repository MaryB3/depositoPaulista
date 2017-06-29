/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MaryBeds
 */
public class CadastroProdutoViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField valorTxt;
    @FXML private TextField nomeTxt;
    @FXML private ComboBox tipoComboBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        List<String> tipos= new ArrayList<>();
        tipos.add("Kg");
        tipos.add("g");
        tipos.add("Lt");
        tipos.add("Bdj");
        tipos.add("Pct");
        tipos.add("Cd");
        tipos.add("Balde");
        ObservableList<String> obsTipos = FXCollections.observableArrayList(tipos);
        tipoComboBox.setItems(obsTipos);
    }

    @FXML
    public void btnSalvarPressed() throws IOException {
        
    }
    
    @FXML
    public void btnExcluirPressed() throws IOException {
        
    }
    
}
