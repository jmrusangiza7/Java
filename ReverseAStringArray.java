/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reverseastringarray;

/**
 *
 * @author miker
 */

import java.util.Scanner; 

public class ReverseAStringArray {

    public static void ReverseAStringArray(){
       String str; 
       Scanner scan = new Scanner(System.in); 
       System.out.println("Enter a string, any string: ");
       str = scan.nextLine(); 
       
       char[] ch = str.toCharArray(); 
       System.out.println("The Reverse of the String is: ");
       int j = ch.length;
        for(int i = j; i > 0; i--){
           System.out.print(ch[i-1]);
       }
       
       
    }
    
    
    
    public static void main(String[] args) {
        ReverseAStringArray(); 
    }
}
