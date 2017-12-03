package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonBookListener;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonBook {
        public static BuildJButton ButtonBook;
        
        protected JButtonBook(){
            ButtonBook = new BuildJButton(
                    LanguageLoader.Language("BTNBOOK"),
                    550, 10, 100, 50);
             ButtonBook.addActionListener(new JButtonBookListener());
        }   
}
