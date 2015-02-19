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
    private TipStrategy tipStrategy;
    public double getTipPlusTotal(){
        return tipStrategy.calculateTotal();
    }
    public double getJustTip(){
        return tipStrategy.calculateTip();
    }
    
    public TipService(TipStrategy tip) {
        this.tipStrategy = tip;
    }

    public TipStrategy getTipStrategy() {
        return tipStrategy;
    }
    
    public void setTipStrategy(TipStrategy tip) {
        this.tipStrategy = tip;
    }
    
    
    
}
