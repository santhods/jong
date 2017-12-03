package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JScrollPane.JScrollPaneTable;

public class JPanelHome extends BuildJPanel{
    public static BuildJPanel PnlHome = new BuildJPanel();
    
    // initialise JPanelHome
    protected JPanelHome(){
    new JScrollPaneTable();
    PnlHome.add(JScrollPaneTable.TableHomeScrollPane);
    }  
    
}