package chutesandladdersgame;

import java.util.Random;

/**
 * The chutes and ladders project main methods class. Includes functions for
 * each number of players, the function for finding chutes and ladders, and the
 * die roller method.
 *
 * @author DJ, Austin, Zach, Denasha
 */
public class Functions {


    /**
     * Functions as the game's dice.
     *
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
     * Takes an inputted square and outputs where that square leads. If that
     * square is a mover, the output will be different, but if not, the output
     * will be the same. It is worth noting; the movers on this game board are
     * that of a traditional board of chutes and ladders.
     *
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
