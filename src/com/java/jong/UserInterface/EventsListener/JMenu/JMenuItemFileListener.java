package com.java.jong.UserInterface.EventsListener.JMenu;

import com.java.jong.DataStructure.FileIO.ConfigFile;
import com.java.jong.DataStructure.FileIO.MakeFile;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class JMenuItemFileListener implements ActionListener{
 // this method is used for opening the associated set of operations based on user input in JMenuItemFile
    @Override
    public void actionPerformed(ActionEvent e) {
        int command = Integer.parseInt(e.getActionCommand());
        
        switch (command){
            // produce print version of booking details (not working).
            case (1):
                if (JTableTemplate.isRowselected()){
                    //    Invoice.build();
                }
                break;
                
                // save system's data and refresh the table  
            case (2):
                 JTableTemplate.refreshTableData();
                 try {
                    new ConfigFile().writeFile();
                } catch (IOException ex) {
                    MakeFile.displayError(JFrameMainMenu.JFrameMainMenu, ex);
                    }
                 
                break;
                
             // save system's configuration data and exit the program.
            case (3):
            try {
                new ConfigFile().writeFile();
            } catch (IOException ex) {
                    MakeFile.displayError(JFrameMainMenu.JFrameMainMenu, ex);
                }
                System.exit(0);
                break;
        }
    }   
}
    

