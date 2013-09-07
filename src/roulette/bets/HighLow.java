package roulette.bets;

import roulette.Wheel;


/**
 * Represents a players attempt to bet on either a high or low outcome.
 * 
 * @author Robert C. Duvall
 */
public class HighLow extends OneOfMany
{
    private static final String[] POSSIBLE_CHOICES = 
        {
            "low",
            "high"
        };


    public HighLow ()
    {
        super("High or Low", POSSIBLE_CHOICES);
    }


    @Override
    public boolean isMade (Wheel wheel)
    {
        int number = wheel.getNumber();
        return ( 1 <= number && number <= 18 && getChoice().equals(POSSIBLE_CHOICES[0])) ||
  	           (19 <= number && number <= 36 && getChoice().equals(POSSIBLE_CHOICES[1]));
    }
}
