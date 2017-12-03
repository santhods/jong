
package com.java.jong.UserInterface.EventsListener.JRadioButton;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;


public class JRadioLanguageCheckBoxListener implements ItemListener{           
   private boolean state = false;
   private final JRadioButton thai, english;
   
   public JRadioLanguageCheckBoxListener(JRadioButton a, JRadioButton b){
        thai = a;
        english = b;
   }
   
   /* this method is used to change system's display language and  notify to the user
    as soon as the system's display language changed based on user options in settings.
    */
   @Override
    public void itemStateChanged(ItemEvent e) { 
       
      if (e.getStateChange() == ItemEvent.SELECTED){
          if (english.isSelected())  {
              ObjectLib._SystemLanguage_ = ObjectLib.english;
              state = true;
          } else if (thai.isSelected()){
              ObjectLib._SystemLanguage_ = ObjectLib.thai;
                 state = true;
         }
          System.out.println(ObjectLib._SystemLanguage_);
        }
      
       if (state){
                 JRadioInterfaceListener.stateChanged(LanguageLoader.Language("LANGUAGECHANGED"));
           }
    }
}