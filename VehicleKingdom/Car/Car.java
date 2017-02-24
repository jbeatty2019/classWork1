
/**
 * This Class creates object car which is an instance of Vehicle. It has two constructors, accessors, modifiers, 
 * a toString Method, a costRange method and an isEqual method.
 * 
 * @author (Joseph Beatty, Nathan Hefner, Jack Gambello, Ethan Malzberg) 
 * @version (1.0)
 */

public class Car extends Vehicle
{
   private int doors;
   
   /**
    * Constructor to create object car that calls Vehicle contructor
   
    */
    public Car()
   {
       super(4, "red");
       doors = 4;
   }
   
   
   /**
    * Constructor to create object car that takes in the parameters and calls Vehicle constructor
    * @param int w
    * @param String s
    * @param int d
    */
 
   public Car(int w, String s, int d)
   {
       super(w,s);
       doors = d;
   }
   
   /**
    * Accessor that return the number of doors in the car
    * @return doors
    */
   public int getDoors()
   {
       return doors;
   }
   
   /**
    * Modifier that sets the number of doors
    * @param int d
    */
   public void setDoors(int d)
   {
       doors = d;
   }
   
   /**
    * Modifier that changes the description of the car overloading the first setDescription in class Vehicle
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
    * Method that checks if the insance and the parameter have equal fields using Vehicle equals
    * @param Car c
    * @return True or False
    */
   public boolean equals(Car c)
   {
       return super.equals(c) && this.doors==c.doors;
   }
   
   /**
    * toString Method that will return a String of color wheel amount and door amount
    * @return String
    */
   public String toString()
   {
       return "The car is " + getColor() + ". The car has " + getWheels() + " wheels." + "The car has" + doors + " doors."; 
   }
   
   /**
    * costRange method returns String of the cost of  the car
    * @return String
    */
   public String costRange()
   {
       return "The car cost will range from $15,000 to 4.5 million dollars";
   }
}

