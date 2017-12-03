package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonRemoveListener;
import com.java.jong.UserInterface.Language.LanguageLoader;

public class JButtonRemove {
        public static BuildJButton ButtonRemove;
        
        protected JButtonRemove(){
                ButtonRemove = new BuildJButton(
                LanguageLoader.Language("BTNREMOVE"),
                235, 20, 90, 50);
                ButtonRemove.addActionListener(new JButtonRemoveListener());
        }
}
