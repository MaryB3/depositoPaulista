/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import util.MaskTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author MaryBeds
 */
public class CadastroClienteViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private RadioButton radioButtonPessoaF; 
    @FXML private RadioButton radioButtonPessoaJ;
    @FXML private TextField nomeTxt;
    @FXML private TextField nomeFantasiaTxt;
    @FXML private MaskTextField documentoTxt;
    @FXML private MaskTextField telCelularTxt;
    @FXML private MaskTextField telResidencialTxt;  
    @FXML private MaskTextField cepTxt;
    @FXML private TextField logradouroTxt;
    @FXML private MaskTextField numeroTxt;
    @FXML private TextField ufTxt;
    @FXML private TextField cidadeTxt;
    @FXML private TextField bairroTxt;
    @FXML private TextField complementoTxt;       
            

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        documentoTxt.setMask("N!.N!.N!-N!");
        documentoTxt.setMaxWidth(270);
        documentoTxt.setMinWidth(270);
        maskTxtField(documentoTxt);
        cepTxt.setMask("N!-N!");
        numeroTxt.setMask("N!");
        numeroTxt.setMaxWidth(85);
        numeroTxt.setMinWidth(85);
        maskTxtField(cepTxt);
        //telCelularTxt.setMask("(NN)NNNNN-NNNN!");
        maskTxtField(telCelularTxt);
        telCelularTxt.setMaxWidth(265);
        telCelularTxt.setMinWidth(265);
        //telResidencialTxt.setMask("(NN)NNNN-NNNN!");
        maskTxtField(telResidencialTxt);
        telResidencialTxt.setMaxWidth(265);
        telResidencialTxt.setMinWidth(265);
        
    } 
    
    @FXML
    public void radioButtonPF() throws IOException {
        
        radioButtonPessoaF.setSelected(true);
        radioButtonPessoaJ.setSelected(false);
    }
    
    @FXML
    public void radioButtonPJ() throws IOException {
        
        radioButtonPessoaJ.setSelected(true);
        radioButtonPessoaF.setSelected(false);
    }
    
    @FXML
    public void btnSalvarPressed() throws IOException {
        
        
    }
    
    @FXML 
    public void btnExcluirPressed() throws IOException {
        
        
    }
    
    @FXML
    public void maskTxtField(MaskTextField txtField) {
        
        txtField.lengthProperty().addListener((ObservableValue<? extends Number> observableValue, Number number, Number number2) -> {
            String mascara = "";
            
            if (txtField == cepTxt) { mascara = "#####-###"; }
            if (txtField == documentoTxt) { mascara = "###.###.###-##"; }
            if (txtField == telCelularTxt) { mascara = "(##)#####-####"; }
            if (txtField == telResidencialTxt) { mascara = "(##)####-####"; }
  
            
            String alphaAndDigits = txtField.getText().replaceAll("[\\-\\.\\()]","");
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


