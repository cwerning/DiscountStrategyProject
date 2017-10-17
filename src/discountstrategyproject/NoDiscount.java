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
public class NoDiscount implements Discount {

    @Override
    public double getDiscountAmount(double unitCost, double qty) {
        return 0;

    }
}
