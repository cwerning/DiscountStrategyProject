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
public class Customer implements Person {
    private String firstName;
    private String lastName;
    private String customerID;

    public Customer(String FirstName, String LastName, String CustomerID) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.customerID = CustomerID;
    }
    
    @Override
    public final String getPersonInformation(String firstName, String lastName){
        return firstName+ " " +  lastName + ", ID: " + getCustomerID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String CustomerID) {
        this.customerID = CustomerID;
    }
    
    
}
