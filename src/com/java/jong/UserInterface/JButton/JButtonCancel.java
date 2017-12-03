package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.EventsListener.JButton.JButtonCancelListener;
import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.Language.LanguageLoader;


public class JButtonCancel {
     public static BuildJButton ButtonCancel;
     
     protected JButtonCancel(){
                ButtonCancel = new BuildJButton(
                                                  LanguageLoader.Language("BTNCANCEL"),
                                                  750, 10, 100, 50);
                
                ButtonCancel.addActionListener(new JButtonCancelListener());
     }
}
