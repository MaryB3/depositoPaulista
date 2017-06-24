/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.text.Element;

/**
 * FXML Controller class
 *
 * @author MaryBeds
 */
public class InicioViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnCadastrarCliente;
    @FXML
    private Button btnClientes;
    @FXML
    private Button btnCadastrarProduto;
    @FXML
    private Button btnProdutos;
    @FXML
    private Button btnFazerPedido;
    @FXML
    private Button btnPedidos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image img = new Image("/imagens/cadastrarClienteImg.png");
        ImageView imgView = new ImageView(img);
        btnCadastrarCliente.setGraphic(imgView);
        btnClientes.setGraphic(new ImageView("/imagens/clientesImg.png"));
        btnCadastrarProduto.setGraphic(new ImageView("/imagens/cadastrarProdutoImg.png"));
        btnProdutos.setGraphic(new ImageView("/imagens/produtosImg.png"));
        btnFazerPedido.setGraphic(new ImageView("/imagens/fazerPedidoImg.png"));
        btnPedidos.setGraphic(new ImageView("/imagens/historicoPedidosImg.png"));
    }

    @FXML
    public void btnCadastrarClientePressed() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/br/view/CadastroClienteView.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("CADASTRO DE CLIENTE");
        stage.setScene(scene);
        stage.showAndWait();

    }

    @FXML
    public void btnCadastrarProdutoPressed() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/br/view/CadastroProdutoView.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("CADASTRO DE PRODUTO");
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    public void btnFazerPedidoPressed() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/br/view/PedidoView.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Pedido");
        stage.setScene(scene);
        stage.show();
    }

}
