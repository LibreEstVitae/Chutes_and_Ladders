//Author: Austin
package chutesandladdersgame;

import java.util.*;

public class ChutesAndLaddersGame /*
        Features yet to be implemented:
        Turn order (1 goes first one game, then 2 goes first the next game) 
        Inputs so that players can feel like they are "playing" the game (at present the computer plays the game by itself)
        Visual representation of game board and player tokens */ {

    public static void main(String[] args) {
        System.out.println("Chutes and Ladders"); //Splash Screen?
        System.out.print("Enter the number of players.[1-4]");
        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextInt()) //checks if user input is a number.
        {
            int numberOfPlayers = userInput.nextInt();
            switch (numberOfPlayers) {
                case 1:
                    Functions.onePlayerMode();
                    break;
                case 2:
                    Functions.twoPlayerMode();
                    break;
                case 3:
                    Functions.threePlayerMode();
                    break;
                case 4:
                    Functions.fourPlayerMode();
                    break;
                default:
                    System.out.println("Please enter a number, not a word.");
                    break;
            }
        }
    }
}
//Author: Austin

