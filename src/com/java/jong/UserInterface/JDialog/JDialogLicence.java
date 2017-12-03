package com.java.jong.UserInterface.JDialog;

import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JDialogLicence{
   public static JDialog DialogLicence;
   private final JScrollPane paneForLicence;
   private final JTextArea LicenceArea = new JTextArea();
   
   // initialise JDialogLicence to be added and displayed
   public JDialogLicence() throws IOException{
       LicenceArea.setBounds(0, 0, 490, 450);
       LicenceArea.read(new FileReader(new File("Licence/gpl-3.0.txt")), null);
       LicenceArea.setEditable(false);
       LicenceArea.setWrapStyleWord(true);
       paneForLicence = new JScrollPane(LicenceArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       paneForLicence.setBounds(0, 0, LicenceArea.getWidth(), LicenceArea.getHeight());
    
       DialogLicence = new JDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("LICENCE"), false);
       DialogLicence.setResizable(false);
       DialogLicence.setBounds(250, 50, paneForLicence.getWidth(), paneForLicence.getHeight());
       DialogLicence.add(paneForLicence);
   }
}