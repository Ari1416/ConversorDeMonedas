import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Moneda buscarMoneda(String monedaBase, String monedaconvertida){

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+"4ed26ac6e0f034144d609d14"+"/pair/"+ monedaBase+ "/" + monedaconvertida);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return  new Gson().fromJson(response.body(), Moneda.class);
            } catch (Exception e) {
                throw new RuntimeException("La moneda no ha sido encontrada");
            }

    }

}
