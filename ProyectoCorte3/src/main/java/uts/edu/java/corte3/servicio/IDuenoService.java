package uts.edu.java.corte3.servicio;

import java.util.List;

import uts.edu.java.corte3.model.Dueno;

public interface IDuenoService {

	public List<Dueno> getDuenos();
	
	public Dueno listarDueno(int idDueno);
	
	public void saveDueno (Dueno dueno);
	
	public void deleteDueno (int idDueno);
	
	
}
