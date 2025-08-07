/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_66051170;

/**
 *
 * @author LEGION
 */
public class Subscriber_66051170 implements ScoreListener_66051170{

    @Override
    public void scoreChange(ScoreEvent_66051170 e) {
        System.out.println("live result: " + e.getTeam1Name()+ " " + e.getScore1() + "-" + e.getScore2()+ " " + e.getTeam2Name());
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    
}
