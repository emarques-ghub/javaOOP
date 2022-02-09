package com.intercepti.livraria.produtos;

import com.intercepti.livraria.*;

public class MiniLivro extends Livro {
    
    public MiniLivro(Autor autor) {
        super(autor);
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        return false;	
    }

    
}

