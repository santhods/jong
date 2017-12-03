package com.java.jong.UserInterface.ComponentFactory;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JPanel.*;
import javax.swing.JLayeredPane;

// This class is the template of JLayeredPane for multi-layer JPanels  in the system main menu.
public class BuildJLayeredPane extends JLayeredPane{
          public static JLayeredPane MenuSectionsPane;       
            
        public BuildJLayeredPane() {          
        final Integer layer = new Integer(1); // the layer of JLayeredPane
        new InitialiseJPanelMainMenu();
        
           MenuSectionsPane = new JLayeredPane();
           MenuSectionsPane.setLayout(null);
           MenuSectionsPane.setBounds(0, 0, ObjectLib._FrameMainMenuWidth, ObjectLib._FrameMainMenuHeight);
           MenuSectionsPane.add(JPanelHome.PnlHome,layer, 1); // top layer position (1 is highest)
           MenuSectionsPane.add(JPanelList.PnlList, layer, 2); // second layer position
           MenuSectionsPane.add(JPanelSummary.PnlSummary, layer, 3); // third layer position
           MenuSectionsPane.add(JPanelSettings.PnlSettings, layer, 4); // fourth layer position
      }
  
}