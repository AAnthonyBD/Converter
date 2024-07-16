package com.anthonyDeLaCruz.conversorDeMoneda.api;

import com.anthonyDeLaCruz.conversorDeMoneda.modelos.ExchangeRateModelo;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExchangeRate {
    // Reemplaza con tu URL de la API
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/8173458afc4afeeef7f71806/latest/";

    public static double obtenerTasaCambio(String monedaOrigen, String monedaDestino) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + monedaOrigen))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ExchangeRateModelo exchangeRateResponse = gson.fromJson(response.body(), ExchangeRateModelo.class);

            return exchangeRateResponse.getRates().get(monedaDestino);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
