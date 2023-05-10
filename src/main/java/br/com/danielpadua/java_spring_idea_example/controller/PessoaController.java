package br.com.danielpadua.java_spring_idea_example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.com.danielpadua.java_spring_idea_example.model.Pessoa;
import br.com.danielpadua.java_spring_idea_example.service.PessoaService;

@RestController()
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired ()
		PessoaService pessoaService;
	
	@PostMapping(value = "/cadastrar")
		public Pessoa salvar (@RequestBody Pessoa pessoa) {
			return pessoaService.salvar(pessoa);
			
	}
	
	@GetMapping(value = "/consultar")
	public Optional<Pessoa> consultar (@RequestParam long id) {
		return pessoaService.consultar(id);
	}
	
	@PostMapping(value = "/alterar")
	public Pessoa alterar (@RequestBody Pessoa pessoa) {
		return pessoaService.alterar(pessoa);
	}

	
	@GetMapping(value = "/listar")
	public List<Pessoa> listarTodos(){
		return pessoaService.listarTodos();
	}
	
	
}
