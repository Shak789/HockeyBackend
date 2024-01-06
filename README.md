# Hockey League API

## Overview
Data is an important part of the game of hockey. Whether it is basic player information (e.g. age, height, weight), scoring statistics or advanced analytics, data helps fans and team staff to develop a greater understanding of player performance. This data is readily available online for the National Hockey League (NHL), professional hockey leauges, and 
<a href="https://goaliecoaches.com/understanding-junior-hockey-path-nhl">junior</a>. Even statistics for AAA minor leagues, which is <a href="https://goaliecoaches.com/understanding-junior-hockey-path-nhl">one level below junior</a> can usually be found online.

Due to resource constraints, statistics for smaller hockey leagues are not often tracked, thus preventing fans and coaches to accurately assess player performance. Therefore, I developed this API, which uses standard HTTP metohds to allow smaller leagues to easily manage player data. It also integrates custom methods to provide more options for leagues to track and analzye data. The API can be integrated with frontend applciations, which provides a user-friendly experience for leagues with limited techincal resources.

## Key Features
- **Player Information:** Access player profiles, including basic details such as team, jersey number, position and injury status. You can also view information from player bios such as nationality, age, height, and weight.
- **Scoring / Goaltending Statistics:** Dive into detailed scoring and goaltending statistics, including games played, goals, assists, points, saves, and save percentage.
- **Searchable Data:** The API has a search feature for player names, position and nationality.
- **Sortable Data:** The API allows you to sort player data based on scoring statistics. You will be able to view scoring and goaltending leaders in the league.

## Prerequisites
- [Java Development Kit (JDK)](https://www.oracle.com/technetwork/java/javase/downloads/)
- IDE for Java, such as [Intellij](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers)
- [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html). You can also use the [Spring](https://start.spring.io/) to generate a basic project structure.
- [MongoDB Atlas Account](https://www.mongodb.com/cloud/atlas/register)
- Optional: [Swagger UI](https://swagger.io/tools/swagger-ui/) for API documentation

For detailed information on dependencies, refer to [this file](Dependencies.md).

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/HockeyBackend.git
    ```

2. Navigate to the project directory:

    ```bash
    cd your-repo
    ```

3. Build the project:

   If you are using Maven, run:

    ```bash
    ./mvnw clean install
    ```

   If you are using Gradle, run:

    ```bash
    ./gradlew clean build
    ```

4. Once the application has started, access it in your web browser at [http://localhost:8080](http://localhost:8080).

## Technologies Used

- **Java:** The core programming language used for developing the backend logic of the application.

- **Spring Boot:** Spring Boot simplifies the creation of the API through automatic configuratons. This enables easy implementation of HTTP and custom methods.
  
- **MongoDB:** The project uses MongoDB as the database to store and retrieve player-related data. MongoDB's NoSQL approach provides efficient managment of complex and frequently changing player datasests.

- **Gradle (or Maven):** The build automation tool Gradle (or Maven) is employed to manage project dependencies.

- **Swagger UI** To test HTTP and custom methods without using a frontend applicaiton.

## HTTP Methods
Documentation for the HTTP methods can be found in [this file](https://github.com/Shak789/HockeyBackend/blob/master/HTTP%20Methods.md#http-methods).

## Custom methods
### <span class="label label-api">GET</span>  `/search{item}`
> Searches for a player in the league database that matches one of the following `Player` object fields:
- firstName
- LastName
- Position
- Nationality
- Team
  


  


  
  
