package uts.edu.java.corte3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table (name = Dueno.TABLE_NAME)
public class Dueno {
	private static final String TABLE_NAME="dueno";
	
	@Id
	private int iddueno;
	private String nombre;
	@JoinColumn(name = "id")
	private Mascota idMascota;
	@JoinColumn(name ="idrol")
	private Rol idrol;
	
	public Dueno() {
		super();
	}
	
	public Dueno(int iddueno, String nombre, Mascota idMascota, Rol idrol) {
		super();
		this.iddueno = iddueno;
		this.nombre = nombre;
		this.idMascota = idMascota;
		this.idrol = idrol;
	}

	public int getIddueno() {
		return iddueno;
	}

	public void setIddueno(int iddueno) {
		this.iddueno = iddueno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mascota getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Mascota idMascota) {
		this.idMascota = idMascota;
	}

	public Rol getIdrol() {
		return idrol;
	}

	public void setIdrol(Rol idrol) {
		this.idrol = idrol;
	}

	@Override
	public String toString() {
		return "Dueno [iddueno=" + iddueno + ", nombre=" + nombre + ", idMascota=" + idMascota + ", idrol=" + idrol
				+ "]";
	}
	
}
