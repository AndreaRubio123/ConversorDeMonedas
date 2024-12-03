import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscarMoneda(String monedaBase, String monedaObjetivo){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b16829084de7e1735b74b30c/pair/" +
                monedaBase + "/" + monedaObjetivo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e){
            throw new RuntimeException("No se encontro la moneda deseada");
        }
    }
}
