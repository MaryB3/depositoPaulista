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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import util.MaskTextField;

/**
 * FXML Controller class
 *
 * @author MaryBeds
 */
public class PedidoViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private ComboBox comboBoxCliente;
    @FXML private ComboBox comboBoxProduto;
    @FXML private TextField dataTxt;
    @FXML private MaskTextField qtdTxt;
    @FXML private ComboBox comboBoxTipo;
    @FXML private TableView produtosTableView;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        maskTxtField(dataTxt);
        qtdTxt.setMask("N!");
        
        List<String> tipos= new ArrayList<>();
        tipos.add("Kg");
        tipos.add("g");
        tipos.add("Lt");
        tipos.add("Bdj");
        tipos.add("Pct");
        tipos.add("Cd");
        tipos.add("Balde");
        ObservableList<String> obsTipos = FXCollections.observableArrayList(tipos);
        comboBoxTipo.setItems(obsTipos);
        
    }  
    
    @FXML
    public void btnPreVizualizarPressed() throws IOException {
        
        
    }
    
    @FXML
    public void btnAddProdutoPressed() throws IOException {
        
        
    }
    
    @FXML
    public void maskTxtField(TextField txtField) {
        
        txtField.lengthProperty().addListener((ObservableValue<? extends Number> observableValue, Number number, Number number2) -> {
            
            String mascara = "##/##/####";
            
            String alphaAndDigits = txtField.getText().replaceAll("[\\-\\.\\/]","");
            StringBuilder resultado = new StringBuilder();
            int i = 0;
            int quant = 0;

            if (number2.intValue() > number.intValue()) {
                if (txtField.getText().length() <= mascara.length()) {
                    while (i<mascara.length()) {
                        if (quant < alphaAndDigits.length()) {
                            if ("#".equals(mascara.substring(i,i+1))) {
                                resultado.append(alphaAndDigits.substring(quant,quant+1));
                                quant++;
                            } else {
                               resultado.append(mascara.substring(i,i+1));
                            }
                        }
                    i++;    
                    }
                    txtField.setText(resultado.toString());
                }
                if (txtField.getText().length() > mascara.length()) {
                    txtField.setText(txtField.getText(0,mascara.length()));
                }    
            } 
        });
    }
    
}
