package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJLayeredPane;
import com.java.jong.UserInterface.JPanel.JPanelList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonListListener implements ActionListener{
 // switch JPanelList to the top layer of JLayeredPane, the topmost layer will be shown in the system.
    @Override
    public void actionPerformed(ActionEvent e) {
        BuildJLayeredPane.MenuSectionsPane.moveToFront(JPanelList.PnlList);
    }
    
}
