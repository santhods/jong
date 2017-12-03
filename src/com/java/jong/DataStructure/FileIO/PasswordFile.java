/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.FileIO;

import com.java.jong.DataStructure.ObjectLib;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// This class is used to manipulate password file for the system.
public class PasswordFile extends MakeFile{
    private final String ISSETUP = "SETUP", VALUE = "VALUE"; // values to be read and written in password properties file.

    
    public PasswordFile(){
    dir = new File(path + "password.properties");
    propertiesFile = new Properties();
    }
    /* an overridden method to read password configuration and value from password properties file
        and set these values and configuration to the system.*/
    @Override
    public void readFile() throws IOException {
            input = new FileInputStream(dir);
            propertiesFile.load(input);
            
            // get values from properties file
            ObjectLib.passValue = propertiesFile.getProperty(VALUE);
            ObjectLib.isPasswordSetup  = Boolean.valueOf(propertiesFile.getProperty(ISSETUP));

        }
    /*an overridden method to write password value and configuration to password properties file
      from system password and configuration.*/
    @Override
    public void writeFile() throws IOException {
                output = new FileOutputStream(dir);
                
                // set values to properties file
                propertiesFile.setProperty(ISSETUP, String.valueOf(ObjectLib.isPasswordSetup));
                propertiesFile.setProperty(VALUE, String.valueOf(ObjectLib.passValue));
                
                propertiesFile.store(output, null);
    }
}