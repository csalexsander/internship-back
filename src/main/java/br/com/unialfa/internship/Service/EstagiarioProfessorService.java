package br.com.unialfa.internship.Service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.internship.Entity.EstagiarioProfessor;

public interface EstagiarioProfessorService {

	void Salvar(EstagiarioProfessor Relacao);
	
	void Deletar(Long Id);
	
	Optional<EstagiarioProfessor> BuscarId(Long Id);
	
	List<EstagiarioProfessor> BuscarTodos();
}
