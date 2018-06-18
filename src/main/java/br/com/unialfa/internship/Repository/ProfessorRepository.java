package br.com.unialfa.internship.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unialfa.internship.Entity.Professor;

public interface ProfessorRepository extends CrudRepository<Professor,Long> {

}
