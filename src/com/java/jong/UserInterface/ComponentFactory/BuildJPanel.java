package com.java.jong.UserInterface.ComponentFactory;
import javax.swing.JPanel;

public class BuildJPanel extends JPanel{
 //  templates for JPanels of system's main function panels.
    
    private final int x = 125, y = 75, width = 650, height = 375;
    
    public BuildJPanel(){
              new JPanel(true);
              setLayout(null);
              setOpaque(true);
              setBounds(x, y, width, height);
    }
    
}
