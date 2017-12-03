package com.java.jong.UserInterface.Main;

import com.java.jong.Setup.InitialSetup;
import javax.swing.SwingUtilities;

public class Main {
    // the main method for starting system.
    public static void main(String[] args){
                SwingUtilities.invokeLater(new Runnable() {
                        public void run(){  
                        new InitialSetup();
                        }
                });
    }
}
