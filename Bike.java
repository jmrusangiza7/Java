package com.company;

public class Bike {
    final int speedlimit =90; //final variable

    void run(){
        System.out.println("running");
    }

    }
    //  void run(){ in the run method, changing the variable speedlimit would cause compile error because there is final method
      //  speedlimit = 400;
   // }

