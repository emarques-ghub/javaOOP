package com.intercepti.livraria.testes;

import com.intercepti.livraria.*;
import com.intercepti.livraria.produtos.*;

public class CadastroDeLivros {
    
    public static void main(String[] args) {

        Autor autor = new Autor ();	
        autor.setNome( "Rodrigo Turini") ;	
        autor.setEmail("rodrigo.turini@gmail.com");	
        autor.setCpf("123.456.789.10");	

        Livro livro = new LivroFisico(autor);

        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setisbn("978-85-98909-98-9");
        livro.setAutor(autor);
        livro.aplicaDescontoDe(0.1);
        
        LivroFisico livrofisico = new LivroFisico(autor);

        livrofisico.setNome("Lógica de Programação (fisico)");
        livrofisico.setDescricao("Crie seus primeiros programas");
        livrofisico.setValor(59.90);
        livrofisico.setisbn("978-85-66205-22-0");
        livrofisico.setAutor(autor);

        //teste da exception criada
        //Ebook elivro = new Ebook(null);

        Ebook elivro = new Ebook(autor);

        elivro.setNome("O Processo (e-book)");
        elivro.setDescricao("Entenda de processos");
        elivro.setValor(59.90);
        elivro.setisbn("978-85-63435-32-3");
        elivro.SetWaterMark("e-book digital");
        elivro.aplicaDescontoDe(0.15);

        livro.mostrarDetalhes();
        livrofisico.mostrarDetalhes();
        elivro.mostrarDetalhes();

    }

}

