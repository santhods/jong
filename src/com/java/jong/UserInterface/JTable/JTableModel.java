package com.java.jong.UserInterface.JTable;

import com.java.jong.DataStructure.Database.*;
import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class JTableModel {
   private final Object[] ClmnNames = 
   {       LanguageLoader.Language("COLUMNID"),
            LanguageLoader.Language("COLUMNNAME"),
            LanguageLoader.Language("COLUMNNUMBER"),
            LanguageLoader.Language("COLUMNDATE"),
            LanguageLoader.Language("COLUMNTIME"),
            LanguageLoader.Language("COLUMNTABLE"),
            LanguageLoader.Language("COLUMNGUEST")
   };
   
 public DefaultTableModel model;

 // initialise data model based on SQL query passed by String command
public JTableModel(String command){
        String CustomerName, ContactNumber = "";
        Date datebook, timebook;
        int ID, tablebook, guests;
        ResultSet tempResultSet = null;
        model = new DefaultTableModel(ClmnNames, 0){
        
            @Override
            public boolean isCellEditable(int row, int column){
            return false;
            }
        };
        
       try { 
            tempResultSet = SQLConnect.pullData(command); // query data
                while (tempResultSet.next()){ // getting each row of data from ResultSet
                    ID = tempResultSet.getInt(SQLCommand.BookingID);
                    ContactNumber = tempResultSet.getString(SQLCommand.ContactNumber);
                    CustomerName = tempResultSet.getString(SQLCommand.CustomerName);
                    datebook = ChangeDateTime.stringToDate(tempResultSet.getString(SQLCommand.DateBook));
                    timebook = ChangeDateTime.stringToTime(tempResultSet.getString(SQLCommand.TimeBook));
                    tablebook = tempResultSet.getInt(SQLCommand.TableBook);
                    guests =  tempResultSet.getInt(SQLCommand.Guests);
                    // assemble data into the desired order
                    Object [] datalist = {ID, CustomerName, ContactNumber, ChangeDateTime.dateToString(datebook), ChangeDateTime.timeToString(timebook), tablebook, guests};
                    // add merged columns of data into a row in the table
                    model.addRow(datalist);    
                
            }
         } catch (SQLException ex) {
                            ex.getErrorCode();
                           ex.printStackTrace();
                           System.err.println("Could not read data from DB");
         }
}
}
