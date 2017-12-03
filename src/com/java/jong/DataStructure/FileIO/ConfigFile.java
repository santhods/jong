package com.java.jong.DataStructure.FileIO;

import com.java.jong.DataStructure.ObjectLib;
import java.io.*;
import java.util.Properties;

// this class is used for write and read the system configuration file.
public class ConfigFile extends MakeFile{
    private final String  SYSTEMLANG = "SYSTEMLANG",  NIMBUS = "NIMBUS",  ISSETUP = "ISSETUP";
 
    public ConfigFile() {
        propertiesFile = new Properties();
        dir = new File(path + "config.properties");
    }
    // read configuration.properties and set all values into ObjectLib class.
    @Override
    public void readFile() throws IOException{
           FileInputStream readFile = new FileInputStream(dir);
           propertiesFile.load(readFile);
            
            ObjectLib._SystemLanguage_ = propertiesFile.getProperty(SYSTEMLANG);
            ObjectLib.Nimbus = Integer.parseInt(propertiesFile.getProperty(NIMBUS));
            ObjectLib.isSetup = Boolean.parseBoolean(propertiesFile.getProperty(ISSETUP));
    }
    
// set configuration.properties values from ObjectLib class.
    @Override
    public void writeFile() throws IOException{
           FileOutputStream writeFile = new FileOutputStream(dir);
                
           propertiesFile.setProperty(SYSTEMLANG, ObjectLib._SystemLanguage_);
           propertiesFile.setProperty(NIMBUS, String.valueOf(ObjectLib.Nimbus));
           propertiesFile.setProperty(ISSETUP, String.valueOf(ObjectLib.isSetup));
                
           propertiesFile.store(writeFile, null);
        
    }
}