package com.java.jong.UserInterface.JButton;

import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.EventsListener.JButton.JButtonPrintListener;
import com.java.jong.UserInterface.Language.LanguageLoader;

public class JButtonPrint {
     public static BuildJButton ButtonPrint;
     
     protected JButtonPrint(){
         ButtonPrint = new BuildJButton(
                    LanguageLoader.Language("BTNPRINT"),
                    650, 10, 100, 50
        );
         ButtonPrint.addActionListener(new JButtonPrintListener());
     }
}
