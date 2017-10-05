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
public class Product {

    private String prodId;
    private String prodName;
    private double unitCost;
    private Discount discount;

    public Product(String prodId, String prodName, double unitCost, Discount discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
    public double getDiscountAmt(double qty){
        return discount.getDiscountAmount(unitCost, qty);
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
    public static void main(String[] args) {
        Product product1 = new Product("A101","Socks", 20.00, new PercentOffDiscount(.10));
        Product product2 = new Product("A102","Hat", 30.00, new QtyPercentOffDiscount(.20, 6));
        
        double amt1 = product1.getDiscountAmt(2);
        System.out.println("Discount for Socks Should be 4.00, it is: " + amt1);
        double amt2 = product2.getDiscountAmt(6);
        System.out.println("Discount for Hat should be 36.00, it is: " + amt2);
    }

}
