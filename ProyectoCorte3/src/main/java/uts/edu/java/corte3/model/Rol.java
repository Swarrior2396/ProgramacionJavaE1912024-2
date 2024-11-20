package uts.edu.java.corte3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = Rol.TABLE_NAME)
public class Rol {
	private static final String TABLE_NAME = "ROL";
	
	@Id
	private int idrol;
	private String nombrerol;
		
	public Rol(int idrol, String nombrerol) {
		super();
		this.idrol = idrol;
		this.nombrerol = nombrerol;
	}

	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombrerol() {
		return nombrerol;
	}
	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	@Override
	public String toString() {
		return "Rol [idrol= " + idrol +
				", \n nombrerol=" + nombrerol + "]";
	}
	
	
	
	
	
}
