package br.com.danielpadua.java_spring_idea_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielpadua.java_spring_idea_example.model.Farmacia;
import br.com.danielpadua.java_spring_idea_example.service.FarmaciaService;

@RestController()
@RequestMapping("/farmacia")

public class FarmaciaController {
	
		@Autowired ()
			FarmaciaService farmaciaService;
		
		@PostMapping(value = "/cadastrar")
			public Farmacia salvar (@RequestBody Farmacia farmacia) {
				return farmaciaService.salvar(farmacia);
				
		}

}
