/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JDialog;

import com.java.jong.DataStructure.FileIO.MakeFile;
import com.java.jong.DataStructure.FileIO.PasswordFile;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.EventsListener.Automatic.PasswordInitialiser;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class JDialogPasswordRemove extends JDialogPassword{
    // initialise JDialogPasswordRemove to be added
    public JDialogPasswordRemove(){
                super();
                
                dialog.setTitle(LanguageLoader.Language("REMOVEPASSWORD"));
               
                newPasswordLabel.setText(LanguageLoader.Language("OLDPASSWORD"));
                confirmPasswordLabel.setText(LanguageLoader.Language("CONFIRMPASSWORD"));
                
                
                this.acceptPasswordButton.addActionListener(new RemovePasswordListener());
                passwordField2.addActionListener(new RemovePasswordListener());
                
                dialog.add(this.newPasswordLabel);
                dialog.add(this.confirmPasswordLabel);
                dialog.add(passwordField1);
                dialog.add(passwordField2);
                dialog.add(this.acceptPasswordButton);
                dialog.add(this.cancelPasswordButton);
                
                dialog.setVisible(true);
            }

}
// check password entry validation and remove password
class RemovePasswordListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isInputValidated()){
           ObjectLib.passValue = "";
           ObjectLib.isPasswordSetup = false;
           
            try {
                new PasswordFile().writeFile();
                PasswordInitialiser.check();
                JDialogPassword.dialog.dispose();
            } catch (IOException ex) {
                MakeFile.displayError(JDialogPassword.dialog, ex);
                ex.printStackTrace();
                }
        }
    }
    // check password entry validation
     boolean isInputValidated(){ 
        return (String.valueOf(JDialogPassword.passwordField1.getPassword()).equals(String.valueOf(JDialogPassword.passwordField2.getPassword())))
                && String.valueOf(JDialogPassword.passwordField1.getPassword()).equals(ObjectLib.passValue);
     }
}
  
