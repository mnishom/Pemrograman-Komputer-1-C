/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelasc.classes.week3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author LABKOM
 */
public class Test extends JDialog { 
    
    public static void main(String[] args) {
        Fields f = new Fields(25);
        f.setNilai(10);     
        //System.out.println(f.getNilai());
        
        JLabel L = new JLabel();
        L.setText(""+f.getNilai()); 
        Test T = new Test();
        T.setSize(100, 100);
        T.add(L);
        T.pack();
        T.setLocationRelativeTo(null); 
        T.setVisible(true); 
    }

}
