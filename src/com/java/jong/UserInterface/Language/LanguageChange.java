package com.java.jong.UserInterface.Language;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JMenu.JMenuLanguageOptions;

public abstract class LanguageChange{       

    // call this method for setting the selection of system's display  language.
    public static void setRadioPos(){
                   switch (ObjectLib._SystemLanguage_){
                       case "en":
                           JMenuLanguageOptions.EngOpt.setSelected(true);
                           break;
                           
                       case "th":
                           JMenuLanguageOptions.ThaiOpt.setSelected(true);
                           break;
                   }
            }
  
 };