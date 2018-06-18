package br.com.unialfa.internship.Service.Impl;

import java.util.List;
import java.util.Optional;

import br.com.unialfa.internship.Entity.Professor;
import br.com.unialfa.internship.Repository.ProfessorRepository;
import br.com.unialfa.internship.Service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

	ProfessorRepository Repositorio;
	
	@Override
	public Optional<Professor> ObtenhaPeloId(Long Id) {
		
		if(Id == 0 || Id == null)
			return null;
		
		return Repositorio.findById(Id);
	}

	@Override
	public void SalvarProfessor(Professor professor) {
		
		if(professor == null)
			return;
		
		Repositorio.save(professor);
	}

	@Override
	public List<Professor> ObtenhaTodos() {
		
		return (List<Professor>) Repositorio.findAll();
	}

	@Override
	public void DeletarPorID(Long Id) {

		if(Id == 0 || Id == null)
			return;
		
		Repositorio.deleteById(Id);
	}

}
