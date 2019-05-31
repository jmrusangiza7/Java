package com.company;

public class A {
 //   void m(){
 //       System.out.println("hello m");
//    }
 //   void n(){
 //       System.out.println("hello n");
//    }
    //m() is the same as this.m()

    //this.m(); default constructor added by compiler
    A(){
        System.out.println("Hello A");
    }
    A(int x){
        //this.(); Current class constructor is called
        System.out.println(x);
    }
}
