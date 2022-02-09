package com.intercepti.livraria.testes;

import java.util.ArrayList;
import java.util.List;
import com.intercepti.livraria.produtos.*;

public class CarrinhoDeCompras {
 
    private double total;
    private List<Produto> produtos; 

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);  
        this.produtos.add(produto);
        total += produto.getValor();   
    } 

    public void remove(int posicao) {
        this.produtos.remove(posicao);        
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}

// Codigo antigo usando Array
// private double total;
// private Produto[] produtos = new Produto[10];
// //private object[] produtos = new object[10];

// private int contador = 0;

// public void adiciona(Produto produto) {
//     System.out.println("Adicionando: " + produto);  
//     this.produtos[contador] = produto;
//     contador++;
//     total += produto.getValor();   
// } 

// public double getTotal() {
//     return total;
// }

// public Produto[] getProdutos() {
//     return produtos;
// }
