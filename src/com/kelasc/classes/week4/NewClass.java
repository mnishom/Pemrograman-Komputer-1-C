package com.kelasc.classes.week4;

public class NewClass {
    public static void main(String[] args) {
        String s = "Username;Abc;Password;123";
        String[] data = s.split(";");
        for (String x : data) {
            //x = x.toLowerCase();
            if(x.equalsIgnoreCase("123")){
//                System.out.println(x);
            }
        }
        double d = NewClass1.luas_segitiga(4, 4);
        System.out.println(d);
        
        int a = -129;
        byte b = -128;
        
    }
}
