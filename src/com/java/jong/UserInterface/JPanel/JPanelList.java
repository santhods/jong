package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JScrollPane.JScrollPaneTable;

public class JPanelList extends BuildJPanel{
    public static BuildJPanel PnlList = new BuildJPanel();
    
    // initialise JPanelList
  {
    PnlList.add(JScrollPaneTable.TableListScrollPane);
} 
    
}
