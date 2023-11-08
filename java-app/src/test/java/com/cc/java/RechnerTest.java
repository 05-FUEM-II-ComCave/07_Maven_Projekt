package com.cc.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {


    @Test
    public void testAdd() {
        
        Rechner rechner = new Rechner(); // Obj. init.
        int c = rechner.add(2, 2); //Testargumente
        assertEquals(4,c); // Testfunktion

    }
}
