/**
 * Created by jsarnelle on 2/12/15.
 */
public class PlayArea
{
    //BEGIN GLOBAL VARIABLES
    private String[][] mBoard = new String[3][3];
    //END GLOBAL VARIABLES

    PlayArea()
    {
        //Set all values to starting position (empty spaces)
        for (int i = 1; i < 3; i++) //Looping through columns
        {
            for (int j = 1; j < 3; j++) //Looping through rows
            {
                mBoard[i][j] = "@string/empty_space";
            }
        }
    }

    public void resetGame() //Resets the current game
    {
        //Set all values to starting position (empty spaces)
        for (int i = 1; i < 3; i++) //Looping through columns
        {
            for (int j = 1; j < 3; j++) //Looping through rows
            {
                mBoard[i][j] = "@string/empty_space";
            }
        }
    }

    public String[][] getGameState() //Retrieves current state of the game
    {
        return mBoard;
    }

    public void humanTurn(int mRow, int mCol) //Sets desired move for human player
    {
        if (mBoard[mRow][mCol].equals("@string/empty_space"))
        {
            mBoard[mRow][mCol] = "@string/human_player";
        }
    }

    public void computerTurn() //Sets the move for the computer player
    {

    }
}
