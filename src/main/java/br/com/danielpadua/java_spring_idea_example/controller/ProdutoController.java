package br.com.danielpadua.java_spring_idea_example.controller;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.Optional;

import br.com.danielpadua.java_spring_idea_example.model.Produto;
import br.com.danielpadua.java_spring_idea_example.service.ProdutoService;

@RestController()
@RequestMapping("/produto")
public class ProdutoController {	
	
	@Autowired()	
		ProdutoService produtoService;
	
	@PostMapping(value = "/cadastrar")
			public Produto salvar (@RequestBody Produto produto) { 
	
		produto.setData(Calendar.getInstance().getTime());
			return	produtoService.salvar(produto);		
		}

	@GetMapping(value = "/consultar")
	public Optional<Produto> consultar (@RequestParam long id) {
		return produtoService.consultar(id);
			}
	@PostMapping(value = "/alterar")
	public Produto alterar	(@RequestBody Produto produto) {
		return produtoService.alterar(produto);
	}
	
	@DeleteMapping(value = "/apagar")
	public String apagar (@RequestParam long id) {
		return produtoService.apagar(id);
		 
	}
}



