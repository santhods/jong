package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JLabel.JLabelSummary;

public class JPanelSummary extends  BuildJPanel{
    public static BuildJPanel PnlSummary = new BuildJPanel();
    
    // initialise JPanelSummary
    protected JPanelSummary(){
        new JLabelSummary();
        PnlSummary.add(JLabelSummary.noOfBookings);
        PnlSummary.add(JLabelSummary.bookings);
        
        PnlSummary.add(JLabelSummary.noOfCustomers);
        PnlSummary.add(JLabelSummary.customers);
        
        PnlSummary.add(JLabelSummary.noOfFoodItems);
        PnlSummary.add(JLabelSummary.foodItems);
        
        JLabelSummary.setSummaryValues();
    }

}
