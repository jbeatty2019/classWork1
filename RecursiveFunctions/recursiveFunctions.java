/**
*Recursive functions prints 0 - n with int n as the parameter
*@author Joseph Beatty
*@version 1
*
*/


public class RecursiveFunctions
{


	/**
	*This is the main method that calls the printNum() method with 5 being the parameter
	*@param String[] args
	*@return none
	*
	*/
	public static void main(String[] args)
	{
	
		printNum(5);
	
	}

	/**
	*This is the method where it takes int n as a parameter and then uses recursion to print 0-n with one number on each line.
	*The code will start at n and then if it is 0 or greater it uses recursion to do the same method but n goes down by 1. After it goes
	*down below 0 and then it will just return nothing. Next the code will go back up by printing 0 then 1 and so on until n.
	*@param int n is the integer that goes 0-n
	*@return none
	*/
	public static void printNum(int n)
	{
		if(n<0)
			return;
		
		else
			printNum(n-1);
			System.out.println(n);
	
	}


}