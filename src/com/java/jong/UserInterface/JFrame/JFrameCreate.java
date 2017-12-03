package com.java.jong.UserInterface.JFrame;

import com.java.jong.UserInterface.JButton.JButtonBook;
import com.java.jong.UserInterface.JButton.JButtonPrint;
import com.java.jong.UserInterface.JButton.JButtonCancel;
import com.java.jong.UserInterface.JButton.JButtonAvailable;
import com.java.jong.UserInterface.ComponentFactory.BuildJFrame;
import com.java.jong.UserInterface.EventsListener.JFrame.JFrameCreateListener;
import com.java.jong.UserInterface.InitialiseComponents.InitialiseJFrameCreate;
import com.java.jong.UserInterface.Language.LanguageLoader;
import com.java.jong.UserInterface.JLabel.JLabelFormCreate;
import com.java.jong.UserInterface.JScrollPane.JScrollPaneAdd;
import com.java.jong.UserInterface.JSpinner.JSpinnerTime;
import com.java.jong.UserInterface.JTextComponent.JFormattedTextFrameCreate;
import com.java.jong.UserInterface.JXDate.DatePicker;
import javax.swing.JFrame;

public class JFrameCreate {
    public static BuildJFrame JFrameCreate;
    
    // add all the required components to JFrameCreate
    public JFrameCreate(){
           new InitialiseJFrameCreate();
        
        JFrameCreate = new BuildJFrame(LanguageLoader.Language("LABELCREATEBOOKING"),
                875, 500, 40, 40);
        JFrameCreate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JFrameCreate.addWindowListener(new JFrameCreateListener());
        JFrameCreate.setResizable(false);
        
        // Add components to JFrameCreate 
        JFrameCreate.add(JButtonPrint.ButtonPrint);
        JFrameCreate.add(JButtonBook.ButtonBook);
        JFrameCreate.add(JButtonCancel.ButtonCancel);
        JFrameCreate.add(JButtonAvailable.ButtonAvailable);
        JFrameCreate.add(JLabelFormCreate.CustomerName);
        JFrameCreate.add(JScrollPaneAdd.MenuPnlScrollPane);
        JFrameCreate.add(JScrollPaneAdd.DrinkPnlScrollPane);
        JFrameCreate.add(JScrollPaneAdd.SeatSelScrollPane);
        JFrameCreate.add(JScrollPaneAdd.OtherInfScrollPane);
        JFrameCreate.add(JLabelFormCreate.PreMenu);
        JFrameCreate.add(JLabelFormCreate.Drink);
        JFrameCreate.add(JLabelFormCreate.SeatSel);
        JFrameCreate.add(JLabelFormCreate.OtherInf);
        JFrameCreate.add(JLabelFormCreate.CustomerName);
        JFrameCreate.add(JLabelFormCreate.ContactNumber);
        JFrameCreate.add(JLabelFormCreate.Guest);
        JFrameCreate.add(JLabelFormCreate.Date);
        JFrameCreate.add(JLabelFormCreate.Time);
        JFrameCreate.add(JFormattedTextFrameCreate.customerName);
        JFrameCreate.add(JFormattedTextFrameCreate.contactNo);
        JFrameCreate.add(JFormattedTextFrameCreate.guest);
        JFrameCreate.add(JSpinnerTime.HourSpinner);
        JFrameCreate.add(JSpinnerTime.MinuteSpinner);
        JFrameCreate.add(DatePicker.picker);
    }
}
