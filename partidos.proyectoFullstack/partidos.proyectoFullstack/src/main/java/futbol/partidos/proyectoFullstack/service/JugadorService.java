package futbol.partidos.proyectoFullstack.service;

import futbol.partidos.proyectoFullstack.model.Jugador;
import futbol.partidos.proyectoFullstack.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> getJugadores() {
        return jugadorRepository.findAll();
    }

    public Jugador saveJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador getJugadorId(int id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    public Jugador updateJugador(Jugador jugador) {
        if (!jugadorRepository.existsById(jugador.getId())) {
            return null;
        }
        return jugadorRepository.save(jugador);
    }

    public void deleteJugador(int id) {
        jugadorRepository.deleteById(id);
    }
}
