# Hockey League API
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
### <span class="label label-api">GET</span>  `/getPlayerData`
> Retrieves player data from the league database.

**Sample Output**
```JSON
[
  {
    "firstName": "John",
    "lastName": "Doe",
    "position": "Forward",
    "jerseyNumber": 87,
    "birthDate": "1990-05-15",
    "nationality": "Canadian",
    "height": 72,
    "weight": 200,
    "team": "Team A",
    "injured": false,
    "statistics": {
      "gamesPlayed": 30,
      "goals": 15,
      "assists": 10,
      "points": 25,
      "saves": 0,
      "savePercentage": 0
    }
  },
  {
    "firstName": "Jane",
    "lastName": "Smith",
    "position": "Defense",
    "jerseyNumber": 22,
    "birthDate": "1992-08-20",
    "nationality": "American",
    "height": 74,
    "weight": 210,
    "team": "Team B",
    "injured": true,
    "statistics": {
      "gamesPlayed": 25,
      "goals": 5,
      "assists": 3,
      "points": 8,
      "saves": 0,
      "savePercentage": 0
    }
  },
  {
    "firstName": "Emma",
    "lastName": "Taylor",
    "position": "Goalie",
    "jerseyNumber": 30,
    "birthDate": "1991-04-05",
    "nationality": "American",
    "height": 72,
    "weight": 190,
    "team": "Team B",
    "injured": false,
    "statistics": {
      "gamesPlayed": 32,
      "goals": 0,
      "assists": 0,
      "points": 0,
      "saves": 250,
      "savePercentage": 0.92
    }
  }
]
```
### <span class="label label-api">POST</span>  `/getPlayerData`
> Adds a player to the league's database.

**Parameters**
- `Player` : an object of type Player with the following fields:
```JSON
{
  "birthDate": "string",
  "firstName": "string",
  "height": 0,
  "injured": true,
  "jerseyNumber": 0,
  "lastName": "string",
  "nationality": "string",
  "position": "string",
  "statistics": {
    "assists": 0,
    "gamesPlayed": 0,
    "goals": 0,
    "points": 0,
    "savePercentage": 0, 
    "saves": 0
  },
  "team": "string",
  "weight": 0
}
```

**Sample Output**
```JSON
{
  "firstName": "Jake",
  "lastName": "Fitzgerald",
  "position": "Forward",
  "jerseyNumber": 90,
  "birthDate": "1994-03-10",
  "nationality": "Canada",
  "height": 72,
  "weight": 190,
  "team": "Team A",
  "injured": false,
  "statistics": {
    "gamesPlayed": 20,
    "goals": 14,
    "assists": 10,
    "points": 24,
    "saves": 0,
    "savePercentage": 0
  }
}
```
### <span class="label label-api">PUT</span> `/updatePlayer/{id}`
> Updates a player's info

**URL Parameters**
  -  `id` is the _id of a specific player
  -  `updatedPlayer ` is a Player object that is used to replace the previous fields 

### <span class="label label-api">DELETE</span>  `/deletePlayer/{id}`
> Deletes the player from the league database.

**Parameters**
  - `id` : the _id of a specific player



  


  
  