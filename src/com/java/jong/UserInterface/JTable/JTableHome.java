package com.java.jong.UserInterface.JTable;

import com.java.jong.DataStructure.Database.SQLCommand;
import javax.swing.JTable;

public class JTableHome{
    public static JTable Home;
    
    // initialise JTable Home for setting proproties and data
    public JTableHome(){
        Home = new JTableTemplate(new JTableModel(SQLCommand.$generateHomeData).model, 30).table;
 
    }
}