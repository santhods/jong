package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonModifyListener;
import com.java.jong.UserInterface.Language.LanguageLoader;

/**
 *
 * @author bazza
 */
public class JButtonModify {
     public static BuildJButton ButtonModify; /* = new BuildjButton(
            LanguageLoader.Language(ObjectLib._SystemLanguage_,"BTNLIST"),
            10, 175, 100, 75); */
    
    protected JButtonModify(){
            ButtonModify = new BuildJButton(
            LanguageLoader.Language("BTNMODIFY"),
                    115, 20, 90, 50);
            ButtonModify.addActionListener(new JButtonModifyListener());
    }
}
