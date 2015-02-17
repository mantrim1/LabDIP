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
public class FoodDeliveryTip implements TipStrategy{
    private double tip;
    private double total;
    private int deliveryTime;

    public FoodDeliveryTip(double total, int deliveryTime) {
        this.total = total;
        this.deliveryTime= deliveryTime;
    }
    
    @Override
    public double calculateTip() {
        if(this.deliveryTime<30){
            tip=10.00;
        }else{
            tip=5.00;
        }
        return tip;
        
    }

    @Override
    public double calculateTotal() {
        this.calculateTip();
        total=tip+total;
        return total;
    }
    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
}
