// Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    private static int numCols = 10;
    //YOUR LINE OF CODE HERE:

    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("My poor attempt at drawing myself");
        // Set a description which will show under the title
        setDescription("I have no art skills");
        // start method
        initialize();
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(1, "Griffinheats", "962019031108", numRows, numCols);
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        // HINT: Remember that getBoardHeight() and getBoardWidth() exist for your use
        // YOUR CODE HERE:

        //increment the row selected by one per loop
        for(int r = 0; r < getBoardWidth(); r++)
        {
            //increment the column selected by one per loop
            for(int c = 0; c < getBoardHeight(); c++)
            {
                //set the selected cell to be colored tan
                setBGColor(r, c, NamedColor.tan);
            }
        }

        // use setBGColor calls for your emoji
        // for example:
        //YOUR CODE HERE:

        //Hair
        //Set the entire top row to be colored brown
        for(int i = 0; i < getBoardWidth(); i++)
        {
            setBGColor(0, i, NamedColor.brown);
        }
        //Set the first four from the out side on each side to be brown
        for(int i = 0; i < 4; i++)
        {
            setBGColor(1, i, NamedColor.brown);
            setBGColor(1, 9-i, NamedColor.brown);
        }
        //Set the first three from the out side on each side to be brown
        for(int i = 0; i < 3; i++)
        {
            setBGColor(2, i, NamedColor.brown);
            setBGColor(2, 9-i, NamedColor.brown);
        }
        //Set the first two from the out side on each side to be brown
        for(int i = 0; i < 2; i++)
        {
            setBGColor(3, i, NamedColor.brown);
            setBGColor(3, 9-i, NamedColor.brown);
        }
        //Set the first one from the out side on each side to be brown
        for(int i = 0; i < 1; i++)
        {
            setBGColor(4, i, NamedColor.brown);
            setBGColor(4, 9-i, NamedColor.brown);
        }

        //Eyes
        //left eye
        setBGColor(4, 2, NamedColor.darkolivegreen);
        setBGColor(5, 2, NamedColor.darkolivegreen);
        setBGColor(4, 3, NamedColor.black);
        setBGColor(5, 3, NamedColor.black);
        //right eye
        setBGColor(4, 7, NamedColor.darkolivegreen);
        setBGColor(5, 7, NamedColor.darkolivegreen);
        setBGColor(4, 6, NamedColor.black);
        setBGColor(5, 6, NamedColor.black);

        //mouth
        //top of mouth
        for(int i = 2; i < getBoardHeight()-2; i++)
        {
            setBGColor(7, i, NamedColor.black);
        }
        //bottom of mouth
        for(int i = 3; i < getBoardHeight()-3; i++)
        {
            setBGColor(8, i, NamedColor.black);
        }
    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end class