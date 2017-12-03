/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.EventsListener.JRadioButton;

import com.java.jong.DataStructure.FileIO.ConfigFile;
import com.java.jong.DataStructure.FileIO.MakeFile;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.JRadioButton.JRadioSettingsPanelOptions;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import javax.swing.JOptionPane;


public class JRadioInterfaceListener implements ItemListener{
    private boolean state = false;
    /* this method is used to change system's look-and-feel and  notify to the user
    as soon as the system's interface look-and-feel changed based on user options in settings.
    */
    @Override
    public void itemStateChanged(ItemEvent e) {
       if (e.getStateChange() == ItemEvent.SELECTED){
           if (JRadioSettingsPanelOptions.defaultGui.isSelected()){
               ObjectLib.Nimbus = 0;
               state = true;
           }
           else if (JRadioSettingsPanelOptions.nimbusGui.isSelected()){
               ObjectLib.Nimbus = 1;
               state = true;
           }    
           System.out.println(ObjectLib.Nimbus);
       }
       
      if (state){
               stateChanged(LanguageLoader.Language("INTERFACECHANGED"));
            }
          
    }
    // check whether the user interface look-and-feel option has changed at run time
   public static void stateChanged(String subject){
                 JOptionPane.showMessageDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("RESTART"), subject, JOptionPane.INFORMATION_MESSAGE);    
                 try {
                     new ConfigFile().writeFile();
                     JFrameMainMenu.JFrameMainMenu.dispose();
                    System.exit(0);
                 }  catch (IOException e){
                      MakeFile.displayError(JFrameMainMenu.JFrameMainMenu, e);
                 }                 
           }
}
