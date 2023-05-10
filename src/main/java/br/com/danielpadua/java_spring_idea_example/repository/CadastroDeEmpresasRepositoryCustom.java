package br.com.danielpadua.java_spring_idea_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danielpadua.java_spring_idea_example.model.CadastroDeEmpresas;

@Repository
public interface CadastroDeEmpresasRepositoryCustom  {

	public CadastroDeEmpresas findByEmail (String email);
		
}
