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
    
    public final double getDiscountAmt(double qty){
        return discount.getDiscountAmount(unitCost, qty);
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        if(prodId == null){
            throw new IllegalArgumentException("Product ID cannot be null");
        }
        this.prodId = prodId;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        if(unitCost < 0){
            throw new IllegalArgumentException("The Uit most be greater than 0.");
        }
        this.unitCost = unitCost;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        if(prodName == null){
              throw new IllegalArgumentException("The Product must have a name.");
        }
        this.prodName = prodName;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
              throw new IllegalArgumentException("Product discount cannot be null");
        }
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
