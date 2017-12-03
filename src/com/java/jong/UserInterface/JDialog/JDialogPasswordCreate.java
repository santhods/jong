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

public class JDialogPasswordCreate extends JDialogPassword{
    
              // initialise JDialogPasswordCreate to be added
            public JDialogPasswordCreate(){
                super();
                
                dialog.setTitle(LanguageLoader.Language("CREATEPASSWORD"));
               
                newPasswordLabel.setText(LanguageLoader.Language("NEWPASSWORD"));
                confirmPasswordLabel.setText(LanguageLoader.Language("CONFIRMPASSWORD"));
                
                
                this.acceptPasswordButton.addActionListener(new CreatePasswordListener());
                passwordField2.addActionListener(new CreatePasswordListener());
                
                dialog.add(this.newPasswordLabel);
                dialog.add(this.confirmPasswordLabel);
                dialog.add(passwordField1);
                dialog.add(passwordField2);
                dialog.add(this.acceptPasswordButton);
                dialog.add(this.cancelPasswordButton);
                
                dialog.setVisible(true);
            }

}
// validate password entry and setup a new password
class CreatePasswordListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isInputValidated()){
           ObjectLib.passValue = String.valueOf(JDialogPassword.passwordField2.getPassword());
          
            try { 
                ObjectLib.isPasswordSetup = true;
                new PasswordFile().writeFile();
                JDialogPassword.dialog.dispose();
            } catch (IOException ex) {
                MakeFile.displayError(JDialogPassword.dialog, ex);
                ex.printStackTrace();
                }
               
                PasswordInitialiser.check();
        }
    }
    // check password entry validation
    public static boolean isInputValidated(){
        return (String.valueOf(JDialogPassword.passwordField1.getPassword()).equals(String.valueOf(JDialogPassword.passwordField2.getPassword())));
    }
}