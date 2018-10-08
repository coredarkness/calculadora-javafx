/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 02371323209
 */
public class Subtrair {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String valorUmmm, valorDoisss, valorResultadooo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValorUmmm() {
        return valorUmmm;
    }

    public void setValorUmmm(String valorUmmm) {
        this.valorUmmm = valorUmmm;
    }

    public String getValorDoisss() {
        return valorDoisss;
    }

    public void setValorDoisss(String valorDoisss) {
        this.valorDoisss = valorDoisss;
    }

    public String getValorResultadooo() {
        return valorResultadooo;
    }

    public void setValorResultadooo(String valorResultadooo) {
        this.valorResultadooo = valorResultadooo;
    }
    
    
    
    
}
