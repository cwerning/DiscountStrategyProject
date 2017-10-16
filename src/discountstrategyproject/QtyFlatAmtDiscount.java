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
public class QtyFlatAmtDiscount implements Discount {

    private double flatAmountOff;

    public QtyFlatAmtDiscount(double flatAmountOff) {
        setFlatAmountOff(flatAmountOff);
    }

    @Override
    public final double getDiscountAmount(double unitCost, double qty) {
        return qty * flatAmountOff;
    }

    public final double getFlatAmountOff() {
        return flatAmountOff;
    }

    public final void setFlatAmountOff(double flatAmountOff) {
        if (flatAmountOff < 0) {
            throw new IllegalArgumentException("Percent off must be greater than 0.");
        }
        this.flatAmountOff = flatAmountOff;
    }

    public static void main(String[] args) {
        QtyFlatAmtDiscount percentOffDiscount = new QtyFlatAmtDiscount(10);
        double amt = percentOffDiscount.getDiscountAmount(20.00, 2);

        System.out.println("Discount should be $20, and it is: " + amt);

    }

}
