package com.java.jong.UserInterface.JMenu;


import com.java.jong.UserInterface.EventsListener.JMenu.JMenuItemFileListener;
import com.java.jong.UserInterface.Language.LanguageLoader;
import static com.java.jong.UserInterface.JMenu.JMenuLanguageOptions.*;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class JMenuItemFile extends JMenuItem{
            protected static JMenuItem printList = new JMenuItem(LanguageLoader.Language("MENUITEMPRINT"), new ImageIcon("img/print.jpg"));
            protected static JMenuItem saveList = new JMenuItem(LanguageLoader.Language("MENUITEMSAVE"), new ImageIcon("img/saveIcon.png")) ;
            protected static JMenuItem Exit = new JMenuItem(LanguageLoader.Language("MENUITEMQUIT"), new ImageIcon("img/exit.jpg")) ;
            protected static JMenu Language = new JMenu(LanguageLoader.Language("MENULANGUAGE"));
   
                    // initialise JMenuItems to be added in JMenuFile
            {
       new JMenuLanguageOptions();
                
               Language.setIcon(new ImageIcon("img/eng.gif"));
               Language.add(ThaiOpt, 0);
               Language.add(EngOpt, 1);
               
               printList.setActionCommand("1");
               saveList.setActionCommand("2");
               Exit.setActionCommand("3");
               Language.setActionCommand("4");
                   
               printList.addActionListener(new JMenuItemFileListener());
               saveList.addActionListener(new JMenuItemFileListener());
               Exit.addActionListener(new JMenuItemFileListener());
              // Language.addActionListener(new ItemFileListener());
    }
}
