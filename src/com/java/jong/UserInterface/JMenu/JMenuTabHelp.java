package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JMenu;

public class JMenuTabHelp extends JMenu{
        protected static JMenu TabHelp = new JMenu(LanguageLoader.Language("MENUHELP"));
        // initialise JMenuTabHelp and its sub-components to JMenuHelp
        {
            TabHelp.add(JMenuItemHelp.Support, 0);
            TabHelp.add(JMenuItemHelp.Manual, 1);
        }
}
