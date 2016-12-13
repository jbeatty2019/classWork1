import java.util.ArrayList;
/**
*This code tests out ArrayLists and has two methods that either remove all of the numbers 
*x in the ArrayList, or replaces e with x in an ArrayList of strings.
*@version 1
*@author Joseph Beatty
*/
public class ArrayListEx
{

	/**
	*This is the main method that calls all of the other methods
	*@param String[] args
	*@return none
	*/
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		System.out.println(a.size());
		System.out.println(a);
		
		
		
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a);
		i = 6;
		a.add(0,-3);
		System.out.println(a);
		a.set(a.size()-1, 6);
		System.out.println(a);
		
		
		
		System.out.println("----------------------------");
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(2);
		b.add(0);
		
		remove(b, 3);
		System.out.println(b);
		System.out.println("----------------------------");
		ArrayList<String> c = new ArrayList<String>();
		c.add("eye");
		c.add("abc");
		c.add("hello");
		change(c);
		System.out.println(c);
	}


	/**
	*This code takes out any integer in an arrayList that is the same as int n.
	*@param ArrayList
	*@param int n
	*/
	public static void remove(ArrayList<Integer> a, int n)
	{
		int index = 0;
		while(index< a.size())
		{
			int b = a.get(index);
			if(b == n)
				a.remove(index);
			else
				index++;
		}
	
	
	}
	
	/**
	*This method takes in an array and changes every e into an x.
	*@param ArrayList a
	*/
	public static void change(ArrayList<String> a)
	{
		int index = 0;
		while(index< a.size())
		{
			int index2 = 0;
			String x = a.get(index);
			String y = "";
			while(index2< x.length())
			{
				if(x.substring(index2, index2+1).equals("e"))
					y+= "x";
				else
					y+= x.substring(index2, index2+1);
				index2++;
			}
			
			a.set(index, y);
			index++;
		}
	
	}




	


}