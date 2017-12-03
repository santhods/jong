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
import javax.swing.JPasswordField;


public class JDialogPasswordChange extends JDialogPassword{
    
    // initialise JDialogPasswordChange components to be added
    public JDialogPasswordChange(){
                super();
                
                dialog.setTitle(LanguageLoader.Language("CHANGEPASSWORD"));
               
                newPasswordLabel.setText(LanguageLoader.Language("OLDPASSWORD"));
                confirmPasswordLabel.setText(LanguageLoader.Language("NEWPASSWORD"));
                
                 
                this.acceptPasswordButton.addActionListener(new ChangePasswordListener(passwordField1, passwordField2));
                passwordField2.addActionListener(new ChangePasswordListener(passwordField1, passwordField2));
                
                dialog.add(this.newPasswordLabel);
                dialog.add(this.confirmPasswordLabel);
                dialog.add(passwordField1);
                dialog.add(passwordField2);
                dialog.add(this.acceptPasswordButton);
                dialog.add(this.cancelPasswordButton);
                
                dialog.setVisible(true);
    }
        
}
class ChangePasswordListener implements ActionListener{
    private static JPasswordField fieldx, fieldy;
    protected ChangePasswordListener(JPasswordField field1, JPasswordField field2){
            fieldx = field1;
            fieldy = field2;
    }
    
    // check the password validation and perform password changing.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isInputValidated()){
           ObjectLib.passValue = String.valueOf(fieldy.getPassword());
            try {
                ObjectLib.isPasswordSetup = true;
                new PasswordFile().writeFile();
                JDialogPassword.dialog.dispose();
                
            } catch (IOException ex) {
               MakeFile.displayError(JDialogPassword.dialog, ex);
                }
            PasswordInitialiser.check();
        }
    }
    // check password validation
    public static boolean isInputValidated(){
            return !String.valueOf(fieldx.getPassword()).equals(ObjectLib.passValue)  && (String.valueOf(fieldx.getPassword()).equals(String.valueOf(fieldy.getPassword())));
    }
}
