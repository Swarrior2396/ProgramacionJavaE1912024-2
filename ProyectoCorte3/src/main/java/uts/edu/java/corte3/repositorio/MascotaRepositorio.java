package uts.edu.java.corte3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import uts.edu.java.corte3.model.Mascota;

public interface MascotaRepositorio extends JpaRepository<Mascota, Integer> {

}
