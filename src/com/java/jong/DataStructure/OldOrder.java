/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure;
/*
A class for storing the the old customer name and contact number and use them for pushing a new order
as the replacement of an old orderif the user modify the existing order details.
*/
public class OldOrder  {
private String customerName, contactNumber;

    /* this constructor is for  initialising customerName and contactNumber fields to the new object when that particular
        is created.
*/
    public OldOrder(String customerName, String contactNumber) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }
    
    public String getCustomerName(){
            return this.customerName; // the getter method for customerName based on an object created.
        }
    
    public String getContactNumber(){
        return this.contactNumber; // the getter method for contactNumber based on an object created.
    }
    
}
