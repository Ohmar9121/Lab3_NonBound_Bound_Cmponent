/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package lab3_boundproperty_66051170;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author LEGION
 */
public class LiveScoreBean_66051170 implements Serializable {
    public static final String TEAM_PROPERTY = "team";
    public static final String SCORELINE_PROPERTY = "scoreLine";
    public static final String TEAM2_PROPERTY = "team2";
    public static final String SCORELINE1_PROPERTY = "score1";
    public static final String SCORELINE2_PROPERTY = "score2";
    
    private String team1;
     private int score1;
    private String team2;
    private int score2;
    private String scoreLine;
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean_66051170() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreLine() {
        return scoreLine;
    }
    
    public void setScoreLine() {
        String oldValue = scoreLine;
        scoreLine = "live result: " + getTeam1()+ " " + getScore1() + "-" + getScore2()+ " " + getTeam2();
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public int getScore1(){    
        return score1;
    }
    
    public int getScore2(){    
        return score2;
    }
    
    public void setScore1(int val){    
        score1 = val;
        setScoreLine();
    }
    
    public void setScore2(int val){    
        score2 = val;
        setScoreLine();
    }
    
    public void setTeam1(String val){    
        team1 = val;
    }
    
    public void setTeam2(String val){    
        team2 = val;
    }
    
    
    private String getTeam1() {
        return team1;
    }
    
    
    private String getTeam2() {
        return team2;
    }

    void PrintStatus() {
        System.out.println("live result: " + getTeam1()+ " " + getScore1() + "-" + getScore2()+ " " + getTeam2());
    }

    void reset() {
        setTeam1("");
        setScore1(0);
        setTeam2("");
        setScore2(0);
    }
    
}
