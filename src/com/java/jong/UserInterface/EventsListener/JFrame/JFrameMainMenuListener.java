package com.java.jong.UserInterface.EventsListener.JFrame;

import com.java.jong.DataStructure.FileIO.ConfigFile;
import com.java.jong.DataStructure.FileIO.MakeFile;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class JFrameMainMenuListener implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
               
    }

    @Override
    public void windowClosing(WindowEvent e) {
        /* since this system is a single windowed, which means that as soon as JFrameMainMenu is closed, the system will exit;
            this method will save the config before the system exit.*/
        try {
            new ConfigFile().writeFile();
        } catch (IOException ex){
            // show error message when config could not be opened, written, saved, or closed.
            MakeFile.displayError(JFrameMainMenu.JFrameMainMenu, ex);
            }
        
    }

    @Override
    public void windowClosed(WindowEvent e) {

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
