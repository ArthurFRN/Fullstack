package futbol.partidos.proyectoFullstack.service;

import futbol.partidos.proyectoFullstack.model.Partidos;
import futbol.partidos.proyectoFullstack.repository.PartidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidosService {

    @Autowired
    private PartidosRepository partidosRepository;

    public List<Partidos> getPartidos() {
        return partidosRepository.findAll();
    }

    public Partidos savePartidos(Partidos partidos) {
        return partidosRepository.save(partidos);
    }

    public Partidos getPartidosId(int id) {
        return partidosRepository.findById(id).orElse(null);
    }

    public Partidos updatePartidos(Partidos partidos) {
        if (!partidosRepository.existsById(partidos.getId())) {
            return null;
        }
        return partidosRepository.save(partidos);
    }

    public void deletePartidos(int id) {
        partidosRepository.deleteById(id);
    }
}
