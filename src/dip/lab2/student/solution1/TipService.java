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
public class TipService {
    private TipStrategy tip;
    public double getTipPlusTotal(){
        return tip.calculateTotal();
    }
    public double getTip(){
        return tip.calculateTip();
    }
    
    public TipService(TipStrategy tip) {
        this.tip = tip;
    }

    public TipStrategy getTip() {
        return tip;
    }

    public void setTip(TipStrategy tip) {
        this.tip = tip;
    }
    
    
    
}
