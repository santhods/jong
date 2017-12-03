package com.java.jong.UserInterface.JRadioButton;

import com.java.jong.UserInterface.EventsListener.JRadioButton.JRadioSeatSelectionListener;
import com.java.jong.UserInterface.Language.LanguageLoader;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;


public class JRadioSeatSelectionList extends JRadioButton{
    public static JRadioButton Table1 = new JRadioButton(LanguageLoader.Language("TABLE1"), false);
    public static JRadioButton Table2 = new JRadioButton(LanguageLoader.Language("TABLE2"), false);
    public static JRadioButton Table3 = new JRadioButton(LanguageLoader.Language("TABLE3"), false);
    public static JRadioButton Table4 = new JRadioButton(LanguageLoader.Language("TABLE4"), false);
    public static JRadioButton Table5 = new JRadioButton(LanguageLoader.Language("TABLE5"), false);
    public static JRadioButton Table6 = new JRadioButton(LanguageLoader.Language("TABLE6"), false);
    public static JRadioButton Table7 = new JRadioButton(LanguageLoader.Language("TABLE7"), false);
    public static JRadioButton Table8 = new JRadioButton(LanguageLoader.Language("TABLE8"), false);
    public static JRadioButton Table9 = new JRadioButton(LanguageLoader.Language("TABLE9"), false);
    public static JRadioButton Table10 = new JRadioButton(LanguageLoader.Language("TABLE10"), false);
    public static ButtonGroup TableGroup = new ButtonGroup();
    
// initialise JRadioButtons of table selection
    public JRadioSeatSelectionList(){
             TableGroup.add(Table1);
             TableGroup.add(Table2);
             TableGroup.add(Table3);
             TableGroup.add(Table4);
             TableGroup.add(Table5);
             TableGroup.add(Table6);
             TableGroup.add(Table7);
             TableGroup.add(Table8);
             TableGroup.add(Table9);
             TableGroup.add(Table10);
             
             Table1.addItemListener(new JRadioSeatSelectionListener());
             Table2.addItemListener(new JRadioSeatSelectionListener());
             Table3.addItemListener(new JRadioSeatSelectionListener());
             Table4.addItemListener(new JRadioSeatSelectionListener());
             Table5.addItemListener(new JRadioSeatSelectionListener());
             Table6.addItemListener(new JRadioSeatSelectionListener());
             Table7.addItemListener(new JRadioSeatSelectionListener());
             Table8.addItemListener(new JRadioSeatSelectionListener());
             Table9.addItemListener(new JRadioSeatSelectionListener());
             Table10.addItemListener(new JRadioSeatSelectionListener());         
    }
}

