package com.java.jong.UserInterface.JCheckBox;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JCheckBox;

public class JCheckBoxDrinkList extends JCheckBox{
        public static JCheckBox water = new JCheckBox(LanguageLoader.Language("WATER"));
        public static JCheckBox coke = new JCheckBox(LanguageLoader.Language("COKE"));
        public static JCheckBox lemongrass = new JCheckBox(LanguageLoader.Language("LEMONGRASS"));
        public static JCheckBox beer = new JCheckBox(LanguageLoader.Language("BEER"));
        public static JCheckBox redwine = new JCheckBox(LanguageLoader.Language("REDWINE"));
        public static JCheckBox whitewine = new JCheckBox(LanguageLoader.Language("WHITEWINE"));
        public static JCheckBox fanta = new JCheckBox(LanguageLoader.Language("FANTA"));
        public static JCheckBox sprite = new JCheckBox(LanguageLoader.Language("SPRITE"));

        // initialise JCheckBoxes of drink list to be added in drink selection area in JFrameCreate
        protected JCheckBoxDrinkList(){
            water.setSelected(false);
            coke.setSelected(false);
            lemongrass.setSelected(false);
            beer.setSelected(false);
            redwine.setSelected(false);
            whitewine.setSelected(false);
            fanta.setSelected(false);
            sprite.setSelected(false);
        }

}
