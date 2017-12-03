package com.java.jong.UserInterface.EventsListener.JMenu;

import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;

public class JMenuItemHelpListener implements ActionListener{
 // this method is used for opening the associated set of operations based on user input in JMenuItemHelp
    @Override
    public void actionPerformed(ActionEvent e) {
            int command = Integer.parseInt(e.getActionCommand());
            
            switch (command){ 
                // this option will launch email program with subject 'help' and address to the developer for help in the system.
                case (1):
                            try {
                            Desktop.getDesktop().mail(URI.create("mailto:bt6512@reigate.ac.uk?subject=Help"));
                            } catch (IOException ex) {
                                    JOptionPane.showMessageDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("EMAILERROR"), LanguageLoader.Language("CANNOTMAIL"), JOptionPane.ERROR_MESSAGE);
                                }
                
                // this option will launch or open the new tab of the default web browser with address to system developer's website.
                case (2):
                            try {
                            Desktop.getDesktop().browse(URI.create("http://www.jong.cu.cc"));
                            } catch (IOException ex){}
                            
                    break;
                    
               
            
            }
    
    }
}
