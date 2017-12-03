package com.java.jong.UserInterface.JTable;

import com.java.jong.DataStructure.Database.SQLCommand;
import javax.swing.JTable;

public class JTableList{
    public static JTable List;   
    // initialise JTable Home for setting proproties and data
    public JTableList(){
        List = new JTableTemplate(new JTableModel(SQLCommand.$generateListData).model, 20).table;
    }
}
