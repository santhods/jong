package com.java.jong.Setup;

import com.java.jong.DataStructure.Database.SQLConnect;
import com.java.jong.DataStructure.FileIO.ConfigFile;
import com.java.jong.DataStructure.FileIO.PasswordFile;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.EventsListener.Automatic.PasswordInitialiser;
import com.java.jong.UserInterface.JDialog.JDialogPasswordEntry;
import com.java.jong.UserInterface.JDialog.JDialogSetup;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/* This class is used to initialise the system in based-on configuration files existance, this will be called every when system
    starts to check the existance for all the required files to be created.*/
public class InitialSetup {
 
        public InitialSetup() {
           try {
                    new SQLConnect();
                    new ConfigFile().readFile(); // check the existance and read the system's configuration file.
                    
                   // apply custom interface if system configuration stated to have custom look-and-feel.
                    if (ObjectLib.Nimbus == 1) applyNimbus();                     
           } catch (IOException e){
               /* when configuration file is not found, means that there is not configuration, therefore new system is needed,
                    therefore an error message state to file is not found will appear and new setup dialog will appear afterwards
                    for new system configuration.*/
               JOptionPane.showMessageDialog(null, "Error: " + e, "Cannot read the config file", JOptionPane.ERROR_MESSAGE);
               new JDialogSetup();               
           }
           
           try {
                   new PasswordFile().readFile();    //check for password file existance and read the system's password file.          
                   
           } catch (IOException e){
               /* if file is not found, means that there is no password protected, means that the password hasn't been set up,
                    therefore password setup state will be assigned to false.*/
               ObjectLib.isPasswordSetup = false;
            }
           
           // this part of the code will be executed everytime if system password has been set up and 
           if (ObjectLib.isPasswordSetup == true){
                     if (ObjectLib.isAuthenticated == true) {
                            new JFrameMainMenu();
                            ObjectLib.isAuthenticated = false;
                                } else if (ObjectLib.isAuthenticated == false){
                                        new JDialogPasswordEntry();
                                         if (ObjectLib.isAuthenticated == true){
                                             new JFrameMainMenu();
                                             ObjectLib.isAuthenticated = false;
                                         }  else {
                                             JOptionPane.showMessageDialog(null, "System login error, system will now exit", "Cannot login", JOptionPane.ERROR_MESSAGE);
                                             System.exit(0);
                                            }
                                    }
                    
            } else {
                            new JFrameMainMenu();
                            ObjectLib.isAuthenticated = false;
                            
                }
                 PasswordInitialiser.check();
}
          
        
  
        public static void applyNimbus(){
            try {
                        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                                   if ("Nimbus".equals(info.getName())) {
                                        UIManager.setLookAndFeel(info.getClassName());
                                   break;
                                }
                         }
            }  catch (Exception e) {
           JOptionPane.showMessageDialog(null, LanguageLoader.Language("NIMBUSERROR"),
                                                                  LanguageLoader.Language("NIMBUSERRORMESSAGE"),
                                                                  JOptionPane.ERROR_MESSAGE);
                }
        }
}