/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JRadioButton;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.EventsListener.JRadioButton.JRadioInterfaceListener;
import com.java.jong.UserInterface.EventsListener.JRadioButton.JRadioLanguageCheckBoxListener;
import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class JRadioSettingsPanelOptions{
        public static JRadioButton thaiLang, engLang, defaultGui, nimbusGui;
        private final ButtonGroup aGroup = new ButtonGroup(), bGroup = new ButtonGroup();
    
        
        // initialise user setting options in JPanelSettings
    public JRadioSettingsPanelOptions(){
        thaiLang = new JRadioButton(LanguageLoader.Language("MENUTHAI"), ("th".equals(ObjectLib._SystemLanguage_)));
        engLang = new JRadioButton(LanguageLoader.Language("MENUENGLISH"), ("en".equals(ObjectLib._SystemLanguage_)));
        defaultGui = new JRadioButton(LanguageLoader.Language("DEFAULTOPTION"), (!(ObjectLib.Nimbus == 1)));
        nimbusGui = new JRadioButton(LanguageLoader.Language("NIMBUSOPTION"), (ObjectLib.Nimbus == 1));
        
        aGroup.add(thaiLang);
        aGroup.add(engLang);
        
        bGroup.add(defaultGui);
        bGroup.add(nimbusGui);
        
        // to setBounds of all radio buttons in this file.
        thaiLang.setBounds(330, 10, 100, 20);
        engLang.setBounds(450, 10, 100, 20);
        defaultGui.setBounds(330, 50, 100, 20);
        nimbusGui.setBounds(450, 50, 100, 20);
        
        thaiLang.addItemListener(new JRadioLanguageCheckBoxListener(thaiLang, engLang));
        engLang.addItemListener(new JRadioLanguageCheckBoxListener(thaiLang, engLang));
        
        defaultGui.addItemListener(new JRadioInterfaceListener());
        nimbusGui.addItemListener(new JRadioInterfaceListener());
    }
}
