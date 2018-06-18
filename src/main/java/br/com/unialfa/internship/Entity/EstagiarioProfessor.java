package br.com.unialfa.internship.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.persistence.Id;

@CrossOrigin(
		origins="http://localhost:4200",
		methods = {
				RequestMethod.POST,
				RequestMethod.GET
		})
@Entity
public class EstagiarioProfessor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private Long IdProfessor;
	private Long IdEstagiario;
	private String DataInicial;
	private String DataFinal;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getIdProfessor() {
		return IdProfessor;
	}
	public void setIdProfessor(Long idProfessor) {
		IdProfessor = idProfessor;
	}
	public Long getIdEstagiario() {
		return IdEstagiario;
	}
	public void setIdEstagiario(Long idEstagiario) {
		IdEstagiario = idEstagiario;
	}
	public String getDataInicial() {
		return DataInicial;
	}
	public void setDataInicial(String dataInicial) {
		DataInicial = dataInicial;
	}
	public String getDataFinal() {
		return DataFinal;
	}
	public void setDataFinal(String dataFinal) {
		DataFinal = dataFinal;
	}
	
	
}
