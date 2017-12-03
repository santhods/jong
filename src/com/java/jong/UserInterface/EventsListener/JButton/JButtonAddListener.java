package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.DataStructure.ObjectLib;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.java.jong.UserInterface.JFrame.JFrameCreate;


public class JButtonAddListener implements ActionListener{
    
    // launch JFrameCrate when JButtonAdd is clicked in JFrameMainMenu.
    @Override
    public void actionPerformed(ActionEvent e) {
            ObjectLib.isEdit = false;
            new JFrameCreate();
    }
}
