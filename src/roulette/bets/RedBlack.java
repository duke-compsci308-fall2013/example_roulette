package roulette.bets;

import roulette.Wheel;


/**
 * Represents a players attempt to bet on either a black or red outcome.
 * 
 * @author Robert C. Duvall
 */
public class RedBlack extends OneOfMany
{
    private static final String[] POSSIBLE_CHOICES = 
        {
            Wheel.BLACK,
            Wheel.RED
        };


    public RedBlack ()
    {
        super("Red or Black", POSSIBLE_CHOICES);
    }


    @Override
    public boolean isMade (Wheel wheel)
    {
        return getChoice().equals(wheel.getColor());
    }
}
