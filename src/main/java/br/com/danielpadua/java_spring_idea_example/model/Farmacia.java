package br.com.danielpadua.java_spring_idea_example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity


public class Farmacia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public long id;
	
	public String nomeDaFarmacia;
	
	
	
	public long getId () {
		return id;
	}
	
	public void setId ( long id) {
	this.id = id;
	
	}
	
	public String getNomeDaFarmaicia() {
		return nomeDaFarmacia;
		
	}
	
	public void setNomeDaFarmacia(String nomeDaFarmacia) {
		this.nomeDaFarmacia = nomeDaFarmacia;
		
	}
		
	
	
	
	}
	
		
	
	

