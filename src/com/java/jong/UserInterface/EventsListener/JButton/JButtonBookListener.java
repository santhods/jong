package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.DataManipulation.PushData;
import com.java.jong.DataStructure.Database.SQLCommand;
import com.java.jong.DataStructure.Database.SQLConnect;
import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.JLabel.JLabelSummary;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JButtonBookListener implements ActionListener{
    // this method is used to save booking details from JFrameCreate to database.
    @Override
    public void actionPerformed(ActionEvent e) {
                       
                    if (PushData.makeNewOrder()  == true){ // make new order object.
                      
                        if (Order.isTableAvailable(ChangeDateTime.dateToString(ObjectLib.order.getDate()), // check date, time and table
                                                                   ObjectLib.order.getTime(), ObjectLib.selectedTable) == true){
                            
                            if (ObjectLib.isEdit == false){
                                /* Check source of data whether this is the data editing from an existing row of booking details
                                        or making the new row of booking records.
                                */
                                PushData.pushBookingData(); 
                      
                                } else if (ObjectLib.isEdit == true){
                                     try {
                                         System.out.println(SQLCommand.$removeAllData + Order.oldOrder.getCustomerName() +
                                            "\" AND ContactNumber = \"" + Order.oldOrder.getContactNumber() + "\";");
                                         
                                         SQLConnect.pushData(SQLCommand.$removeAllData + Order.oldOrder.getCustomerName() +
                                            "\" AND ContactNumber = \"" + Order.oldOrder.getContactNumber() + "\";");
                                            
                                           } catch (SQLException ex) {
                                               ex.printStackTrace();
                                           }
                          PushData.pushBookingData();
                        } 
                
                JFrameCreate.JFrameCreate.dispose();
                JTableTemplate.refreshTableData();
                Order.selectedBookingIDRow = 0;
                JLabelSummary.setSummaryValues();
               } else JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate,  LanguageLoader.Language("AVAILABLEERROR"), LanguageLoader.Language("TABLEERROR"),
                                                                       JOptionPane.ERROR_MESSAGE);  
        } else System.out.println("Make new order error");
    }
}
