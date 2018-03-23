/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 02371323209
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtN1, txtN2, txtResultado;
    @FXML
    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicar;
    private Button btnDividir;
    
    @FXML
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());
        Double result;
        result = (num1 + num2);
        txtResultado.setText(result.toString());
    }
    @FXML
    private void subtrair(ActionEvent event) {
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());
        Double result2;
        result2 = (num1 - num2);
        txtResultado.setText(result2.toString());
    }
    @FXML
    private void multiplicar(ActionEvent event){
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());
        Double result3;
        result3 = (num1 * num2);
        txtResultado.setText(result3.toString());
    }
    @FXML
    private void dividir(ActionEvent event){
        Double num1 = Double.parseDouble(txtN1.getText());
        Double num2 = Double.parseDouble(txtN2.getText());
        Double result4;
        result4 = (num1 / num2);
        txtResultado.setText(result4.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
