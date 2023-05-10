package br.com.danielpadua.java_spring_idea_example.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danielpadua.java_spring_idea_example.model.CadastroDeEmpresas;


@Repository
public class  CadastroDeEmpresasimpl  implements CadastroDeEmpresasRepositoryCustom  {
	
	@Autowired
	private EntityManager entityManager;
	@Override	
	public CadastroDeEmpresas findByEmail (String email) {
		String sqlString = "SELECT * FROM farmacia.cadastrodeempresas e where e.email = :email ";
	Query query =	entityManager.createNativeQuery(sqlString).setParameter("email", email);
		return (CadastroDeEmpresas) query.getSingleResult();
	}
	

}
