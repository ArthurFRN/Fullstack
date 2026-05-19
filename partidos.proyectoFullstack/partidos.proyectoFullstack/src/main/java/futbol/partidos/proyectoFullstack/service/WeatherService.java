package futbol.partidos.proyectoFullstack.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WeatherService {

    @Autowired
    @Qualifier("weatherWebClient")
    private WebClient weatherWebClient;

    public Object obtenerClima(double lat, double lon) {

        return weatherWebClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v1/forecast")
                        .queryParam("latitude", lat)
                        .queryParam("longitude", lon)
                        .queryParam("current_weather", true)
                        .build())
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }
}