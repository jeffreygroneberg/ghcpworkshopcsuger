package com.mycompany.app;

import java.io.IOException;

public interface StarWarsAPI {

    StarWarsCharacterDTO getLukeSkywalker() throws IOException, InterruptedException;
    // Get Darth Vader
    StarWarsCharacterDTO getDarthVader() throws IOException, InterruptedException;
}