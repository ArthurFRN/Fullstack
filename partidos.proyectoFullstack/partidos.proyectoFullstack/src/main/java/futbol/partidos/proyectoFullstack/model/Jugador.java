package futbol.partidos.proyectoFullstack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

    @Id
    private Integer id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String posicion;

    @NotBlank
    private String equipo;
}