import java.util.ArrayList;

/**
 * This class concerns the player character and the different functions it needs to
 * interact with the map.
 *
 * @author Stephen M. Burns
 * @version 3/31/2025
 */

public class Player
{
    private int healthPool;
    private ArrayList<String> inventory;
    private int weightLimit=3;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        weightLimit=3;
        healthPool=100;
        inventory = new ArrayList<String>();
    }
    
    /**
     * 
     */
    public int getHealth()
    {
        return healthPool;
    }
    
    /**
     * 
     */
    public void setHealth(int healthMod)
    {
        if(healthMod<=0)
        {
            healthPool-=healthMod;
        }
        else
        {
            healthPool+=healthMod;
        }
    }
    
    
    /**
     * 
     */
    public ArrayList<String> getInventory()
    {
        return inventory;
    }
    
    /**
     * 
     */
    public void setInventory()
    {
        
    }
    
    /**
     * 
     */
    public int getWeightLimit()
    {
        return weightLimit;
    }
    
    /**
     * 
     */
    public void setWeightlimit(int weightMod)
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod(int y)
    {
        // put your code here
        
    }
}
