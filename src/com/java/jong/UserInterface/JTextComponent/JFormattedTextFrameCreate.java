package com.java.jong.UserInterface.JTextComponent;

import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class JFormattedTextFrameCreate {
    public static JFormattedTextField customerName;
    public static JFormattedTextField contactNo;
    public static JFormattedTextField guest;
    
    private MaskFormatter maskCustomer;
    private MaskFormatter maskContactNo;
    private MaskFormatter maskGuest;
    
    private final Font fontFormCreate = new Font("Tahoma", PLAIN, 15);
   // initialise text boxes for valid formatting and constraints
    protected JFormattedTextFrameCreate(){              
                try {
                       maskContactNo = new MaskFormatter("0#### - ######");
                       maskContactNo.setPlaceholder("");
                       maskGuest = new MaskFormatter("##");
                       maskGuest.setPlaceholder("");
                       maskCustomer = new MaskFormatter("U*******************");
                       maskCustomer.setPlaceholder("");
                       maskCustomer.setInvalidCharacters("1234567890\"'`¬!£$%^&*()-_=+[{]};:\'@#~\\|,<.>/?");
                       
                        
                        customerName = new JFormattedTextField(maskCustomer);
                        contactNo = new JFormattedTextField(maskContactNo);;
                        guest = new JFormattedTextField(maskGuest);
                        
                        customerName.setValue(null);
                        contactNo.setValue(null);
                        guest.setValue(null);
                        
                } catch  (ParseException e){
                        e.printStackTrace();
                }
                customerName.setFont(fontFormCreate);
                contactNo.setFont(fontFormCreate);
                guest.setFont(fontFormCreate);
                
                customerName.setBounds(75, 50, 250, 35);
                contactNo.setBounds(75, 120, 200, 35);
                guest.setBounds(75, 190, 50, 35);
                
                customerName.setText("");
                contactNo.setText("");
                guest.setText("");
        }
   
}
