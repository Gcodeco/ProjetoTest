package br.com.danielpadua.java_spring_idea_example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class CadastroDeEmpresas {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	
	public long id;
	
	public String nomeFantasia;
	
	public String razaoSocial;
	
	public String email;
	
	public String homepage;
	
	public String endereco;
	
	public int numero;
	
	public String complemento;
	
	public String bairro;
	
	public String cidade;
	
	public String estado;
	
	public int cep;
	
	public int cnpj;
	
	public String inscrEstadual;
	
	public String inscrMunicipal;
	
	
public long getId () {
	return id;
}

public void setId (long id) {
	this.id = id;
			
}

public String getnomeFantasia () {
	return nomeFantasia;
}

public void setNomeFantasia (String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}
	
public String getRazaoSocial () {
	return razaoSocial;
}
	
public void setRazaoSocial ( String razaoSocial) {
	this.razaoSocial = razaoSocial;
}

public String getEmail () {
	return email;
}

public void setEmail ( String email) {
	this.email = email;
}

public String getHomePage () {
	return homepage;
}

public void setHomePage (String homepage) {
	this.homepage = homepage;
}


public String getEndereco () {
	return endereco;
}
	
public void setEndereco (String endereco) {
	this.endereco = endereco;
}

public int getNumero () {
	return numero;
}

public void setNumero ( int numero) {
	this.numero = numero;
}

public String getComplemento () {
	return complemento;
}

public void setComplemento ( String complemento) {
	this.complemento = complemento;
}

public String getBairro () {
	return bairro;
}

public void setbairro ( String bairro) {
	this.bairro = bairro;
}

public String getCidade () {
	return cidade;
}


public void setCidade ( String cidade) {
	this.cidade = cidade;
}

public String getEstado () {
	return estado;
}


public void setEstado ( String estado) {
	this.estado = estado;
}

public int getCep () {
	return cep;
}

public void setCep ( int cep) {
	this.cep = cep;
}

public int getCnpj() {
	return cnpj;
}

public void setCnpj(int cnpj) {
	this.cnpj = cnpj;
}

public String getInscrEstadual() {
	return inscrEstadual;
}

public void setInscrEstadual(String inscrEstadual) {
	this.inscrEstadual = inscrEstadual;
}

public String getInscrMunicipal() {
	return inscrMunicipal;
}

public void setInscrMunicipal(String inscrMunicipal) {
	this.inscrMunicipal = inscrMunicipal;
}

@Override
public String toString() {
	return "CadastroDeEmpresas [id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial
			+ ", email=" + email + ", homepage=" + homepage + ", endereco=" + endereco + ", numero=" + numero
			+ ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
			+ ", cep=" + cep + ", cnpj=" + cnpj + ", inscrEstadual=" + inscrEstadual + ", inscrMunicipal="
			+ inscrMunicipal + "]";
}















}

