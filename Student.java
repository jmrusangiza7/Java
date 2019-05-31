package com.company;

public class Student {
      int rollno;
      String name;
      // static variable
        static String college ="ITS";
 //   float fee;
        Student(int r, String n){
            rollno = r;
            name = n;
        }
 //   Student(int rollno, String name, float fee){
 //       this.rollno = rollno; //Refers class instance variable rollno
 //       this.name = name; //Refers class instance variable name
 //       this.fee = fee; //Refers class instance variable fee
 //   }
    void display(){
            System.out.println(rollno + " " + name + " " + college);
    }
 //   void display(){
//        System.out.println(rollno + " " + name + " " + fee);


}

