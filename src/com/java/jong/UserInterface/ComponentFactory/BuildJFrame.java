package com.java.jong.UserInterface.ComponentFactory;

import javax.swing.JFrame;


/**
 *  This class will be used for building jFrame in the specified size
 * and in location included as arguments in an instance
 */

public class BuildJFrame extends JFrame{
    // template for JFrames in the system
    public BuildJFrame(String name, int size_x,int size_y, int location_x, int location_y){
        new JFrame();
        setTitle(name);
        setSize(size_x, size_y);
        setLocation(location_x, location_y);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
         }
