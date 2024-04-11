//Author: Austin

package chutesandladdersgame;

import java.util.*;

public class ChutesAndLaddersGame 
        
/*
        Features yet to be implemented:
        
        Turn order (1 goes first one game, then 2 goes first the next game) 
        
        Inputs so that players can feel like they are "playing" the game (at present the computer plays the game by itself)
        
        Visual representation of game board and player tokens
        
        
*/

{

    public static void main(String[] args) 

    {

        System.out.println("Chutes and Ladders"); //Splash Screen?

        Player playerOne = new Player(1);

        Player playerTwo = new Player(1);

        Player computer = new Player(1);

        System.out.print("Enter the number of players.[1-2]");

        Scanner userInput = new Scanner(System.in);

        if (userInput.hasNextInt()) //checks if user input is a number.

        {

            int numberOfPlayers = userInput.nextInt();

            if (numberOfPlayers == 1)

            {
                    System.out.print("Would you like to play against the computer?");

                    String userResponse = userInput.nextLine();

                    if (userResponse.equals("yes")) 
                    
                    {

                    } 
                    else 
                    
                    {
                        System.exit(0); //closes the program.
                    }
            }

            else if (numberOfPlayers == 2)
                
            {
                
                
                int playerOnePosition = 1;
                
                int playerTwoPosition = 1;
                
                while (playerOnePosition < 100 && playerTwoPosition < 100) 
                
                    {
                        int playerOneRoll = dieRoller();
                        
                        System.out.println("Player one rolled a: "+ playerOneRoll);
                        
                        System.out.print("Player one, please input the result of your roll.[1-6]");
                        
                        /*
                            
                        
                        switch(playerOneRoll) 
                        {
                            case 1:
                                display "1" side of die
                        
                            case 2:
                                 display "2" side of die
                        
                        and so on.
                        
                        }

                        */
                        
                        int playerOneRollResult = userInput.nextInt();
                        
                        if(playerOneRoll < playerOneRollResult) 
                        
                        {
                            System.out.println("You forfeit your turn for trying to cheat.");
                            
                            playerOneRoll = 0;
                        }
                        
                        switch (playerOnePosition) 
                        
                        {
                            case 4:
                                playerOnePosition = 14; //ladder
                                break;
                            case 8:
                                playerOnePosition = 30; //ladder
                                break;
                            case 13:
                                playerOnePosition = 33; //ladder
                                break;
                            case 16:
                                playerOnePosition = 2; //chute
                                break;
                            case 21:
                                playerOnePosition = 42; //ladder
                                break;
                            case 28:
                                playerOnePosition = 76; //ladder
                                break;
                            case 36:
                                playerOnePosition = 6; //chute
                                break;
                            case 48:
                                playerOnePosition = 26; //chute
                                break;
                            case 49:
                                playerOnePosition = 73; //ladder
                                break;
                            case 50:
                                playerOnePosition = 67; //ladder
                                break;
                            case 56:
                                playerOnePosition = 18; //chute
                                break;
                            case 62:
                                playerOnePosition = 54; //chute
                                break;
                            case 64:
                                playerOnePosition = 45; //chute
                                break;
                            case 71:
                                playerOnePosition = 92; //ladder
                                break;
                            case 80:
                                playerOnePosition = 99; //ladder
                                break;
                            case 88:
                                playerOnePosition = 24; //chute
                                break;
                            case 93:
                                playerOnePosition = 66; //chute
                                break;
                            case 95:
                                playerOnePosition = 75; //chute
                                break;
                            case 97:
                                playerOnePosition = 78; //chute
                                break;
                            default:
                                playerOnePosition += playerOneRoll;
                            
                        }
                        
                        System.out.println("Player One moved " + playerOneRoll + " spaces.");
                        
                        System.out.println("Player One is on the " + playerOnePosition + " square.");
                    
                        
                        if (playerOnePosition == 100) 
                                
                            {
                                System.out.println("Player One Won!");

                            }
                                
                        else if (playerOnePosition > 100) 
                                
                        {
                                    
                            while (playerOnePosition > 100) 
                                    
                                {
                                    
                                    playerOnePosition -= playerOneRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                                
                                }

                        }
                        
                        
                        int playerTwoRoll = dieRoller();
                        
                        System.out.println("Player two rolled a: "+ playerTwoRoll);
                        
                        System.out.print("Player two, please input the result of your roll.[1-6]");
                        
                        int playerTwoRollResult = userInput.nextInt();
                        
                        if(playerTwoRoll < playerTwoRollResult) 
                        
                        {
                            System.out.println("You forfeit your turn for trying to cheat.");
                            
                            playerTwoRoll = 0;
                        }
                            
                        switch (playerTwoPosition) 
                        
                        {
                            case 4:
                                playerTwoPosition = 14; //ladder
                                break;
                            case 8:
                                playerTwoPosition = 30; //ladder
                                break;
                            case 13:
                                playerTwoPosition = 33; //ladder
                                break;
                            case 16:
                                playerTwoPosition = 2; //chute
                                break;
                            case 21:
                                playerTwoPosition = 42; //ladder
                                break;
                            case 28:
                                playerTwoPosition = 76; //ladder
                                break;
                            case 36:
                                playerTwoPosition = 6; //chute
                                break;
                            case 48:
                                playerTwoPosition = 26; //chute
                                break;
                            case 49:
                                playerTwoPosition = 73; //ladder
                                break;
                            case 50:
                                playerTwoPosition = 67; //ladder
                                break;
                            case 56:
                                playerTwoPosition = 18; //chute
                                break;
                            case 62:
                                playerTwoPosition = 54; //chute
                                break;
                            case 64:
                                playerTwoPosition = 45; //chute
                                break;
                            case 71:
                                playerTwoPosition = 92; //ladder
                                break;
                            case 80:
                                playerTwoPosition = 99; //ladder
                                break;
                            case 88:
                                playerTwoPosition = 24; //chute
                                break;
                            case 93:
                                playerTwoPosition = 66; //chute
                                break;
                            case 95:
                                playerTwoPosition = 75; //chute
                                break;
                            case 97:
                                playerTwoPosition = 78; //chute
                                break;
                            default:
                                playerTwoPosition += playerTwoRoll;
                            
                        }
                            
                            System.out.println("Player Two moved " + playerTwoRoll + " spaces.");
                        
                            System.out.println("Player Two is on the " + playerTwoPosition + " square.");

                        

                            if (playerTwoPosition == 100) 
                                
                            {
                                   
                                System.out.println("Player Two Won!");
                                
                            }
                                
                        else if (playerTwoPosition > 100) 
                                
                            {
                                    
                                while (playerTwoPosition > 100) 
                                    
                                    {
                                        
                                    playerTwoPosition -= playerTwoRoll;
                                
                                    }

                            }
                    }

            }

        }

        else
            
        {
            
            System.out.println("Please enter a number, not a word.");
            
        }
            
}
    
public static int dieRoller() //method to simulate a roll of a single six sided die.
    
    {
        Random d6 = new Random();

        int d6Roll = d6.nextInt(6) + 1; //hackish way to ensure a player never rolls a 0 or anything above 6.
        
        return d6Roll;
    }
}

//Author: Austin

