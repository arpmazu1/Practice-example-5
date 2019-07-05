package com.stackroute.pexercise;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class OccurrenceOfACharacterTest {
    OccurrenceOfACharacter occur;

    @Before
    public void setUp() {

        occur = new OccurrenceOfACharacter();
    }

    @After
    public void tearDown() {

        occur = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {


    }

    @AfterClass
    public static void tearDownBeforeClass() {


    }

    @Test
    public void givenStringShouldReturnCorrectOutput() {
        //arange
        //Act
        String[] arr = {"a", "b", "c", "d", "a", "c", "c"};
        //Assert
        assertEquals(Map.of("a", true, "b", false, "c", true, "d", false), occur.occurrence(arr));

    }

    @Test
    public void givenNullStringShouldReturnErrorMessage() {
        //arange
        //Act

        //Assert
        assertNull(occur.occurrence(null));

    }

    @Test
    public void givenAlphaNumerciStringShouldReturnCorrectOutput() {
        //arange
        //Act
        String[] arr = {"a", "b", "c", "123", "a", "123", "c", "a3E"};
        //Assert
        assertEquals(Map.of("a", true, "b", false, "123", true, "a3E", false, "c", true), occur.occurrence(arr));

    }

}