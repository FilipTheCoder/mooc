/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Match {

    private String homeTeam;
    private String outsideTeam;
    private int homeTeamScore;
    private int outsideTeamScore;

    public Match(String homeTeam, String outsideTeam, int homeTeamScore, int outsideTeamScore) {
        this.homeTeam = homeTeam;
        this.outsideTeam = outsideTeam;
        this.homeTeamScore = homeTeamScore;
        this.outsideTeamScore = outsideTeamScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getOutsideTeam() {
        return outsideTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public int getOutsideTeamScore() {
        return outsideTeamScore;
    }
    public String getLoser() {
        if(homeTeamScore < outsideTeamScore) {
            return homeTeam;
        }
        else {
            return outsideTeam;
        }
    }
    public String getWinner() {
        if(homeTeamScore > outsideTeamScore) {
            return homeTeam;
        }
        else {
            return outsideTeam;
        }
    }
    
}
