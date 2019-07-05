package com.stackroute.pexercise;

import java.util.HashMap;
import java.util.Map;

public class ReplacetheMapValues {

    //a method that accepts a Map object having two key-value pairs with the keys val1,val2 and modify and return.

    public Map<String, String> replace(Map<String, String> map) {

        if (map == null)
            return null;
        //storing the value of val1 on string val
        String val = map.get("val1");
        map.replace("val2", val); //replacing the val2 with val
        map.replace("val1", " "); //replacing the val1 with " "
        return map;

    }
}
