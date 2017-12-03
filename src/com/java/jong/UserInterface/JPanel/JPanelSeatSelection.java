package com.java.jong.UserInterface.JPanel;

import com.java.jong.UserInterface.ComponentFactory.BuildJPanel;
import com.java.jong.UserInterface.JRadioButton.JRadioSeatSelectionList;
import javax.swing.BoxLayout;

/**
 *
 * @author bazza
 */
public class JPanelSeatSelection extends BuildJPanel{
        public static BuildJPanel SeatSelection = new BuildJPanel();
        
        // initialise JPanelSeatSelection
        public JPanelSeatSelection(){
                new JRadioSeatSelectionList();
                SeatSelection.setLayout(new BoxLayout(SeatSelection, BoxLayout.Y_AXIS));
                SeatSelection.add(JRadioSeatSelectionList.Table1);
                SeatSelection.add(JRadioSeatSelectionList.Table2);
                SeatSelection.add(JRadioSeatSelectionList.Table3);
                SeatSelection.add(JRadioSeatSelectionList.Table4);
                SeatSelection.add(JRadioSeatSelectionList.Table5);
                SeatSelection.add(JRadioSeatSelectionList.Table6);
                SeatSelection.add(JRadioSeatSelectionList.Table7);
                SeatSelection.add(JRadioSeatSelectionList.Table8);
                SeatSelection.add(JRadioSeatSelectionList.Table9);
                SeatSelection.add(JRadioSeatSelectionList.Table10);
        }
}
