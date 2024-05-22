package com.mycompany.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StarWarsAPIImpl implements StarWarsAPI {

    private HttpClient client;

    public StarWarsAPIImpl() {
        this.client = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.ALWAYS)
            .build();
    }

    @Override
    public StarWarsCharacterDTO getLukeSkywalker() throws IOException, InterruptedException {
        return getStarWarsCharacter(1);
    }

    @Override
    public StarWarsCharacterDTO getDarthVader() throws IOException, InterruptedException {
        return getStarWarsCharacter(4);
    }

    private StarWarsCharacterDTO getStarWarsCharacter(int id) throws IOException, InterruptedException {
        String url = "https://swapi.dev/api/people/" + id + "/";

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), StarWarsCharacterDTO.class);
    }
}