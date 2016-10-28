/**
*String methods
*@author Joseph Beatty
*@version 1
*
*/



public class StringMethods
{


	/**
	* This is the main method that calls all other methods
	*@param String[] args
	*@return none
	*
	*/
	public static void main(String[] args)
	{
	
	System.out.println(findString("racecar", "car", 0));
	System.out.println(findString("abcabcdabc", "abc", 2));
	System.out.println(findString("abcd", "ef", 1));
	System.out.println("---------------------");
	
	System.out.println(countStrings("racecar", "c"));
	System.out.println(countStrings("HeHeHoHe", "He"));
	System.out.println(countStrings("HeHeHoHe", "Ho"));
	System.out.println(countStrings("Hey", "Ho"));
	
	System.out.println("---------------------");
	
	
	underlineStrings("Hey _ Hello_");
	underlineStrings("_Hello Whats u_p co_ol");
	underlineStrings("Hey  Hello");
	
	}
	
	
	
	/**
	 * Finds the first instance of s in line,
	 * starting at the position start
	 * @param o the orignal string 
	 * @param s the string to find 
	 * @param start the position to start searching.
	 * Guaranteed to be in the string line. (precondition)
	 * @return the index of the first single instance of
 	 * s if the string is found OR -1 if it is not found.
	*/
	public static int findString(String o, String s, int start)
	{
	 
		
		o= o.substring(start);
		if(o.indexOf(s)>-1)
			return o.indexOf(s) + start;
		return -1;
	
	
	
	
	}
	
	/**
	 * Count the number of times instances of s appear in
	 * the line.
	 * @param o the original string
	 * @param s the string to find.
	 * @return the number of times the string appears in the line
	 */
	public static int countStrings(String o, String s)
	{
		int count = 0;
		int i = findString(o, s, 0);
		while(i!=-1)
		{
			o = o.substring(0, i) + o.substring(i+s.length());
			i = findString(o, s, 0);
			count +=1;
		}
		return count;
	
	}
	/**
	 * Replace all instances of underscores in the line given by
 	 * line with italics tags.  There must be an even number of underscores
 	 * in the line, and they will be replaced by <I>, </I>, alternating.
	 * @param line a string with 0 or more underscores
	 * @return the line that has underscores replaced with <I> </I> tags or 
	 * the original line if there are not an even number of underscores.
	 */
	public static void underlineStrings(String Line)
	{
	
		String u = "_";
		int count = 0;
		String[] arr = new String[Line.length()];
		int index = 0;
		while(index<Line.length())
			{
				arr[index] = Line.substring(index, index+1);
				index+=1;
				
				
			}
		for(int i=0; i<Line.length(); i++)
		{
			
			if(Line.substring(i, i+1).equals(u))
			{	
				
				if(count%2==0)
					arr[i] = "<I>";
				
				
				else
				
					arr[i] = "</I>";
					
				count+=1;
				
			}
			
		
		
		
		}
		
	String convert = "";
	for(int x = 0; x<Line.length(); x++)
		convert+= arr[x];
		
	System.out.println(convert);
	
	
	
	}
	





}