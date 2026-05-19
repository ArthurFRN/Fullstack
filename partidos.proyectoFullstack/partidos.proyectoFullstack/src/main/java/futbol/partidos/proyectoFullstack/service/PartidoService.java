package futbol.partidos.proyectoFullstack.service;

import futbol.partidos.proyectoFullstack.dto.PartidoDto;
import futbol.partidos.proyectoFullstack.model.Partido;
import futbol.partidos.proyectoFullstack.repository.PartidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> getPartidos() {
        return partidoRepository.findAll();
    }

    public Partido getPartidoId(Integer id) {
        return partidoRepository.findById(id).orElse(null);
    }

    public Partido savePartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    public Partido updatePartido(Partido partido) {

        if(!partidoRepository.existsById(partido.getId())) {
            return null;
        }

        return partidoRepository.save(partido);
    }

    public void deletePartido(Integer id) {
        partidoRepository.deleteById(id);
    }

    public List<PartidoDto> getResumenPartidos() {

        return partidoRepository.findAll().stream()
                .map(p -> new PartidoDto(
                        p.getEquipoLocal() + " vs " + p.getEquipoVisitante(),
                        p.getHora(),
                        p.getEstadio()
                ))
                .toList();
    }
}