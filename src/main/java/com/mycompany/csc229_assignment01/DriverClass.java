package com.mycompany.csc229_assignment01;

public class DriverClass {
    public static void main(String[] args) {
        Course course = new Course();

        course.setID(1672628);
        course.setName("Michael");
        course.setCode("CSC229");

       displayCourseDetails(course);
    }
    private static void displayCourseDetails (Course course){
        System.out.println("ID: " + course.getID());
        System.out.println("Name: " + course.getName());
        System.out.println("Code: " + course.getCode());
    }
}
