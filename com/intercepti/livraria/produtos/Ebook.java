package com.intercepti.livraria.produtos;

import com.intercepti.livraria.*;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void SetWaterMark(String waterMark) {
        this.waterMark = waterMark;        
    }

    public String getWaterMark() {
        return waterMark;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if ( porcentagem > 0.15 ) { 
            return false;	
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);	
        System.out.println("aplicando desconto no Ebook");
        return true;	
    }

    //sobrescrevendo o metodo toString padrao do Objeto Ebook
    @Override
    public String toString() {
        return "Eu sou um ebook ";
    }

    // public boolean aplicaDescontoDe(double porcentagem) {
    //     if ( porcentagem > 0.15 ) { 
    //         return false;	
    //     }
    //     System.out.println("aplicando desconto no Ebook");
    //     return super.aplicaDescontoDe(porcentagem);
//        double desconto = this.getValor() * porcentagem;
//        this.setValor(this.getValor() - desconto);	
//        return true;	
//    }
}