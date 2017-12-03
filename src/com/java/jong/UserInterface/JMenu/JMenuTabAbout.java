package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JMenu;


public class JMenuTabAbout extends JMenu{
        protected static JMenu TabAbout = new JMenu(LanguageLoader.Language("MENUABOUT"));
        
        // initialise JMenuTabAbout and its sub-components to be added in the system
        {
          TabAbout.add(JMenuItemAbout.Report, 0);
          TabAbout.add(JMenuItemAbout.Licence, 1);
          TabAbout.add(JMenuItemAbout.About, 2);
        }
}
