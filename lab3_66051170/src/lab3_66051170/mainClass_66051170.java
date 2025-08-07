/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_66051170;

import java.util.*;

public class mainClass_66051170 {
    static ScoreSource_66051170 sesh1 = new ScoreSource_66051170();
    static Subscriber_66051170 subscriber1 = new Subscriber_66051170();
    static Subscriber_66051170 subscriber2 = new Subscriber_66051170();
    static boolean isRunning = true;
    static Scanner sc;
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the first Team's Name");
        sesh1.setTeam1(sc.nextLine());
        System.out.println("Enter the second Team's Name");
        sesh1.setTeam2(sc.nextLine());
        
        sesh1.addMyListener(subscriber1);
        sesh1.addMyListener(subscriber2);
        String command;
        while (isRunning) {
            System.out.println("Enter the following numbers for commands: ");
            displayOptions();
            command = "";
            command = sc.nextLine();
            if (command != "") {
            commandHandler(Integer.parseInt(command));
        } else {
                isRunning = false;
            }
        }
    }
    
    private static void displayOptions() {
        System.out.println("(1) Increase Score (Team 1)");
        System.out.println("(2) Increase Score (Team 2)");
        System.out.println("(7) Show current scores");
        System.out.println("(8) Decrease Score (Team 1)");
        System.out.println("(9) Decrease Score (Team 2)");
        System.out.println("(999) Reset Scores");
        System.out.println("(Enter) Exit Program");
    }
    
    private static void commandHandler(int commandChosen) {
        switch (commandChosen) {
            case 1 -> sesh1.setScore1(sesh1.getScore1()+1);
            case 2 -> sesh1.setScore2(sesh1.getScore2()+1);
            case 7 -> sesh1.PrintStatus();
            case 8 -> sesh1.setScore1(sesh1.getScore1()-1);
            case 9 -> sesh1.setScore2(sesh1.getScore2()-1);
            case 999 -> sesh1.reset();
            default -> System.out.println("Unrecognized Command, Please enter again.");
        }
    }
    
}
