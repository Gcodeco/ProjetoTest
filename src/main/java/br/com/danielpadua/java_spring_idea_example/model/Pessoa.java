package br.com.danielpadua.java_spring_idea_example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity

public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	public long id;
	
	public String empresa;
	
	public String nome;
	
	public int matricula;
	
	public String sexo;
	
	public int nascimento;
	
	public int idade;
	
	public String email;
	
	public boolean deficiente;
	
	
	public boolean getDeficiente () {
		return deficiente;
	}
	
	public void setDeficiente (boolean deficiente) {
	this.deficiente = deficiente;
	}
	
	
	public long getid () {
		return id;
	}
	
	public String getempresa () {
		return empresa;
	}
	
	public String getnome () {
		return nome;
	}
	
	public int getmatricula () {
		return matricula;
	}
	
	public String getsexo() {
		return sexo;
	}
	
	public int getnascimento () {
		return nascimento;
	}
	
	public int getidade () {
		return idade;
	}
	
	public String getemail () {
		return email;
	}


	public void setId(long id) {
		this.id = id;
	}

	public void setEmpresa (String empresa) {
		this.empresa = empresa;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setMatricula (int matricula) {
		this.matricula = matricula;
	}

	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
}

