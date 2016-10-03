/**
*@author Joseph Beatty
*@Version 1
*This program makes a staircase of stars out of a nested loops. One staricase goes from
*Low to high and the other goes high to low
*/
public class StairCase
{

	/**
	*This main method calls the other two methods plugging in their arguments with 5
	*Between the two methods it prints a line to separate the two
	*@ param args
	*/
	public static void main(String[] args)
	{
	HighLow(5);
	System.out.println("-----------");
	
	LowHigh(5);
	
	}
	/**
	*This method creates a staircase high to low of stars.
	*It takes in an integer and uses a nested loop to produce the staircase.
	*the first loop of this is the row and the nested loop is the column
	*@param integer n is the number of rows and columns
	*/
	public static void HighLow(int n)
	{
	
		int i=1;
		while(i<=n)
		{
			
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			
			}
			
			System.out.println("");
			i++;
			
		
		
		}
	
	
	
	
	}
	
	/**
	*This method goes from low to to high meaning the top row has 5
	*stars and then it goes down to 1. It is also a nested loop but with
	*the numbers going down from n to 1 rather then from 1 to n.
	*@param integer n is the number of rows and columns
	*
	*/
	public static void LowHigh(int n)
	{
		
		int i=n;
		while(i>=1)
		{
			
			int j=1;
			while(j<=i)
			{
				
			System.out.print("*");
			j++;
			
			
			}
			System.out.println("");
			i=i-1;
		
		
		
		}
	
	
	
	
	
	
	}





}