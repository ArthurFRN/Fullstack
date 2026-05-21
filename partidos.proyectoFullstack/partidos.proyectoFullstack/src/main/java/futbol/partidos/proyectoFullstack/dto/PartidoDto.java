package futbol.partidos.proyectoFullstack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartidoDto {

    private String partido;
    private String hora;
    private String estadio;
}