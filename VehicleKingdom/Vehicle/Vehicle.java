

/**
 * Class Vehicle creates object Vehicle with fields int wheels and String color. It holds accessors, modifiers,
 * a toString method, a getCost method, an equals method.
 * 
 * @author (Joseph Beatty, Nathan Hefner, Jack Gambello, Ethan Malzberg) 
 * @version (1.0)
 */
public class Vehicle
{
   // instance variables - replace the example below with your own
    private int wheels;
    private String color;

    /**
     * Constructor for objects of class Vehicle that calls the other Vehicle constructor
     */
    public Vehicle()
    {
        // initialize instance variables
        this(4,"red");
    }
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(int w,String s)
    {
        wheels = w;
        color = s;
    }
    
    //accessors
    /**
     * Accessor that returns the color of the Vehicle object
     * @return String color
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * Accessor that returns the number of wheels on the vehicle object
     * @return int Wheels
     */
    public int getWheels()
    {
        return wheels;
    }
    //Modifiers
    /**
     * Modifier that will change the color to the input color
     * @param String s
     */
    
    public void setColor(String s)
    {
        color = s;
    }
    
    /**
     * Modifier that sets the number of wheels
     * @param int w
     */
    public void setWheels(int w)
    {
        wheels = w;
    }
    
    /**
     * Modifier that sets both the number of wheels and the color
     * @param int w
     * @param String s
     */
    public void setDescription(int w, String s)
    {
        wheels = w;
        color = s;
    }
    
    /**
     * Method that takes in an object of type Vehicle and returns if the instance is equal to the parameter
     * using the fields
     * @param Vehicle v
     * @return True of False
     */
    public boolean equals(Vehicle v)
    {
        return ((this.wheels==v.wheels)&&(this.color==v.color));
    }
    
    /**
     * toString method that will print the number of wheels and the color
     * @return String that says the number of wheels and the color
     */
    public String toString()
    {
        return "The vehicle is " + color + ". The vehicle has " + wheels + " wheels.";
    }
    
    /**
     * Method that returns a string of how much that vehicle will cost
     * @return String
     */
    public String costRange()
    {
        return "The vehicle cost will range from $20 to $4.5 million.";
    }
   
}


