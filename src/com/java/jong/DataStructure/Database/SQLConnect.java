package com.java.jong.DataStructure.Database;

import com.java.jong.DataStructure.Pathing.PathGenerator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnect {
    // utility variables for connecting and manipulating database
    private static Statement call;
    private final String dbDriverPath = "org.sqlite.JDBC";
    private final String dbDriver = "jdbc:sqlite:";
    private final String dbPath = PathGenerator.getHomePath() + System.getProperty("file.separator"); // Builds a db automatically
    private final String dbFile = "Reservations.sqlite";

    // this contructor will be called to initialise database when program starts.
    public SQLConnect(){
        try{
                    Class.forName(dbDriverPath);
                    Connection connect = DriverManager.getConnection(dbDriver + dbPath + dbFile);
                    call = connect.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                    call.execute("PRAGMA foreign_keys = ON;");  // Automatically turn on foreign keys.     
                    if (initialiseDatabase()) System.out.println("Database creation successful");
                    System.out.println(dbDriver + dbPath + dbFile);
                    
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Connection not established");
            e.printStackTrace();
            }
    }
    
    /*  this method is used to pull data rows from the database based-on SQLCommand passes on String command parameter,
         results will be return in ResultSet type.
    */
    public static ResultSet pullData(String command) throws SQLException{
            return call.executeQuery(command);
    }
    
    /* this method is used to push data rows to the database based-on SQLCommand passes on String command parameter,#
        return 1 for a successful datapush, or return 0 otherwise.
    */
    public static int pushData(String command) throws SQLException{
            return call.executeUpdate(command);        
    }             
    
    // A method to initialise database every time when the database is connected to the program.
    private boolean initialiseDatabase(){   
         try {
            pushData(SQLCommand.DBInitialiser);
            return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    } 
    

}