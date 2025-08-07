/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_boundproperty_66051170;

import java.beans.*;

/**
 *
 * @author LEGION
 */
public class Subscriber_66051170 implements PropertyChangeListener{
//  Note to self: Another way to do it is to get the source object and call the method from there
//  LiveScoreBean_66051170 seshy;
    @Override
    public void propertyChange(PropertyChangeEvent e) {
//        seshy = (LiveScoreBean_66051170)e.getSource();
//        seshy.PrintStatus();
        System.out.println(e.getNewValue());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        
    }
    
}
