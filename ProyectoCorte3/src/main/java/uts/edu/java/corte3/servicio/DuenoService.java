package uts.edu.java.corte3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import uts.edu.java.corte3.model.Dueno;
import uts.edu.java.corte3.repositorio.DuenoRepositorio;

@Service
@Transactional
public class DuenoService implements IDuenoService {

	@Autowired
	DuenoRepositorio duenoRepositorio;
	
	@Override
	public List<Dueno> getDuenos(){
		return duenoRepositorio.findAll();
	}
	
	@Override
	public void saveDueno (Dueno dueno) {
		duenoRepositorio.save(dueno);
	}
	
	@Override
	public void deleteDueno (int iddueno) {
		duenoRepositorio.deleteById(iddueno);
	}
	
	public Dueno listarDueno (int iddueno) {
		return duenoRepositorio.findById(iddueno).orElse(null);
	}
}
