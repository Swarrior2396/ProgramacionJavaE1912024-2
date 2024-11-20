package uts.edu.java.corte3.servicio;

import java.util.List;

import uts.edu.java.corte3.model.Veterinario;

public interface IVeterinarioService {

	//Mostrar
	public List<Veterinario> getVeterinarios();
	//lista
	public Veterinario listarVeterinario(int idVete);
	//crear
	public void saveVeterinario (Veterinario veterinario);
	//borra
	public void deleteVete (int idVete);
	
	
}
