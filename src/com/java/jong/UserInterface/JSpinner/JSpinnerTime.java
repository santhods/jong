package com.java.jong.UserInterface.JSpinner;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class JSpinnerTime{
    public static JSpinner HourSpinner;
    public static JSpinner MinuteSpinner;
    List <String>minuteList = new ArrayList();
    
    // initialise JSpinner hour and JSpinner minute
    public JSpinnerTime(){;
            for (int i = 0; i <= 9; i += 1) minuteList.add("0"+ i);
            for (int i = 10; i <= 59; i += 1) minuteList.add(String.valueOf(i));
            
            HourSpinner = new JSpinner(new SpinnerNumberModel(18, 18, 23, 1));
            MinuteSpinner = new JSpinner(new SpinnerListModel(minuteList));
            HourSpinner.setBounds(700, 120, 70, 30);
            MinuteSpinner.setBounds(780, 120, 70, 30);
    }
    
}
