package uts.edu.java.corte3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import uts.edu.java.corte3.model.Mascota;
import uts.edu.java.corte3.repositorio.MascotaRepositorio;

@Service
@Transactional
public class MascotaService implements IMascostaService {
	
	@Autowired
	MascotaRepositorio mascotaRepositorio;
	
	@Override
	public List<Mascota> getMascotas(){
		return mascotaRepositorio.findAll();
	}

	@Override
	public void saveMascota (Mascota mascota) {
		mascotaRepositorio.save(mascota);
	}

	@Override
	public void deleteMascota (int id) {
		mascotaRepositorio.deleteById(id);
	}
	
	@Override
	public Mascota listarMascotas (int id) {
		return mascotaRepositorio.findById(id).orElse(null);
	}
}
