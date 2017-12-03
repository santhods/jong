package com.java.jong.UserInterface.InitialiseComponents;

import com.java.jong.UserInterface.JButton.InitialiseJButtonComponents;
import com.java.jong.UserInterface.JCheckBox.InitialiseJCheckBox;
import com.java.jong.UserInterface.JLabel.InitialiseJLabels;
import com.java.jong.UserInterface.JPanel.InitialiseJPanelCreate;
import com.java.jong.UserInterface.JScrollPane.InitialiseJScrollPane;
import com.java.jong.UserInterface.JSpinner.JSpinnerTime;
import com.java.jong.UserInterface.JTextComponent.InitialiseJTextField;
import com.java.jong.UserInterface.JXDate.DatePicker;


public class InitialiseJFrameCreate {
    
    // initialise components which would be added in JFrameCreate
    public InitialiseJFrameCreate(){
        new InitialiseJCheckBox();
        new InitialiseJPanelCreate();
        new InitialiseJTextField();
        new InitialiseJScrollPane();
        new InitialiseJLabels();
        new JSpinnerTime();
        new DatePicker();
        new InitialiseJButtonComponents();
    }
}
