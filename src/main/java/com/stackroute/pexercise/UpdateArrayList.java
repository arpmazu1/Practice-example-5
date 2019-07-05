package com.stackroute.pexercise;

import java.util.ArrayList;

public class UpdateArrayList {
    //program to update specific array element by given element and empty the array list.
    public String update(int index, String str) {
        String s = "";

        //Creating a arraylist
        ArrayList<String> arrList = new ArrayList<>();

        //Adding values to arraylist
        arrList.add("Apple");
        arrList.add("Grape");
        arrList.add("Melon");
        arrList.add("Berry");

        //The original Arraylist
        s = s + "The original Arraylist:" + arrList.toString() + "\n";

        //updating the element of the arraylist
        arrList.set(index, str);
        s = s + "The updated Arraylist:" + arrList.toString() + "\n";

        //clearing the arraylist
        arrList.clear();
        s = s + "The empty Arraylist:" + arrList.toString();

        //retuning the original, updated and empty arraylist
        return s;

    }
}
