package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.DataManipulation.PullData;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.DataStructure.OldOrder;
import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.JTextComponent.JFormattedTextFrameCreate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonModifyListener implements ActionListener{
    // launch JFrameCreate and set data to the components in JFrameCreate from the selected row of booking details in the system.
    @Override
    public void actionPerformed(ActionEvent e) {
           if (JTableTemplate.isRowselected()){
                ObjectLib.isEdit = true;
                new JFrameCreate();
                PullData.getAllData(Order.selectedBookingIDRow);
                Order.oldOrder = new OldOrder(JFormattedTextFrameCreate.customerName.getText().trim(),
                                                                          JFormattedTextFrameCreate.contactNo.getText().trim());
           }
    }
    
}
