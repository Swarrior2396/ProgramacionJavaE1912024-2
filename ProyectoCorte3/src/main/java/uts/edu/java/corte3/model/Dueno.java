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
	
}
