package br.com.danielpadua.java_spring_idea_example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public long id;
	
	public int preco;
	
	public String nome;
	
	public String cor;
	
	public int quantidade;
	
	public int desconto;
	
	public Date data;
	
	
	public int getpreco ( ) {
		return preco;  
	}
		
	
	public String getnome   ( ) { 
		 return nome;		 
	}
	
	public String getcor () {
		return cor;
		
	}

	public int getduantidade () {
		return quantidade;
					
	}
	
	public int getdesconto ( ) {
		return desconto;
	}
	
	public Date getData () {
		return data;
		
	}
	
		
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setPreco (int preco ) {
		this.preco = preco;
	}
	
	public void setNome ( String nome) {
		this.nome = nome;
		
	}

	public void setCor ( String cor) {
		this.cor = cor;
		
	}

	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
		
			
	}

	public void setDesconto ( int desconto) {
		this.desconto = desconto;
	}
	
	
	public void setData ( Date data) {
	this.data = data;
	}

	
	
	
}

