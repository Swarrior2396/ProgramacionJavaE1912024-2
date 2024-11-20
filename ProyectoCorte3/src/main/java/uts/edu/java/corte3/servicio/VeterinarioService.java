package uts.edu.java.corte3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import uts.edu.java.corte3.model.Veterinario;
import uts.edu.java.corte3.repositorio.VeterinarioRepositorio;

@Service
@Transactional
public class VeterinarioService implements IVeterinarioService {

	@Autowired
	VeterinarioRepositorio veteRepositorio;
	
	@Override
	public List<Veterinario> getVeterinarios(){
		return veteRepositorio.findAll();
	}
	
	@Override
	public void saveVeterinario (Veterinario veterinario) {
		veteRepositorio.save(veterinario);
	}
	
	@Override
	public void deleteVete (int idVete) {
		veteRepositorio.deleteById(idVete);
	}
	
	public Veterinario listarVeterinario (int idVete) {
		return veteRepositorio.findById( idVete).orElse(null);
	}
}
