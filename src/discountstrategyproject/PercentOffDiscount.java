/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author cwerning
 */
public class PercentOffDiscount implements Discount{

    private double percentOff;

    public PercentOffDiscount(double percentOff) {
        setPercentOff(percentOff);
    }

    @Override
    public final double getDiscountAmount(double unitCost, double qty) {
        return unitCost * qty * percentOff;
    }

    public final double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        if (percentOff < 0) {
            throw new IllegalArgumentException("...");
        }
        this.percentOff = percentOff;
    }
    
    public static void main(String[] args) {
        PercentOffDiscount percentOffDiscount = new PercentOffDiscount(.10);
        double amt = percentOffDiscount.getDiscountAmount(20.00, 2);
        
        System.out.println("Discount should be $4, and it is: "  + amt);
        
    }

 
}
