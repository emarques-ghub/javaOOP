package com.intercepti.livraria.produtos;

import com.intercepti.livraria.*;


public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if ( porcentagem > 0.3 ) { 
            return false;	
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);	
        System.out.println("aplicando desconto no LivroFisico");
        return true;	
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        double taxaImpressao = this.getTaxaImpressao();
        System.out.println("Taxa Impressão: " + taxaImpressao);
    }

}
