/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.FileIO;

import com.java.jong.DataStructure.Pathing.PathGenerator;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

// This class is an abstract class for manipulating file.
public abstract class MakeFile {
    Properties propertiesFile = null; // properties file object
    File dir = null;  // directory
    final String path = PathGenerator.getHomePath() + System.getProperty("file.separator") ; // file path
    FileInputStream input; // input file
    FileOutputStream output; // output file
    public abstract void readFile() throws IOException; // abstract method for reading a file.
    public abstract void writeFile() throws IOException; // abstract method for writing a file.
    
    // display error message in terms of file writing.
    public static void displayError(Component  comp, Exception e){
    JOptionPane.showMessageDialog(comp, e, LanguageLoader.Language("FILEWRITEERROR"), JOptionPane.ERROR_MESSAGE);
    }
}
