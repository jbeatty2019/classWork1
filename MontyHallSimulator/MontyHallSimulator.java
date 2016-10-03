/**
*Monty Hall simulator
*@author Joseph Beatty
*@version 1
*/

public class MontyHallSimulator
{
	/**
	*this is the main method that takes in the amount of times the game should be run and then runs the game.
	*It then continuously adds 1 or 0 to the number of times switching makes you win for number of times that the user typed.
	*then it finds the percentage of the number of times switching wins and the number of times staying does.
	*@param args the number of times the code should be run
	*
	*
	*/
	public static void main(String[] args)
	
	{
		String input = args[0];
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		for(int i = 0; i< numSim; i++)
			switchWin += game();
		
		double percentSwitchWin = format((double) switchWin/ numSim * 100);
		double percentStayWin = format(100 - percentSwitchWin);
		System.out.println("% switch_win:" + percentSwitchWin);
		System.out.println("% stay_win:" + percentStayWin);
	}

	/**
	*This program randomly selects the car and the user pick and the if they are the same it returns 0 but if they arent it returns 1
	*@param none
	*@return wether the car and the user pick are equal
	*/
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
	
		if(car== userPick)
			return 0;
		else
			return 1;
	}
	/**
	*this method takes in a double and truncates it 2 decimal places
	*@param d the double input to be truncated
	*@return double formatted to 2 decimal places
	*
	*/
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp / 100.0;

		
	
	
	
	
	}




}
		 

