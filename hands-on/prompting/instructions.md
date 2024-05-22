# Introduction about prompting with Github Copilot

Github Copilot is an AI pair programmer that helps you write code faster and with less effort. It is a machine learning model trained on a diverse range of public code repositories. Copilot can generate code completions, suggest whole lines or blocks of code, and even write entire functions for you. While using Copilot it is important to follow the **3S Principle**: Simple, specific and short. This will help Copilot to generate more accurate suggestions.

In this hands-on about prompting, you will learn how to use Github Copilot to write code by providing it with specific instructions. You will also learn how to use the `//` comment to provide hints to Copilot. Let's get started!

# Simple Example

1. Create an index.ts file and use Copilot by pressing `CMD + I` at the top of the file with the following prompt `An express API that returns weather data and uses swagger`

2. What you get is a very simple express API that returns weather data and uses swagger. The code will look like this:

```typescript

    import express from 'express';
    import swaggerUi from 'swagger-ui-express';
    import * as swaggerDocument from './swagger.json';

    const app = express();
    const port = 3000;

    // Define your routes here
    app.get('/weather', (req, res) => {
        // Logic to fetch weather data
        const weatherData = {
            temperature: 25,
            description: 'Sunny',
        };

        res.json(weatherData);
    });

    // Serve Swagger UI
    app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerDocument));

    // Start the server
    app.listen(port, () => {
        console.log(`Server is running on port ${port}`);
    });
```



# Instructions (using html and javascript)

1. Open your IDE and create a new `index.html` file. Try to use Copilot chat or use a prompt (eg. `Basic html file with an empty script tag`) in your `index.html` file to generate the following code:
   
   ```html
   <!DOCTYPE html>
   <head>
    <meta charset="UTF-8" />
    <script>
      
    </script>
    </head>
    ```

2. Inside the script tags, write a function that takes two numbers as arguments and returns their sum.

    ```
    // function that takes two numbers as arguments and returns their sum

    function addTwoNumbers(num1, num2) {
    return num1 + num2;
    }

    console.log(addTwoNumbers(5, 10));
    ```


3. Call the function with two numbers and display the result on the console.
4. Now, let's add a new function that takes a string as an argument and returns the length of the string by using a prompt to generate the function

    ```
    // function that takes a string as an argument and returns the length of the string

    function getStringLength(str) {
    return str.length;
    }
    ```

5. Call the function with a string and display the length of the string on the console.
6. Run the code and check if the length of the string is displayed correctly on the console.