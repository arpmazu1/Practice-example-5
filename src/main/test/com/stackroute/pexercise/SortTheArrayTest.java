package com.stackroute.pexercise;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class SortTheArrayTest {

    SortTheArray arr;

    @Before
    public void setUp() {

        arr = new SortTheArray();
    }

    @After
    public void tearDown() {

        arr = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {


    }

    @AfterClass
    public static void tearDownBeforeClass() {


    }

    @Test
    public void givenSetOfStringShouldReturnCorrectOutput() {
        //arange
        //Act
        Set<String> names = new HashSet<>();
        names.add("Harry");
        names.add("Olive");
        names.add("Bluto");
        names.add("Eugene");
        names.add("Alice");

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Alice");
        ar.add("Bluto");
        ar.add("Eugene");
        ar.add("Harry");
        ar.add("Olive");
        //Assert
        assertEquals(ar, arr.sortTheArray(names));

    }

    @Test
    public void givenSetAsNullShouldReturnNullOutput() {
        //arange
        //Act
        //Assert
        assertNull( arr.sortTheArray(null));

    }

    @Test
    public void givenSetOfStringHavingNumberElementShouldReturnCorrectOutput() {
        //arange
        //Act
        Set<String> names = new HashSet<>();
        names.add("Harry");
        names.add("Olive");
        names.add("Bluto");
        names.add("1234");
        names.add("Alice");

        ArrayList<String> ar = new ArrayList<>();
        ar.add("1234");
        ar.add("Alice");
        ar.add("Bluto");
        ar.add("Harry");
        ar.add("Olive");
        //Assert
        assertEquals(ar, arr.sortTheArray(names));

    }


    @Test
    public void givenSetOfStringHavingNullElementShouldReturnCorrectOutput() {
        //arange
        //Act
        Set<String> names = new HashSet<>();
        names.add("Harry");
        names.add("Olive");
        names.add("Bluto");
        names.add(null);
        names.add("Alice");


        //Assert
        assertEquals(null, arr.sortTheArray(names));

    }
}