/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_66051170;

import java.util.*;

/**
 *
 * @author LEGION
 */
public class ScoreSource_66051170 {
    private int score1, score2;
    private String team1, team2;
    private ArrayList<ScoreListener_66051170> listeners;
    
    public ScoreSource_66051170() {
        listeners = new ArrayList<>();
        score1 = 0;
        score2 = 0;
    }
    
    public void addMyListener (ScoreListener_66051170 i) {
        listeners.add(i);
    }
    
    public void removeMyListener (ScoreListener_66051170 i) {
        listeners.remove(i);
    }
    
    public void setScoreLine(ScoreEvent_66051170 e) {
        for(int i = 0; i < listeners.size();i++) {
            ScoreListener_66051170 current = listeners.get(i);
            current.scoreChange(e);
        }
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
    
    public void setScore1(int val) {
        score1 = val;
        PrintEnteredValues();
        setScoreLine(new ScoreEvent_66051170(this,getTeam1Name(),getScore1(),getTeam2Name() ,getScore2()));
    }
    
    public void setScore2(int val) {
        score2 = val;
        PrintEnteredValues();
        setScoreLine(new ScoreEvent_66051170(this,getTeam1Name(),getScore1(),getTeam2Name() ,getScore2()));
    }
    
    public void setTeam1(String val) {
        team1 = val;
    }
    
    public void setTeam2(String val) {
        team2 = val;
    }
    
    public void reset(){
        score1 = 0;
        score2 = 0;
    }
    
    public void PrintEnteredValues() {
         System.out.println("--------------------------------------------------------------------------------------------------------");
         System.out.println("Enter Score: " + getTeam1Name()+ " " + getScore1() + "-" + getScore2()+ " " + getTeam2Name());
         System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    
    public void PrintStatus() {
         System.out.println("--------------------------------------------------------------------------------------------------------");
         System.out.println("Status: " + getTeam1Name()+ " " + getScore1() + "-" + getScore2()+ " " + getTeam2Name());
         System.out.println("--------------------------------------------------------------------------------------------------------");
    }
}
