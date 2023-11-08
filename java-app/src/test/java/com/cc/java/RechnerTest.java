package com.cc.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {

    @Test
    public void testAdd() {
        Rechner rechner = new Rechner();
        assertEquals(4,rechner.add(2, 2));
    }
}
