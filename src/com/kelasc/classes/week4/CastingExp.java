package com.kelasc.classes.week4;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CastingExp {
    public static void main(String[] args) {
        Object[] data = {"ABC",12,12.3,new JLabel("Casting")};
        for (Object object : data) {
            if(object instanceof JLabel){
                JLabel L = (JLabel) object;
                object = L.getText();
            }   
            System.out.println(object);
        }
    }
}
