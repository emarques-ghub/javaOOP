package com.curso.aula2;

/**
 * Aula2
 */
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
   
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();

        c1.mostrarStatus();

        Caneta c2 = new Caneta();
   
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.rabiscar();

        c2.mostrarStatus();

    }
}