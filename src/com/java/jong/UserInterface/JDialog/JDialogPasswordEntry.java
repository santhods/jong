/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JDialog;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class JDialogPasswordEntry {
    protected static JDialog passwordEntry;
    protected JPasswordField passwordField;
    protected JButton ok;
    
    // launch password entry for system authentication
    public JDialogPasswordEntry(){
            passwordEntry = new JDialog();
            passwordEntry.setModal(true);
            passwordEntry.setTitle( LanguageLoader.Language("PASSWORDENTRY"));
            passwordEntry.setBounds(400, 230, 210, 150);
            passwordEntry.setLayout(null);
            
            passwordField = new JPasswordField();
            passwordField.setBounds(10, 20,  170, 30);
            passwordField.addActionListener(new PasswordEntryListener(passwordField));
            
            ok = new JButton("OK");
            ok.setBounds(40, 70, 120, 30);
            ok.addActionListener(new PasswordEntryListener(passwordField));
            
           passwordEntry.add(passwordField);
           passwordEntry.add(ok);
            
            passwordEntry.setVisible(true);
    }
}


class PasswordEntryListener implements ActionListener{
    JPasswordField entryPoint;
    
    PasswordEntryListener(JPasswordField passingField){
        this.entryPoint = passingField;
    }
// check password validation and set authentication status
    @Override
    public void actionPerformed(ActionEvent ae) {
               if (!(String.valueOf(entryPoint.getPassword()).equals(ObjectLib.passValue))){
                    JOptionPane.showMessageDialog(null, LanguageLoader.Language("PASSWORDERROR"), JOptionPane.WANTS_INPUT_PROPERTY, JOptionPane.ERROR_MESSAGE);
               } else {
                   ObjectLib.isAuthenticated = true;
                   JDialogPasswordEntry.passwordEntry.dispose();
               }
    }
}