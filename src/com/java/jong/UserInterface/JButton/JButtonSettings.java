package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonSettingsListener;
import com.java.jong.UserInterface.Language.LanguageLoader;

/**
 *
 * @author bazza
 */
public class JButtonSettings {
     public static BuildJButton ButtonSettings;
    
    protected JButtonSettings(){
            ButtonSettings = new BuildJButton(
            LanguageLoader.Language("BTNSETTINGS"),
            5, 375, 120, 75);
            ButtonSettings.addActionListener(new JButtonSettingsListener());
    }
}
