package com.cc.java;

public class Klausur {
    
    public int notenErmittlung( int prozent){
        if (prozent < 0) {
            throw new IllegalArgumentException("Ungültige Eingabe");
        } 
        else if (prozent < 50) {
            return 5; // Note5
        }
        else if (prozent < 60) {
            return 4; // Note 5
        }
        else if (prozent < 73) {
            return 3; // Note 2
        }
        else if (prozent < 85) {
            return 2; // Note 2
        }
        else {
           return 1; // Note 1 
        }
    }


}
