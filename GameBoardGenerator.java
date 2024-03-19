//Author: Austin

package chutesandladdersgame;


public class GameBoardGenerator 

{
    
    int numberOfLadders = 9; //The default number of ladders in the original game.
    
    int numberOfChutes = 10; //The default number of chutes in the original game.
    
    int gridSize = 100; // The size of the game board i.e. 100 squares.
    
    /**
     * default constructor to generate the game board.
     */
    
    public GameBoardGenerator() 
    {
    
    }
    
    /**
     * Overloaded constructor to generate game board with initial values. 
     * @param numberOfLadders The number of ladders on the board.
     * @param numberOfChutes The number of Chutes on the board.
     * @param gridSize The number of squares on the board. 
     */
    
    public GameBoardGenerator(int numberOfLadders, int numberOfChutes, int gridSize) 
    {
        this.numberOfLadders = numberOfLadders;
        this.numberOfChutes = numberOfChutes;
        this.gridSize = gridSize;
    }
    
    /**
     * setter method to allow for customizing the number of ladders on the board.
     * @param newNumberOfLadders the user specified value for number of ladders on the board.
     */
    
    public void setNumberOfLadders(int newNumberOfLadders) 
    {
        numberOfLadders = newNumberOfLadders;
    }
    
    /**
     * setter method to allow for customizing the number of chutes on the board.
     * @param newNumberOfChutes The user specified value for number of chutes on the board.
     */
    
    public void setNumberOfChutes(int newNumberOfChutes) 
    {
        numberOfChutes = newNumberOfChutes;
    }
    
    /**
     * setter method to allow for customization of board size.
     * @param newGridSize The user defined number of squares in the game board. 
     */
    
    public void setGridSize(int newGridSize) 
    {
        gridSize = newGridSize;
    }
    
    /**
     * getter method to retrieve number of ladders on the game board.
     * @return The number of ladders on the board.
     */
    
    public int getNumberOfLadders() 
    {
        return numberOfLadders;
    }
    
    /**
     * getter method to retrieve number of chutes on the game board.
     * @return The number of chutes on the board.
     */
    
    public int getNumberOfChutes() 
    {
        return numberOfChutes;
    }
    
    /**
     * getter method to retrieve number of squares on the board.
     * @return The number of squares on the board.
     */
    
    public int getGridSize() 
    {
        return gridSize;
    }
//Author: Austin
}
