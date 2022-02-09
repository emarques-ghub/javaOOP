package com.curso.aula2;

import javax.lang.model.util.ElementScanner6;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if(this.tampada) {
            System.out.println("Erro: não posso rabiscar");
        }
        else
        {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void mostrarStatus() {
        System.out.println("Esta caneta é: " + this.cor );
        System.out.println("Esta caneta tem ponta: " + this.ponta );
        System.out.println("Esta caneta está com " + this.carga + " de carga" );
        System.out.println("e esta tampada? " + this.tampada );

    }
}
