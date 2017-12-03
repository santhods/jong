/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JDialog;

import com.java.jong.DataStructure.Database.SQLCommand;
import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.JRadioButton.JRadioSortTypeMenu;
import com.java.jong.UserInterface.JTable.JTableTemplate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;


public class JDialogSort {
        public static JDialog Sort;
        private JButton sortMenu;
        
        // launch JDialogSort, the dialog for the user to choosedata sort type before performing search
        public JDialogSort(){
        new JRadioSortTypeMenu();
        Sort = new JDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("SELECTSORTTYPE"), true);
        Sort.setLayout(null);
        Sort.setBounds(400, 250, 250, 150);
        sortMenu = new JButton("OK");
        sortMenu.setBounds(100, 80, 50, 35);
        sortMenu.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               if (JRadioSortTypeMenu.date.isSelected()){
                    JTableTemplate.sortTableData(SQLCommand.$orderByDate + SQLCommand.$LIMITHOMEDATA,
                                                  SQLCommand.$orderByDate + SQLCommand.$LIMITLISTDATA);
                }
                else if (JRadioSortTypeMenu.customerName.isSelected()){
                    JTableTemplate.sortTableData(SQLCommand.$orderByCustomerName + SQLCommand.$LIMITHOMEDATA,
                                                  SQLCommand.$orderByCustomerName + SQLCommand.$LIMITLISTDATA);
                }
                else if (JRadioSortTypeMenu.bookingId.isSelected()){
                    JTableTemplate.sortTableData(SQLCommand.$orderByBookingID+ SQLCommand.$LIMITHOMEDATA,
                                                  SQLCommand.$orderByBookingID + SQLCommand.$LIMITLISTDATA);
                }
               Sort.dispose();
            }
        
        });
        Sort.add(JRadioSortTypeMenu.date);
        Sort.add(JRadioSortTypeMenu.customerName);
        Sort.add(JRadioSortTypeMenu.bookingId);
        Sort.add(sortMenu);
        }
}
