package chutesandladdersgame;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class FourPlayerMode {

    /**
     * The four-player version of the game.
     */
    public void startGame() {
        Scanner userInput = new Scanner(System.in);
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int playerThreePosition = 0;
        int playerFourPosition = 0;
        while (playerOnePosition < 100 && playerTwoPosition < 100 && playerThreePosition < 100 && playerFourPosition < 100) {
            printBoard(playerOnePosition,playerTwoPosition,playerThreePosition,playerFourPosition);
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
                System.exit(0);
            } else if (playerTwoPosition > 100) {
                while (playerTwoPosition > 100) {
                    System.out.print("Your roll moved you to square " + playerTwoPosition + ", which is too far! ");
                    playerTwoPosition -= playerTwoRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                    System.out.println("You've been pulled back to square " + playerTwoPosition + ". You must land on square 100 to win.");
                }
            }
            int playerThreeRoll = Functions.dieRoller();
            System.out.println("Player Three rolled a: " + playerThreeRoll);
            System.out.print("Player Three, please input the result of your roll.[1-6] ");

            int playerThreeRollResult = userInput.nextInt();
            if (playerThreeRoll < playerThreeRollResult) {
                System.out.println("You forfeit your turn for trying to cheat.");
                playerThreeRoll = 0;
            }
            playerThreePosition += playerThreeRoll;
            System.out.println("Player Three moved " + playerThreeRoll + " space(s).");
            if (playerThreePosition != Functions.testForMover(playerThreePosition)) {
                if (playerThreePosition > Functions.testForMover(playerThreePosition)) {
                    System.out.println("Player Three landed on a chute! They slid down to square " + Functions.testForMover(playerThreePosition) + ".");
                } else {
                    System.out.println("Player Three landed on a ladder! They climbed up to square " + Functions.testForMover(playerThreePosition) + ".");
                }
                playerThreePosition = Functions.testForMover(playerThreePosition);
            }
            System.out.println("Player Three is on square " + playerThreePosition + ".");
            if (playerThreePosition == 100) {
                System.out.println("Player Three Won!");
                System.exit(0);
            } else if (playerThreePosition > 100) {
                while (playerThreePosition > 100) {
                    System.out.print("Your roll moved you to square " + playerThreePosition + ", which is too far! ");
                    playerThreePosition -= playerThreeRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                    System.out.println("You've been pulled back to square " + playerThreePosition + ". You must land on square 100 to win.");
                }
            }
            int playerFourRoll = Functions.dieRoller();
            System.out.println("Player Four rolled a: " + playerFourRoll);
            System.out.print("Player Four, please input the result of your roll.[1-6] ");

            int playerFourRollResult = userInput.nextInt();
            if (playerFourRoll < playerFourRollResult) {
                System.out.println("You forfeit your turn for trying to cheat.");
                playerFourRoll = 0;
            }
            playerFourPosition += playerFourRoll;
            System.out.println("Player Four moved " + playerFourRoll + " space(s).");
            if (playerFourPosition != Functions.testForMover(playerFourPosition)) {
                if (playerFourPosition > Functions.testForMover(playerFourPosition)) {
                    System.out.println("Player Four landed on a chute! They slid down to square " + Functions.testForMover(playerFourPosition) + ".");
                } else {
                    System.out.println("Player Four landed on a ladder! They climbed up to square " + Functions.testForMover(playerFourPosition) + ".");
                }
                playerFourPosition = Functions.testForMover(playerFourPosition);
            }
            System.out.println("Player Four is on square " + playerFourPosition + ".");
            if (playerFourPosition == 100) {
                System.out.println("Player Four Won!");
                System.exit(0);
            } else if (playerFourPosition > 100) {
                while (playerFourPosition > 100) {
                    System.out.print("Your roll moved you to square " + playerFourPosition + ", which is too far! ");
                    playerFourPosition -= playerFourRoll; //implements the rule that dictates a player must roll backwards if they "overshoot" 100.
                    System.out.println("You've been pulled back to square " + playerFourPosition + ". You must land on square 100 to win.");
                }
            }
        }
    }

    public static void printBoard(int player1Position, int player2Position, int player3Positon, int player4Position) {
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
                    if (player3Positon == currentsquare) {
                        ln2.append(" 3");

                    } else {
                        ln2.append("  ");
                    }
                    if (player4Position == currentsquare) {
                        ln2.append(" 4 *");

                    } else {
                        ln2.append("   *");
                    }
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
                    if (player3Positon == currentsquare) {
                        ln2.append(" 3");

                    } else {
                        ln2.append("  ");
                    }
                    if (player4Position == currentsquare) {
                        ln2.append(" 4 *");

                    } else {
                        ln2.append("   *");
                    }
                    ln3.append("******");

                }
            }
            System.out.println(ln1.toString());
            System.out.println(ln2.toString());
            System.out.println(ln3.toString());

        }

    }

}
