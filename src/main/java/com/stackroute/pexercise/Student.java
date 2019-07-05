package com.stackroute.pexercise;

public class Student {
    //class studen having member variables id,nameand age
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//constructor

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
//getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
