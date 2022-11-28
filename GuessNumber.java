//Java program for this project 
 

import java.util.Scanner; 

public class GuessNumber{
      //Function that implements the number guessing game
      public static void
      guessNumberGame(){
        
          //Scanner Class
          Scanner sc = new Scanner(System.in); 
          
          //Generate the numbers
          int number = 1 + (int)(100 * Math.random()); 
          
          //Given K trials
          int K = 5;  
          int i, guess; 
          
          System.out.println(
             "A number is chosen" + " between 1 to 100." + " Guess the number" + " within 5 trials."
          );
          
          for (i = 0; i <K; i++){
            System.out.println(
                  "Guess the number:");
            guess = sc.nextInt(); 
            
            if (number == guess){
                System.out.println("Congratulations!" + "You guess the number!");
                break; 
            }
            else if (number > guess && i != K - 1){
                System.out.println("The number is" + " greater than " + guess);  
            }
            else if (number < guess && i != K - 1){
                System.out.println("The number is" + " less than " + guess); 
            }
                  
                  
        }
        if (i == K) {
            System.out.println("You have ran out of guesses"); 
            System.out.println("The number is " + number);
        }
    }
    //Driver code 
    public static void
    main (String arg[])
    {
        //Function call
        guessNumberGame(); 
    }
    
}