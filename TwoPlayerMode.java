package chutesandladdersgame;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class TwoPlayerMode {

    /**
     * The two-player version of the game.
     */
    public void startGame() {
        Scanner userInput = new Scanner(System.in);
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        while (playerOnePosition < 100 && playerTwoPosition < 100) {
            printBoard(playerOnePosition,playerTwoPosition);
            int playerOneRoll = Functions.dieRoller();
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
                System.exit(0);
            } else if (playerOnePosition > 100) {
                while (playerOnePosition > 100) {
                    System.out.print("Your roll moved you to square " + playerOnePosition + ", which is too far! ");
                    playerOnePosition -= playerOneRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                    System.out.println("You've been pulled back to square " + playerOnePosition + ". You must land on square 100 to win.");
                }
            }
            int playerTwoRoll = Functions.dieRoller();
            System.out.println("Player Two rolled a: " + playerTwoRoll);
            System.out.print("Player Two, please input the result of your roll.[1-6] ");
            int playerTwoRollResult = userInput.nextInt();
            if (playerTwoRoll < playerTwoRollResult) {
                System.out.println("You forfeit your turn for trying to cheat.");
                playerTwoRoll = 0;
            }
            playerTwoPosition += playerTwoRoll;
            System.out.println("Player Two moved " + playerTwoRoll + " space(s).");
            if (playerTwoPosition != Functions.testForMover(playerTwoPosition)) {
                if (playerTwoPosition > Functions.testForMover(playerTwoPosition)) {
                    System.out.println("Player Two landed on a chute! They slid down to square " + Functions.testForMover(playerTwoPosition) + ".");
                } else {
                    System.out.println("Player Two landed on a ladder! They climbed up to square " + Functions.testForMover(playerTwoPosition) + ".");
                }
                playerTwoPosition = Functions.testForMover(playerTwoRoll);
            }
            System.out.println("Player Two is on square " + playerTwoPosition + ".");
            if (playerTwoPosition == 100) {
                System.out.println("Player Two Won!");
            } else if (playerTwoPosition > 100) {
                while (playerTwoPosition > 100) {
                    System.out.print("Your roll moved you to square " + playerTwoPosition + ", which is too far! ");
                    playerTwoPosition -= playerTwoRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                    System.out.println("You've been pulled back to square " + playerTwoPosition + ". You must land on square 100 to win.");
                }
            }
        }
    }

    public static void printBoard(int player1Position, int player2Position) {
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
