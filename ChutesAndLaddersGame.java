package chutesandladdersgame;

import java.util.Scanner;

import java.util.Random;
        
public class ChutesAndLaddersGame 

{
    
    public static void main(String[] args) 
    
    {
        
        System.out.println("Chutes and Ladders"); //Splash Screen?
        
        System.out.print("How many players?");
        
        Scanner userInput = new Scanner(System.in);
        
        String numberOfPlayers = userInput.nextLine();
        
        if (numberOfPlayers.equals("1")) //replace with switch case statement
        
        {
            System.out.print("Would you like to play against the computer?");
            
            String userResponse = userInput.nextLine();
            
            if (userResponse.equals("yes")) 
                    {
                        //initialize the game
                    }
            else 
            {
                System.exit(0); //closes the program.
            }
         
        }
        
        else 
        {
            
            
            
            int playerGen = Integer.parseInt(numberOfPlayers);
            
            for (int i = 1; i <= playerGen; i++) //loop to fill array with values
            
            {
                
                int[] playerCount = {}; //empty array to store player number and order
                
                
                System.out.println("Each player must roll the die to decide who goes first.");
                
                
                
                
            }
            
        }
        
        
        
        
        
       
        
        
    }

}
