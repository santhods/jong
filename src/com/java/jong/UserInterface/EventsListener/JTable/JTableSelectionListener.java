/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.EventsListener.JTable;

import com.java.jong.DataStructure.Order;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTable;

public class JTableSelectionListener implements FocusListener{
    private JTable table;
  
public JTableSelectionListener(JTable table){
    this.table = table;
}
    // get the number (index) from a selected row of the table
    @Override
    public void focusGained(FocusEvent fe) {
       if (!table.getSelectionModel().isSelectionEmpty()) 
           Order.selectedBookingIDRow = (int) table.getValueAt(table.getSelectedRow(), 0);
    }
    // clear row selection index
    @Override
    public void focusLost(FocusEvent fe) {
                  table.clearSelection();
                  System.out.println(Order.selectedBookingIDRow);
    }
   
  }