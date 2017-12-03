package com.java.jong.DataStructure;

/*
The versatile and uncategorised list of object properties used in a program.
*/

public abstract class ObjectLib {
            public static final String thai = "th", english = "en"; // the system language options
            public static String _SystemLanguage_; // the system language
            public static final int _FrameMainMenuWidth = 750; // The standard width (in pixels) of each main menu panel in BuildJPanel
            public static final int _FrameMainMenuHeight = 500; // The standard height (in pixels) of each main menu panel in BuildJPanel
            public static boolean isSetup; // the boolean value to see if the program is been yet setup.
            public static int Nimbus; // the int value state the enable of Nimbus look-and-feel in the program.
            public static int selectedTable; // the temporary int value for storing the selected table from JRadioBuSeatSelection class.
            public static Order order; // An order object based-on class Order for storing a temporary booking values.
            public static boolean isPasswordSetup; // the boolean value to see if the program has yet set up the password.
            public static String passValue = null; // the temporary value for storing the password of the program if password has been setup in the program.
            public static boolean isEdit = false; // the boolean value specifying whether the booking is made new or edit the existing one, true for modifying an existing booking, false for creating a new booking.
            public static boolean isAuthenticated; // the boolean value specifying whether the password entry is authenticated if password has already set up.
}