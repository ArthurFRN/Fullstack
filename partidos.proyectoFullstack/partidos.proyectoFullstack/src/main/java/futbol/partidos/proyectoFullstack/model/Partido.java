package futbol.partidos.proyectoFullstack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String equipoLocal;

    @NotBlank
    private String equipoVisitante;

    @NotBlank
    private String liga;

    @NotBlank
    private String fecha;

    @NotBlank
    private String hora;

    @NotBlank
    private String estadio;

    @NotBlank
    private String estado;
}
