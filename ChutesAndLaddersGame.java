//Author: Austin
package chutesandladdersgame;

import java.util.*;

public class ChutesAndLaddersGame /*
        Features yet to be implemented:
        
        Turn order (1 goes first one game, then 2 goes first the next game) 
        
        Inputs so that players can feel like they are "playing" the game (at present the computer plays the game by itself)
        
        Visual representation of game board and player tokens
        
        
 */ {

    public static void main(String[] args) {

        System.out.println("Chutes and Ladders"); //Splash Screen?

        System.out.print("Enter the number of players.[1-2]");

        Scanner userInput = new Scanner(System.in);

        if (userInput.hasNextInt()) //checks if user input is a number.
        {

            int numberOfPlayers = userInput.nextInt();

            if (numberOfPlayers == 1) {
                System.out.print("Would you like to play against the computer?");

                String userResponse = userInput.nextLine();

                if (userResponse.equals("yes")) {

                } else {
                    System.exit(0); //closes the program.
                }
            } else if (numberOfPlayers == 2) {

                int playerOnePosition = 0;

                int playerTwoPosition = 0;

                while (playerOnePosition < 100 && playerTwoPosition < 100) {

                    int playerOneRoll = dieRoller();
                    playerOnePosition+= playerOneRoll;
                    
                    System.out.println("Player One moved " + playerOneRoll + " spaces.");
                    if(playerOnePosition != TestForMover.testForMover(playerOnePosition)) {
                        if(playerOnePosition > TestForMover.testForMover(playerOnePosition)){
                            System.out.println("Player One landed on a chute! They slid down to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        } else {
                            System.out.println("Player One landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        }
                        playerOnePosition = TestForMover.testForMover(playerOnePosition);
                    }
                    System.out.println("Player One is on the " + playerOnePosition + " square.");

                    if (playerOnePosition == 100) {
                        System.out.println("Player One Won!");

                    } else if (playerOnePosition > 100) {

                        while (playerOnePosition > 100) {

                            playerOnePosition -= playerOneRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.

                        }

                    }

                    int playerTwoRoll = dieRoller();
                    playerTwoPosition += playerTwoRoll;
                    System.out.println("Player Two moved " + playerTwoRoll + " spaces.");
                    if(playerTwoPosition != TestForMover.testForMover(playerTwoPosition)) {
                        if(playerTwoPosition > TestForMover.testForMover(playerTwoPosition)){
                            System.out.println("Player Two landed on a chute! They slid down to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        } else {
                            System.out.println("Player Two landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        }
                        playerTwoPosition = TestForMover.testForMover(playerTwoRoll);
                    }
                    
                    System.out.println("Player Two is on the " + playerTwoPosition + " square.");
                    if (playerTwoPosition == 100) {

                        System.out.println("Player Two Won!");

                    } else if (playerTwoPosition > 100) {

                        while (playerTwoPosition > 100) {

                            playerTwoPosition -= playerTwoRoll;

                        }

                    }

                }

            }

        } else {

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

