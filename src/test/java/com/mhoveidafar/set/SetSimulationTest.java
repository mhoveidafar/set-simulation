package com.mhoveidafar.set;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetSimulationTest {

    // make object usable in all methods
    SetSimulation setSimulation;
    @Before
    public void setup() {
        setSimulation = new SetSimulation();
    }

    @Test
    public void isEmptyTest() {
        // Setup
        SetSimulation setSimulation = new SetSimulation();
        // Excecution
        boolean actualResult = setSimulation.isEmpty();
        // Assertion
        assertTrue(actualResult);

        // one liner using usable object under @Before
        // assertTrue(setSimulation.isEmpty());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, setSimulation.size());
    }

    @Test
    public void addTest() {
        SetSimulation setOne = new SetSimulation();

        setOne.add("Apple");

        assertFalse(setOne.isEmpty());
    }

    @Test
    public void removeTest() {
        SetSimulation setTwo = new SetSimulation();

        setTwo.add("Apple");
        setTwo.add("Orange");
        setTwo.add("Pear");

        setTwo.remove("Orange");

        assertEquals(2 , setTwo.size());
        assertTrue(setTwo.size() > 1);
        assertTrue(setTwo.findIndex("Orange") == -1);
    }
}