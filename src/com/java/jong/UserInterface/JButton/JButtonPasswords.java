/*
 Jong! 
 2013 - 2014
 Author: Baramee Thummatewin
 Develop in: Linux Mint 16 32-bit
 */

package com.java.jong.UserInterface.JButton;

import com.java.jong.DataStructure.ObjectLib;
import com.java.jong.UserInterface.ComponentFactory.BuildJButton;
import com.java.jong.UserInterface.JDialog.JDialogPasswordChange;
import com.java.jong.UserInterface.JDialog.JDialogPasswordCreate;
import com.java.jong.UserInterface.JDialog.JDialogPasswordEntry;
import com.java.jong.UserInterface.JDialog.JDialogPasswordRemove;
import com.java.jong.UserInterface.Language.LanguageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonPasswords {
    public static BuildJButton buttonSetup, buttonChange, buttonRemove;
    // initialise buttons for password creation and manipulation
    public JButtonPasswords(){
            buttonSetup = new BuildJButton(LanguageLoader.Language("SETUPPASS"), 330, 90, 100, 30);
            buttonChange = new BuildJButton(LanguageLoader.Language("CHANGEPASS"), 450, 90, 100, 30);
            buttonRemove = new BuildJButton(LanguageLoader.Language("REMOVEPASSWORD"), 400, 120, 100, 30);
            
            
            buttonSetup.addActionListener(new setupPass());
            buttonChange.addActionListener(new changePass());
            buttonRemove.addActionListener(new removePass());
    }
}


class setupPass implements ActionListener{
    // launch password creation dialog
    @Override
    public void actionPerformed(ActionEvent e) {
        new JDialogPasswordCreate();
    }

}

class changePass implements ActionListener{
    /* check password manipulation authentication and launch password changing dialog 
        if password entry is authenticated.
    */
    @Override
    public void actionPerformed(ActionEvent e) {
       if (ObjectLib.isAuthenticated) {
            new JDialogPasswordChange();
            ObjectLib.isAuthenticated = false;
            
       } else if (!ObjectLib.isAuthenticated) {
                    new JDialogPasswordEntry();
                    if (ObjectLib.isAuthenticated){
                        new JDialogPasswordChange();
                        ObjectLib.isAuthenticated= false;
                    }
       }
    }
}

class removePass implements ActionListener{
     /* check password manipulation authentication and launch password removal dialog 
        if password entry is authenticated.
    */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ObjectLib.isAuthenticated) 
            new JDialogPasswordRemove();
        else if (!ObjectLib.isAuthenticated) {
                new JDialogPasswordEntry();
                    if (ObjectLib.isAuthenticated) new JDialogPasswordRemove();
        }
    }

}