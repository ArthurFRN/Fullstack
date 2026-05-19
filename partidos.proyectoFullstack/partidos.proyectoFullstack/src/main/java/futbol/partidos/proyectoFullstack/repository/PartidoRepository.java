package futbol.partidos.proyectoFullstack.repository;

import futbol.partidos.proyectoFullstack.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {
}