package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonListListener;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonList {
    public static BuildJButton ButtonList;
    
    protected JButtonList(){
            ButtonList = new BuildJButton(
            LanguageLoader.Language("BTNLIST"),
            5, 175, 120, 75);
            ButtonList.addActionListener(new JButtonListListener());
    }
}