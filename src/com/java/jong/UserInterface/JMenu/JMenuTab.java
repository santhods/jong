package com.java.jong.UserInterface.JMenu;

import javax.swing.JMenuBar;

public class JMenuTab extends JMenuBar{
            public JMenuBar MenuBar;
            
            // initialise JMenuBar and its sub-components to be added in the system
            public JMenuTab(){
                MenuBar = new JMenuBar();
                MenuBar.add(JMenuTabFile.TabFile, 0);
                MenuBar.add(JMenuTabHelp.TabHelp, 1);
                MenuBar.add(JMenuTabAbout.TabAbout, 2);
            }
            
}
