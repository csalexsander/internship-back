package br.com.unialfa.internship.Service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.internship.Entity.Professor;

public interface ProfessorService {

	Optional<Professor> ObtenhaPeloId(Long Id);
	
	void SalvarProfessor(Professor professor);
	
	List<Professor> ObtenhaTodos();
	
	void DeletarPorID(Long Id);
}
