
/**********
 *
 * D_javaBasicUserInput.java
 * 
 *********/

package a_BasicEexample;

/*********
 * Scanner - a method to deal with user input.
 * 1. import Scanner class
 *********/
import java.util.Scanner;

public class D_javaBasicUserInput {



	public static void main(String[] args) {

		int age = 0;
		
		System.out.println("pleae, enter your age:");
		
		//2. using "Scanner" class by creating instance of the class 
		Scanner userInput = new Scanner(System.in);
		
		
		//
		// check the value of the user input
		if (userInput.hasNextInt() == true) {			
		/***
		 * hasNextByte()
		 * hasNextShort()
		 * hasNextInt()
		 * hasNextLong()
		 * hasNextFloat()
		 * hasNextDouble()
		 * hasNextBoolean()
		 * hasNextLine()
		 * hasNext
		 */
			
		    // get the user integer input
			age = userInput.nextInt();		
			/**********
			 * 
			 * NextByte()
			 * NextShort()
			 * nextInt()
			 * nextLong()
			 * nextFloat()
			 * nextDouble()
			 * nextBoolean()
			 * nextLine()
			 * next()
			 **********/
			
			//print result
			System.out.println("You'r age is: " + age);
		}
		else
			System.out.println("prease enter age next time");
		
		
		//test zone
		String contYorN = "Y";
		int h = 1;
		
		// equalsIgnoreCase checks if the input string is equal to y or Y
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("Continue y or n?");
			contYorN = userInput.nextLine(); // Accepts a string input from the user
			h++;
		}
		

	}

}
