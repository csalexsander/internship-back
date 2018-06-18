package br.com.unialfa.internship.Service.Impl;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.internship.Entity.Estagiario;
import br.com.unialfa.internship.Repository.EstagiarioRepository;
import br.com.unialfa.internship.Service.EstagiarioService;

public class EstagiarioServiceImpl implements EstagiarioService {

	EstagiarioRepository Repositorio;
	
	@Override
	public void AdicionarNovo(Estagiario estagiario) {
		
		if (estagiario == null)
			return;
				
		Repositorio.save(estagiario);
	}

	@Override
	public Optional<Estagiario> ObtenhaPorID(Long Id) {
		if(Id == 0 || Id == null)
			return null;
		
		return Repositorio.findById(Id);
	}

	@Override
	public void DeletarPorID(Long Id) {
		if(Id == 0 || Id == null)
			return;
		
		Repositorio.deleteById(Id);
	}

	@Override
	public List<Estagiario> ObtenhaTodos() {
		return (List<Estagiario>) Repositorio.findAll();
	}

}
