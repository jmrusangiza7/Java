package com.company;

public class TestStudent {

    public static void main(String[] args) {
	// write your code here

        //Set up object name of type Student
        Student s = new Student();
        Student e = new Student();

        //Setting Student S information
        s.setStudentID(236348);
        s.setStudentName("Harry");
        s.setCollegeName("Franciscan University");
        s.setAddress("Steubenville,OH");

        //Setting Student E information
        e.setStudentID(372748);
        e.setStudentName("Erin");
        e.setCollegeName("University of Virginia");
        e.setAddress("Charlottesville,VA");

        //Getting Student S information
        System.out.println("Student ID: " + s.getStudentID());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("College Name: " + s.getCollegeName());
        System.out.println("Address: " + s.getAddress());

        System.out.println("\n");

        //Getting Student E information
        System.out.println("Student ID: " + e.getStudentID());
        System.out.println("Student Name: " + e.getStudentName());
        System.out.println("College Name: " + e.getCollegeName());
        System.out.println("Address: " + e.getAddress());



    }
}
