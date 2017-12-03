/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.EventsListener.JTextField;

import com.java.jong.DataStructure.DataManipulation.PullData;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.JTextComponent.JTextFieldSearch;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTextFieldQuerySearchListener implements ActionListener, MouseListener{
    // perform search based on user query as soon as the user clicks on JTextBoxSearch
    @Override
    public void actionPerformed(ActionEvent e) {
       JTableTemplate.setTableModel(PullData.getSearchResults(JTextFieldSearch.textField.getText()), PullData.getSearchResults(JTextFieldSearch.textField.getText()));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
            
    }
    // drop focus as soon as the user unhover the mouse from textbox
    @Override
    public void mouseExited(MouseEvent e) {
        JFrameMainMenu.JFrameMainMenu.requestFocus();
    }
}
