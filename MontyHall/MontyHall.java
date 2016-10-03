import java.util.Scanner;
/**
*Monty Hall Game
*@author Joseph Beatty
*@version 1
*This program creates the monty hall game
*/


public class MontyHall
{

	/**
	*This is the main method that calls the other methods.
	*It calls the welcome method which is the introduction and then the game function
	*then it calls the game function which runs the actual game
	*@param args
	*/
	public static void main(String[] args)
	{
	welcome();
	game();
	
	
	}
	/**
	*This method runs the introduction by printing the instructions as well as the name of the game
	*@param none
	*
	*/
	public static void welcome()
	{
		System.out.println("Monty Hall game");
		System.out.println("Pick a door number first.");
		System.out.print("after a door has been opened ");
		System.out.println("You have a chance to switch");
		// print out 3 doors
		
	
	
	
	}
	/**
	*This is the game method which actually runs the game
	*It starts by picking a random number from 1-3 to be the car door. Then it asks the user to choose a door 1-3. 
	*Next it says your pick and then says one of the doors that has a goat in it that was not your pick nor the one with the 
	*car in it. this door is found by callling the doorToReveal method. Then the user has the chance to switch and if he/she
	*switches then the user pick is now the switched pick. If this pick is the car number then it will print "You win" but if not 
	*it will say that you loose
	*@param none
	*/
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int) (Math.random() * 3 + 1);
		
		//testing
	
		System.out.print("Please choose  a door (1, 2 or 3):");
		int user_pick = keyboard.nextInt();
		// get rid of the newline from the buffer
		keyboard.nextLine();
		
		//testing
		System.out.println("You chose door #:" + user_pick);
		
		int reveal = doorToReveal(car, user_pick);
		
		
		System.out.print("door " + reveal + " has a goat in it, would you like to switch your door:");
		
		String user_switch= keyboard.nextLine();
		
		if(user_switch.equals( "yes") || user_switch.equals("Yes"))
		{
			
			user_pick= doorToReveal(reveal, user_pick);
		
		}
		
		if(car==user_pick)
			System.out.println("You win!!");
		else
			System.out.println("Sorry! You lose!!!");
	
	}
	
	
	
	/**
	*this method finds the door that is neither the car or the users choices.
	*It picks a random number and if it isn't either the car number or user number then it gets returned
	*but if it is one of them then the number gets randomly picked again
	*@param u is the user choice number
	*@param c is the car number
	*@return goat door
	*/
	public static int doorToReveal(int c, int u)
	{
		int i = (int) (Math.random()*3 + 1);
		while(i ==c || i==u)
		{
			i = (int)(Math.random()*3 + 1);
		
		
		}
		
		return i;
	
	
	}
	
	
	





}