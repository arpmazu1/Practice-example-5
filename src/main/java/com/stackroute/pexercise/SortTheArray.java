package com.stackroute.pexercise;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortTheArray {

    //program to implement set interface which sorts the given randomly ordered names into ascending order
    public ArrayList<String> sortTheArray(Set<String> str) {
        if (str == null)
            return null;
        if (str.contains(null))
            return null;
        //sorting the set of string using treeset
        Set<String> treeset = new TreeSet<String>(str);
        //converting the set int oarray list
        ArrayList<String> arr = new ArrayList<>(treeset);
        //returning the arraylist
        return arr;
    }
}
