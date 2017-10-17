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
public class Receipt {

    private LineItem[] lineItems;

    public Receipt(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public static void main(String[] args) {

    }

}
