/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */
package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JTextField.JTextFieldQuerySearchListener;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.JTextComponent.JTextFieldSearch;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonSearch {
        public static BuildJButton buttonSearch, buttonClear;
        
        public JButtonSearch(){
        buttonSearch = new BuildJButton(
                                       LanguageLoader.Language("BTNSEARCH"), 590, 40, 75, 30);
        buttonSearch.addActionListener(new JTextFieldQuerySearchListener());
        
        buttonClear = new BuildJButton(
                                    LanguageLoader.Language("BTNCLEAR"), 670, 40, 75, 30);
        buttonClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              JTextFieldSearch.textField.setText("");
              JTableTemplate.refreshTableData();
            }
            
        });
        }
}
