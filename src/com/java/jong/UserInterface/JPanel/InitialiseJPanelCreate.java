package com.java.jong.UserInterface.JPanel;

public class InitialiseJPanelCreate {
    public JPanelMenu loadMenu;
    private JPanelDrink loadDrink;
    private JPanelSeatSelection loadSeat;
        
   // initialise JPanels for food, drink, and table selection to be added in JFrameCreate
   public InitialiseJPanelCreate(){
       loadMenu = new JPanelMenu();
       loadDrink = new JPanelDrink();
       loadSeat = new JPanelSeatSelection();
   }
    
}
