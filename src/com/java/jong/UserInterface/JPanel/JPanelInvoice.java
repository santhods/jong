/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JPanel;

import javax.swing.JPanel;
import org.icepdf.ri.common.SwingViewBuilder;

public class JPanelInvoice {
    public JPanel invoicePanel;
    
    // build JPanelInvoice for displaying print version of booking details
    public JPanelInvoice(SwingViewBuilder viewer){
        invoicePanel = viewer.buildViewerPanel();
    }
}
