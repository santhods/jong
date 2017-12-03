
package com.java.jong.DataStructure;

import com.java.jong.DataStructure.Database.SQLConnect;
import java.sql.SQLException;
import java.util.Date;

/*
A class responsible for handling with order from user input to the system to database.
*/

public class Order {
    private String CustomerName;
    private String ContactNumber;
    private int Guest;
    private int selectedTable;
    private Date date;
    private String time;
    
    public static Object[] foodOrderedList, drinkOrderedList;
    public static int selectedBookingIDRow = 0;
    public static OldOrder oldOrder;
    
    // the constructor to initialise values for Order object if created.
    public Order(String CustomerName, String ContactNumber, Date date, String time, int selectedTable, int Guest){
             this.CustomerName = CustomerName;
             this.ContactNumber = ContactNumber;
             this.date = date;
             this.time = time;
             this.selectedTable = selectedTable;
             this.Guest = Guest;
    }
    
    public String getCustomerName(){
    return CustomerName;    // return customer name.
    }
    public String getContactNumber(){
    return ContactNumber; // return contact number.
    }
    
    public Date getDate(){
    return date;        // return date.
    }
    
    public String getTime(){
    return time;    //  return time.
    }
    
    public int getGuest(){
    return Guest;       // return number of guests.
    }
    
    public int getselectedTable(){
    return selectedTable;       // return selected table.
    }
    
    public static boolean isTableAvailable(String date, String time, int selectedTable){
        /* This method is used for check the availability of the table in the database, if the query return 0 means that the table is available
             or return 1 if the table was already reserved on the selected day + time + table, which means it is unavailable.
        */
        try {
            /* Since each record must have the unique date, time, and table; which means that
                if there is any with the same date, time, and table, that record must be rejected.*/
            if  (SQLConnect.pullData(
                    "SELECT count(*) AS rows FROM BookingDetails "
                            + "WHERE DateBook = Date(\"" + date + "\") "
                            + "AND TimeBook = Time(\""+ time + "\") "
                            + "AND TableBook = " + selectedTable + ";").getInt("rows") == 0){
                            
                
                return true;
            } else return false;
            } catch (SQLException e){
                return false;
            }
    }
}
