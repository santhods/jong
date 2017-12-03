package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJLayeredPane;
import com.java.jong.UserInterface.JPanel.JPanelSettings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonSettingsListener implements ActionListener{
 // switch JPanelSettings to the top layer of JLayeredPane, the topmost layer will be shown in the system.
    @Override
    public void actionPerformed(ActionEvent e) {
       BuildJLayeredPane.MenuSectionsPane.moveToFront(JPanelSettings.PnlSettings);
    }
    
}
