package com.stackroute.pexercise;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class FindOccurrenceOfWordTest {
    FindOccurrenceOfWord find;

    @Before
    public void setUp() {
//        System.out.println("Inside before");
        find = new FindOccurrenceOfWord();
    }

    @After
    public void tearDown() {
//        System.out.println("After");
        find = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
//        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownBeforeClass() {
//        System.out.println("After class");


    }

    @Test
    public void givenStringShouldReturnCorrectOutput() {
        //arange
        //Act
        //Assert
        assertEquals(Map.of("one", 5, "two", 2, "three", 2), find.occurrence("one one -one___two,,three,one @three*one?two"));

    }

    @Test
    public void givenNullStringShouldReturnErrorMessage() {
        //arange
        //Act
        //Assert
        assertNull(find.occurrence(null));


    }

    @Test
    public void givenAlphaNumericStringShouldReturnCorrectOutput() {
        //arange
        //Act
        //Assert
        assertEquals(Map.of("00", 1, "Arpita", 1, "00f90", 1, "one", 3, "two", 2, "three", 2, "123F90", 1), find.occurrence("one___two,,three,one 00 00f90 @three 123F90 &Arpita *one?two"));

    }

}