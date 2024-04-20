//Author: Austin
package chutesandladdersgame;

import java.util.*;

public class ChutesAndLaddersGame  {

    public static void main(String[] args) 
    
    {
        System.out.println("Chutes and Ladders"); 
        System.out.print("Enter the number of players.[1-4]");
        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextInt()) 
        {
            int numberOfPlayers = userInput.nextInt();
            
            switch (numberOfPlayers) {
                case 1:
                    OnePlayerMode onePlayerGame = new OnePlayerMode();
                    
                    onePlayerGame.startGame();
                    
                    break;
                
                case 2:
                    
                    TwoPlayerMode twoPlayerGame = new TwoPlayerMode();
                    
                    twoPlayerGame.startGame();
                    
                    break;
                case 3:
                    ThreePlayerMode threePlayerGame = new ThreePlayerMode();
                    
                    threePlayerGame.startGame();
                    
                    break;
                case 4:
                    FourPlayerMode fourPlayerGame = new FourPlayerMode();
                    
                    fourPlayerGame.startGame();
                    break;
                default:
                    System.out.println("Please enter a number, not a word.");
                    break;
            }
        }
    }
}
//Author: Austin

