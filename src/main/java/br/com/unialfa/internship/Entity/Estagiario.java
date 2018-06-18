package br.com.unialfa.internship.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(
		origins="http://localhost:4200",
		methods = {
				RequestMethod.POST,
				RequestMethod.GET
		})
@Entity
public class Estagiario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private long matricula;
	private String nome;
	private long telefonePrincipal;
	private long telefoneSecundario;
	private String email;
	private int turno;
	private int periodo;
	private int tipo;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefonePrincipal() {
		return telefonePrincipal;
	}
	public void setTelefonePrincipal(long telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}
	public long getTelefoneSecundario() {
		return telefoneSecundario;
	}
	public void setTelefoneSecundario(long telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
