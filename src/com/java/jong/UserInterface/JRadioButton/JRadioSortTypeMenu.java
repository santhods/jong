/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JRadioButton;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class JRadioSortTypeMenu {
    public static JRadioButton date ,customerName,bookingId;
    private static ButtonGroup buttonGroup = new ButtonGroup();
    
    // initialise sorting options in JDialogSort
    public JRadioSortTypeMenu(){
        date = new JRadioButton(LanguageLoader.Language("COLUMNDATE"), true);
        customerName = new JRadioButton(LanguageLoader.Language("LABELCUSTOMERNAME"));
        bookingId = new JRadioButton(LanguageLoader.Language("COLUMNID"));
        
        date.setBounds(20, 20, 200, 20);
        customerName.setBounds(20, 40, 200, 20);
        bookingId.setBounds(20, 60, 200, 20);
        
        buttonGroup.add(date);
        buttonGroup.add(customerName);
        buttonGroup.add(bookingId);
   } 
}
