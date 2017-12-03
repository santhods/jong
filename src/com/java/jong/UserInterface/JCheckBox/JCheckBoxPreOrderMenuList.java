package com.java.jong.UserInterface.JCheckBox;

import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.JCheckBox;

public class JCheckBoxPreOrderMenuList extends JCheckBox{
  
    
    public static JCheckBox Item1 = new JCheckBox(LanguageLoader.Language("FOODITEM1"));
    public static JCheckBox Item2 = new JCheckBox(LanguageLoader.Language("FOODITEM2"));
    public static JCheckBox Item3 = new JCheckBox(LanguageLoader.Language("FOODITEM3"));
    public static JCheckBox Item4 = new JCheckBox(LanguageLoader.Language("FOODITEM4"));
    public static JCheckBox Item5 = new JCheckBox(LanguageLoader.Language("FOODITEM5"));
    public static JCheckBox Item6 = new JCheckBox(LanguageLoader.Language("FOODITEM6"));
    public static JCheckBox Item7 = new JCheckBox(LanguageLoader.Language("FOODITEM7"));
    public static JCheckBox Item8 = new JCheckBox(LanguageLoader.Language("FOODITEM8"));
    public static JCheckBox Item9 = new JCheckBox(LanguageLoader.Language("FOODITEM9"));
    public static JCheckBox Item10 = new JCheckBox(LanguageLoader.Language("FOODITEM10"));

    // initialise JCheckBoxes of drink list to be added in drink selection area in JFrameCreate
    protected JCheckBoxPreOrderMenuList(){
             Item1.setSelected(false);
             Item2.setSelected(false);
             Item3.setSelected(false);
             Item4.setSelected(false);
             Item5.setSelected(false);
             Item6.setSelected(false);
             Item7.setSelected(false);
             Item8.setSelected(false);
             Item9.setSelected(false);
             Item10.setSelected(false);
    }
    
}