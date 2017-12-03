/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JDialog;

import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

// this class is the template for password creation and manipulation dialogs
public class JDialogPassword {
    protected JButton acceptPasswordButton, cancelPasswordButton;
    protected static JPasswordField passwordField1, passwordField2;
    protected static JDialog dialog;
    protected JLabel  newPasswordLabel, confirmPasswordLabel;
    
    // initialise and add components to password entry dialog
    protected JDialogPassword(){
   
                dialog = new JDialog(JFrameMainMenu.JFrameMainMenu, true);
                dialog.setLayout(null);
                dialog.setBounds(400, 200, 300, 200);
                
                newPasswordLabel = new JLabel();
                confirmPasswordLabel = new JLabel();
                newPasswordLabel.setBounds(10, 10, 120, 20);
                confirmPasswordLabel.setBounds(10, 50, 120, 20);
                
                passwordField1 = new JPasswordField(20);
                passwordField2 = new JPasswordField(20);  
                passwordField1.setBounds(140, 10, 150, 30);
                passwordField2.setBounds(140, 50, 150, 30);
                
                acceptPasswordButton = new JButton(LanguageLoader.Language("OK"));
                cancelPasswordButton = new JButton(LanguageLoader.Language("CANCEL"));
                acceptPasswordButton.setBounds(30, 100, 100, 30);
                cancelPasswordButton.setBounds(150, 100, 100, 30);    
                cancelPasswordButton.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }  
                });
       
    }
}