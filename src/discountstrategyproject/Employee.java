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
public class Employee implements Person {
    private String FirstName;
    private String LastName;
    private String EmployeeID;

    public Employee(String FirstName, String LastName, String EmployeeID) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmployeeID = EmployeeID;
    }
    
    @Override
    public final String getPersonInformation(String firstName, String lastName){
        return firstName+ " " +  lastName + ", ID: " + getEmployeeID();
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
    
}
