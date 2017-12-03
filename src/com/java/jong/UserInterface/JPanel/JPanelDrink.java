package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JCheckBox.JCheckBoxDrinkList;
import javax.swing.BoxLayout;

public class JPanelDrink extends BuildJPanel{
            public static BuildJPanel Drink = new BuildJPanel();
           
    // initialise JPanelDrink of food selection to be added in JFrameCreate
    public JPanelDrink(){
        Drink.setLayout(new BoxLayout(Drink, BoxLayout.Y_AXIS));
        Drink.add(JCheckBoxDrinkList.beer);
        Drink.add(JCheckBoxDrinkList.coke);
        Drink.add(JCheckBoxDrinkList.fanta);
        Drink.add(JCheckBoxDrinkList.lemongrass);
        Drink.add(JCheckBoxDrinkList.redwine);
        Drink.add(JCheckBoxDrinkList.whitewine);
        Drink.add(JCheckBoxDrinkList.sprite);
        Drink.add(JCheckBoxDrinkList.water);
    }
}
