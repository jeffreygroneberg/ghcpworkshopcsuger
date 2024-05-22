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

[!IMPORTANT]
Ask Github Copilot how you can leverage Junit 4 instead of Junit 3. Open your `pom.xml` in an editor. Use the command pop up to interact with Copilot Chat here. 
After you have altered the `pom.xml` file, run the tests again to make sure everything is working as expected.

[!TIP]
Prompt: ``I would like to use Junit 4. What do I have to alter?``

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

[!IMPORTANT]
Ask Github Copilot to provide you with the necessary imports to use Junit 4 in your tests. Open your `AppTest.java` file in an editor and use Copilot Chat with an appropriate prompt to refactor the class.

[!TIP]
Prompt: ``I would like to refactor the tests to use Junit 4 and one basic test. Can you help me with the imports and the overall class structure?``

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

Contributions are warmly welcomed! ✨

To contribute to a public exercise, please refer to our contribution guidelines [here](https://github.com/ps-copilot-sandbox/.github/blob/main/.github/CONTRIBUTING.md).

To create a net new exercise, please use [this repository template](https://github.com/ps-copilot-sandbox/copilot-exercise-template).
