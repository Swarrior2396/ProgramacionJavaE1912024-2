package uts.edu.java.corte3.servicio;

import java.util.List;

import uts.edu.java.corte3.model.Mascota;

public interface IMascostaService {

	//Mostrar
	public List<Mascota> getMascotas();
	//lista
	public Mascota listarMascotas(int id);
	//crear
	public void saveMascota (Mascota mascota);
	//borra
	public void deleteMascota (int id);
	
	
}
