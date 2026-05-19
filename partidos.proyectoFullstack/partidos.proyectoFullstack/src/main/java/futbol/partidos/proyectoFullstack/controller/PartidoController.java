package futbol.partidos.proyectoFullstack.controller;

import futbol.partidos.proyectoFullstack.dto.PartidoDto;
import futbol.partidos.proyectoFullstack.model.Partido;
import futbol.partidos.proyectoFullstack.service.PartidoService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public ResponseEntity<List<Partido>> listar() {
        return ResponseEntity.ok(partidoService.getPartidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable Integer id) {

        Partido partido = partidoService.getPartidoId(id);

        if(partido == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(partido);
    }

    @GetMapping("/resumen")
    public ResponseEntity<List<PartidoDto>> resumen() {
        return ResponseEntity.ok(
                partidoService.getResumenPartidos()
        );
    }

    @PostMapping
    public ResponseEntity<Partido> guardar(
            @Valid @RequestBody Partido partido) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(partidoService.savePartido(partido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(
            @PathVariable Integer id,
            @Valid @RequestBody Partido partido) {

        partido.setId(id);

        Partido actualizado = partidoService.updatePartido(partido);

        if(actualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {

        partidoService.deletePartido(id);

        return ResponseEntity.noContent().build();
    }
}