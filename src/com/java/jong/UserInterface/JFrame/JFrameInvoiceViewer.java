/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JFrame;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameInvoiceViewer {
    public static JFrame invoiceFrame;
    
    // add the JPanel to Frame to display booking details
    public JFrameInvoiceViewer(JPanel panel){
            invoiceFrame = new JFrame(LanguageLoader.Language("INVOICEFRAME"));
            invoiceFrame.add(panel);
            invoiceFrame.setVisible(true);
            invoiceFrame.setBounds(15, 0, 1000, 550);
            invoiceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
