## Custom Methods
### <span class="label label-api">GET</span>  `/Search/{item}`
> Searches for a player in the league database that matches one of the following `Player` object fields:
- firstName
- LastName
- Position
- Nationality
- Team

**Parameters**
- `item` : One of the aformentionned `Player` fields

### <span class="label label-api">GET</span>  `/Sort/{entry}`
> Sorts players in the league database in descending order based on the following `PlayerStatistics` object fields:
- GamesPlayed
- Goals
- Assists
- Points
- Saves
- Save Percentage

**Parameters**
- `entry` : One of the aformentionned `PlayerStatistics` fields

**Sample Output for Sorting Based on Gaols**
```JSON
[
  {
    "firstName": "Ryan",
    "lastName": "Johnson",
    "position": "Forward",
    "jerseyNumber": 55,
    "birthDate": "1994-06-30",
    "nationality": "American",
    "height": 70,
    "weight": 200,
    "team": "Team A",
    "injured": false,
    "statistics": {
      "gamesPlayed": 33,
      "goals": 22,
      "assists": 16,
      "points": 38,
      "saves": null,
      "savePercentage": null
    }
  },
  {
    "firstName": "Sophia",
    "lastName": "Jones",
    "position": "Forward",
    "jerseyNumber": 44,
    "birthDate": "1994-09-25",
    "nationality": "American",
    "height": 69,
    "weight": 198,
    "team": "Team C",
    "injured": false,
    "statistics": {
      "gamesPlayed": 35,
      "goals": 20,
      "assists": 15,
      "points": 35,
      "saves": null,
      "savePercentage": null
    }
  },
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
  }
]
```
