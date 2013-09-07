package roulette.bets;

import roulette.Wheel;
import util.ConsoleReader;


/**
 * Represents a players attempt to bet on a range of values.
 * 
 * @author Robert C. Duvall
 */
public class Consecutive extends Bet
{
    private static final int BASE_ODDS = 36;
    private static final String[] DIGIT_AS_WORD = 
        {
            "Zero",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine"
        };

    private int myStart;
    private int myRange;


    public Consecutive (int range)
    {
        super(numToWord(range) + " in a row", BASE_ODDS / range - 1);
        myRange = range;
        myStart = 1;
    }


    @Override
    public boolean isMade (Wheel wheel)
    {
        int number = wheel.getNumber();
        return (myStart <= number && number < myStart + myRange);
    }


    @Override
    public void place ()
    {
        myStart = ConsoleReader.promptRange("Enter first number of range",
                                            1, 37 - myRange);
    }


    // overkill, perhaps?
    private static String numToWord (int number)
    {
        return DIGIT_AS_WORD[number] + " number" + ((number == 1) ?  "" : "s");
    }
}
