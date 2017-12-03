/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JLabel;

import com.java.jong.DataStructure.Database.SQLConnect;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelSummary {
        public static JLabel noOfBookings, noOfCustomers, noOfFoodItems;
        public static JLabel bookings, customers, foodItems;
        private final Font font = new Font("Tahoma", Font.BOLD, 15);
        
        // initialise JLabelSummary labels to be added in JFrameMainMenu
        public JLabelSummary(){
                noOfBookings = new JLabel(LanguageLoader.Language("NOOFBOOKINGS"), SwingConstants.LEADING);
                noOfCustomers = new JLabel(LanguageLoader.Language("NOOFCUSTOMERS"), SwingConstants.LEADING);
                noOfFoodItems = new JLabel(LanguageLoader.Language("NOOFFOODITEMS"), SwingConstants.LEADING);
                
                bookings = new JLabel();
                customers = new JLabel();
                foodItems = new JLabel();
                               
                noOfBookings.setFont(font);
                noOfCustomers.setFont(font);
                noOfFoodItems.setFont(font);
                bookings.setFont(font);
                customers.setFont(font);
                foodItems.setFont(font);
                
                noOfBookings.setBounds(10, 10, 400, 30);
                noOfCustomers.setBounds(10, 100, 400, 30);
                noOfFoodItems.setBounds(10, 210, 600, 30);
                bookings.setBounds(400, 40, 100, 50);
                customers.setBounds(400, 140, 100, 50);
                foodItems.setBounds(400, 250, 100, 50);
        }
        
        public static void setSummaryValues(){
            ResultSet set;
            try {
                
               set = SQLConnect.pullData("SELECT count(*) AS counter FROM CustomerDetails;");
               customers.setText(String.valueOf(set.getInt("counter")));
               System.out.println(set.getInt("counter"));
               set.close();
               
               set = SQLConnect.pullData("SELECT count(*) AS counter FROM BookingDetails;");
               bookings.setText(String.valueOf(set.getInt("counter")));
               System.out.println(set.getInt("counter"));
                set.close();
               
                set = SQLConnect.pullData("SELECT count(*) AS counter FROM FoodDetails");
                foodItems.setText(String.valueOf(set.getInt("counter")));
                System.out.println(set.getInt("counter"));
                set.close();
                
                    }catch (SQLException e){
                                    e.printStackTrace();
                        }
        }
}
