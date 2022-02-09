package com.intercepti.livraria.testes;
import java.io.FileNotFoundException;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date);
        
        try {
            abreArquivo();    
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel abrir arquivo");
            e.printStackTrace();
        }	
    }

    public static void abreArquivo() throws FileNotFoundException {
        new java.io.FileInputStream("arquivo.txt");
    }

}
