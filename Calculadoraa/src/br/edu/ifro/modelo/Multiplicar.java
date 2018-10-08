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
public class Multiplicar {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String valorUmmmm, valorDoissss, valorResultadoooo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValorUmmmm() {
        return valorUmmmm;
    }

    public void setValorUmmmm(String valorUmmmm) {
        this.valorUmmmm = valorUmmmm;
    }

    public String getValorDoissss() {
        return valorDoissss;
    }

    public void setValorDoissss(String valorDoissss) {
        this.valorDoissss = valorDoissss;
    }

    public String getValorResultadoooo() {
        return valorResultadoooo;
    }

    public void setValorResultadoooo(String valorResultadoooo) {
        this.valorResultadoooo = valorResultadoooo;
    }
    
    
}
