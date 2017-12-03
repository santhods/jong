package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonSummaryListener;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonSummary {
     public static BuildJButton ButtonSummary;
    
    protected JButtonSummary(){
            ButtonSummary = new BuildJButton(
            LanguageLoader.Language("BTNSUMMARY"),
            5, 275, 120, 75);
            ButtonSummary.addActionListener(new JButtonSummaryListener());
    }
}
