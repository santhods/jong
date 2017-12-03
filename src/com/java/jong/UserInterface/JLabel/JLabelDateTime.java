/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JLabel;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.Timer;

public class JLabelDateTime {
    public static JLabel dateTimeLabel;
    private DateFormat format;
    private final String sep = "\'";

    // set the date and time JLabels
    public JLabelDateTime(){
    dateTimeLabel = new JLabel();
    dateTimeLabel.setLayout(null);
    dateTimeLabel.setBounds(440, 10, 300, 40);
    dateTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
    
    format = new SimpleDateFormat( sep + LanguageLoader.Language("LABELDATE") + sep
            + "     dd - MM - YYYY      " + sep + LanguageLoader.Language("LABELTIME") + sep + "    HH:mm:ss",
            new Locale(ObjectLib._SystemLanguage_));
    
        new Timer(0, new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
           dateTimeLabel.setText(format.format(new Date())); 
        }
    }).start();
    }
}
