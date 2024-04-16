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
            if (numberOfPlayers == 1) {
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
                        if (playerOnePosition != TestForMover.testForMover(playerOnePosition)) {
                            if (playerOnePosition > TestForMover.testForMover(playerOnePosition)) {
                                System.out.println("Player One landed on a chute! They slid down to square " + TestForMover.testForMover(playerOnePosition) + ".");
                            } else {
                                System.out.println("Player One landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerOnePosition) + ".");
                            }
                            playerOnePosition = TestForMover.testForMover(playerOnePosition);
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
                        if (playerTwoPosition != TestForMover.testForMover(playerTwoPosition)) {
                            if (playerTwoPosition > TestForMover.testForMover(playerTwoPosition)) {
                                System.out.println("Computer landed on a chute! They slid down to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                            } else {
                                System.out.println("Computer landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                            }
                            playerTwoPosition = TestForMover.testForMover(playerTwoRoll);
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
            } else if (numberOfPlayers == 2) {
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
                    if (playerOnePosition != TestForMover.testForMover(playerOnePosition)) {
                        if (playerOnePosition > TestForMover.testForMover(playerOnePosition)) {
                            System.out.println("Player One landed on a chute! They slid down to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        } else {
                            System.out.println("Player One landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        }
                        playerOnePosition = TestForMover.testForMover(playerOnePosition);
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
                    int playerTwoRoll = dieRoller();
                    System.out.println("Player Two rolled a: " + playerTwoRoll);
                    System.out.print("Player Two, please input the result of your roll.[1-6] ");
                    int playerTwoRollResult = userInput.nextInt();
                    if (playerTwoRoll < playerTwoRollResult) {
                        System.out.println("You forfeit your turn for trying to cheat.");
                        playerTwoRoll = 0;
                    }
                    playerTwoPosition += playerTwoRoll;
                    System.out.println("Player Two moved " + playerTwoRoll + " space(s).");
                    if (playerTwoPosition != TestForMover.testForMover(playerTwoPosition)) {
                        if (playerTwoPosition > TestForMover.testForMover(playerTwoPosition)) {
                            System.out.println("Player Two landed on a chute! They slid down to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        } else {
                            System.out.println("Player Two landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        }
                        playerTwoPosition = TestForMover.testForMover(playerTwoRoll);
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
            } else if (numberOfPlayers == 3) {
                int playerOnePosition = 0;
                int playerTwoPosition = 0;
                int playerThreePosition = 0;
                while (playerOnePosition < 100 && playerTwoPosition < 100 && playerThreePosition < 100) {
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
                    if (playerOnePosition != TestForMover.testForMover(playerOnePosition)) {
                        if (playerOnePosition > TestForMover.testForMover(playerOnePosition)) {
                            System.out.println("Player One landed on a chute! They slid down to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        } else {
                            System.out.println("Player One landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        }
                        playerOnePosition = TestForMover.testForMover(playerOnePosition);
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
                    int playerTwoRoll = dieRoller();
                    System.out.println("Player Two rolled a: " + playerTwoRoll);
                    System.out.print("Player Two, please input the result of your roll.[1-6] ");
                    int playerTwoRollResult = userInput.nextInt();
                    if (playerTwoRoll < playerTwoRollResult) {
                        System.out.println("You forfeit your turn for trying to cheat.");
                        playerTwoRoll = 0;
                    }
                    playerTwoPosition += playerTwoRoll;
                    System.out.println("Player Two moved " + playerTwoRoll + " space(s).");
                    if (playerTwoPosition != TestForMover.testForMover(playerTwoPosition)) {
                        if (playerTwoPosition > TestForMover.testForMover(playerTwoPosition)) {
                            System.out.println("Player Two landed on a chute! They slid down to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        } else {
                            System.out.println("Player Two landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        }
                        playerTwoPosition = TestForMover.testForMover(playerTwoRoll);
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
                    int playerThreeRoll = dieRoller();
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
                    if (playerThreePosition != TestForMover.testForMover(playerThreePosition)) {
                        if (playerThreePosition > TestForMover.testForMover(playerThreePosition)) {
                            System.out.println("Player Three landed on a chute! They slid down to square " + TestForMover.testForMover(playerThreePosition) + ".");
                        } else {
                            System.out.println("Player Three landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerThreePosition) + ".");
                        }
                        playerThreePosition = TestForMover.testForMover(playerThreePosition);
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
            } else if (numberOfPlayers == 4) {
                int playerOnePosition = 0;
                int playerTwoPosition = 0;
                int playerThreePosition = 0;
                int playerFourPosition = 0;
                while (playerOnePosition < 100 && playerTwoPosition < 100 && playerThreePosition < 100 && playerFourPosition < 100) {
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
                    if (playerOnePosition != TestForMover.testForMover(playerOnePosition)) {
                        if (playerOnePosition > TestForMover.testForMover(playerOnePosition)) {
                            System.out.println("Player One landed on a chute! They slid down to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        } else {
                            System.out.println("Player One landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerOnePosition) + ".");
                        }
                        playerOnePosition = TestForMover.testForMover(playerOnePosition);
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
                    int playerTwoRoll = dieRoller();
                    System.out.println("Player Two rolled a: " + playerTwoRoll);
                    System.out.print("Player Two, please input the result of your roll.[1-6] ");
                    int playerTwoRollResult = userInput.nextInt();
                    if (playerTwoRoll < playerTwoRollResult) {
                        System.out.println("You forfeit your turn for trying to cheat.");
                        playerTwoRoll = 0;
                    }
                    playerTwoPosition += playerTwoRoll;
                    System.out.println("Player Two moved " + playerTwoRoll + " space(s).");
                    if (playerTwoPosition != TestForMover.testForMover(playerTwoPosition)) {
                        if (playerTwoPosition > TestForMover.testForMover(playerTwoPosition)) {
                            System.out.println("Player Two landed on a chute! They slid down to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        } else {
                            System.out.println("Player Two landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerTwoPosition) + ".");
                        }
                        playerTwoPosition = TestForMover.testForMover(playerTwoRoll);
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
                    int playerThreeRoll = dieRoller();
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
                    if (playerThreePosition != TestForMover.testForMover(playerThreePosition)) {
                        if (playerThreePosition > TestForMover.testForMover(playerThreePosition)) {
                            System.out.println("Player Three landed on a chute! They slid down to square " + TestForMover.testForMover(playerThreePosition) + ".");
                        } else {
                            System.out.println("Player Three landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerThreePosition) + ".");
                        }
                        playerThreePosition = TestForMover.testForMover(playerThreePosition);
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
                    int playerFourRoll = dieRoller();
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
                    if (playerFourPosition != TestForMover.testForMover(playerFourPosition)) {
                        if (playerFourPosition > TestForMover.testForMover(playerFourPosition)) {
                            System.out.println("Player Four landed on a chute! They slid down to square " + TestForMover.testForMover(playerFourPosition) + ".");
                        } else {
                            System.out.println("Player Four landed on a ladder! They climbed up to square " + TestForMover.testForMover(playerFourPosition) + ".");
                        }
                        playerFourPosition = TestForMover.testForMover(playerFourPosition);
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
            } else {
                System.out.println("Please enter a number, not a word.");
            }
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

