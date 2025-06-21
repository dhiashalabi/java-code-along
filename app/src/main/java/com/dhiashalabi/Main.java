package com.dhiashalabi;

import java.io.BufferedReader;
import java.util.ArrayList;

class WeatherData {
    String date;
    double temperature;
    double humidity;

    WeatherData(String date, double temperature, double humidity) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    boolean isHotDay() {
        return temperature > 30.0;
    }

    boolean isHumidDay() {
        return humidity > 70.0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weather Data Analyzer!");

        // 1. Call the method for the first exercise: basic data types and variable
        // assignment
        System.out.println("###### Exercise 1 ######");
        basicDataTypesExercise();

        System.out.println("###### Exercise 2 ######");
        createWeatherDataClass();

        // 3. Call the method for the third exercise: creating and using a WeatherData
        // object
        System.out.println("###### Exercise 3 ######");
        createWeatherDataObject();

        // 4. Call the method for the fourth exercise: analyzing a single day's weather
        System.out.println("###### Exercise 4 ######");
        analyzeSingleDayWeather();

        // 5. Call the method for the fifth exercise: working with an array of
        // WeatherData objects
        System.out.println("###### Exercise 5 ######");
        analyzeMultipleDaysWeather();

        // 6. Call the method for the sixth exercise: reading weather data from a CSV
        // file
        System.out.println("###### Exercise 6 ######");
        analyzeWeatherDataFromCSV();
    }

    public static void basicDataTypesExercise() {
        int dayNumber = 12;
        double temperature = 28.5;
        String weatherDescription = "Sunny";

        System.out.println("Day Number: " + dayNumber);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Weather Description: " + weatherDescription);
    }

    public static void createWeatherDataClass() {
    }

    public static void createWeatherDataObject() {
        WeatherData weatherData = new WeatherData("2025-10-01", 25.0, 60.0);
        System.out.println("Weather Data:");
        System.out.println("Date: " + weatherData.getDate());
        System.out.println("Temperature: " + weatherData.getTemperature() + "°C");
        System.out.println("Humidity: " + weatherData.getHumidity() + "%");
    }

    public static void analyzeSingleDayWeather() {
        WeatherData weatherData = new WeatherData("2025-10-01", 32.0, 75.0);
        System.out.println("Hot Day: " + weatherData.isHotDay());
        System.out.println("Humid Day: " + weatherData.isHumidDay());
    }

    public static double calculateAverageTemperature(WeatherData[] weatherDatas) {
        double avgTem = 0.0;
        for (WeatherData data : weatherDatas) {
            avgTem += data.getTemperature();
        }

        return avgTem / weatherDatas.length;
    }

    public static void analyzeMultipleDaysWeather() {
        WeatherData[] weatherDatas = {
                new WeatherData("2025-10-01", 25.0, 60.0),
                new WeatherData("2025-10-02", 22.5, 65.0),
                new WeatherData("2025-10-03", 20.0, 70.0)
        };

        double averageTemperature = calculateAverageTemperature(weatherDatas);
        System.out.println("Average Temperature: " + averageTemperature + "°C");
    }

    public static void analyzeWeatherDataFromCSV() {
        String fileName = "weather_data.csv";
        WeatherData[] weatherDataArray = readWeatherDataFromCSV(fileName);
        if (weatherDataArray != null) {
            double averageTemperature = calculateAverageTemperature(weatherDataArray);
            System.out.println("Average Temperature from CSV: " + Math.round(averageTemperature) + "°C");
        } else {
            System.out.println("No weather data found in the CSV file.");
        }
    }

    public static WeatherData[] readWeatherDataFromCSV(String fileName) {
        ArrayList<WeatherData> weatherDataList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String date = parts[0];
                    double temperature = Double.parseDouble(parts[1]);
                    double humidity = Double.parseDouble(parts[2]);
                    weatherDataList.add(new WeatherData(date, temperature, humidity));
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
            return null;
        }
        if (weatherDataList.isEmpty()) {
            return null;
        } else {
            return weatherDataList.toArray(WeatherData[]::new);
        }
    }
}
