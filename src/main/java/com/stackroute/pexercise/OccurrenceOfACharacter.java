package com.stackroute.pexercise;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfACharacter {
    //program where different string is a key and its value is true if that string appears 2 or more times in the array
    public Map<String, Boolean> occurrence(String[] arr) {
        if (arr == null)
            return null;
//        if(Arrays.asList(arr).contains(null))
//            return null;

        //using hash map to store each word and find its occurrence
        Map<String, Boolean> map = new HashMap<>();
        for (String w : arr) {
            //checking if the map does not contain  value set ket as false
            if (!map.containsKey(w))
                map.put(w, false);
                //if the map contains the value then set key as true
            else
                map.put(w, true);


        }
        //return the map
        return map;

    }
}
