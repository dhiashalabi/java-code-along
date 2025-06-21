# Java Code-Along: DataCamp Basics of Programming with Java

This repository contains hands-on exercises and code examples for learning the fundamentals of Java programming through DataCamp's "Basics of Programming with Java" course.

## 🎯 Project Overview

This project demonstrates core Java programming concepts through practical weather data analysis exercises. Each exercise builds upon the previous one, gradually introducing more complex programming concepts.

## 📁 Project Structure

```
java-code-along/
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── com/
│       │           └── dhiashalabi/
│       │               ├── Main.java
│       │               └── Main.class
│       └── test/
│           └── java/
│               └── com/
│                   └── dhiashalabi/
│                       └── MainTest.java
├── gradle/
├── weather_data.csv
├── gradlew
├── gradlew.bat
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Gradle (included via wrapper)

### Running the Project

1. Clone this repository
2. Navigate to the project directory
3. Run the application:
   ```bash
   ./gradlew run
   ```
   or on Windows:
   ```bash
   gradlew.bat run
   ```

## 📚 Exercise Breakdown

### Exercise 1: Basic Data Types and Variables

**File**: `Main.java` - `basicDataTypesExercise()` method

**Learning Objectives**:

- Understanding primitive data types (`int`, `double`, `String`)
- Variable declaration and assignment
- Basic output formatting

**Key Concepts**:

- Integer variables for day numbers
- Double variables for temperature values
- String variables for weather descriptions
- Console output with concatenation

### Exercise 2: Creating Classes

**File**: `Main.java` - `WeatherData` class and `createWeatherDataClass()` method

**Learning Objectives**:

- Class definition and structure
- Instance variables (fields)
- Constructor methods
- Getter and setter methods

**Key Concepts**:

- Encapsulation principles
- Object-oriented programming basics
- Method definition and implementation

### Exercise 3: Object Creation and Usage

**File**: `Main.java` - `createWeatherDataObject()` method

**Learning Objectives**:

- Creating objects from classes
- Calling methods on objects
- Accessing object properties

**Key Concepts**:

- Object instantiation with `new` keyword
- Method calls on objects
- Data retrieval through getter methods

### Exercise 4: Conditional Logic

**File**: `Main.java` - `analyzeSingleDayWeather()` method and `WeatherData` helper methods

**Learning Objectives**:

- Boolean expressions
- Conditional methods
- Logical operators

**Key Concepts**:

- `isHotDay()` method (temperature > 30.0°C)
- `isHumidDay()` method (humidity > 70.0%)
- Boolean return types

### Exercise 5: Arrays and Loops

**File**: `Main.java` - `analyzeMultipleDaysWeather()` and `calculateAverageTemperature()` methods

**Learning Objectives**:

- Array creation and initialization
- For-each loops
- Method parameters and return values
- Mathematical calculations

**Key Concepts**:

- Array of objects
- Iterating through arrays
- Accumulator pattern for calculations
- Method with parameters and return type

### Exercise 6: File I/O and Exception Handling

**File**: `Main.java` - `analyzeWeatherDataFromCSV()` and `readWeatherDataFromCSV()` methods

**Learning Objectives**:

- Reading from CSV files
- Exception handling with try-catch blocks
- ArrayList usage
- String parsing

**Key Concepts**:

- `BufferedReader` for file reading
- `ArrayList` for dynamic data storage
- `String.split()` for CSV parsing
- Exception handling best practices

## 📊 Data Structure

### WeatherData Class

```java
class WeatherData {
    String date;        // Date in YYYY-MM-DD format
    double temperature; // Temperature in Celsius
    double humidity;    // Humidity percentage

    // Constructor, getters, setters, and analysis methods
}
```

### CSV File Format

The `weather_data.csv` file contains weather data in the following format:

```
date,temperature,humidity
2025-01-01,25.5,65.0
2025-01-02,28.0,70.0
...
```

## 🛠️ Key Java Concepts Covered

- **Variables and Data Types**: `int`, `double`, `String`
- **Classes and Objects**: Encapsulation, constructors, methods
- **Arrays**: Creation, initialization, iteration
- **Control Flow**: Conditional statements, loops
- **File I/O**: Reading CSV files, exception handling
- **Collections**: ArrayList usage
- **Methods**: Parameters, return types, overloading

## 🧪 Testing

Run the test suite:

```bash
./gradlew test
```

## 📝 Notes

- This project uses Gradle for build management
- The `WeatherData` class is defined as an inner class within `Main.java`
- All exercises are contained within the `Main` class as static methods
- The project includes both source code and compiled bytecode

## 🎓 Learning Path

1. Start with Exercise 1 to understand basic syntax
2. Progress through each exercise sequentially
3. Experiment with the code by modifying values and adding new features
4. Try creating additional analysis methods for the weather data

## 📖 Additional Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Gradle User Guide](https://docs.gradle.org/current/userguide/userguide.html)
- [DataCamp Java Course](https://app.datacamp.com/learn/skill-tracks/java-fundamentals)

---

**Happy Coding! 🌟**
