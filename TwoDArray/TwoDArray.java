public class TwoDArray
{

	public static void main(String[] args)
	{
	
		int[][] x = doubleArr(3);
		printArray(x);
		printFancyArray(x);
	}
	
	public static int[][] doubleArr(int x)
	{
	
		int[][] doubled = new int[x][x];
		int index = 0;
		int index3 = 1;
		while(index<x)
		{
			int index2 = 0;
			while(index2<x)
			{
				doubled[index][index2] = index3;
				index3++;
				index2++;
			
			}
			index++;
			
		
		}
	
		return doubled;
	}



	public static void printArray(int[][] a)
	{
		int len = a[a.length - 1][a.length - 1];
		
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void printFancyArray(int[][] a)
	{
		String line = "";
		String x = String.valueOf(a[a.length - 1][a.length - 1]);
		for(int i = 0; i< x.length() * a.length; i++)
			line+= "--";
		System.out.println(line);
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.print("|");
				String y = String.valueOf( a[i][j]);
				String z = String.valueOf(a[a.length - 1][a.length - 1]);
				int index = z.length()-y.length();
				int index2 = 0;
				while(index>0)
				{
					System.out.print(" ");
					index--;
					index2++;
				}
				
				System.out.print(a[i][j]);
					
			}
			System.out.println("|");
			System.out.println(line);
		
		}
			
	
	}
	
	
	
	
	



}