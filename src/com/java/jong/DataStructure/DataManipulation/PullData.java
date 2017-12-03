/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.DataManipulation;

import com.java.jong.DataStructure.Database.SQLCommand;
import com.java.jong.DataStructure.Database.SQLConnect;
import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.EventsListener.Automatic.SelectionSelector;
import com.java.jong.UserInterface.JSpinner.JSpinnerTime;
import com.java.jong.UserInterface.JTextComponent.JFormattedTextFrameCreate;
import com.java.jong.UserInterface.JTextComponent.JTextAreaOtherInfo;
import com.java.jong.UserInterface.JXDate.DatePicker;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
A class responsible for pulling data from SQL database to the program for displaying and manipulation.
*/

public abstract class PullData {
    // Retrieve all data sets from SQL database and push them in JFrameCreate when the user wants to edit booking details.
    public static void getAllData (int BookingID){
        String list,time;
       ResultSet customerSet, bookingSet, foodSet, detailSet;
       try {
        
            customerSet = SQLConnect.pullData(SQLCommand.$selectCustomerDetails + BookingID + SQLCommand.end);
                  while (customerSet.next()){ 
                        System.out.println(customerSet.getString(SQLCommand.ContactNumber));
                        JFormattedTextFrameCreate.contactNo.setText(customerSet.getString(SQLCommand.ContactNumber).substring(1));
           
                    }     
               
             bookingSet = SQLConnect.pullData(SQLCommand.$selectBookingDetails + BookingID + SQLCommand.end);
                      while (bookingSet.next()){
                         JFormattedTextFrameCreate.customerName.setText(bookingSet.getString(SQLCommand.CustomerName));
                         JFormattedTextFrameCreate.guest.setText(String.valueOf(bookingSet.getInt(SQLCommand.Guests)));
                         
                         DatePicker.picker.setDate(ChangeDateTime.stringToDate(bookingSet.getString(SQLCommand.DateBook)));
                         
                         time  = bookingSet.getString(SQLCommand.TimeBook);
                         JSpinnerTime.HourSpinner.setValue(Integer.valueOf(time.substring(0, 2)));
                         JSpinnerTime.MinuteSpinner.setValue(String.valueOf(time.substring(3, 5)));
                         
                         ObjectLib.selectedTable = Integer.valueOf(bookingSet.getString(SQLCommand.TableBook));
                         SelectionSelector.setSeatSelection(ObjectLib.selectedTable);                  
                    }
               
                detailSet = SQLConnect.pullData(SQLCommand.$selectAdditionalDetails + BookingID + SQLCommand.end);             
                    while (detailSet.next()){
                         JTextAreaOtherInfo.OtherInfo.setText(detailSet.getString("Description"));
                    }
                    

                foodSet = SQLConnect.pullData(SQLCommand.$selectFoodDetails + BookingID + SQLCommand.end);
                       while (foodSet.next()){
                        list = foodSet.getString("Item");
                        SelectionSelector.setMenuSelection(list);
                    }
            
            }    catch (SQLException ex) {
                         ex.printStackTrace();
                    }
    }
    /* A method responsible for getting booking ID in SQL database based on information available such as customer name,
        time, date, and table.
    */
    public static String getBookingID() throws SQLException{
            final String separate = "\" ";
            String $GetBookingID = "SELECT BookingID FROM BookingDetails "
                                           + "WHERE CustomerName = \"" + ObjectLib.order.getCustomerName() + separate
                                           + "AND TimeBook = Time(\"" + ObjectLib.order.getTime() + "\") "
                                           + "AND DateBook = Date(\"" + ChangeDateTime.dateToString(ObjectLib.order.getDate()) + "\") "
                                           + "AND TableBook = \"" + ObjectLib.order.getselectedTable()+ "\";";
           return  SQLConnect.pullData($GetBookingID).getString(SQLCommand.BookingID); 
    }
    
    /*
    A method responsible for getting data result sets based-on pattern given by (String query) on SQL database
    where a pattern will be compared to each data column, for any data columns has a pattern given by (String query)
    the whole row, which can be many rows, will return.
    */
    public static String getSearchResults(String query){
        final String open = "\"%", close = "%\"", line = "\n";
        final String pattern = open + query + close + line;
        final String data = " SELECT DISTINCT  BookingID, BookingDetails.CustomerName, "
                                    + "DateBook, TimeBook, TableBook, "
                                    + "Guests, CustomerDetails.ContactNumber FROM CustomerDetails, BookingDetails\n"
                           
                                    + "WHERE (BookingDetails.CustomerName LIKE " + pattern
                                    + "OR CustomerDetails.ContactNumber LIKE " + pattern
                                    + "OR DateBook LIKE " + pattern
                                    + "OR TimeBook LIKE " + pattern
                                    + "OR TableBook LIKE " + pattern
                                    + "OR Guests LIKE " + open + query + close + ")" + line
                                    + "AND BookingDetails.CustomerName = CustomerDetails.CustomerName"+ ";";
        return data;
    }
    
}