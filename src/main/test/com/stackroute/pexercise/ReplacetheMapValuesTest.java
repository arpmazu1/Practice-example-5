package com.stackroute.pexercise;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplacetheMapValuesTest {

    ReplacetheMapValues replace;

    @Before
    public void setUp() {

        replace = new ReplacetheMapValues();
    }

    @After
    public void tearDown() {

        replace = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {


    }

    @AfterClass
    public static void tearDownBeforeClass() {


    }

    @Test
    public void givenMapStringShouldReturnCorrectOutput() {
        //arange
        //Act
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        //Assert
        assertEquals(Map.of("val2", "java", "val1", " "), replace.replace(map));

    }

    @Test
    public void givenNullStringShouldReturnCorrectOutput() {
        //arange
        //Act

        //Assert
        assertNull(replace.replace(null));

    }

    @Test
    public void givenMapStringWithEmptyValueShouldReturnCorrectOutput() {
        //arange
        //Act
        Map<String, String> map = new HashMap<>();
        map.put("val1", " ");
        map.put("val2", "c++");
        //Assert
        assertEquals(Map.of("val2", " ", "val1", " "), replace.replace(map));

    }

    @Test
    public void givenMapStringWithNullValueShouldReturnCorrectOutput() {
        //arange
        //Act
        Map<String, String> map = new HashMap<>();
        map.put("val1", "123");
        map.put("val2", "c++");
        //Assert
        assertEquals(Map.of("val2", "123", "val1", " "), replace.replace(map));

    }


}