import java.util.Scanner;
/**
*Chat bot communication 
*@author Joseph Beatty
*@version 2
*/

public class ChatBot2
{

	/**
	*this method is the base of the chatbot
	*@param args command line argument
	*
	*/
	public static void main(String[] args)
	{
		Scanner cb = new Scanner(System.in);
		System.out.print("Hello, what is your name?:");
		String name= cb.nextLine();
		System.out.println(name + " is a cool name");
		System.out.print("How has your day been so far?:");
		String day= cb.nextLine();
		if(day.equals("good"))
		{
			System.out.println("good for you");
		
		}
		else if(day.equals("bad"))
		{
			System.out.println("Im sorry to hear that");
		}
		System.out.print("Why has your day been " + day + "?:");
		String why = cb.nextLine();
		System.out.println("That is a good answer");
		System.out.print("What is your favorite color?:");
		String color = cb.nextLine();
		System.out.println(color + " is my favorite color too!!");
		System.out.print("what year were you born?:");
		int birthday = cb.nextInt();
		// to get rid of the new line char
		cb.nextLine();
		if(birthday < 1975)
		{
			System.out.println("You are old!!");
		
		}
		else if(birthday > 2006)
		{
			System.out.println("You are young!!");
		}
		else
		{
			System.out.println("You are not old, but not young!!");
		}
		String bye = "hey";
		while(!bye.equals("bye") && !bye.equals("Bye"))
		{
			System.out.print("It has been fun talking to you. Goodbye!!:");
			bye = cb.nextLine();
		}
	}

}