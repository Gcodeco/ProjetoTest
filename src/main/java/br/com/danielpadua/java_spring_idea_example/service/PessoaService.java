package br.com.danielpadua.java_spring_idea_example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danielpadua.java_spring_idea_example.model.Pessoa;
import br.com.danielpadua.java_spring_idea_example.repository.PessoaRepository;

@Service

	public class PessoaService {

		@Autowired(required=false)
		PessoaRepository pessoaRepository;
		
	public Pessoa salvar (Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
		
	}
	
	public Optional<Pessoa> consultar (long id) {
		return pessoaRepository.findById(id);
		
	}
	
	public Pessoa alterar ( Pessoa pessoa) {
		Optional<Pessoa> aux = pessoaRepository.findById(pessoa.getid());
		aux.get().setEmpresa(pessoa.getempresa());
		aux.get().setNome(pessoa.getnome());
		aux.get().setMatricula(pessoa.getmatricula());
		aux.get().setSexo(pessoa.getsexo());
		aux.get().setNascimento(pessoa.getnascimento());
		aux.get().setIdade(pessoa.getidade());
		aux.get().setEmail(pessoa.getemail());
			return pessoaRepository.save(aux.get());
						
	}
		
		
	public List<Pessoa> listarTodos () {
		List<Pessoa> listarAlguns = new ArrayList();
		listarAlguns = pessoaRepository.findAll();
		
		for (Pessoa p : listarAlguns){
				p.setEmail("*******");	
		};
		return listarAlguns;
	}
		
}
