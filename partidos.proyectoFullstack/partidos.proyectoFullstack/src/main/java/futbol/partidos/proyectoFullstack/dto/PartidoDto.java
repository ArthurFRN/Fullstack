package futbol.partidos.proyectoFullstack.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartidoDto {

    private String partido;

    private String horario;

    private String estadio;
}