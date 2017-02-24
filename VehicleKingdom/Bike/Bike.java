


 /**
 * This class creates object Bike which has an is-a relationship with Vehicle. It has one default constructor
 * and one costRange Method.
 * 
 * @author (Joseph Beatty, Nathan Hefner, Jack Gambello, Ethan Malzberg) 
 * @version (1.0)
 */
public class Bike extends Vehicle
{
    
    /**
     * Default constructor that calls classVehicle and has parameters 2 and "red"
     * 
     */
    public Bike()
    {
        super(2,"red");
    }
    
    /**
     * Method that returns a string of the cost of this object
     * @return String
     */
    public String costRange()
    {
        return "The bike cost will range from $20 to $2,000";
    }
}
