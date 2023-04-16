package br.com.danielpadua.java_spring_idea_example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danielpadua.java_spring_idea_example.model.Produto;
import br.com.danielpadua.java_spring_idea_example.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired(required=false)	
	ProdutoRepository produtoRepository;
	
	public Produto salvar (Produto produto) {			 
			return  produtoRepository.save(produto);
	}

	public Optional<Produto> consultar ( long id) {
		return produtoRepository.findById(id);
	}
	
	public Produto alterar (Produto produto) {
				Optional<Produto> aux = produtoRepository.findById(produto.getId());
				aux.get().setCor(produto.getcor());
				aux.get().setDesconto(produto.getdesconto());
				aux.get().setNome(produto.getnome());
				aux.get().setPreco(produto.getpreco());
				aux.get().setQuantidade(produto.getduantidade());
					return produtoRepository.save(aux.get());
					
	}

	public String apagar (long id) {
		if (id != 5) {   
			produtoRepository.deleteById(id);
				return "Produto apagado com Sucesso!!!.";
			
		} else {
			
			return " O produto em Questão não pode ser apagado.";
		}
			
		
		
	}

	

}

