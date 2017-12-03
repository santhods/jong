package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.EventsListener.JButton.JButtonHomeListener;
import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonHome{
 public static BuildJButton ButtonHome;
    
    protected JButtonHome(){
        ButtonHome= new BuildJButton(
         LanguageLoader.Language("BTNHOME"),
                                                    5, 75, 120, 75);
       ButtonHome.addActionListener(new JButtonHomeListener());
    }
}
