/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.DataStructure.Validation;

import com.java.jong.DataStructure.DateTime.ChangeDateTime;
import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.JFrame.JFrameCreate;
import com.java.jong.UserInterface.JTextComponent.JFormattedTextFrameCreate;
import com.java.jong.UserInterface.JXDate.DatePicker;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.util.Date;
import javax.swing.JOptionPane;
// this class is used for validating all required inputs in JFrame JFrameCreate class.
public abstract class JFrameCreateVerifier {
        /* this method will return true if all the required have the valid input, or otherwise return false if any of data input fields
            in JFrameCreate class is not in the correct format or not filled and error message appear.*/
        public static boolean  InputValidated(){
                            if (JFormattedTextFrameCreate.customerName.getText().trim().length() <= 0
                            || JFormattedTextFrameCreate.contactNo.getText().trim().length() < 11
                            || DatePicker.picker.getDate().before(ChangeDateTime.stringToDate(ChangeDateTime.dateToString(new Date())))
                            || (ObjectLib.selectedTable  < 1) ){
                                 JOptionPane.showMessageDialog(JFrameCreate.JFrameCreate, LanguageLoader.Language("INPUTFRAMEERROR"),
                                                                        LanguageLoader.Language("INPUTERROR"), JOptionPane.ERROR_MESSAGE);
                                 return false;
                            }
                            else return true;
        }
        
        
}
