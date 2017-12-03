package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonAvailableListener;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonAvailable{
        public static BuildJButton ButtonAvailable;
        
        public JButtonAvailable(){
            ButtonAvailable = new BuildJButton(LanguageLoader.Language("BTNAVAILABLE"), 690, 205, 173, 35);
            ButtonAvailable.addActionListener(new JButtonAvailableListener());
        }
}
