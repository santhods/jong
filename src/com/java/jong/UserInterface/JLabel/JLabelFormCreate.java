package com.java.jong.UserInterface.JLabel;

import com.java.jong.UserInterface.Language.LanguageLoader;
import com.java.jong.UserInterface.JScrollPane.JScrollPaneAdd;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class JLabelFormCreate extends JLabel{
        public static JLabel CustomerName = new JLabel(LanguageLoader.Language("LABELCUSTOMERNAME"));
        public static JLabel ContactNumber = new JLabel(LanguageLoader.Language("LABELCONTACTNUM"));
        public static JLabel Guest = new JLabel(LanguageLoader.Language("LABELGUEST"));
        public static JLabel Date = new JLabel(LanguageLoader.Language("LABELDATE"), SwingConstants.CENTER);
        public static JLabel Time = new JLabel(LanguageLoader.Language("LABELTIME"), SwingConstants.CENTER);
        public static JLabel PreMenu = new JLabel(LanguageLoader.Language("LABELPREORDERMENU"), SwingConstants.CENTER);
        public static JLabel Drink = new JLabel(LanguageLoader.Language("LABELDRINK"), SwingConstants.CENTER);
        public static JLabel SeatSel = new JLabel(LanguageLoader.Language("LABELSEATSEL"), SwingConstants.CENTER);
        public static JLabel OtherInf = new JLabel(LanguageLoader.Language("LABELOTHERINF"), SwingConstants.CENTER);
        public static JLabel OtherInfEnter = new JLabel(LanguageLoader.Language("LABELOTHERINFENTER"));

        {
            // CustomerName.setBounds(10, 75, 10, );
         // PreMenu title settings
         PreMenu.setBounds(0, 245, JScrollPaneAdd.MenuPnlScrollPane.getWidth(), 30);
         PreMenu.setBorder(BorderFactory.createEtchedBorder());
         // Drink title settings
         Drink.setBounds(210, 245, JScrollPaneAdd.DrinkPnlScrollPane.getWidth(), 30);
         Drink.setBorder(BorderFactory.createEtchedBorder());
         // Seat selection title settings
         SeatSel.setBounds(420, 245, JScrollPaneAdd.SeatSelScrollPane.getWidth(), 30);
         SeatSel.setBorder(BorderFactory.createEtchedBorder());
         // Other Information title settings
         OtherInf.setBounds(630, 245, JScrollPaneAdd.OtherInfScrollPane.getWidth(), 30);
         OtherInf.setBorder(BorderFactory.createEtchedBorder());
         
         Date.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
         Time.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));        

         CustomerName.setBounds(10, 25, 200, 30);
         ContactNumber.setBounds(10, 95, 200, 30);
         Guest.setBounds(10, 165, 200, 30);
         
         Date.setBounds(450, 75, 150, 40);
         Time.setBounds(700, 75, 150, 40);
        }
}