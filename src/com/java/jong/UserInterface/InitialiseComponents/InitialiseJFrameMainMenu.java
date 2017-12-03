package com.java.jong.UserInterface.InitialiseComponents;

import com.java.jong.UserInterface.JButton.InitialiseJButtonComponents;
import com.java.jong.UserInterface.JMenu.InitialiseJMenu;
import com.java.jong.UserInterface.ComponentFactory.BuildJLayeredPane;
import com.java.jong.UserInterface.JDialog.JDialogSort;
import com.java.jong.UserInterface.JLabel.JLabelDateTime;
import com.java.jong.UserInterface.JTextComponent.JTextFieldSearch;


public class InitialiseJFrameMainMenu {
    
     // initialise components which would be added in JFrameMainMenu
    public InitialiseJFrameMainMenu(){
       new InitialiseJButtonComponents();
       new InitialiseJMenu();
       new BuildJLayeredPane();
       new JTextFieldSearch();
       new JDialogSort();
       new JLabelDateTime();
    }
}