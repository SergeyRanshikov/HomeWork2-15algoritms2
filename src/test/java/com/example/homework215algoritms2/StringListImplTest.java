package com.example.homework215algoritms2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StringListImplTest {
    private StringList stringList;

    @Before
    public void setUp() {
        stringList = new StringListImpl(10);
    }


    @Test
    public void testAdd() {
        stringList.add("Item 1");
        stringList.add("Item 2");


        assertEquals(2, stringList.size());
        assertTrue(stringList.contains("Item 1"));
        assertTrue(stringList.contains("Item 2"));

    }

    @Test
    public void testAddWithIndex() {
        stringList.add("Item 1");
        stringList.add("Item 3");
        stringList.add(1, "Item 2");

        assertEquals(3, stringList.size());
        assertTrue(stringList.contains("Item 1"));
        assertTrue(stringList.contains("Item 2"));
        assertTrue(stringList.contains("Item 3"));
        assertEquals("Item 1", stringList.get(0));
        assertEquals("Item 2", stringList.get(1));
        assertEquals("Item 3", stringList.get(2));
    }

    @Test
    public void testSet() {
        stringList.add("Item 1");
        stringList.add("Item 2");

        stringList.set(1, "Item 3");

        assertEquals(2, stringList.size());
        assertTrue(stringList.contains("Item 1"));
        assertTrue(stringList.contains("Item 3"));
        assertEquals("Item 1", stringList.get(0));
        assertEquals("Item 3", stringList.get(1));
    }

    @Test
    public void testRemoveByValue() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        stringList.remove("Item 2");

        assertEquals(2, stringList.size());
        assertTrue(stringList.contains("Item 1"));
        assertFalse(stringList.contains("Item 2"));
        assertTrue(stringList.contains("Item 3"));
        assertEquals("Item 1", stringList.get(0));
        assertEquals("Item 3", stringList.get(1));
    }

    @Test
    public void testRemoveByIndex() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        stringList.remove(0);

        assertEquals(2, stringList.size());
        assertFalse(stringList.contains("Item 1"));
        assertTrue(stringList.contains("Item 2"));
        assertTrue(stringList.contains("Item 3"));
        assertEquals("Item 2", stringList.get(0));
        assertEquals("Item 3", stringList.get(1));
    }

    @Test
    public void testContains() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        assertTrue(stringList.contains("Item 2"));
        assertFalse(stringList.contains("Item 4"));
    }

    @Test
    public void testIndexOf() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 2");

        assertEquals(1, stringList.indexOf("Item 2"));
        assertEquals(-1, stringList.indexOf("Item 3"));
    }

    @Test
    public void testLastIndexOf() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 2");

        assertEquals(2, stringList.lastIndexOf("Item 2"));
        assertEquals(-1, stringList.lastIndexOf("Item 3"));
    }

    @Test
    public void testGet() {
        stringList.add("Item 1");
        stringList.add("Item 2");

        assertEquals("Item 2", stringList.get(1));
    }

    @Test
    public void testEquals() {
        StringList otherList = new StringListImpl(10);

        stringList.add("Item 1");
        stringList.add("Item 2");
        otherList.add("Item 1");
        otherList.add("Item 2");

        assertTrue(stringList.equals(otherList));
    }

    @Test
    public void testSize() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        assertEquals(3, stringList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stringList.isEmpty());

        stringList.add("Item 1");

        assertFalse(stringList.isEmpty());
    }

    @Test
    public void testClear() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        stringList.clear();

        assertEquals(0, stringList.size());
        assertTrue(stringList.isEmpty());
    }

    @Test
    public void testToArray() {
        stringList.add("Item 1");
        stringList.add("Item 2");
        stringList.add("Item 3");

        String[] expected = {"Item 1", "Item 2", "Item 3"};
        assertArrayEquals(expected, stringList.toArray());
    }
}
