package com.intercepti.livraria.produtos;
import com.intercepti.livraria.*;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {

        if (autor == null) {
//            throw new RuntimeException("O autor do livro não pode ser nulo");
            throw new AutorNuloException("O autor do livro não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    public void mostrarDetalhes() {
        String mensagem =  "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {
            System.out.println("");
            autor.mostrarDetalhes();
            System.out.println("--");   
        }
    }

    public abstract boolean aplicaDescontoDe(double porcentagem);
//    public boolean aplicaDescontoDe(double porcentagem) {
//            return false;	
//    }

    boolean temAutor() { return this.autor != null;}

    public void setValor(double valor) {this.valor = valor;}
    public double getValor() {return this.valor;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getDescricao() {return descricao;}
    public void setDescricao (String descricao) { this.descricao = descricao; }
    public String getIsbn () { return isbn;}
    public void setisbn (String isbn) { this.isbn = isbn; }	
    public Autor getAutor () { return autor; } 	
    public void setAutor (Autor autor) { this.autor = autor;}
 
	@Override
	public int compareTo(Produto outro) {
		
		if (this.getValor() < outro.getValor()){
			return -1;
		}
		if (this.getValor() > outro.getValor()){
			return 1;
		}
		return 0;
	}

}