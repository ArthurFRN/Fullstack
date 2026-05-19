package futbol.partidos.proyectoFullstack.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {

    private int codigo;

    private String mensaje;

    private String detalle;
}