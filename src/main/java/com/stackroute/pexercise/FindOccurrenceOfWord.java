package com.stackroute.pexercise;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfWord {
    //program to find the number of counts in the following String.
    public Map<String, Integer> occurrence(String str) {
        if (str == null)
            return null;

        Map<String, Integer> map = new HashMap<>(); //using hash map to store each word and find its occurrence

        //replacing all the special character into " "
        String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");

        //splitting the string into string array
        String[] word = str1.split("\\s+");

        //checking the occ
        for (String w : word) {
            Integer n = map.get(w);
            n = (n == null) ? 1 : ++n;
            map.put(w, n);
        }


        return map;

    }
}
