package br.com.unialfa.internship.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unialfa.internship.Entity.Estagiario;
import br.com.unialfa.internship.Service.EstagiarioService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/estagiario")
public class EstagiarioController {

	@Autowired
	EstagiarioService Servico;
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public void Salvar(@RequestBody Estagiario estagiario){
		try {
			Servico.AdicionarNovo(estagiario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/deletar", method = RequestMethod.POST)
	public void Deletar(@RequestBody Long Id) {
		try {
			Servico.DeletarPorID(Id);			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@RequestMapping(value="/buscar", method = RequestMethod.POST)
	public Mono<Optional<Estagiario>> BuscarPorID(@RequestBody Long Id){
		try {
			return Mono.just(Servico.ObtenhaPorID(Id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/buscartodos", method = RequestMethod.GET)
	public Mono<List<Estagiario>> BuscarTodos(){
		try {
			return Mono.just(Servico.ObtenhaTodos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
