package com.java.jong.DataStructure.Pathing;

import java.io.File;
import java.nio.file.Paths;

// This class is used for generating the system path.
public abstract class PathGenerator {
    // This method is used for creating and connecting a directory of "Jong!" for system file handling.
    public static String getHomePath(){
            String separator = System.getProperty("file.separator");
            final String prog_name = "Jong!";
            new File(System.getProperty("user.home") + separator + prog_name).mkdir();
            return Paths.get(System.getProperty("user.home"), separator,prog_name).toString();
    }
    
}