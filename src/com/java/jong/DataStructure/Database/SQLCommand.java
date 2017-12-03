package com.java.jong.DataStructure.Database;

// A class for storing most of SQL commands which will be used for transferring data from and to the database.
public abstract class SQLCommand {
   // The list of table columns in table customer details and booking details in the database.   
    public static final String BookingID  = "BookingID";
    public static final String CustomerName = "CustomerName";
    public static final String ContactNumber = "ContactNumber";
    public static final String DateBook = "DateBook";
    public static final String TimeBook = "TimeBook";
    public static final String TableBook  = "TableBook";
    public static final String Guests = "Guests";
    
    public static final String end = ";";
    // this command is used for initialising tables in the database every time when the database is connected or firstly created.
  protected static final String DBInitialiser = "CREATE TABLE IF NOT EXISTS CustomerDetails(\n" +
                                               "CustomerName VARCHAR(50) NOT NULL PRIMARY KEY,\n" +
                                               "ContactNumber CHAR(11) NOT NULL UNIQUE,\n" +
                                               "UNIQUE (CustomerName, ContactNumber) ON CONFLICT ABORT);\n" +

                                                "CREATE TABLE IF NOT EXISTS BookingDetails(\n" +
                                                "BookingID INTEGER PRIMARY KEY UNIQUE,\n" +
                                                "CustomerName VARCHAR(50) NOT NULL,\n" +
                                                "DateBook TEXT NOT NULL,\n" +
                                                "TimeBook TEXT NOT NULL,\n" +
                                                "TableBook UNSIGNED INTEGER  NOT NULL,\n" +
                                                "Guests UNSIGNED INTEGER NOT NULL,\n" +
                                                "FOREIGN KEY (CustomerName) REFERENCES CustomerDetails(CustomerName) ON UPDATE CASCADE ON DELETE CASCADE,\n" +
                                                "UNIQUE (DateBook, TimeBook, TableBook) ON CONFLICT ABORT);\n" +
                                    
                                                "CREATE TABLE IF NOT EXISTS FoodDetails(\n" +
                                                "BookingID INTEGER NOT NULL,\n" +
                                                "Item VARCHAR(30) NOT NULL,\n" +
                                                "Quantity UNSIGNED INTEGER NOT NULL,\n" +
                                                "FOREIGN KEY (BookingID) REFERENCES BookingDetails(BookingID) ON UPDATE CASCADE ON DELETE CASCADE,\n" +
                                                "UNIQUE (BookingID, Item) ON CONFLICT ABORT);\n" +

                                                "CREATE TABLE IF NOT EXISTS AdditionalDetails(\n" +
                                                "BookingID INTEGER NOT NULL PRIMARY KEY UNIQUE,\n" +
                                                "Description TEXT NOT NULL,\n" +
                                                "FOREIGN KEY (BookingID) REFERENCES BookingDetails (BookingID) ON UPDATE CASCADE ON DELETE CASCADE);";
 
// this command is used for pull the common data items for displaying in the table in the program. 
public static final String $generateData  = "SELECT CustomerDetails.ContactNumber, BookingID, BookingDetails.CustomerName, DateBook,  TimeBook,"
                                                                    + "TableBook, Guests FROM CustomerDetails, BookingDetails\n"
                                                                    + "WHERE BookingDetails.CustomerName = CustomerDetails.CustomerName\n"
                                                                    + "AND Date(BookingDetails.DateBook) >= Date(\"now\")\n";
                                                                    
// these three command lists below are used for pulling data based-on user's sort query.
public static final String $orderByDate = $generateData +" ORDER BY Date(BookingDetails.DateBook)" ;
public static final String $orderByCustomerName = $generateData + " ORDER BY CustomerDetails.CustomerName";
public static final String $orderByBookingID =  $generateData + " ORDER BY BookingID";

/* these two commands are used for limiting the number of rows and set for ascending or descending,
they are used with combination of pulling data into tables in the program.
*/
public static final String $LIMITHOMEDATA = " DESC LIMIT 11;", $LIMITLISTDATA = " ASC LIMIT 100;";

// these 
public static final String $selectCustomerDetails = "SELECT ContactNumber FROM CustomerDetails, BookingDetails "
                                                                            + "WHERE CustomerDetails.CustomerName = BookingDetails.CustomerName "
                                                                            + "AND BookingDetails.BookingID = ",
                                    $selectBookingDetails = "SELECT CustomerName, DateBook, TimeBook, TableBook, Guests From BookingDetails WHERE BookingID = ",
                                    $selectFoodDetails =  "SELECT Item FROM FoodDetails WHERE BookingID = ",
                                    $selectAdditionalDetails = "SELECT Description FROM AdditionalDetails WHERE BookingID = ";

//  pull data from database to the program and display in the program table. 
public static final String $generateHomeData = $orderByBookingID + $LIMITHOMEDATA;
public static final String $generateListData = $orderByBookingID + $LIMITLISTDATA;

// remove a record from database from specified customer name.
public static final String $removeAllData = "DELETE FROM CustomerDetails WHERE CustomerName = \"";

// add order details from program input to database.
public static String $AddCustomerDetails = "INSERT OR REPLACE  INTO CustomerDetails (CustomerName, ContactNumber)  VALUES ";
public static final String $AddBookingDetails = "INSERT OR REPLACE INTO BookingDetails (CustomerName, DateBook, TimeBook, TableBook, Guests) VALUES ";
public static final String $AddAdditionalDetails = "INSERT OR REPLACE INTO AdditionalDetails (BookingID, Description) VALUES ";
public static final String $AddFoodDetails = "INSERT OR REPLACE INTO FoodDetails (BookingID, Item, Quantity) VALUES ";

// remove order from data
public static final String $removeRecord = "DELETE FROM BookingDetails WHERE BookingID = ";
}