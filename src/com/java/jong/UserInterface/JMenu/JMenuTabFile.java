package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JMenu;

public class JMenuTabFile extends JMenu{
            protected static JMenu TabFile = new JMenu(LanguageLoader.Language("MENUFILE"));
          // initialise JMenuTabFile and its sub-components to be added in JMenuFile
            {
                    TabFile.add(JMenuItemFile.printList, 0);
                    TabFile.add(JMenuItemFile.saveList, 1);
                    TabFile.add(JMenuItemFile.Language, 2);  
                    TabFile.add(JMenuItemFile.Exit, 3);

                    TabFile.insertSeparator(3);
            }
}
