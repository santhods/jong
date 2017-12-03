/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JScrollPane;

import com.java.jong.UserInterface.JTable.InitialiseJTable;
import com.java.jong.UserInterface.JTable.JTableHome;
import com.java.jong.UserInterface.JTable.JTableList;
import javax.swing.JScrollPane;

public class JScrollPaneTable {
    public static JScrollPane TableHomeScrollPane, TableListScrollPane;
    // initialise scroll panes for table
    public JScrollPaneTable(){
        new InitialiseJTable();
        TableHomeScrollPane = new JScrollPane(JTableHome.Home, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        TableListScrollPane = new JScrollPane(JTableList.List, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        TableHomeScrollPane.setBounds(0, 0, 620, 375);
        TableListScrollPane.setBounds(0, 0, 620, 375);
    }
}