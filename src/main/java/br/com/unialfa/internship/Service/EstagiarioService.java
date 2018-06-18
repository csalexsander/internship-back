package br.com.unialfa.internship.Service;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.internship.Entity.Estagiario;

public interface EstagiarioService {

	void AdicionarNovo(Estagiario estagiario);
	
	Optional<Estagiario> ObtenhaPorID(Long Id);
	
	void DeletarPorID(Long Id);
	
	List<Estagiario> ObtenhaTodos();
}
