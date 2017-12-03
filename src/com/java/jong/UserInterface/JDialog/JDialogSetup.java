package com.java.jong.UserInterface.JDialog;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import static com.java.jong.Setup.InitialSetup.applyNimbus;
import com.java.jong.UserInterface.EventsListener.Automatic.PasswordInitialiser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.WindowConstants.*;
import javax.swing.border.Border;


public class JDialogSetup implements ActionListener{
            public static JDialog setup = new JDialog();
            private Border Lang, GUI;
            private JRadioButton ENG, THA, Nimbus, Default;
            private JButton OK;
            private ButtonGroup langGroup = new ButtonGroup();
            private ButtonGroup GUIGroup = new ButtonGroup();
            private JLabel langBorder = new JLabel();
            private JLabel InterfaceBorder = new JLabel();
            
            // initialise components to be added in JDialogSetup
            public JDialogSetup(){
                setup.setLayout(null);
                setup.setTitle("Select your preferences..");
                setup.setBounds(400, 270, 250, 200);
                setup.setResizable(false);
                
                ENG = new JRadioButton("ENG", true);
                THA = new JRadioButton("THA");
                Nimbus = new JRadioButton("Nimbus", true);
                Default = new JRadioButton("Default");
                
                ENG.setHorizontalTextPosition(RIGHT);
                THA.setHorizontalTextPosition(RIGHT);
                
                Lang = BorderFactory.createTitledBorder("Language");
                GUI = BorderFactory.createTitledBorder("Interface");
                
                langGroup.add(ENG);
                langGroup.add(THA);
                GUIGroup.add(Nimbus);
                GUIGroup.add(Default);
                
                langBorder.setBounds(10, 10, 230, 50);
                InterfaceBorder.setBounds(10, 70, 230, 50);
                
                ENG.setBounds(10, 20, 100, 20);
                THA.setBounds(120, 20, 100, 20);
                Nimbus.setBounds(10, 20, 100, 20);
                Default.setBounds(120,20, 100,20);
                
                langBorder.setBorder(Lang);
                InterfaceBorder.setBorder(GUI);
                
                langBorder.add(ENG);
                langBorder.add(THA);
                InterfaceBorder.add(Nimbus);
                InterfaceBorder.add(Default);
               
                OK = new JButton("OK");
                OK.setBounds(85, 130, 70, 35);
                OK.addActionListener(this);
                
                setup.add(langBorder);
                setup.add(InterfaceBorder);     
                setup.add(OK);
                 
                setup.setVisible(true);
                setup.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
            
            
     // method for setting up system's display language and user interface when the system starts
    @Override
    public void actionPerformed(ActionEvent e) {
            ObjectLib._SystemLanguage_ = (ENG.isSelected() ? "en" : "th");
            if (Nimbus.isSelected()) {
            applyNimbus();
            ObjectLib.Nimbus = 1;
            new JFrameMainMenu();
                }   else {
                new JFrameMainMenu();
                ObjectLib.Nimbus = 0;
                }
            ObjectLib.isSetup = true;
            this.setup.dispose();      
            
     PasswordInitialiser.check();
    }
}
