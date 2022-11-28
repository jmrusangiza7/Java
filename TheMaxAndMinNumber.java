/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.themaxandminnumber;

/**
 *
 * @author miker
 */

import java.util.Scanner;



public class TheMaxAndMinNumber {
    
    public static void
    TheMaxAndMinNumber(){
        //Scanner Class
          Scanner sc = new Scanner(System.in);
          
          //Number Variables
          int number1;
          int number2; 
          int number3; 
          
          System.out.println("Enter three numbers: ");
          
          number1 = sc.nextInt();
          number2 = sc.nextInt(); 
          number3 = sc.nextInt(); 
          
          if (number1 > number2 && number1 > number3){
             System.out.println(number1 + " is the max number."); 
          }else if (number2 > number1 && number2 > number3){
              System.out.println(number2 + " is the max number.");
          } else {
             System.out.println(number3 + " is the max number.");
          }
          
          if (number1 < number2 && number1 < number3){
             System.out.println(number1 + " is the min number."); 
          }else if (number2 < number1 && number2 < number3){
              System.out.println(number2 + " is the min number.");
          } else {
             System.out.println(number3 + " is the min number.");
          }
    }

    public static void main(String[] args) {
        TheMaxAndMinNumber();
    }
}
