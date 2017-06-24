/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void btnSalvarPressed() throws IOException {
        
    }
    
    @FXML
    public void btnExcluirPressed() throws IOException {
        
    }
    
}
