package roulette.bets;

import roulette.Wheel;


/**
 * Represents a players attempt to bet on either an odd or even outcome.
 * 
 * @author Robert C. Duvall
 */
public class OddEven extends OneOfMany
{
    private static final String[] POSSIBLE_CHOICES = 
        {
            "even",
            "odd"
        };


    public OddEven ()
    {
        super("Odd or Even", POSSIBLE_CHOICES);
    }


    @Override
    public boolean isMade (Wheel wheel)
    {
        int number = wheel.getNumber();
        return (!wheel.getColor().equals(Wheel.GREEN) && 
                (number % 2 == 0 && getChoice().equals(POSSIBLE_CHOICES[0])) ||
		        (number % 2 == 1 && getChoice().equals(POSSIBLE_CHOICES[1])));
    }
}
