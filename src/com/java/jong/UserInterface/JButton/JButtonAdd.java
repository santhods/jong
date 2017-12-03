package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.Language.LanguageLoader;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonAddListener;


public class JButtonAdd{
    public static BuildJButton ButtonAdd;
    
    protected JButtonAdd() {
            ButtonAdd = new BuildJButton(
            LanguageLoader.Language("BTNADD"),
            5, 20, 90, 50);
            ButtonAdd.addActionListener(new JButtonAddListener());
    }
 
}