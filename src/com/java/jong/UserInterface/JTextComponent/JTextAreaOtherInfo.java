package com.java.jong.UserInterface.JTextComponent;

import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JTextArea;

public class JTextAreaOtherInfo extends JTextArea{
    public static JTextArea OtherInfo;
    // initialise text area
    protected JTextAreaOtherInfo(){
        OtherInfo = new JTextArea();
        OtherInfo.setLineWrap(true);
        OtherInfo.setWrapStyleWord(true);
        OtherInfo.setFont(new Font("Tahoma", BOLD, 13));  
        OtherInfo.setVisible(true);
        OtherInfo.setEnabled(true);
    }
    
 }
