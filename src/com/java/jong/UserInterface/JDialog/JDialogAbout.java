package com.java.jong.UserInterface.JDialog;

import com.java.jong.UserInterface.JFrame.JFrameMainMenu;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class JDialogAbout {
        public static JDialog DialogAbout;
        private JLabel ProgramName, ProgramConcept, Author, SystemInf;
        private final Font infFont = new Font("Tahoma", Font.BOLD, 12);
        
        // initialise JDialogAbout components to be added and displayed
        public JDialogAbout(){
            DialogAbout = new JDialog(JFrameMainMenu.JFrameMainMenu, LanguageLoader.Language("ABOUT"), false);
            DialogAbout.setBounds(350, 230, 250, 150);
            DialogAbout.setLayout(null);
            DialogAbout.setResizable(false);
            
            ProgramName = new JLabel(LanguageLoader.Language("PROGRAMNAME"), JLabel.CENTER);
            ProgramName.setForeground(Color.blue);
            ProgramName.setFont(infFont);
            ProgramName.setBounds(40, 10, 150, 35);
            ProgramName.setBackground(Color.CYAN);
            
            ProgramConcept = new JLabel(LanguageLoader.Language("PROGRAMCONCEPT"), JLabel.LEFT);
            ProgramConcept.setForeground(Color.BLACK);
            ProgramConcept.setFont(infFont);
            ProgramConcept.setBounds(20, 50, 250, 20);
            ProgramConcept.setBackground(Color.red);
            
            Author = new JLabel(LanguageLoader.Language("AUTHOR") + ": " + LanguageLoader.Language("AUTHORNAME"), JLabel.LEFT);
            Author.setForeground(Color.BLACK);
            Author.setFont(infFont);
            Author.setBounds(10, 80, 250, 20);
            
            SystemInf = new JLabel(LanguageLoader.Language("SYSTEM") + ": "+ System.getProperty("os.name"), JLabel.LEFT);
            SystemInf.setForeground(Color.BLACK);
            SystemInf.setFont(infFont);
            SystemInf.setBounds(10, 100, 150, 20);
            
            DialogAbout.add(ProgramName);
            DialogAbout.add(ProgramConcept);
            DialogAbout.add(SystemInf);
            DialogAbout.add(Author);
            }
}
