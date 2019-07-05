package com.stackroute.pexercise;

import org.junit.*;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaintestTest {

    Maintest stud;

    @Before
    public void setUp() {

        stud = new Maintest();
    }

    @After
    public void tearDown() {

        stud = null;

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
        List<Student> studentDetails = new ArrayList<>();
        studentDetails.add(new Student(123, "Arpita", 22));
        studentDetails.add(new Student(121, "Aditi", 22));
        studentDetails.add(new Student(001, "Aditya", 25));
        studentDetails.add(new Student(124, "Aditya", 25));
        studentDetails.add(new Student(123, "Riya", 22));
        //Assert
        assertEquals("[Student{id=124, name='Aditya', age=25}, Student{id=1, name='Aditya', age=25}, Student{id=123, name='Riya', age=22}," +
                " Student{id=123, name='Arpita', age=22}, Student{id=121, name='Aditi', age=22}]", stud.sorting(studentDetails).toString());

    }
    @Test
    public void givenNullArrayLisrShouldReturnCorrectOutput() {
        //arange
        //Act
        List<Student> studentDetails = new ArrayList<>();

        //Assert
        assertNull(stud.sorting(studentDetails));

    }
}