/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Mark
 */

public class RestrauntTip implements TipStrategy {
    private double tip;
    private double tipPercent;
    private double total;

    public RestrauntTip(double total, double tipPercent) {
        this.total = total;
        this.tipPercent=tipPercent;
    }
    
   @Override
    public double calculateTip(){
       tip=total*(tipPercent/100);
       return tip; 
    }
    @Override
    public double calculateTotal(){
        this.calculateTip();
        total=total+tip;
        return total;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(int tipPercent) {
        this.tipPercent = tipPercent;
    }

    

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   

    
}
