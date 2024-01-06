### <span class="label label-api">GET</span>  `/getPlayerData`
> Retrieves player data for the league.

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
      "saves": null,
      "savePercentage": null
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
      "saves": null,
      "savePercentage": null
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
      "goals": null,
      "assists": null,
      "points": null,
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

**Parameters**
  -  `id` is the _id of a specific player
  -  `updatedPlayer ` is a Player object that is used to replace the previous fields 

### <span class="label label-api">DELETE</span>  `/deletePlayer/{id}`
> Deletes the player from the league database.

**Parameters**
  - `id` : the _id of a specific player

