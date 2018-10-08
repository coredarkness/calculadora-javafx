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
public class Dividir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String valorUmmmmm, valorDoisssss, valorResultadooooo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValorUmmmmm() {
        return valorUmmmmm;
    }

    public void setValorUmmmmm(String valorUmmmmm) {
        this.valorUmmmmm = valorUmmmmm;
    }

    public String getValorDoisssss() {
        return valorDoisssss;
    }

    public void setValorDoisssss(String valorDoisssss) {
        this.valorDoisssss = valorDoisssss;
    }

    public String getValorResultadooooo() {
        return valorResultadooooo;
    }

    public void setValorResultadooooo(String valorResultadooooo) {
        this.valorResultadooooo = valorResultadooooo;
    }
    
    
}
