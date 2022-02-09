package com.intercepti.livraria.produtos;
import com.intercepti.livraria.*;

public class Revista implements Produto, Promocional {
    
    private String nome;	
    private String descricao;	
    private double valor;	
    private Editora editora;	


    public boolean aplicaDescontoDe(double porcentagem) {
        if ( porcentagem > 0.1 ) { 
            return false;	
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);	
        System.out.println("aplicando desconto na Revista");
        return true;	
    }


    public String getNome() { return this.nome;}
    public void setNome(String nome) { this.nome = nome;}
    public String getDescricao() { return this.descricao;}
    public void setDescricao(String descricao) { this.descricao = descricao;}
    public double getValor() { return this.valor;}
    public void setValor(double valor) { this.valor = valor;}
    public Editora getEditora() { return this.editora;}
    public void setEditora(Editora editora) { this.editora = editora;}

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
