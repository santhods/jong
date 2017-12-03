/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.EventsListener.JRadioButton;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JRadioButton.JRadioSeatSelectionList;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioSeatSelectionListener implements ItemListener{
    // get the selected table based on the user option of selected table in JFrameCreate.
    @Override
    public void itemStateChanged(ItemEvent e) {
          if (JRadioSeatSelectionList.Table1.isSelected()) ObjectLib.selectedTable = 1;
          else  if (JRadioSeatSelectionList.Table2.isSelected()) ObjectLib.selectedTable = 2;
          else if (JRadioSeatSelectionList.Table3.isSelected()) ObjectLib.selectedTable = 3;
          else if (JRadioSeatSelectionList.Table4.isSelected()) ObjectLib.selectedTable = 4;
          else if (JRadioSeatSelectionList.Table5.isSelected()) ObjectLib.selectedTable = 5;
          else if (JRadioSeatSelectionList.Table6.isSelected()) ObjectLib.selectedTable = 6;
          else if (JRadioSeatSelectionList.Table7.isSelected()) ObjectLib.selectedTable = 7;
          else if (JRadioSeatSelectionList.Table8.isSelected()) ObjectLib.selectedTable = 8;
          else if (JRadioSeatSelectionList.Table9.isSelected()) ObjectLib.selectedTable = 9;
          else if (JRadioSeatSelectionList.Table10.isSelected()) ObjectLib.selectedTable = 10;
          else ObjectLib.selectedTable = 1;
    }
}
