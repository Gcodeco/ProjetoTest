package br.com.danielpadua.java_spring_idea_example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danielpadua.java_spring_idea_example.model.CadastroDeEmpresas;
import br.com.danielpadua.java_spring_idea_example.repository.CadastroDeEmpresasRepository;

@Service
public class CadastroDeEmpresasService {
	
		@Autowired(required = false)
		CadastroDeEmpresasRepository  cadastroDeEmpresasRepository;
		
		public CadastroDeEmpresas salvar ( CadastroDeEmpresas cadastroDeEmpresas) {
			return cadastroDeEmpresasRepository.save(cadastroDeEmpresas);
		}

		
			
		
		public Optional<CadastroDeEmpresas> findById ( Long id ) {
			return cadastroDeEmpresasRepository.findById(id);
		}				
		
		
		public CadastroDeEmpresas findbyemail (String email) {	
			return cadastroDeEmpresasRepository.findByEmail(email);
									
		}
					
		
		public Optional<CadastroDeEmpresas> findByCep ( Long id) {
			return cadastroDeEmpresasRepository.findById(id);
		}
}
