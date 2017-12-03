package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.DataManipulation.PushData;
import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.DataStructure.Order;
import com.java.jong.DataStructure.Reports.Invoice;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JButtonPrintListener implements ActionListener{
    // print booking details in JFrameCreate as soon as the user clicks on JButtonPrint and all data are validated.
    @Override
    public void actionPerformed(ActionEvent e) {
                     if (PushData.makeNewOrder() == true){
                                           Invoice.build(ObjectLib.order.getCustomerName(), ObjectLib.order.getContactNumber(),
                                           ChangeDateTime.dateToString(ObjectLib.order.getDate()),ObjectLib.order.getTime(),
                                           String.valueOf(ObjectLib.order.getselectedTable()), String.valueOf(ObjectLib.order.getGuest()),
                                           Order.foodOrderedList, Order.drinkOrderedList);
                         } else JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate,  LanguageLoader.Language("AVAILABLEERROR"), LanguageLoader.Language("TABLEERROR"),
                                                                       JOptionPane.ERROR_MESSAGE);  
    }
}
