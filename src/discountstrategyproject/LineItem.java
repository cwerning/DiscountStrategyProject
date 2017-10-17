/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Chad Werning
 */
public class LineItem {

    Product product;
    private double qty;
    private double itemSubtotal;
    private double discountAmt;

    public LineItem(Product product, double qty) {
        this.product = product;
        this.qty = qty;
        this.itemSubtotal = getItemSubtotal();
        this.discountAmt = getDiscountAmount();
    }
    
    private final double getItemSubtotal(){
        return (qty * product.getUnitCost()) - product.getDiscountAmt(qty);
    }
    
    private final double getDiscountAmount(){
        return product.getDiscountAmt(qty);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }
    
    public static void main(String[] args) {
        Product product = new Product("101", "Shoes", 15.00, new PercentOffDiscount(.1));
        LineItem lineItem1 = new LineItem(product, 2);
        System.out.println(lineItem1.getItemSubtotal());
    }

}
