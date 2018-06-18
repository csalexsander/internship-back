package br.com.unialfa.internship.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.unialfa.internship.Entity.Estagiario;

public interface EstagiarioRepository extends CrudRepository<Estagiario,Long> {

}
