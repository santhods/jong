/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JXDate;

import java.util.Date;
import org.jdesktop.swingx.JXDatePicker;


public class DatePicker {
    public static JXDatePicker picker = new JXDatePicker();
    // initialise visual date picker to be added in JFrameCreate
    public DatePicker(){
            picker.setBounds(450, 120, 150, 30);
            picker.setDate(new Date());
    }
}
