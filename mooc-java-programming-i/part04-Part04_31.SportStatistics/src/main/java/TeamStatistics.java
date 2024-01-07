
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class TeamStatistics {
    private String team;
    private int numberOfGames;
    private int numberOfLosses;
    private int numberOfWins;

    public TeamStatistics(String team,int numberOfGames, int numberOfLosses, int numberOfWins) {
        this.team = team;
        this.numberOfGames = numberOfGames;
        this.numberOfLosses = numberOfLosses;
        this.numberOfWins = numberOfWins;
    }

    public TeamStatistics(String team) {
        this.team = team;
        this.numberOfGames = 0;
        this.numberOfLosses = 0;
        this.numberOfWins = 0;
    }

    public String getTeam() {
        return team;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public int getNumberOfLosses() {
        return numberOfLosses;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public void setNumberOfLosses(int numberOfLosses) {
        this.numberOfLosses = numberOfLosses;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
    
    public static TeamStatistics generateFromList(String teamName, ArrayList<Match> matches) {
        TeamStatistics statistics = new TeamStatistics(teamName);
        for(Match match : matches) {
            if(match.getHomeTeam().equals(teamName) || match.getOutsideTeam().equals(teamName)) {
                
                statistics.setNumberOfGames(statistics.getNumberOfGames() + 1);
                if(match.getWinner().equals(teamName)) {
                    statistics.setNumberOfWins(statistics.getNumberOfWins() + 1);
                } else {
                    statistics.setNumberOfLosses(statistics.getNumberOfLosses() + 1);
                }
            }
        }
        return statistics;
        
    }
    @Override  
    public String toString() {
        return "Games: " + this.numberOfGames + "\n" + "Wins: " + this.numberOfWins + "\n" + "Losses: " + this.numberOfLosses;
    }
    
}
