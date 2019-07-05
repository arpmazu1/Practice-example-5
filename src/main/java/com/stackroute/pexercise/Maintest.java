package com.stackroute.pexercise;

import java.util.ArrayList;
import java.util.List;

public class Maintest {
    //Creating a list of type student
    public List<Student> sorting(List<Student> arr){
        //checking if the arr is empty or not
        if(arr.isEmpty())
            return null;
        //sorting the array in descending order
        arr.sort(new StudentSorter());
        return arr;

    }
}
