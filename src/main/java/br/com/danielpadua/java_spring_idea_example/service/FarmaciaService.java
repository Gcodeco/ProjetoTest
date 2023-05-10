package br.com.danielpadua.java_spring_idea_example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danielpadua.java_spring_idea_example.model.Farmacia;
import br.com.danielpadua.java_spring_idea_example.repository.FarmaciaRepository;



@Service

public class FarmaciaService {
	
	@Autowired(required=false)
	FarmaciaRepository farmaciaRepository;

	
	public Farmacia salvar (Farmacia farmacia) {
		return farmaciaRepository.save(farmacia);
	}
}
