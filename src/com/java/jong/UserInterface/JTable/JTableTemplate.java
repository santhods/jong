/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JTable;

import com.java.jong.DataStructure.Database.SQLCommand;
import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.EventsListener.JTable.JTableSelectionListener;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

// this class is used for creating table template
public class JTableTemplate extends JTable{
    public JTable table;
    // creating JTableTemplate based on TableModel and the row height
    public JTableTemplate(DefaultTableModel model, int rowHeight){
            table = new JTable(model);
            table.setRowHeight(rowHeight);
            table.setAutoCreateRowSorter(true);
            table.setBounds(0,0, 650, 400);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setTableColumn(table);
            
            table.addFocusListener(new JTableSelectionListener(table));
    }
    // set table column into the specified width
    public static void setTableColumn(JTable table){
       table.getColumnModel().getColumn(1).setPreferredWidth(170);
       table.getColumnModel().getColumn(2).setPreferredWidth(120);
       table.getColumnModel().getColumn(3).setPreferredWidth(100);
       table.getColumnModel().getColumn(4).setPreferredWidth(70);
       table.getColumnModel().getColumn(6).setPreferredWidth(100);
    }
    // refresh table data model to default
    public static void refreshTableData(){        
        sortTableData(SQLCommand.$generateHomeData, SQLCommand.$generateListData);
    }
    // set table data based on SQL query of JTable home and JTable list
    public static void setTableModel(String homeData, String listData){
        JTableHome.Home.setModel(new JTableModel(homeData).model);
        JTableList.List.setModel(new JTableModel(listData).model);
        setTableColumn(JTableHome.Home);
        setTableColumn(JTableList.List);
    }
    // set table data in sorted order based on SQL data query
    public static void sortTableData(String home, String list){
        setTableModel(home, list);
        JTableTemplate.setTableColumn(JTableHome.Home);
        JTableTemplate.setTableColumn(JTableList.List);
    }
    // check whether any row in table is selected or not
    public static boolean isRowselected(){
            System.out.println(Order.selectedBookingIDRow);
        return  !(Order.selectedBookingIDRow <= 0); 
    }

}
