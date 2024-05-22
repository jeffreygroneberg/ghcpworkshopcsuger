# Star Wars API with Java

<!-- REPLACE THE TITLE WITH THE NAME OF THE EXERCISE -->

This repository includes a Copilot training demo intended to show off a practical example using the tool.
We will leverage the Java programming language to query the Star Wars API at https:://swapi.info and retrieve information about the Star Wars characters.

## 🎯 Goal

<!-- ONE SENTENCE ABOUT THE GOAL OF THE EXERCISE -->

## ✍️ Programming Languages

- Java

## 💻 IDE

<!-- OPTIONALLY SPECIFY THE IDE THAT SHOULD BE USED -->

* OpenJDK: [OpenJDK JDK 21.0.2 GA Release (java.net)](https://jdk.java.net/21/)
* Maven: [Maven – Installing Apache Maven](https://maven.apache.org/install.html)
* VSCode: [https://code.visualstudio.com/](https://code.visualstudio.com/)
* Github Copilot: [GitHub Copilot - Visual Studio Marketplace](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot)
* Java Extensions Pack: [Extension Pack for Java - Visual Studio Marketplace](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## 🗒️ Guide

<!-- STEP BY STEP ISNTRUCTIONS DETAILING HOW TO COMPLETE THE EXERCISE -->

Within the next steps we will create a Java application that will query the Star Wars API and retrieve information about the Star Wars characters.
We will leverage Github Copilot to help us write the code and get started.

### Create the project

First of all it is necessary to have a folder created in which you will create the project. Navigate to this folder via terminal and run the following command:

```bash
code .
```

We need to create a Maven based Java project. For this we will have to ask Github Copilot to give us a good overview of how to do it.

[!IMPORTANT]
Ask Github Copilot Chat to provide you with the steps to create a Maven based Java project.

[!TIP]
An example prompt could be: ``How can I create via terminal a Java based project that already has some unit tests?``

Remember hat you can directly copy commands from the chat and paste them into the terminal using the terminal icon:

![image](./images/1.png)

### Solution

Create an empty folder and navigate to it via terminal. Then run the following command:

```bash
mvn archetype:generate -DgroupId=com.starwars -DartifactId=starwars -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Check if the tests compile

[!IMPORTANT]
Ask Github Copilot to provide you with the command to compile the tests.

[!TIP]
Another prompt: ``How can I use maven to run the tests?``

### Solution

Navigate in the folder where the project was created and run the following command:

```bash
mvn test
```

You should see the following output:

```bash
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.682 s
```

## Upgrade JUnit to Junit4 in your pom.xml

> [!IMPORTANT]
> Ask Github Copilot how you can leverage Junit 4 instead of Junit 3. Open your `pom.xml` in an editor. Use the command pop up to interact with Copilot Chat here.
> After you have altered the `pom.xml` file, run the tests again to make sure everything is working as expected.

> [!TIP]
> Prompt: ``I would like to use Junit 4. What do I have to alter?``

### Solution

Your `pom.xml` dependencies should look like this:

```xml
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```

## Refactor the tests to use Junit 4

> [!IMPORTANT]
> Ask Github Copilot to provide you with the necessary imports to use Junit 4 in your tests. Open your `AppTest.java` file in an editor and use Copilot Chat with an appropriate prompt to refactor the class.

> [!TIP]
> Prompt: ``I would like to refactor the tests to use Junit 4 and one basic test. Can you help me with the imports and the overall class structure?``

### Solution

Your `AppTest.java` file should look like this. Be careful with the package name, **it should match the one you used when creating the project**.

```java

package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
```

## Create a Star Wars Person DTO class

Please navigate in your browser to the [Star Wars API](https://swapi.info/) and get familiar with the API. We will create a DTO class to represent a Star Wars Person.
Let's start by using Luke Skywalker as an example: https://swapi.info/people/1

You can see the example payload directly at the page. Please copy the JSON in your clipboard.

```json
{  
    "name": "Luke Skywalker",
    "height": "172",
    "mass": "77",
    "hair_color": "blond",
    "skin_color": "fair",
    "eye_color": "blue",
    "birth_year": "19BBY",
    "gender": "male",
    "homeworld": "https://swapi.info/api/planets/1",
    "films": [
        "https://swapi.info/api/films/1",
        "https://swapi.info/api/films/2",
        "https://swapi.info/api/films/3",
        "https://swapi.info/api/films/6"
    ],
    "species": [],
    "vehicles": [
        "https://swapi.info/api/vehicles/14",
        "https://swapi.info/api/vehicles/30"
    ],
    "starships": [
        "https://swapi.info/api/starships/12",
        "https://swapi.info/api/starships/22"
    ],
    "created": "2014-12-09T13:50:51.644000Z",
    "edited": "2014-12-20T21:17:56.891000Z",
    "url": "https://swapi.info/api/people/1"
}
```

> [!IMPORTANT]
> Use Github Copilot chat to create a DTO class for the Star Wars Person. You can use the JSON payload above as an example payload within the prompt.

> [!TIP]
> Prompt:
>
> ```plaintext
>
> Can you help me create a DTO class that is returned by the public Star Wars API. One example looks like this:  
>
> --- JSON PAYLOAD --- 
>
> { "name": "Luke Skywalker", "height": "172", "mass": "77", "hair_color": "blond", "skin_color": "fair", "eye_color": "blue", "birth_year": "19BBY", "gender": "male", "homeworld": "https://swapi.info/api/planets/1", "films": [ "https://swapi.info/api/films/1", "https://swapi.info/api/films/2", "https://swapi.info/api/films/3", "https://swapi.info/api/films/6" ], "species": [], "vehicles": [ "https://swapi.info/api/vehicles/14", "https://swapi.info/api/vehicles/30" ], "starships": [ "https://swapi.info/api/starships/12", "https://swapi.info/api/starships/22" ], "created": "2014-12-09T13:50:51.644000Z", "edited": "2014-12-20T21:17:56.891000Z", "url": "https://swapi.info/api/people/1" }
> ---
> ```
> Remember that you can directly create files out of copilot chat by clicking on the file icon.
> ![image](./images/2.png)

### Solution

Your DTO class should look like this:

```java
import java.util.List;

public class StarWarsCharacterDTO {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;

    // Getters and setters for each field
    // ...
}
```

Remember that this file needs to be stored in the same folder like your `App.java` file. **The file needs to have the same filename as the class name** (eg `StarWarsCharacterDTO.java` in this example!).

## Fixing error in the StarWarsCharacterDTO class

Your DTO class seems to have an error as something is underlined in red. Please ask Github Copilot to help you fix the error. 

> [!IMPORTANT]
> Press ``CMD + .`` to open the quick fix menu and use the Github Copilot to fix the error. 

> [!TIP]
> The fix can be found here: 
> ![image](./images/3.png)
>
> Accept the suggestion of Github Copilot. 
>

### Solution

The error should be fixed now. And the `StarWarsCharacterDTO.java` file looks like this: 

```java
package com.mycompany.app;

import java.util.List;

public class StarWarsCharacterDTO {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;

    // Getters and setters for each field
    // ...
}
```

## Generating Getters and Setters with VS Code

You can use the VS Code feature to generate getters and setters for the fields in the `StarWarsCharacterDTO` class. Click in the class and press ``CMD + .`` to open the quick fix menu. Then select the option to generate getters and setters.

### Solution

Your `StarWarsCharacterDTO.java` file should look like this:

```java

package com.mycompany.app;

import java.util.List;

public class StarWarsCharacterDTO {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;

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
    public String getHair_color() {
        return hair_color;
    }
    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }
    public String getSkin_color() {
        return skin_color;
    }
    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }
    public String getEye_color() {
        return eye_color;
    }
    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }
    public String getBirth_year() {
        return birth_year;
    }
    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
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
    public List<String> getFilms() {
        return films;
    }
    public void setFilms(List<String> films) {
        this.films = films;
    }
    public List<String> getSpecies() {
        return species;
    }
    public void setSpecies(List<String> species) {
        this.species = species;
    }
    public List<String> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }
    public List<String> getStarships() {
        return starships;
    }
    public void setStarships(List<String> starships) {
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

## Creating the interface to query the Star Wars API

We will create an interface that will be used to query the Star Wars API. The interface will have a method that will return a `StarWarsCharacterDTO` object. As we need to have a start we will use the Luke Skywalker example and also use a method to query specificly for Luke Skywalker.

> [!IMPORTANT]
> Create a new file called `StarWarsAPI.java` in the same folder as your `App.java` file. If you have problems creating this file then use the Github Copilot chat to help you create the file. We need to have a method that returns Luke Skywalker as an `StarWarsCharacterDTO` object.

> [!TIP]
> Prompt: ``Can you help me create a plain java interface that queries the Star Wars API and returns a StarWarsCharacterDTO object? I would like to start with just one method for querying Luke Skywalker. The interface should be called StarWarsAPI.`` 

### Solution

Your `StarWarsAPI.java` file should look like this and been stored in the same folder like your `App.java` and `StarWarsCharacterDTO.java` file:

```java
package com.mycompany.app;

import java.io.IOException;

public interface StarWarsAPI {
    StarWarsCharacterDTO getLukeSkywalker() throws IOException;
}
```

## Generate a test for the StarWarsAPI interface

We will now create a test for the `StarWarsAPI` interface. The test will be used to verify that the interface is working as expected. We will use Junit 4 to create the test.

> [!IMPORTANT]
> Use the Github Copilot chat to create a test for the `StarWarsAPI` interface. The test should verify that the `getLukeSkywalker` method is working as expected. The test should be stored in the same folder like your `AppTest.java` file.

> [!TIP]
> Use the Github Copilot popup to create the test. Leverage the ``/tests`` command to let Copilot generate the test for you. An example prompt could be: ``/tests Create a test that is checking if the retrieved object from the Star Wars API is fine.`` Accept the suggestion of Copilot and store the file next to your `AppTest.java` file as ``StarWarsAPITest.java`` file.
> Careful: Most likely you will have to adjust the package name in the generated test file and import the IOException. You can use the quick fix menu to do so with Github Copilot.

### Solution

Your `StarWarsAPITest.java` file should look like this:

```java
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
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }
    }
}
```

You will see that the `StarWarsAPIImpl` class is not yet created. And that we still have compilation errors. We will fix this in the next steps.

## Create the StarWarsAPIImpl class

We will now create the `StarWarsAPIImpl` class that implements the `StarWarsAPI` interface. The class will have a method that will return a `StarWarsCharacterDTO` object. As we need to have a start we will use the Luke Skywalker example and also use a method to query specificly for Luke Skywalker.



