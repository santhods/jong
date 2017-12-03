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
import com.java.jong.DataStructure.Order;
import com.java.jong.DataStructure.Validation.JFrameCreateVerifier;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.JTextComponent.JFormattedTextFrameCreate;
import com.java.jong.UserInterface.JTextComponent.JTextAreaOtherInfo;
import com.java.jong.UserInterface.JXDate.DatePicker;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// This class responsible for pushing data from the program to SQL database.

public class PushData {
    private static final String start = "(\"", separate = "\", \"", end = "\");";
    private static String currentBookingID;
    
    // A method for adding customer details to SQL database before other details can be added.
    private static void AddCustomerDetails(){
        String command = SQLCommand.$AddCustomerDetails +
           start + ObjectLib.order.getCustomerName() + separate 
                   + ObjectLib.order.getContactNumber() + end;
           try {
           System.out.println(command);
           SQLConnect.pushData(command);

           } catch (SQLException e){
           System.out.print("AddCustomer error:");
           e.getErrorCode();
           e.printStackTrace();
           }
    }
    // A method for adding booking details before food and additional details can be added. 
    private static void AddBookingDetails(){
        String command = SQLCommand.$AddBookingDetails +
                start + ObjectLib.order.getCustomerName()
                + "\", Date(\"" + ChangeDateTime.dateToString((ObjectLib.order.getDate())) 
                + "\"), Time(\"" + ChangeDateTime.timeToString(ChangeDateTime.stringToTime(ObjectLib.order.getTime())) + "\"), "
                + String.valueOf(ObjectLib.order.getselectedTable()) + ", "
                + ObjectLib.order.getGuest() + ");";
    
               try {
                System.out.println(command);
                SQLConnect.pushData(command);
                
               } catch (SQLException e){
                   System.out.println("AddBookingDetails error");
                   e.getErrorCode();
                   e.printStackTrace();
               }
        try {
            currentBookingID = PullData.getBookingID();
            System.out.println(currentBookingID);
        }  catch (SQLException e ) {JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate, LanguageLoader.Language("SAVEDATAERRORMESSAGE"), LanguageLoader.Language("SAVEDATAERROR"), JOptionPane.ERROR_MESSAGE);}
    }
    // A method for adding food details.
    private static void AddFoodDetails(){        
        for (Object item: Order.foodOrderedList)    PushItemList(String.valueOf(item));
        for (Object item : Order.drinkOrderedList)   PushItemList(String.valueOf(item));
    }
    
    // a method for adding additional details.
    private static void AddAdditionalDetails(){
        String command = SQLCommand.$AddAdditionalDetails
            + start +
               currentBookingID + separate
            + JTextAreaOtherInfo.OtherInfo.getText() + end;
        try {    
            SQLConnect.pushData(command);
        } catch (SQLException e){
            System.out.println("AddAdditionalDetails error");
            e.getErrorCode();
            e.printStackTrace();
        }
    }
    /* This method is used for pushing food and drink item into the table FoodDetails,
    this will be called by AddFoodDetails() in this class recursively.
    */
    private static void PushItemList(String item){
                    String command = SQLCommand.$AddFoodDetails
            + start + currentBookingID  + separate +
             item + "\", " + 1 + ");";
            try {
                System.out.println(command);
             SQLConnect.pushData(command);
            } catch (SQLException e){
                System.out.println("Food Details error");
                e.getErrorCode();
                e.printStackTrace(); 
                }
    }
    // A method is used for pushing a new or an existing order to the database.
    public static void pushBookingData(){
                           AddCustomerDetails();
                           AddBookingDetails();
                           AddFoodDetails();
                           AddAdditionalDetails();
                           JTableTemplate.refreshTableData();
    }
    
    /* A method for testing whether the new order can be made by testing whether the all the inputs are validated,
        then create a new order based on all inputs entered including the food and drink item.
        If all inputs are validated, make a new Order instance for storing all values, and return true.
        Otherwise, return false.
    */
    public static boolean makeNewOrder(){
        if (JFrameCreateVerifier.InputValidated()){
            ObjectLib.order = new Order(JFormattedTextFrameCreate.customerName.getText().trim().toString(),
                                                      JFormattedTextFrameCreate.contactNo.getText().trim().toString(),
                                                      DatePicker.picker.getDate(),
                                                      ChangeDateTime.getTime(),
                                                      ObjectLib.selectedTable,
                                                      Integer.valueOf(getGuests().trim()));
                                                      
                    SelectFoodAndDrinkList.refreshList();
                    SelectFoodAndDrinkList.selectFoodList();
                    SelectFoodAndDrinkList.selectDrinkList();
                    System.out.println("All input completed.");
            return true;  
        } else {
            System.out.println("InputValidated error");
            return false;
        }
    }
    // A method for validate and receive an input from JTextField guest in JFormattedTextFrameCreateClass.
    public static String getGuests(){            
            if (JFormattedTextFrameCreate.guest.getText().trim().length() <= 0) {
                JFormattedTextFrameCreate.guest.setText("01");
                return "1";
            }
            else return JFormattedTextFrameCreate.guest.getText();
        }
}
