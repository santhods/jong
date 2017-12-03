package com.java.jong.UserInterface.JMenu;


public class InitialiseJMenu {
    
    // initialise JMenu components to be added in JFrameMainMenu
    public InitialiseJMenu(){
        JMenuTab loadMenuTab = new JMenuTab();
        JMenuTabAbout loadMenuAbout = new JMenuTabAbout();
        JMenuTabFile loadMenuFile = new JMenuTabFile();
        JMenuTabHelp loadMenuHelp = new JMenuTabHelp();
        JMenuItemFile loadItemFile = new JMenuItemFile();
        JMenuItemHelp loadItemHelp = new JMenuItemHelp();
        JMenuItemAbout loadItemAbout = new JMenuItemAbout(); 
        JMenuLanguageOptions loadLanguageOptions = new JMenuLanguageOptions();
    }
    
}
