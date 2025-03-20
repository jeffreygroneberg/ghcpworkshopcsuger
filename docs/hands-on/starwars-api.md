# Star Wars API Client Lab 🚀

In this hands-on lab, you'll build a Java client for the Star Wars API (SWAPI) with the help of GitHub Copilot! This lab demonstrates how GitHub Copilot can assist with creating DTOs, interfaces, implementations, and tests.

## Lab Overview 📋

**Duration**: 1 hour  
**Difficulty**: Intermediate  
**Prerequisites**: Basic knowledge of Java, REST APIs, and unit testing  

## What You'll Build 🏗️

A Java client for the Star Wars API with the following components:
- Data Transfer Objects (DTOs) to represent Star Wars characters
- An interface defining the API client methods
- An implementation of the interface using Java's HTTP client
- Unit tests to verify the functionality

## Getting Started 🚀

### Step 1: Set Up the Project Structure

We'll start by setting up a basic Maven project structure. GitHub Copilot will help us create the necessary files and configurations.

> 💡 **Copilot Tip**: If you're using an IDE like IntelliJ or VS Code, you can create a new Maven project using the built-in tools. Otherwise, you can use the Maven command-line tools to create a new project.

Your project should have the following structure:
```
starwarsapi/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── mycompany/
│   │               └── app/
│   │                   ├── App.java
│   │                   ├── StarWarsAPI.java
│   │                   ├── StarWarsAPIImpl.java
│   │                   └── StarWarsCharacterDTO.java
│   └── test/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── app/
│                       ├── AppTest.java
│                       └── StarWarsAPITest.java
```

### Step 2: Create the Maven POM File

Let's start by creating a `pom.xml` file with the necessary dependencies.

> 💡 **Copilot Tip**: Ask GitHub Copilot to help you create a Maven POM file with dependencies for HTTP client and JSON parsing.

Your `pom.xml` should look something like this:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.mycompany.app</groupId>
  <artifactId>starwarsapi</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>starwarsapi</name>
  <url>http://maven.apache.org</url>
  <properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.0</version>
    </dependency>
  </dependencies>
</project>
```

### Step 3: Create the Data Transfer Object (DTO)

Now, let's create a DTO to represent a Star Wars character.

> 💡 **Copilot Tip**: Create a new file called `StarWarsCharacterDTO.java` and add a comment describing what you want to create.

```java
package com.mycompany.app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for Star Wars character from SWAPI
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsCharacterDTO {
    private String name;
    private String height;
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    private String gender;
    private String homeworld;
    private String[] films;
    private String[] species;
    private String[] vehicles;
    private String[] starships;
    private String created;
    private String edited;
    private String url;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(String[] vehicles) {
        this.vehicles = vehicles;
    }

    public String[] getStarships() {
        return starships;
    }

    public void setStarships(String[] starships) {
        this.starships = starships;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
```

### Step 4: Create the API Interface

Let's create an interface that defines the methods our Star Wars API client will implement.

> 💡 **Copilot Tip**: Create a new file called `StarWarsAPI.java` and add a comment describing what you want to create.

```java
package com.mycompany.app;

import java.io.IOException;

/**
 * Interface for Star Wars API client
 */
public interface StarWarsAPI {
    /**
     * Get Luke Skywalker's information
     * @return StarWarsCharacterDTO with Luke Skywalker's data
     * @throws IOException if an I/O error occurs
     * @throws InterruptedException if the operation is interrupted
     */
    StarWarsCharacterDTO getLukeSkywalker() throws IOException, InterruptedException;
    
    /**
     * Get Darth Vader's information
     * @return StarWarsCharacterDTO with Darth Vader's data
     * @throws IOException if an I/O error occurs
     * @throws InterruptedException if the operation is interrupted
     */
    StarWarsCharacterDTO getDarthVader() throws IOException, InterruptedException;
}
```

### Step 5: Implement the API Interface

Now, let's implement the interface using Java's HTTP client.

> 💡 **Copilot Tip**: Create a new file called `StarWarsAPIImpl.java` and add a comment describing what you want to create.

```java
package com.mycompany.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implementation of the Star Wars API client
 */
public class StarWarsAPIImpl implements StarWarsAPI {
    private HttpClient client;
    
    public StarWarsAPIImpl() {
        this.client = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.ALWAYS)
            .build();
    }
    
    @Override
    public StarWarsCharacterDTO getLukeSkywalker() throws IOException, InterruptedException {
        String url = "https://swapi.dev/api/people/1/";
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), StarWarsCharacterDTO.class);
    }
    
    @Override
    public StarWarsCharacterDTO getDarthVader() throws IOException, InterruptedException {
        String url = "https://swapi.dev/api/people/4/";
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.body(), StarWarsCharacterDTO.class);
    }
}
```

### Step 6: Create a Simple App Class

Let's create a simple application class to demonstrate the API client.

> 💡 **Copilot Tip**: Create a new file called `App.java` and add a comment describing what you want to create.

```java
package com.mycompany.app;

import java.io.IOException;

/**
 * Main application class
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Star Wars API Client");
        
        StarWarsAPI api = new StarWarsAPIImpl();
        
        try {
            System.out.println("Getting Luke Skywalker's information...");
            StarWarsCharacterDTO luke = api.getLukeSkywalker();
            System.out.println("Name: " + luke.getName());
            System.out.println("Height: " + luke.getHeight() + " cm");
            System.out.println("Mass: " + luke.getMass() + " kg");
            System.out.println("Hair color: " + luke.getHairColor());
            System.out.println("Eye color: " + luke.getEyeColor());
            
            System.out.println("\nGetting Darth Vader's information...");
            StarWarsCharacterDTO vader = api.getDarthVader();
            System.out.println("Name: " + vader.getName());
            System.out.println("Height: " + vader.getHeight() + " cm");
            System.out.println("Mass: " + vader.getMass() + " kg");
            System.out.println("Hair color: " + vader.getHairColor());
            System.out.println("Eye color: " + vader.getEyeColor());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

### Step 7: Create Unit Tests

Let's create unit tests to verify that our API client works correctly.

> 💡 **Copilot Tip**: Create a new file called `StarWarsAPITest.java` and add a comment describing what you want to create.

```java
package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

/**
 * Unit tests for the Star Wars API client
 */
public class StarWarsAPITest {
    @Test
    public void testGetLukeSkywalker() {
        StarWarsAPI starWarsAPI = new StarWarsAPIImpl();
        try {
            StarWarsCharacterDTO lukeSkywalker = starWarsAPI.getLukeSkywalker();
            assertNotNull(lukeSkywalker);
            // Check if the name of Luke Skywalker is correct
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
```

### Step 8: Refactor the API Implementation

There's a lot of duplicated code in the `getLukeSkywalker` and `getDarthVader` methods. Let's refactor the code to extract the common code into a new private method.

> 💡 **Copilot Tip**: Use GitHub Copilot chat to help you refactor the `StarWarsAPIImpl` class. You can use a prompt like: "Can you help me refactoring this class to use a private method getStarWarsCharacter to retrieve the payloads and avoid duplicated code in the different methods. I want to provide an Id to the private method."

After refactoring, your `StarWarsAPIImpl.java` file should look like this:

```java
package com.mycompany.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implementation of the Star Wars API client
 */
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
```

### Step 9: Run the Tests

Run the tests to make sure everything is working as expected.

> 💡 **Copilot Tip**: Use the Maven command `mvn test` to run the tests.

If everything is set up correctly, the tests should pass, indicating that your Star Wars API client is working properly.

## Bonus Challenges 🌟

If you have extra time, try these bonus challenges with GitHub Copilot:

1. Add a method to get information about a character by name (hint: you'll need to use the search endpoint)
2. Add a method to get information about a planet
3. Add a method to get all characters from a specific film
4. Implement caching to avoid making the same API calls repeatedly

## Summary 📝

In this lab, you've learned how to:
- Use GitHub Copilot to create a Java client for a REST API
- Create DTOs, interfaces, and implementations
- Write unit tests to verify functionality
- Refactor code to eliminate duplication

GitHub Copilot has helped you write code faster and with less effort, allowing you to focus on the design and architecture rather than the implementation details. This is a great example of how AI-assisted coding can enhance your development workflow, especially when working with external APIs! 🚀

![Star Wars API](../assets/images/starwars-api.png)
