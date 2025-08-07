/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_66051170;

import java.util.*;

/**
 *
 * @author LEGION
 */
public class ScoreEvent_66051170 extends EventObject  {
    private int score1, score2;
    private String team1, team2;
    public ScoreEvent_66051170(Object source,String team1, int score1, String team2, int score2) {
        super(source);
        this.score1 = score1;
        this.score2 = score2;
        this.team1 = team1;
        this.team2 = team2;
    }
    
    public int getScore1(){
        return score1;
    }
    
    public int getScore2(){
        return score2;
    }
    
    public String getTeam1Name() {
        return team1;
    }
    
    public String getTeam2Name() {
        return team2;
    }
}
