package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.DataManipulation.PushData;
import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JButtonAvailableListener implements ActionListener{
     /* This method is used to check table availability based on existing rows of booking details in system's database,
        the message dialog will appear to state whether the table is available or not.*/   
    @Override
    public void actionPerformed(ActionEvent e) {
       if (PushData.makeNewOrder()){
           if (Order.isTableAvailable(ChangeDateTime.dateToString(ObjectLib.order.getDate()),
                                                    ObjectLib.order.getTime(), ObjectLib.selectedTable) == true)
                                                                           
                JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate, LanguageLoader.Language("TABLEAVAILABLE"),
                                                                           LanguageLoader.Language("TABLEMSG"), JOptionPane.INFORMATION_MESSAGE); 
           
           else JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate,  LanguageLoader.Language("AVAILABLEERROR"), LanguageLoader.Language("TABLEERROR"),
                                                                       JOptionPane.ERROR_MESSAGE);                                                  
           }
    }
}