package chutesandladdersgame;

import static chutesandladdersgame.Functions.dieRoller;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class OnePlayerMode {

    /**
     * The one-player version of the game. Pits the player against a computer
     * which does not attempt to cheat.
     */
    public void startGame() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Would you like to play against the computer?");

        String userResponse = userInput.nextLine();

        if (userResponse.contains("yes")) {
            int playerOnePosition = 0;
            int computerPosition = 0;
            while (playerOnePosition < 100 && computerPosition < 100) {
                int playerOneRoll = dieRoller();
                System.out.println("Player One rolled a: " + playerOneRoll);
                System.out.print("Player One, please input the result of your roll.[1-6] ");

                int playerOneRollResult = userInput.nextInt();
                if (playerOneRoll < playerOneRollResult) {
                    System.out.println("You forfeit your turn for trying to cheat.");
                    playerOneRoll = 0;
                }
                playerOnePosition += playerOneRoll;
                System.out.println("Player One moved " + playerOneRoll + " space(s).");
                if (playerOnePosition != Functions.testForMover(playerOnePosition)) {
                    if (playerOnePosition > Functions.testForMover(playerOnePosition)) {
                        System.out.println("Player One landed on a chute! They slid down to square " + Functions.testForMover(playerOnePosition) + ".");
                    } else {
                        System.out.println("Player One landed on a ladder! They climbed up to square " + Functions.testForMover(playerOnePosition) + ".");
                    }
                    playerOnePosition = Functions.testForMover(playerOnePosition);
                }
                System.out.println("Player One is on square " + playerOnePosition + ".");
                if (playerOnePosition == 100) {
                    System.out.println("Player One Won!");
                } else if (playerOnePosition > 100) {
                    while (playerOnePosition > 100) {
                        System.out.print("Your roll moved you to square " + playerOnePosition + ", which is too far! ");
                        playerOnePosition -= playerOneRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                        System.out.println("You've been pulled back to square " + playerOnePosition + ". You must land on square 100 to win.");
                    }
                }
                int computerRoll = dieRoller();
                System.out.println("Computer rolled a: " + computerRoll);
                computerPosition += computerRoll;
                System.out.println("Computer moved " + computerRoll + " space(s).");
                if (computerPosition != Functions.testForMover(computerPosition)) {
                    if (computerPosition > Functions.testForMover(computerPosition)) {
                        System.out.println("Computer landed on a chute! They slid down to square " + Functions.testForMover(computerPosition) + ".");
                    } else {
                        System.out.println("Computer landed on a ladder! They climbed up to square " + Functions.testForMover(computerPosition) + ".");
                    }
                    computerPosition = Functions.testForMover(computerRoll);
                }
                System.out.println("Computer is on the " + computerPosition + " square.");
                
                printBoard(playerOnePosition,computerPosition);
                
                if (computerPosition == 100) {
                    System.out.println("The Computer Won!");
                } else if (computerPosition > 100) {
                    while (computerPosition > 100) {
                        computerPosition -= computerRoll;
                    }
                }
            }
        } else {
            System.out.println("Have a nice day.");
        }
    }

    public void printBoard(int player1Position, int player2Position) {
        System.out.println("*************************************************************");
        for (int i = 9; i >= 0; i--) {
            StringBuilder ln1 = new StringBuilder();
            StringBuilder ln2 = new StringBuilder();
            StringBuilder ln3 = new StringBuilder();
            ln1.append("*");
            ln2.append("*");
            ln3.append("*");

            if (i % 2 == 0) {
                // loop for counting up

                for (int j = 1; j <= 10; j++) {
                    int currentsquare = (i * 10) + j;
                    if (player1Position == currentsquare) {
                        ln1.append(" 1");

                    } else {
                        ln1.append("  ");
                    }
                    if (player2Position == currentsquare) {
                        ln1.append(" 2 *");
                    } else {
                        ln1.append("   *");
                    }

                    ln2.append("  ");

                    ln2.append("   *");

                    ln3.append("******");

                }
            } else {
                //loop for counting down 

                for (int j = 10; j > 0; j--) {
                    int currentsquare = (i * 10) + j;
                    if (player1Position == currentsquare) {
                        ln1.append(" 1");

                    } else {
                        ln1.append("  ");
                    }
                    if (player2Position == currentsquare) {
                        ln1.append(" 2 *");
                    } else {
                        ln1.append("   *");
                    }

                    ln2.append("  ");

                    ln2.append("   *");

                    ln3.append("******");

                }
            }
            System.out.println(ln1.toString());
            System.out.println(ln2.toString());
            System.out.println(ln3.toString());

        }
    }

}
