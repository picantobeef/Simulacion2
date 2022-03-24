/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simulacion2;

import java.io.Serializable;

/**
 *
 * @author scont
 */
public class Contador implements Serializable {

    private int Contador;

    public Contador(int Contador) {
        this.Contador = Contador;
    }

    public Contador() {
        this.Contador = Contador;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
}
