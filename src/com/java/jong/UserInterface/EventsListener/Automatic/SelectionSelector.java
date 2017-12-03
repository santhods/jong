/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.EventsListener.Automatic;

import com.java.jong.DataStructure.DataManipulation.SelectFoodAndDrinkList;
import com.java.jong.UserInterface.JRadioButton.JRadioSeatSelectionList;
import javax.swing.JCheckBox;


public abstract class SelectionSelector {
    /* This method is used to set table selection in the system from
        the selected table in the selected row of booking details in the system.*/
    public static void setSeatSelection(int selectedTable){
       switch (selectedTable){
           case 1 :
               JRadioSeatSelectionList.Table1.setSelected(true);
                       break;
          case 2 :
               JRadioSeatSelectionList.Table2.setSelected(true);
                       break;
          case 3 :
               JRadioSeatSelectionList.Table3.setSelected(true);
                       break;
          case 4 :
               JRadioSeatSelectionList.Table4.setSelected(true);
                       break;
          case 5 :
               JRadioSeatSelectionList.Table5.setSelected(true);
                       break;
          case 6 :
               JRadioSeatSelectionList.Table6.setSelected(true);
                       break;
           case 7 :
               JRadioSeatSelectionList.Table7.setSelected(true);
                       break;
           case 8 :
               JRadioSeatSelectionList.Table8.setSelected(true);
                       break;
           case 9 :
               JRadioSeatSelectionList.Table9.setSelected(true);
                       break;
           case 10 :
               JRadioSeatSelectionList.Table10.setSelected(true);
                       break;
       }
    }
    /* This method is used to set menu selection in JFrameCreate from selected food and drink items 
        in the selected row of booking details.*/
    public static void setMenuSelection(String item){
           
        for (JCheckBox currentItem : SelectFoodAndDrinkList.menuList){
           if (item.equals(currentItem.getText()))
                currentItem.setSelected(true);
        }
        
         for (JCheckBox currentItem : SelectFoodAndDrinkList.drinkList){
           if (item.equals(currentItem.getText()))
                currentItem.setSelected(true);
        }
    }
}