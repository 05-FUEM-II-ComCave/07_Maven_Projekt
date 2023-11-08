package com.cc.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KlausurTest {

    @Test
    public void  note5() {
        Klausur klausur = new Klausur();
        assertEquals(5, klausur.notenErmittlung(49));
    }  

    @Test
    public void  note4() {
    Klausur klausur = new Klausur();
    assertEquals(4, klausur.notenErmittlung(59));
    }   


    @Test
    public void  note3() {
        Klausur klausur = new Klausur();
        assertEquals(3, klausur.notenErmittlung(72));
    }  

    @Test
    public void  note2() {
        Klausur klausur = new Klausur();
        assertEquals(2, klausur.notenErmittlung(84));
    }  

    @Test
    public void  note1() {
        Klausur klausur = new Klausur();
        assertEquals(1, klausur.notenErmittlung(85));
    }  

    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }



}
