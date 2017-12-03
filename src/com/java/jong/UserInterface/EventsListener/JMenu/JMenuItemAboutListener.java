package com.java.jong.UserInterface.EventsListener.JMenu;

import com.java.jong.UserInterface.JDialog.JDialogAbout;
import com.java.jong.UserInterface.JDialog.JDialogLicence;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;


public class JMenuItemAboutListener implements ActionListener{
    // this method is used for opening the associated set of operations based on user input in JMenuItemAbout
    @Override
    public void actionPerformed(ActionEvent e) {
            
        try {
            new JDialogLicence();
            new JDialogAbout();
        } catch (IOException ex) {
            }
        int command = Integer.parseInt(e.getActionCommand());
            
            switch (command){
                // the first menu option will launch the local email program with subject "report problem" and address to the developer for reporting system's false.
                case (1): 
        try {
            Desktop.getDesktop().mail(URI.create("mailto:bt6512@reigate.ac.uk?subject=Report problem"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("EMAILERROR"), LanguageLoader.Language("CANNOTMAIL"), JOptionPane.ERROR_MESSAGE);
        }
                    break;
                  // this second option will display system's licence dialog.
                case (2): 
                    // Licence menu
                    JDialogLicence.DialogLicence.setVisible(true);
                    break;
                  // this third option will display system's information dialog.
                case (3): // About menu
                    JDialogAbout.DialogAbout.setVisible(true);
                    break;
            }
    }
    
}
