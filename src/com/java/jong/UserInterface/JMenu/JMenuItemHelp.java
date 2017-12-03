package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.EventsListener.JMenu.JMenuItemHelpListener;
import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;


public class JMenuItemHelp extends JMenuItem{
                protected static JMenuItem Support = new JMenuItem(LanguageLoader.Language("MENUITEMSUPPORT"), new ImageIcon("img/support.png"));
                protected static JMenuItem Manual = new JMenuItem(LanguageLoader.Language("MENUITEMMANUAL"), new ImageIcon("img/manual.png"));
    
                        // initialise JMenuItems to be added in JMenuHelp
                {
            Support.setActionCommand("1");
            Manual.setActionCommand("2");
            
            Support.addActionListener(new JMenuItemHelpListener());
            Manual.addActionListener(new JMenuItemHelpListener());
            
    }
}
