package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonSortListener;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonSort {
    public static BuildJButton ButtonSort;
    
    protected JButtonSort(){
           ButtonSort = new BuildJButton(LanguageLoader.Language("BTNSORT"),
           345, 20, 90, 50);
           ButtonSort.addActionListener(new JButtonSortListener());
    }
}
