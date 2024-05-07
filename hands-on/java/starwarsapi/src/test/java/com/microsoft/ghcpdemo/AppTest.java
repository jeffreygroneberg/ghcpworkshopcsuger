package com.microsoft.ghcpdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testGetLukeSkywalker() throws IOException, InterruptedException {
        SWAPI swapi = new SWAPIImpl();

        Person lukeSkywalker = swapi.getLukeSkywalker();

        // Assert that the returned Person object is not null
        assertNotNull(lukeSkywalker);

        // Assert that the name of the Person is "Luke Skywalker"
        assertEquals("Luke Skywalker", lukeSkywalker.getName());

        // Add more assertions to test other properties of the Person object if needed
    }

    @Test
    public void testGetMaceWindu() throws IOException, InterruptedException {
        SWAPIImpl swapi = new SWAPIImpl();
        Person maceWindu = swapi.getMaceWindu();

        // Assert that the returned Person object is not null
        assertNotNull(maceWindu);

        // Assert that the name of the Person is "Mace Windu"
        assertEquals("Mace Windu", maceWindu.getName());
    }

    @Test
    // R2D2
    public void testGetR2D2() throws IOException, InterruptedException {
        SWAPIImpl swapi = new SWAPIImpl();
        Person r2d2 = swapi.getR2D2();

        // Assert that the returned Person object is not null
        assertNotNull(r2d2);

        // Assert that the name of the Person is "R2-D2"
        assertEquals("R2-D2", r2d2.getName());
    }

    @Test
    // R4-P17
    public void testGetR4P17() throws IOException, InterruptedException {
        SWAPIImpl swapi = new SWAPIImpl();
        Person r4p17 = swapi.getR4P17();

        // Assert that the returned Person object is not null
        assertNotNull(r4p17);

        // Assert that the name of the Person is "R4-P17"
        assertEquals("R4-P17", r4p17.getName());

        // check for home world https://swapi.info/api/planets/28
        assertEquals("https://swapi.info/api/planets/28", r4p17.getHomeworld());
    }

}
