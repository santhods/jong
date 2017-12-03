package com.java.jong.UserInterface.JScrollPane;

import com.java.jong.UserInterface.JPanel.*;
import com.java.jong.UserInterface.JTextComponent.JTextAreaOtherInfo;
import javax.swing.JScrollPane;

public class JScrollPaneAdd extends JScrollPane{
        public static JScrollPane DrinkPnlScrollPane = new JScrollPane(JPanelDrink.Drink, VERTICAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_AS_NEEDED); //= new BuildScrollPane(PnelDrink.Drink);
        public static JScrollPane MenuPnlScrollPane = new JScrollPane(JPanelMenu.PnlMenu, VERTICAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_AS_NEEDED);
        public static JScrollPane OtherInfScrollPane;
        public static JScrollPane SeatSelScrollPane = new JScrollPane(JPanelSeatSelection.SeatSelection, VERTICAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_AS_NEEDED);
          
        // initialise ScrollPanes for components in JFrameCreate
    public JScrollPaneAdd() {
                    OtherInfScrollPane = new JScrollPane(JTextAreaOtherInfo.OtherInfo, VERTICAL_SCROLLBAR_ALWAYS, HORIZONTAL_SCROLLBAR_NEVER);
                   MenuPnlScrollPane.setBounds(0, 275, 200, 200);
                   DrinkPnlScrollPane.setBounds(210, 275, 200, 200);
                   SeatSelScrollPane.setBounds(420, 275, 200, 200);
                   OtherInfScrollPane.setBounds(630, 275, 235, 200);
    }
}
