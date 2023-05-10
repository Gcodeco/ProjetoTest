package br.com.danielpadua.java_spring_idea_example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielpadua.java_spring_idea_example.model.CadastroDeEmpresas;
import br.com.danielpadua.java_spring_idea_example.service.CadastroDeEmpresasService;

@RestController
@RequestMapping("/cadastro-de-empresas")

public class CadastroDeEmpresasController {
	
		@Autowired ()
		CadastroDeEmpresasService cadastroDeEmpresasService;
		
		@PostMapping(value = "/cadastrar")
		public CadastroDeEmpresas salvar (@RequestBody CadastroDeEmpresas cadastroDeEmpresas) throws Exception {
		
		 CadastroDeEmpresas emailVerificador = cadastroDeEmpresasService.findbyemail(cadastroDeEmpresas.getEmail());
		 			
		 	try {
		 		if(emailVerificador == null) {
					return cadastroDeEmpresasService.salvar(cadastroDeEmpresas);
				}		
		 	} catch (Exception e ) {		 	
		 		e.printStackTrace();
		 	}
			
			
			
			return null;
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@GetMapping(value = "/consultarId")
		public Optional<CadastroDeEmpresas> consultarId (@RequestParam Long id) {
			return cadastroDeEmpresasService.findById(id);
		}
		
		
		@GetMapping(value = "/consultarNomeFantasia")
		public String consultarNomeFantasia (@RequestParam Long id) {
			Optional<CadastroDeEmpresas> consultarN = cadastroDeEmpresasService.findById(id);
			return consultarN.get().getnomeFantasia();
					
		}
					
		@GetMapping(value = "/consultarRazaoSocial")
		public String consultarRazaoSocial (@RequestParam Long id) {
			Optional<CadastroDeEmpresas> consultarR = cadastroDeEmpresasService.findById(id);
			return consultarR.get().getRazaoSocial();
		}
				
				
		@GetMapping(value = "/consultarEmail")
		public String consultarEmail (@RequestParam Long  id) {
			     Optional<CadastroDeEmpresas> consultarE = cadastroDeEmpresasService.findById(id) ;	
			     return consultarE.get().getEmail();
		}
		
		@GetMapping(value = "/consultarHomePage")
		public String consultarHomePage (@RequestParam Long id) {
			Optional<CadastroDeEmpresas> consultarH = cadastroDeEmpresasService.findById(id);
			return consultarH.get().getHomePage();
		}
	
		
		
				
		
		@GetMapping(value = "/consultarCep")
		public int consultarCep (@RequestParam Long id) {
				Optional<CadastroDeEmpresas> consultarC = cadastroDeEmpresasService.findById(id);
				return consultarC.get().getCep();
				 			
		}
		
		
	
}
