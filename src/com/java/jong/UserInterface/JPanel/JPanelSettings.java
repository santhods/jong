package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JButton.JButtonPasswords;
import com.java.jong.UserInterface.JLabel.JLabelSettings;
import com.java.jong.UserInterface.JRadioButton.JRadioSettingsPanelOptions;

public class JPanelSettings extends BuildJPanel{
    public static BuildJPanel PnlSettings = new BuildJPanel();
    
    // initialise JPanelSettings 
    protected JPanelSettings(){
            new JLabelSettings();
            new JRadioSettingsPanelOptions();
            
            PnlSettings.add(JLabelSettings.langLabel);
            PnlSettings.add(JLabelSettings.guiLabel);
            PnlSettings.add(JLabelSettings.passwordLabel);
            PnlSettings.add(JRadioSettingsPanelOptions.thaiLang);
            PnlSettings.add(JRadioSettingsPanelOptions.engLang);
            PnlSettings.add(JRadioSettingsPanelOptions.defaultGui);
            PnlSettings.add(JRadioSettingsPanelOptions.nimbusGui);
            PnlSettings.add(JButtonPasswords.buttonSetup);
            PnlSettings.add(JButtonPasswords.buttonChange);
            PnlSettings.add(JButtonPasswords.buttonRemove);
    }
    
}
