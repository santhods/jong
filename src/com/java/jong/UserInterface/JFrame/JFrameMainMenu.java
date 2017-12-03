package com.java.jong.UserInterface.JFrame;


import com.java.jong.UserInterface.Language.LanguageLoader;
import com.java.jong.UserInterface.JButton.JButtonHome;
import com.java.jong.UserInterface.JButton.JButtonList;
import com.java.jong.UserInterface.JButton.JButtonModify;
import com.java.jong.UserInterface.JButton.JButtonRemove;
import com.java.jong.UserInterface.JButton.JButtonSummary;
import com.java.jong.UserInterface.JButton.JButtonSettings;
import com.java.jong.UserInterface.JButton.JButtonSort;
import com.java.jong.UserInterface.JButton.JButtonAdd;
import com.java.jong.UserInterface.ComponentFactory.BuildJFrame;
import com.java.jong.DataStructure.*;
import com.java.jong.UserInterface.ComponentFactory.BuildJLayeredPane;
import com.java.jong.UserInterface.EventsListener.JFrame.JFrameMainMenuListener;
import com.java.jong.UserInterface.InitialiseComponents.InitialiseJFrameMainMenu;
import com.java.jong.UserInterface.JButton.JButtonSearch;
import com.java.jong.UserInterface.JLabel.JLabelDateTime;
import com.java.jong.UserInterface.JMenu.JMenuTab;
import com.java.jong.UserInterface.JTextComponent.JTextFieldSearch;
import javax.swing.WindowConstants;

public class JFrameMainMenu{
    public static BuildJFrame JFrameMainMenu;
    
   // add all the required components to JFrameMainMenu 
   public JFrameMainMenu(){
                new InitialiseJFrameMainMenu();
       
   JFrameMainMenu = new BuildJFrame(
                       LanguageLoader.Language("PROGRAMNAME"),
                       ObjectLib._FrameMainMenuWidth, ObjectLib._FrameMainMenuHeight, 150, 60);
   
     JFrameMainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     JFrameMainMenu.addWindowListener(new JFrameMainMenuListener());
     JFrameMainMenu.requestFocus();
     
     JFrameMainMenu.setJMenuBar(new JMenuTab().MenuBar);
     JFrameMainMenu.add(BuildJLayeredPane.MenuSectionsPane);
     JFrameMainMenu.add(JButtonHome.ButtonHome);
     JFrameMainMenu.add(JButtonList.ButtonList);
     JFrameMainMenu.add(JButtonSummary.ButtonSummary);
     JFrameMainMenu.add(JButtonSettings.ButtonSettings);
     JFrameMainMenu.add(JButtonAdd.ButtonAdd);
     JFrameMainMenu.add(JButtonModify.ButtonModify);
     JFrameMainMenu.add(JButtonRemove.ButtonRemove);
     JFrameMainMenu.add(JButtonSort.ButtonSort);
     JFrameMainMenu.add(JTextFieldSearch.textField);
     JFrameMainMenu.add(JButtonSearch.buttonSearch);
     JFrameMainMenu.add(JButtonSearch.buttonClear);
     JFrameMainMenu.add(JLabelDateTime.dateTimeLabel);
     JFrameMainMenu.setResizable(false);
   }
}