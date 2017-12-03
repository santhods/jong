package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JCheckBox.JCheckBoxPreOrderMenuList;

public class JPanelMenu extends BuildJPanel{
        public static BuildJPanel PnlMenu = new BuildJPanel();
        
        // Initialise JPanelMenu
        public JPanelMenu(){
            PnlMenu.setLayout(new javax.swing.BoxLayout(PnlMenu, javax.swing.BoxLayout.Y_AXIS));
            
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item1);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item2);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item3);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item4);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item5);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item6);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item7);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item8);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item9);
            PnlMenu.add(JCheckBoxPreOrderMenuList.Item10);
        }
        
}
