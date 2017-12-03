package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.UserInterface.JFrame.JFrameCreate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonCancelListener implements ActionListener{
    // Close JFrameCreate and return to JFrameMainMenu
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrameCreate.JFrameCreate.dispose();
    }  
}
