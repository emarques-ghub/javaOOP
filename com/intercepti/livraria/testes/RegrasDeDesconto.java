package com.intercepti.livraria.testes;

import com.intercepti.livraria.*;
import com.intercepti.livraria.produtos.*;

public class RegrasDeDesconto {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new MiniLivro(autor);
        livro.setValor(39.90);

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto nao pode ser > 30%");
        } else {
            System.out.println("Valor com Desconto: "+ livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.15)) {
            System.out.println("Desconto nao pode ser > 15%");
        } else {
            System.out.println("Valor com Desconto: "+ ebook.getValor());
        }
    }
}
