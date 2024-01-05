package com.example.hockeybackend.Model;


public class PlayerStatistics {
    private Integer gamesPlayed;
    private Integer goals;
    private Integer assists;
    private Integer points;
    private Integer saves;
    private Double savePercentage;

    public PlayerStatistics(Integer gamesPlayed, Integer goals, Integer assists, Integer points, Integer saves, Double savePercentage) {
        this.gamesPlayed = gamesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.points = points;
        this.saves = saves;
        this.savePercentage = savePercentage;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Integer getSaves() {
        return saves;
    }

    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    public Double getSavePercentage() {
        return savePercentage;
    }

    public void setSavePercentage(Double savePercentage) {
        this.savePercentage = savePercentage;
    }
}
