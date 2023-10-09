package com.kelasc.GUI.week3;

public class AutoCode {
    
    
    static String lastID(){
        return "P004";
    }
    
    static String generateID(){        
        String lastID = lastID();
        String angka = lastID.substring(1);
        int number = Integer.parseInt(angka);
        
        String kode = "";
        if(number < 10){
            kode = "P00"+(number+1);
        }else if(number >9 && number < 100){
            kode = "P0"+(number+1);
        }else if(number >99 && number <= 999){
            kode = "P"+(number+1);
        }
        return kode;
    }
    
    public static void main(String[] args) {
        String newID = generateID();
        
    }
}
