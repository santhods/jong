/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.DataManipulation;

import com.java.jong.DataStructure.Order;
import com.java.jong.UserInterface.JCheckBox.JCheckBoxDrinkList;
import com.java.jong.UserInterface.JCheckBox.JCheckBoxPreOrderMenuList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

/*
An abstract class for adding the selected food and drink items into the appropriate list instances.
*/
public abstract class SelectFoodAndDrinkList {
  private static final List<String> selectedMenuList = new ArrayList<>();
  private static final List<String> selectedDrinkList = new ArrayList<>();
  
  // Arrays of JCheckBox objects which will be used for selecting a food or drink item into the list.
  public static JCheckBox[]  menuList = {   
                                          JCheckBoxPreOrderMenuList.Item1,
                                          JCheckBoxPreOrderMenuList.Item2,
                                          JCheckBoxPreOrderMenuList.Item3,
                                          JCheckBoxPreOrderMenuList.Item4,
                                          JCheckBoxPreOrderMenuList.Item5,
                                          JCheckBoxPreOrderMenuList.Item6,
                                          JCheckBoxPreOrderMenuList.Item7,
                                          JCheckBoxPreOrderMenuList.Item8,
                                          JCheckBoxPreOrderMenuList.Item9,
                                          JCheckBoxPreOrderMenuList.Item10,
                                          },
          
                        drinkList = {
                                          JCheckBoxDrinkList.beer,
                                          JCheckBoxDrinkList.coke,
                                          JCheckBoxDrinkList.fanta,
                                          JCheckBoxDrinkList.lemongrass,
                                          JCheckBoxDrinkList.redwine,
                                          JCheckBoxDrinkList.sprite,
                                          JCheckBoxDrinkList.water,
                                          JCheckBoxDrinkList.whitewine
                                         };
  
      // A method for selecting the text from selected food items into the list object selectredMenuList above.
    public static void selectFoodList(){
        for (JCheckBox currentItem : menuList){
                if (currentItem.isSelected())
                selectedMenuList.add(currentItem.getText());
        }
        Order.foodOrderedList = selectedMenuList.toArray();
    }
    
    // A method for selecting the text from selected drink items into the list object selectredDrinkList above.
    public static void selectDrinkList(){
        for (JCheckBox currentItem : drinkList)
                if (currentItem.isSelected())
                selectedDrinkList.add(currentItem.getText());
        
        Order.drinkOrderedList = selectedDrinkList.toArray();
        
    }
    
    /*
    This method is used for clearing all values in selected menu and drink list which has been previously selected by last order.
    */
    public static void refreshList(){
        selectedMenuList.clear();
        selectedDrinkList.clear();
    }
}
