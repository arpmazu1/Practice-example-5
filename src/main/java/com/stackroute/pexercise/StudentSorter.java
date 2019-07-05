package com.stackroute.pexercise;

import java.util.Comparator;

class StudentSorter implements Comparator<Student>
{
    int value;
    //comparing values of id,name and age
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()==o2.getAge())
        {
            //if age equal compare the name
            value=o1.getName().compareTo(o2.getName());
            if(value==0)
            {
                //if age and name same then compare
                if(o1.getId()==o2.getId())
                    return 0;
                else if(o1.getId()<o2.getId())
                    return 1;
                else
                    return -1;
            }
            else
                return value*-1;

        }
        else if(o1.getAge()<o2.getAge())
            return 1;
        else
            return -1;

    }


}
