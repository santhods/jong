/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JLabel;
   
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Font;
import javax.swing.JLabel;


public class JLabelSettings {
     public static JLabel langLabel, guiLabel, passwordLabel;
     private final Font labelFont = new Font("Tahoma", Font.PLAIN, 20);
     
     // initialise JLabelSettings labels to be added in JFrameMainMenu.
     public JLabelSettings(){
     langLabel = new JLabel(LanguageLoader.Language("MENULANGUAGE"));
     guiLabel = new JLabel(LanguageLoader.Language("INTERFACE"));
     passwordLabel = new JLabel(LanguageLoader.Language("PASSWORD"));
     langLabel.setFont(labelFont);
     guiLabel.setFont(labelFont);
     passwordLabel.setFont(labelFont);
     
     langLabel.setBounds(10, 10, 300, 30);
     guiLabel.setBounds(10, 50, 300, 30);
     passwordLabel.setBounds(10, 90, 300, 30);
     }
     
}
