package com.java.jong.UserInterface.EventsListener.Automatic;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JButton.JButtonPasswords;


public abstract class PasswordInitialiser {
            /* this method is used to check whether the password has yet set to the program,
                 which prevent setup a new password when there is an existing one,
                or change or remove password when there is not password set up. */
    
            public static void check(){
                 if  (ObjectLib.isPasswordSetup){
                        JButtonPasswords.buttonSetup.setEnabled(false);
                        JButtonPasswords.buttonChange.setEnabled(true);
                        JButtonPasswords.buttonRemove.setEnabled(true);
                 }  else {
                     JButtonPasswords.buttonSetup.setEnabled(true);
                     JButtonPasswords.buttonChange.setEnabled(false);
                     JButtonPasswords.buttonRemove.setEnabled(false);
                 }
            }
}
