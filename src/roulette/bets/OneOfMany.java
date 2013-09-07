package roulette.bets;

import util.ConsoleReader;


/**
 * Represents a players attempt to bet on either an odd or even outcome.
 * 
 * @author Robert C. Duvall
 */
public abstract class OneOfMany extends Bet
{
    private static final int BASE_ODDS = 1;

    private String[] myPossibles;
    private String myChoice;


    public OneOfMany (String description, String[] possibleChoices)
    {
        super(description, BASE_ODDS);
        myPossibles = possibleChoices;
        myChoice = "";
    }


    @Override
    public void place ()
    {
        myChoice = ConsoleReader.promptOneOf("Please bet", myPossibles);
    }


    protected String getChoice ()
    {
        return myChoice;
    }
}
