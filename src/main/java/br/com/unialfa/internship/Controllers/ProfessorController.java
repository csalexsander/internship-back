package br.com.unialfa.internship.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unialfa.internship.Entity.Professor;
import br.com.unialfa.internship.Service.ProfessorService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	ProfessorService Servico;
	
	@RequestMapping(value="/deletar", method = RequestMethod.POST)
	public void Deletar(@RequestBody Long Id) {
		try {
			Servico.DeletarPorID(Id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/buscar", method = RequestMethod.POST)
	public Mono<Optional<Professor>> Buscar(@RequestBody Long Id){
		try {
			return Mono.just(Servico.ObtenhaPeloId(Id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@RequestMapping(value="/salvar", method = RequestMethod.GET)
	public void Salvar(@RequestBody Professor professor) {
		try {
			Servico.SalvarProfessor(professor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/obtenhatodos", method = RequestMethod.POST)
	public Mono<List<Professor>> ObtenhaTodos(){
		try {
			return Mono.just(Servico.ObtenhaTodos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
