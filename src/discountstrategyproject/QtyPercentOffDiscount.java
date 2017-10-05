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
public class QtyPercentOffDiscount implements Discount{

    private double percentOff;
    private double minQty;

    public QtyPercentOffDiscount(double percentOff, double minQty) {
        setPercentOff(percentOff);
        setMinQty(minQty);
    }
   
    
    @Override
    public final double getDiscountAmount(double unitCost, double qty) {
        double amt = 0;
        
        if(qty < minQty){
            return 0;
        } else {
            return unitCost * qty * percentOff;
        }
        
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

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }
    
    
    
    public static void main(String[] args) {
        QtyPercentOffDiscount percentOffDiscount = new QtyPercentOffDiscount(.10, 5);
        double amt = percentOffDiscount.getDiscountAmount(20.00, 2);
        
        System.out.println("Discount should be $4, and it is: "  + amt);
        amt = percentOffDiscount.getDiscountAmount(20.00, 6);
        System.out.println("Discount should be $12, and it is: " + amt);
        
    }



}
