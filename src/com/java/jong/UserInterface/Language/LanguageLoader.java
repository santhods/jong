package com.java.jong.UserInterface.Language;

import com.java.jong.DataStructure.ObjectLib;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Note: Language property files are in src folder.
 * 
 */
public abstract class LanguageLoader {    
    private static ResourceBundle Display;
    // call this method for setting text on visual component based-on locale and specified display language.
    public static String Language(String displayPart) {
        Display = ResourceBundle.getBundle("Language", new Locale(ObjectLib._SystemLanguage_, ObjectLib._SystemLanguage_.toUpperCase()));
        return Display.getString(displayPart);
    }
    
}
