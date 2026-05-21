package futbol.partidos.proyectoFullstack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partido {

    @Id
    private Integer id;

    @NotBlank
    private String equipoLocal;

    @NotBlank
    private String equipoVisitante;

    @NotBlank
    private String estadio;

    @NotBlank
    private String hora;

    @NotNull
    private Integer fecha;
}