/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.modelo.Soma;
import br.edu.ifro.modelo.Subtrair;
import br.edu.ifro.modelo.Multiplicar;
import br.edu.ifro.modelo.Dividir;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author 02371323209
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button btnMostrarHistorico;
    @FXML
    private Button btnSair;
    @FXML
    private Button btnDivisao;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnSomar;
    @FXML
    private TextField valorResultado;
    @FXML
    private TextField valorDois;
    @FXML
    private TextField valorUm;

   
    @FXML
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(valorUm.getText());
        Double num2 = Double.parseDouble(valorDois.getText());
        Double result;
        result = (num1 + num2);
        valorResultado.setText(result.toString());
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Soma soma1 = new Soma();
        soma1.setValorUmm(valorUm.getText());
        soma1.setValorDoiss(valorDois.getText());
        soma1.setValorResultadoo(valorResultado.getText());
        
        em.getTransaction().begin();
        em.persist(soma1);
        em.getTransaction().commit();
    }
    @FXML
    private void subtrair(ActionEvent event) {
        Double num1 = Double.parseDouble(valorUm.getText());
        Double num2 = Double.parseDouble(valorDois.getText());
        Double result2;
        result2 = (num1 - num2);
        valorResultado.setText(result2.toString());
        
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Subtrair subtrair1 = new Subtrair();
        subtrair1.setValorUmmm(valorUm.getText());
        subtrair1.setValorDoisss(valorDois.getText());
        subtrair1.setValorResultadooo(valorResultado.getText());
        
        em.getTransaction().begin();
        em.persist(subtrair1);
        em.getTransaction().commit();
    }
    @FXML
    private void multiplicar(ActionEvent event){
        Double num1 = Double.parseDouble(valorUm.getText());
        Double num2 = Double.parseDouble(valorDois.getText());
        Double result3;
        result3 = (num1 * num2);
        valorResultado.setText(result3.toString());
        
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Multiplicar multiplicar1 = new Multiplicar();
        multiplicar1.setValorUmmmm(valorUm.getText());
        multiplicar1.setValorDoissss(valorDois.getText());
        multiplicar1.setValorResultadoooo(valorResultado.getText());
        
        em.getTransaction().begin();
        em.persist(multiplicar1);
        em.getTransaction().commit();
    }
    
    @FXML
    private void dividir(ActionEvent event){
        Double num1 = Double.parseDouble(valorUm.getText());
        Double num2 = Double.parseDouble(valorDois.getText());
        Double result4;
        result4 = (num1 / num2);
        valorResultado.setText(result4.toString());
        
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        Dividir dividir1 = new Dividir();
        dividir1.setValorUmmmmm(valorUm.getText());
        dividir1.setValorDoisssss(valorDois.getText());
        dividir1.setValorResultadooooo(valorResultado.getText());
        
        em.getTransaction().begin();
        em.persist(dividir1);
        em.getTransaction().commit();
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void mostrarHistorico(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MostrarHistorico.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Mostrar Histórico");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void sair(ActionEvent event) {
         Stage stage = (Stage) btnSair.getScene().getWindow();
    stage.close();
    }
    
}
