package ifba.exemplo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")		
public class Usuario {
	
	@Id
	@Column(name="id_usuario") 
	private int id_usuario;
	
	@Column(name="nm_usuario")
	private String nm_usuario;
	
	@Column(name="sexo_usuario")
	private String sexo_usuario;
	
	@Column(name="email_usuario")
	private String email_usuario;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getSexo_usuario() {
		return sexo_usuario;
	}

	public void setSexo_usuario(String sexo_usuario) {
		this.sexo_usuario = sexo_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public Usuario(int id_usuario, String nm_usuario, String sexo_usuario, String email_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.sexo_usuario = sexo_usuario;
		this.email_usuario = email_usuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
