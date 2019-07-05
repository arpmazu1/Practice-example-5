package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList arr;

    @Before
    public void setUp() {

        arr = new UpdateArrayList();
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
    public void givenStringAndIndexShouldReturnUpdateArrayList() {
        //arange

        //Act


        //Assert
        assertEquals("The original Arraylist:[Apple, Grape, Melon, Berry]\n" +
                "The updated Arraylist:[Kiwi, Grape, Melon, Berry]\n" +
                "The empty Arraylist:[]", arr.update(0, "Kiwi"));

        assertEquals("The original Arraylist:[Apple, Grape, Melon, Berry]\n" +
                "The updated Arraylist:[Apple, Grape, Mango, Berry]\n" +
                "The empty Arraylist:[]", arr.update(2, "Mango"));


    }

    @Test
    public void givenNullStringAndIndexShouldReturnUpdateArrayList() {
        //arange

        //Act


        //Assert
        assertEquals("The original Arraylist:[Apple, Grape, Melon, Berry]\n" +
                "The updated Arraylist:[Apple, Grape, null, Berry]\n" +
                "The empty Arraylist:[]", arr.update(2, null));


    }


}