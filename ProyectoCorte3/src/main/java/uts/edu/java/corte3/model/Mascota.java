package uts.edu.java.corte3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = Mascota.TABLE_NAME)
public class Mascota {

	private static final String TABLE_NAME="mascota";
	
	@Id
	private int id;
	private String nomMascota;
	private int edadMascota;
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota(int id, String nomMascota, int edadMascota) {
		super();
		this.id = id;
		this.nomMascota = nomMascota;
		this.edadMascota = edadMascota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomMascota() {
		return nomMascota;
	}
	public void setNomMascota(String nomMascota) {
		this.nomMascota = nomMascota;
	}
	public int getEdadMascota() {
		return edadMascota;
	}
	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}
	@Override
	public String toString() {
		return "Mascota [id=" + id + 
				", \n nomMascota=" + nomMascota + 
				", \n edadMascota=" + edadMascota + "]";
	}
	
	
	
}
