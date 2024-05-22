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