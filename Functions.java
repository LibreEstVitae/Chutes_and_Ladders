package chutesandladdersgame;

import java.util.Random;
import java.util.Scanner;
/**
 * The chutes and ladders project main methods class. Includes functions for each number of players, the function for finding chutes and ladders, and the die roller method.
 * @author DJ, Austin, Zach, Denasha
 */
public class Functions {
    /**
     * The one-player version of the game. Pits the player against a computer which does not attempt to cheat.
     */
    public static void onePlayerMode() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Would you like to play against the computer?");

        String userResponse = userInput.nextLine();
        userResponse = userInput.nextLine();

        if (userResponse.equals("yes")) {
            int playerOnePosition = 0;
            int playerTwoPosition = 0;
            while (playerOnePosition < 100 && playerTwoPosition < 100) {
                int playerOneRoll = dieRoller();
                System.out.println("Player One rolled a: " + playerOneRoll);
                System.out.print("Player One, please input the result of your roll.[1-6] ");
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
                int playerTwoRoll = dieRoller();
                System.out.println("Computer rolled a: " + playerTwoRoll);
                playerTwoPosition += playerTwoRoll;
                System.out.println("Computer moved " + playerTwoRoll + " space(s).");
                if (playerTwoPosition != Functions.testForMover(playerTwoPosition)) {
                    if (playerTwoPosition > Functions.testForMover(playerTwoPosition)) {
                        System.out.println("Computer landed on a chute! They slid down to square " + Functions.testForMover(playerTwoPosition) + ".");
                    } else {
                        System.out.println("Computer landed on a ladder! They climbed up to square " + Functions.testForMover(playerTwoPosition) + ".");
                    }
                    playerTwoPosition = Functions.testForMover(playerTwoRoll);
                }
                System.out.println("Computer is on the " + playerTwoPosition + " square.");
                if (playerTwoPosition == 100) {
                    System.out.println("The Computer Won!");
                } else if (playerTwoPosition > 100) {
                    while (playerTwoPosition > 100) {
                        playerTwoPosition -= playerTwoRoll;
                    }
                }
            }
        } else {
            System.exit(0); //closes the program.
        }
    }
    /**
     * The two-player version of the game.
     */
    public static void twoPlayerMode() {
        Scanner userInput = new Scanner(System.in);
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        while (playerOnePosition < 100 && playerTwoPosition < 100) {
            int playerOneRoll = Functions.dieRoller();
            System.out.println("Player One rolled a: " + playerOneRoll);
            System.out.print("Player One, please input the result of your roll.[1-6] ");
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
    /**
     * The three-player version of the game.
     */
    public static void threePlayerMode() {
        Scanner userInput = new Scanner(System.in);
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int playerThreePosition = 0;
        while (playerOnePosition < 100 && playerTwoPosition < 100 && playerThreePosition < 100) {
            int playerOneRoll = Functions.dieRoller();
            System.out.println("Player One rolled a: " + playerOneRoll);
            System.out.print("Player One, please input the result of your roll.[1-6] ");
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
            /*
                        switch(playerThreeRoll) 
                        {
                            case 1:
                                display "1" side of die
                            case 2:
                                 display "2" side of die
                        and so on.
                        }
             */
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
        }
    }
    /**
     * The four-player version of the game.
     */
    public static void fourPlayerMode() {
        Scanner userInput = new Scanner(System.in);
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int playerThreePosition = 0;
        int playerFourPosition = 0;
        while (playerOnePosition < 100 && playerTwoPosition < 100 && playerThreePosition < 100 && playerFourPosition < 100) {
            int playerOneRoll = Functions.dieRoller();
            System.out.println("Player One rolled a: " + playerOneRoll);
            System.out.print("Player One, please input the result of your roll.[1-6] ");
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
            /*
                        switch(playerThreeRoll) 
                        {
                            case 1:
                                display "1" side of die
                            case 2:
                                 display "2" side of die
                        and so on.
                        }
             */
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
            /*
                        switch(playerFourRoll) 
                        {
                            case 1:
                                display "1" side of die
                            case 2:
                                 display "2" side of die
                        and so on.
                        }
             */
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
    /**
     * Functions as the game's dice.
     * @return The rolled number. Any integer from 1 to 6.
     */
    public static int dieRoller() //method to simulate a roll of a single six sided die.
    {
        Random d6 = new Random();
        int d6Roll = d6.nextInt(6) + 1; //hackish way to ensure a player never rolls a 0 or anything above 6.
        return d6Roll;
    }
    /**
     * The "movers" class. "Movers" are a catch-all for a chute or a ladder.
     * Takes an inputted square and outputs where that square leads.
     * If that square is a mover, the output will be different, but if not, the output will be the same.
     * It is worth noting; the movers on this game board are that of a traditional board of chutes and ladders.
     * @param startPos The initial position to be checked if it is a mover.
     * @return The position after movers have been applied
     */
       public static int testForMover(int startPos) {
      int endPos;
      switch (startPos) {
         case 1:
            endPos = 38;
            break;
         case 4:
            endPos = 15;
            break;
         case 9:
            endPos = 31;
            break;
         case 16:
            endPos = 6;
            break;
         case 21:
            endPos = 42;
            break;
         case 28:
            endPos = 84;
            break;
         case 36:
            endPos = 44;
            break;
         case 47:
            endPos = 26;
            break;
         case 49:
            endPos = 11;
            break;
         case 51:
            endPos = 67;
            break;
         case 56:
            endPos = 53;
            break;
         case 62:
            endPos = 19;
            break;
         case 64:
            endPos = 60;
            break;
         case 71:
            endPos = 91;
            break;
         case 80:
            endPos = 100;
            break;
         case 87:
            endPos = 24;
            break;
         case 93:
            endPos = 73;
            break;
         case 95:
            endPos = 75;
            break;
         case 98:
            endPos = 78;
            break;
         default:
             endPos = startPos;
            break;
      }
      return endPos;
   }
}
