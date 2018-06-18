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
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private Long Matricula;
	private String Nome;
	private Long TelefonePrincipal;
	private Long TelefoneSecundario;
	private String Email;
	private int Especialidade;
	private String Abordagem;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getMatricula() {
		return Matricula;
	}
	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Long getTelefonePrincipal() {
		return TelefonePrincipal;
	}
	public void setTelefonePrincipal(Long telefonePrincipal) {
		TelefonePrincipal = telefonePrincipal;
	}
	public Long getTelefoneSecundario() {
		return TelefoneSecundario;
	}
	public void setTelefoneSecundario(Long telefoneSecundario) {
		TelefoneSecundario = telefoneSecundario;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(int especialidade) {
		Especialidade = especialidade;
	}
	public String getAbordagem() {
		return Abordagem;
	}
	public void setAbordagem(String abordagem) {
		Abordagem = abordagem;
	}
}
