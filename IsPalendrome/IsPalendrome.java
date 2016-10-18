/**
*palendromes code
*@author Joseph Beatty
*@version 1
*this code has four palendrome methods each with different ways of doing the proper function and also has a has digit method
*/



public class IsPalendrome
{



	/**
	*This is the main method that just prints all of the functions with different parameters
	*@param String args
	*@return none
	*
	*/
	public static void main(String[] args)
	{
	
		System.out.println(hasDigit("a1c"));
		System.out.println(hasDigit("abc"));
		
		System.out.println("-----------------------");
	
		System.out.println(isPalendromeIterative("anna"));
		System.out.println(isPalendromeIterative("racecar"));
		System.out.println(isPalendromeIterative("a"));
		System.out.println(isPalendromeIterative("acna"));
		
		
		System.out.println("-----------------------");
		System.out.println(isPalendromeIterativeTwo("acna"));
		System.out.println(isPalendromeIterativeTwo("anna"));
		System.out.println(isPalendromeIterativeTwo("a"));
		
		System.out.println("-----------------------");
		
		System.out.println(isPalendromeRecursive("anna"));
		System.out.println(isPalendromeRecursive("acna"));
		System.out.println(isPalendromeRecursive("a"));
		System.out.println(isPalendromeRecursive("racecar"));
		
		System.out.println("-----------------------");
		
		
		
		System.out.println(isPalendromeRecursiveTwo("anna"));
		System.out.println(isPalendromeRecursiveTwo("acna"));
		System.out.println(isPalendromeRecursiveTwo("ana"));
		System.out.println(isPalendromeRecursiveTwo("racecar"));
		System.out.println(isPalendromeRecursiveTwo("stuff"));
		System.out.println(isPalendromeRecursiveTwo("a"));
	}



	/**
	*This is the has digit method which finds out if a string has a digit inside of it by using charAt
	*@param string
	*@return true or false depending on weather the string has a digit or not
	*/
	public static boolean hasDigit(String s)
	{
	
		for(int i = 0; i < s.length(); i++)
		{
		
			int x= (int) s.charAt(i);
			if(x>48 && x<57)
			{
			
				return true;
			
			}
		
		
		
		}
	
		return false;
	
	
	
	
	
	
	}




	/**
	*This is the palendrome method that is iterative and uses charAt to find out if a string (s) is a palendrome
	*@param string s
	*@return true or false depending on if the string is a palendrome or not
	*
	*/
	public static boolean isPalendromeIterative(String s)
	{
	
	
		for(int i =0; i < s.length()/2; i++)
		{
		
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			
			
			}
		
		
		}
		
		return true;
	
	
	}




	/**
	*This is the palendrome method that is recursive and uses charAt to find out if a string (s) is a palendrome
	*@param string s
	*@return true or false depending on if the string is a palendrome or not
	*
	*/
	public static boolean isPalendromeRecursive(String s)
	{
	
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		if(s.length()<=1)
			return true;
		if(s.length()==2)
			return isPalendromeRecursive(s.substring(1));
		return isPalendromeRecursive(s.substring(1, s.length()-1));
	
	
	
	}
	
	
	
	/**
	*This is the palendrome method that is iterative but doesn't use CharAt to find out if a string (s) is a palendrome
	*@param string s
	*@return true or false depending on if the string is a palendrome or not
	*
	*/
	public static boolean isPalendromeIterativeTwo(String s)
	{
	
	
		for(int i =0; i < s.length()/2; i++)
		{
		
			if(!s.substring(i, i+1).equals(s.substring(s.length()-1-i, s.length()-i)))
			{
				return false;
			
			
			}
		
		
		}
		
		return true;
	
	
	}
	
	
	/**
	*This is the palendrome method that is recursive meaning it runs the same method numerous times instead of a loop and doesn't use charAt to find out if a string (s) is a palendrome. Instead it uses substrings to get one character alone
	*@param string s
	*@return true or false depending on if the string is a palendrome or not
	*
	*/
	public static boolean isPalendromeRecursiveTwo(String s)
	{
	
		if(!s.substring(0, 1).equals(s.substring(s.length()-1, s.length())))
			return false;
		if(s.length()<=1)
			return true;
		if(s.length()==2)
			return isPalendromeRecursive(s.substring(1));
		return isPalendromeRecursive(s.substring(1, s.length()-1));
	
	
	
	}
	
	
	
	
}



	