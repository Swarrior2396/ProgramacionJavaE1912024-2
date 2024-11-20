package uts.edu.java.corte3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = Veterinario.TABLE_NAME)
public class Veterinario {
	private static final String TABLE_NAME="veterinario";
	
	@Id
	private int idVete;
	private String nombreVete;
	@JoinColumn(name = "idrol")
	private Rol idrol;
	
	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinario(int idVete, String nombreVete, Rol idrol) {
		super();
		this.idVete = idVete;
		this.nombreVete = nombreVete;
		this.idrol = idrol;
	}

	public int getIdVete() {
		return idVete;
	}

	public void setIdVete(int idVete) {
		this.idVete = idVete;
	}

	public String getNombreVete() {
		return nombreVete;
	}

	public void setNombreVete(String nombreVete) {
		this.nombreVete = nombreVete;
	}

	public Rol getIdrol() {
		return idrol;
	}

	public void setIdrol(Rol idrol) {
		this.idrol = idrol;
	}

	@Override
	public String toString() {
		return "Veterinario [idVete=" + idVete +
				", \n nombreVete=" + nombreVete + 
				", \n idrol=" + idrol + "]";
	}
	
	 
	
	
}
