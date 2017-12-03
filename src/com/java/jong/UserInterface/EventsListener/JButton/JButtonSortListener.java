package com.java.jong.UserInterface.EventsListener.JButton;

import com.java.jong.UserInterface.JDialog.JDialogSort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonSortListener implements ActionListener{
    // launch sort dialog options
    @Override
    public void actionPerformed(ActionEvent e) {
               JDialogSort.Sort.setVisible(true);
    }
    
}
