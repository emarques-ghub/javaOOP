package com.intercepti.livraria;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public void mostrarDetalhes() {
        String mensagem =  "Detalhes do Autor: ";
        System.out.println(mensagem);
        System.out.println("-------------------");
        System.out.println("Nome:" + nome);
        System.out.println("email: " + email);
        System.out.println("cpf: " + cpf);
    }

    //sobrescrevendo o metodo equals para testar se o atributo nome //dos dois autores é igual
    @Override
    public boolean equals(Object obj) {
        //testa se o parametro passado é da classe Autor, pois 
        //apenas este tem o  atributo nome que queremos comparar
        if(!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
    }

    public String getNome() {return nome;}	
    public void setNome (String nome) {	this.nome = nome; }	
    public String getEmail() {return email;}	
    public void setEmail(String email) { this.email = email;}
    public String getCpf() {return cpf;}	
    public void setCpf (String cpf) {this.cpf = cpf;}	

} 