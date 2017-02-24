
/**
 * Write a description of class Aircrafts here.
 * 
 * @author (Joseph Beatty, Nathan Hefner, Jack Gambello, Ethan Malzberg) 
 * @version (1.0)
 */
public class Truck extends Vehicle
{
   private int doors;
   
   /**
    * default constructor thta calls the super class to create an object with the two vehicle fields and the doors fields
    */
    public Truck()
   {
       super(12, "black");
       doors = 2;
   }
   
   /**
    * Constructor that takes in parameters of the number of wheels,
    * the color, and the number of doors. This method calls the super class Vehicle
    * @param int w
    * @param String s
    * @param int d
    */
   public Truck(int w, String s, int d)
   {
       super(w,s);
       doors = d;
   }
   
   /**
    * Accessor that returns the field doors
    * @return int doors
    */
   public int getDoors()
   {
       return doors;
   }
   
   
   /**
    * Modifier that sets the number of doors to the parameter
    * @param int d
    */
   public void setDoors(int d)
   {
       doors = d;
   }
   
   /**
    * Modifier that sets all fields in the object by overriding the Vehicle setDescription and taking in three
    * parameters to change
    * @param int w
    * @param String s
    * @param int d
    */
   public void setDescription(int w, String s, int d)
   {
       super.setDescription(w,s);
       doors = d;
   }
   
   /**
    * Method that checks if the instance is equal to the parameter by checking all of the fields and overriding
    * the vehicle class equals
    * @param Truck t
    * @return True or False
    */
   public boolean equals(Truck t)
   {
       return this.doors==t.doors;
   }
   
   
   /**
    * toString method that will return a string of all fields using the superclasses getWheels() and getColor()
    * @return String
    */
   public String toString()
   {
       return "The truck is " + getColor() + ". The truck has " + getWheels() + " wheels." + "The truck has" + doors + " doors."; 
   }
   
   /**
    * Method that returns a string of how much the vehicle will cost
    * @return String
    */
   public String costRange()
   {
       return "The truck cost will range from $9,000 to $150,000";
   }
}
