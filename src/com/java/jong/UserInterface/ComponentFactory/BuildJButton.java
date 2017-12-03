package com.java.jong.UserInterface.ComponentFactory;

import com.java.jong.DataStructure.ObjectLib;
import java.util.Locale;
import javax.swing.*;


public final class BuildJButton extends JButton{
            // template for common buttons
   public BuildJButton(String name, int locate_x, int locate_y, int width, int height){
                new JButton();
                JButton.setDefaultLocale(new Locale(ObjectLib._SystemLanguage_, ObjectLib._SystemLanguage_.toUpperCase()));
                setBounds(locate_x, locate_y, width, height);
                setText(name);
    }
                    
}
