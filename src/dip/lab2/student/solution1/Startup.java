/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public class Startup {
    public static void main(String[] args) {
//        String pct = JOptionPane.showInputDialog("Enter Desired Tip Percent ex. 15 = 15%");
//        double pctD=Double.parseDouble(pct);
        String amt = JOptionPane.showInputDialog("Enter Total");
        double amtD=Double.parseDouble(amt);
//        TipService test = new TipService(new RestrauntTip(amtD, pctD));
//        System.out.println(test.getTipPlusTotal());
        String timeInMin = JOptionPane.showInputDialog("Enter Delivery Time In Minutes");
        int timeInMinI=Integer.parseInt(timeInMin);
        TipService test = new TipService(new FoodDeliveryTip(amtD, timeInMinI));
        System.out.println(test.getTipPlusTotal());
        
        
    }
    
}
