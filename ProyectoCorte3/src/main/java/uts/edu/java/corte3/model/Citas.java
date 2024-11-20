package uts.edu.java.corte3.model;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

// import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = Citas.TABLE_NAME)
public class Citas {
	private static final String TABLE_NAME ="citas";
	
	@Id
	private int idcita;
	
	// AAAA-MM-DD HH-MM
	@DateTimeFormat (pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime fecha;
	
	@JoinColumn(name = "idVete")
	private Veterinario idVete;
	
	@JoinColumn (name ="id")
	private Mascota idMascosta;
	
	@JoinColumn (name = "iddueno")
	private Dueno iddueno;
	
	public Citas() {
		super();
	}
	public Citas(int idcita, LocalDateTime fecha, Veterinario idVete, Mascota idMascosta, Dueno iddueno) {
		super();
		this.idcita = idcita;
		this.fecha = fecha;
		this.idVete = idVete;
		this.idMascosta = idMascosta;
		this.iddueno = iddueno;
	}
	public int getIdcita() {
		return idcita;
	}
	public void setIdcita(int idcita) {
		this.idcita = idcita;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Veterinario getIdVete() {
		return idVete;
	}
	public void setIdVete(Veterinario idVete) {
		this.idVete = idVete;
	}
	public Mascota getIdMascosta() {
		return idMascosta;
	}
	public void setIdMascosta(Mascota idMascosta) {
		this.idMascosta = idMascosta;
	}
	public Dueno getIddueno() {
		return iddueno;
	}
	public void setIddueno(Dueno iddueno) {
		this.iddueno = iddueno;
	}
	@Override
	public String toString() {
		return "Citas [idcita=" + idcita + 
				", \n fecha=" + fecha + 
				", \n idVete=" + idVete + 
				", \n idMascosta=" + idMascosta +
				", \n iddueno=" + iddueno + "]";
	}
	

	
	
	
	
}
