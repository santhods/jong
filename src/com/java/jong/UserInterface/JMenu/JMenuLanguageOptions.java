package com.java.jong.UserInterface.JMenu;

import com.java.jong.UserInterface.EventsListener.JRadioButton.JRadioLanguageCheckBoxListener;
import com.java.jong.UserInterface.Language.LanguageChange;
import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class JMenuLanguageOptions extends JRadioButton{
            public static  JRadioButton ThaiOpt = new JRadioButton(LanguageLoader.Language("MENUTHAI"));
            public static  JRadioButton EngOpt = new JRadioButton(LanguageLoader.Language("MENUENGLISH"));
            private final ButtonGroup LangGroup = new ButtonGroup();

            // initialise JRadioButtons to be added in JMenuItemFile
            public JMenuLanguageOptions(){
                      LangGroup.add(ThaiOpt);
                      LangGroup.add(EngOpt);
                        
                      LanguageChange.setRadioPos();        
                      ThaiOpt.addItemListener(new JRadioLanguageCheckBoxListener(ThaiOpt, EngOpt));
                      EngOpt.addItemListener(new JRadioLanguageCheckBoxListener(ThaiOpt, EngOpt));  
            }
}