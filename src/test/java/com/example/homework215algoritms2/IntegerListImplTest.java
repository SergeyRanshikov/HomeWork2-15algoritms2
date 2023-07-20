package com.example.homework215algoritms2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class IntegerListImplTest {
    private IntegerList IntegerList;

    @Before
    public void setUp() {
        IntegerList = new IntegerListImpl(10);
    }


    @Test
    public void testAdd() {
        IntegerList.add(1);
        IntegerList.add(2);


        assertEquals(2, IntegerList.size());
        assertTrue(IntegerList.contains(1));
        assertTrue(IntegerList.contains(2));

    }

    @Test
    public void testAddWithIndex() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(1, 3);

        assertEquals(3, IntegerList.size());
        assertEquals(1, IntegerList.get(0));
        assertEquals(3, IntegerList.get(1));
        assertEquals(2, IntegerList.get(2));
    }

    @Test
    public void testSet() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.set(1, 3);

        assertEquals(2, IntegerList.size());
        assertEquals(1, IntegerList.get(0));
        assertEquals(3, IntegerList.get(1));
    }

    @Test
    public void testRemoveByValue() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.remove(2);

        assertEquals(2, IntegerList.size());
        assertTrue(IntegerList.contains(1));
        assertFalse(IntegerList.contains(3));
        assertTrue(IntegerList.contains(2));
    }

    @Test
    public void testRemoveByIndex() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.remove(1);

        assertEquals(2, IntegerList.size());
        assertEquals(1, IntegerList.get(0));
        assertEquals(3, IntegerList.get(1));
    }

    @Test
    public void testContains() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        assertTrue(IntegerList.contains(2));
        assertFalse(IntegerList.contains(4));
    }

    @Test
    public void testIndexOf() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(2);

        assertEquals(1, IntegerList.indexOf(2));
        assertEquals(-1, IntegerList.indexOf(3));
    }

    @Test
    public void testLastIndexOf() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(2);

        assertEquals(2, IntegerList.lastIndexOf(2));
        assertEquals(-1, IntegerList.lastIndexOf(3));
    }

    @Test
    public void testGet() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        assertEquals(2, IntegerList.get(1));
    }

    @Test
    public void testEquals() {
        IntegerList otherList = new IntegerListImpl(10);

        IntegerList.add(1);
        IntegerList.add(2);
        otherList.add(1);
        otherList.add(2);

        assertTrue(IntegerList.equals(otherList));
    }

    @Test
    public void testSize() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        assertEquals(3, IntegerList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(IntegerList.isEmpty());

        IntegerList.add(1);

        assertFalse(IntegerList.isEmpty());
    }

    @Test
    public void testClear() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        IntegerList.clear();

        assertEquals(0, IntegerList.size());
        assertTrue(IntegerList.isEmpty());
    }

    @Test
    public void testToArray() {
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);

        Integer[] expected = {1, 2, 3};
        assertArrayEquals(expected, IntegerList.toArray());
    }
}