package com.intercepti.livraria.testes;

import com.intercepti.livraria.*;
import com.intercepti.livraria.produtos.*;
import java.util.List;

public class RegistroDeVendas {
    
    public static void main (String[] args) { 	
        Autor autor = new Autor();	
        autor.setNome("Mauricio Aniche");

        Autor autor2 = new Autor();	
        autor2.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);	
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);	
        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor2);	
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        //Produto[] produtos = carrinho.getProdutos();
        List<Produto> produtos = carrinho.getProdutos();

        for(Produto produto : produtos) {
            System.out.println(produto);
        }
        // for (int i=0; i<= produtos.length; i++) {
        //     try {
        //         Produto produto = produtos[i];
        //         if (produto != null) {
        //             System.out.println(produto.getValor());
        //         }
        //     } catch (Exception e) {
        //         System.out.println("exception no indice!" + i);
        //         e.printStackTrace();
        //     }
        // }
        System.out.println("Fui executado!");
        System.out.println(ebook);

        if (autor.equals(autor2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

    }
}
