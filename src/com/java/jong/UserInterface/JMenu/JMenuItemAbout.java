package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.EventsListener.JMenu.JMenuItemAboutListener;
import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;


public class JMenuItemAbout extends JMenuItem{
            protected static JMenuItem Report = new JMenuItem(LanguageLoader.Language("MENUITEMREPORT"), new ImageIcon("img/report.png"));
            protected static JMenuItem Licence = new JMenuItem(LanguageLoader.Language("MENUITEMLICENCE"), new ImageIcon("img/licence.png"));
            protected static JMenuItem About = new JMenuItem(LanguageLoader.Language("MENUITEMABOUT"), new ImageIcon("img/about.jpg"));
           
        // initialise JMenuItems to be added in JMenuAbout
            {
                    Report.setActionCommand("1");
                    Licence.setActionCommand("2");
                    About.setActionCommand("3");
                    
                    Report.addActionListener(new JMenuItemAboutListener());
                    Licence.addActionListener(new JMenuItemAboutListener());
                    About.addActionListener(new JMenuItemAboutListener());
            }
}
