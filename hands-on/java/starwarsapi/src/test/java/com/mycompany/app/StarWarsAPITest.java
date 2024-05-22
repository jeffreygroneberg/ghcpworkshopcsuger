package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class StarWarsAPITest {

    @Test
    public void testGetLukeSkywalker() {

        StarWarsAPI starWarsAPI = new StarWarsAPIImpl();
        try {
            StarWarsCharacterDTO lukeSkywalker = starWarsAPI.getLukeSkywalker();
            assertNotNull(lukeSkywalker);

            // Check if the name of Like Skywalker is correct
            assertEquals("Luke Skywalker", lukeSkywalker.getName());

            // Check if the height of Luke Skywalker is correct
            assertEquals("172", lukeSkywalker.getHeight());

        } catch (IOException | InterruptedException e) {
            fail("IOException occurred: " + e.getMessage());
        }
    }

    // Test the getDarthVader method
    @Test
    public void testGetDarthVader() {

        StarWarsAPI starWarsAPI = new StarWarsAPIImpl();
        try {
            StarWarsCharacterDTO darthVader = starWarsAPI.getDarthVader();
            assertNotNull(darthVader);

            // Check if the name of Darth Vader is correct
            assertEquals("Darth Vader", darthVader.getName());

            // Check if the height of Darth Vader is correct
            assertEquals("202", darthVader.getHeight());

        } catch (IOException | InterruptedException e) {
            fail("IOException occurred: " + e.getMessage());
        }
    }
}