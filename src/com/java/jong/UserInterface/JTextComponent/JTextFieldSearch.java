/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JTextComponent;

import com.java.jong.UserInterface.EventsListener.JTextField.JTextFieldQuerySearchListener;
import javax.swing.JTextField;

public class JTextFieldSearch {
    public static JTextField textField;
    
    // initialise JTextBoxSearch
    public JTextFieldSearch(){
    textField = new JTextField(20);
    textField.setBounds(440, 40, 150, 30);
    textField.addActionListener(new JTextFieldQuerySearchListener());
    textField.addActionListener(new JTextFieldQuerySearchListener());
    }
    
}
