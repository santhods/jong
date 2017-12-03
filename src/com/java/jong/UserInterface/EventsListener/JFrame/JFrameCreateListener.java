package com.java.jong.UserInterface.EventsListener.JFrame;

import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JFrameCreateListener implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
      // hide JFrameMainMenu from the view when JFrameCreate is opened.
        JFrameMainMenu.JFrameMainMenu.setVisible(false);
    }

    @Override
    public void windowClosing(WindowEvent e) {
    
    }
    

    @Override
    public void windowClosed(WindowEvent e) {       
        // show JFrameMainMenu from the view when JFrameCreate is closed.
            JFrameMainMenu.JFrameMainMenu.setVisible(true);
    }

    @Override
    public void windowIconified(WindowEvent e) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
    
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
      
    }
    
}
