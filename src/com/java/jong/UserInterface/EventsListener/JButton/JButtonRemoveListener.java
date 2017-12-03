package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.Database.SQLCommand;
import com.java.jong.DataStructure.Database.SQLConnect;
import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.JButton.JButtonAdd;
import com.java.jong.UserInterface.JLabel.JLabelSummary;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.JTable.JTableHome;
import com.java.jong.UserInterface.JTable.JTableList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class JButtonRemoveListener implements ActionListener{
    // remove data from the database based on the selected row of booking details in the table.
    @Override
    public void actionPerformed(ActionEvent e) {
            if (JTableTemplate.isRowselected()){
                try {
                    System.out.println(SQLCommand.$removeRecord + Order.selectedBookingIDRow + SQLCommand.end);
                    SQLConnect.pushData(SQLCommand.$removeRecord + Order.selectedBookingIDRow + SQLCommand.end);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    }
            Order.selectedBookingIDRow = 0; // reset the selected row of booking details to 0
            JButtonAdd.ButtonAdd.requestFocus();
            JTableTemplate.refreshTableData(); // reset table data after a row of booking details is removed.
            JTableHome.Home.getSelectionModel().clearSelection();
            JTableList.List.getSelectionModel().clearSelection();
            JLabelSummary.setSummaryValues();
            } 
            
    }
    
}
