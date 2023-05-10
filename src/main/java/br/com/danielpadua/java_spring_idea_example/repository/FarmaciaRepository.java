package br.com.danielpadua.java_spring_idea_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danielpadua.java_spring_idea_example.model.Farmacia;

@Repository
public interface FarmaciaRepository extends JpaRepository  <Farmacia, Long> {

}
