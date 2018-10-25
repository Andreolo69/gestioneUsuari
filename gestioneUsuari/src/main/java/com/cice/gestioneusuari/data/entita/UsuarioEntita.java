package com.cice.gestioneusuari.data.entita;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntita {	
	public UsuarioEntita() {
		super();
	}	
	public UsuarioEntita(Long id, String nombre, String user, String pass, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.user = user;
		this.pass = pass;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String user;
	private String pass;
	private String email;


}
