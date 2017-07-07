
/**********
 *
 * A_JavaConditionalAndLoops.java
 * 
 ***********/


package b_ConditionalAndLoops;

public class A_JavaConditionalAndLoops {
	//Attributes
	private int age = 27;
	
	
	
//	constructor
	public A_JavaConditionalAndLoops() {
		System.out.println("~~~ Java Conditional And Loops ~~~");
		
	}
	
	
	
	//if
	public void JavaConditionalIf(int age)
	{
		if (age == 30)
			System.out.println("#1 age == 30");
	}


	
	//if..else
	public void JavaConditionalIfElse(int age)
	{
		if (age < 30)
			System.out.println("#2 smaller then 30");
		else
			System.out.println("#2not smaller then 30");
	}

	

	//if..if else..else
	public void JavaConditionalIfIfElse(int age)
	{
		if (age < 10)
			System.out.println("#3 smaller then 10");
		else if (age < 20)
			System.out.println("#3 smaller then 20");
		else if (age < 30)
			System.out.println("#3 smaller then 30");
		else
			System.out.println("#3 bigger then 30");
	}

	
	//Netted if() { if(){} else{} }else
	public void JavaConditionalNestedIf(int age)
	{
		if (age > 30)
		{
			if (age >= 30)
			{
				if (age == 30)
				{
					System.out.println("#3 equal to 30");
				}
				else
				{
					System.out.println("#3 not equal to 30");
				}
			}
			else
			{
				System.out.println("#3 smaller then to 30 - level 2");
			}			
		}
		else
		{
			System.out.println("#3 smaller then 30 - level 1");
		}
		
	}

	
	
	/**********
	 * 
	 * logical operators / statements ( !  &  &&  |  ||  ^ )  
	 * 
	 *  !    Converts the boolean value to its right to its opposite form ie. true to false
	 *  &    Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
	 *  &&   Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
	 *  |    Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
	 *  ||   Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
	 *  ^    Returns true if there is 1 true and 1 false boolean value on the right or left
	 *  
	 ***********/
	public void JavaConditionalLogicalStatements(int age) {
		
		System.out.println("\nYour age is: " + age);
		
		
		if (age > 0 && age < 2)
			System.out.println("#4 toddler");
		
		else if (age > 2 && age < 13)
			System.out.println("#4 child");
			

		else if (age > 13 && age < 18)
			System.out.println("#4 teen");

			
		else if (age > 18 && age < 120)
				System.out.println("#4 adult");

		else if(age < 0 || age >= 121)
				System.out.println("#4 age is not rational, please check age");
		
		if (!(age>18 && age < 120) )
			System.out.println("#4 your too young or too old for this job.");
	}
	
	
	
	// switch .. case
	public void JavaConditionalSwitchcase(int age) {
	
		System.out.println("\nYour age is: " + age);
		
		switch (age)
		{
			case 1: 
			case 2:
				System.out.println("#5 toddler");
				break;
				
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("#5 child");
				break;
				
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
				System.out.println("#5 teen");
				break;
				
			default:	
				System.out.println("#5 adult");
		}
		
		
		
		//colors with switch..case
		String colors = "blue";
		
		switch(colors) {
		case "red":
			System.out.println("#6 color red");
			break;
		case "blue":
			System.out.println("#6 color blue");
			break;
		default: 
			System.out.println("#6 nice color :-) ");
		}
		
	}
	
	
	
	// while..loops
	public void JavaConditionalwhileloops(int count) {
		
		System.out.print("#7 count ==> " + count);
		
		while (count < 100)
		{		
			count = count + 10;
			System.out.print(" ," + count);
		}
		
	}
	
	
	
	// do .. while..loops
	public void JavaConditionalDoWhileloops(int count) {
		
		System.out.println("\n#8 count ==> " + count);
		
		do 
		{
			if (count >= 100)
			{
				System.out.println("-!!- do.. while loop - loop will be executed once only, because of the condition is not valid");				
			}		
			
			count = count + 10;
			System.out.print(" " + count);			
		}
		while (count < 100);
		
	}
	
	
	
	// for..loops
	public void JavaConditionalForloops(int count) {
		
		int x=0 ,y=0 ,i=0;
		
		
		
		System.out.println("\n#9 count ==> " + count);
		
		
		
		for (i=0; i <= count; i=i+3)
		{		
			System.out.print(" ," + i);
		}

		
		//***
		System.out.println("\n#10 for()");
		for (x=0, y=0; x<= 10 ; x++, ++y) {
			System.out.println("x == " + x + " y == " + y);
		}
		

		
		System.out.println("\n#11 for() - 100 board table");
		int breakpoint = 10;
		int index = 0;
		
		for (x=1; x<=100; x++)
		{
			if (breakpoint == index) {
				System.out.println("");
				index = 0;
			}
			
			if (x > 0 && x < 10) 
				System.out.print("   " + x); // 3x space/s

				
			if (x >= 10)
				System.out.print("  " + x); // 2x space/s
		
			index++;
		}
		System.out.println("\n");

		
		
		System.out.println("\n#12 for() - Multiplication table");
		for (x=1; x<=10; x++)
		{
			System.out.println(" ");
			for (y=x; y<=x*10; y=y+x)
			{
				if (y > 0 && y < 10) 
					System.out.print("   " + y); // 3x space/s

				
				if (y >= 10)
					System.out.print("  " + y); // 2x space/s
			}
		}		
		System.out.println("\n");
		
	} //JavaConditionalForloops
	
	
	
	public void JavaConditionalBreakContinue(int count) {
		
		int i = 0;
		
		System.out.println("continue; count === " + count);
		
		
		while (i <= count) {
			
			if (i == 4)
			{
				i++;
				continue;
			}
			
			System.out.print(" " + i + " ");
			i++;
		}
		
		System.out.println("\n\n break; and continue \n");
		for (i=0; i<count; i++)
		{
			if (i == 3 || i == 6)
			{
				System.out.println("continue in " + i);
				continue;
			}
			
			if (i == 11)
			{
				System.out.println("break on " + i);
				break;
			}	
			System.out.print(" " + i + " ");
		}
		
		System.out.println(" i === " +  i + " count === " + count);
	}
	
	//main method
	public static void main(String[] args) {
		
		//variable
		int age = 30;
		
		A_JavaConditionalAndLoops ajcal = new A_JavaConditionalAndLoops();
		
		//JavaConditionalIf
		ajcal.JavaConditionalIf(age);
		
		//JavaConditionalIfElse
		ajcal.JavaConditionalIfElse(age);
		
		//JavaConditionalIfIfElse
		ajcal.JavaConditionalIfIfElse(age);
		
		//JavaConditionalNestedIf
		ajcal.JavaConditionalNestedIf(age);
		
		//JavaConditionalLogicalStatements
		ajcal.JavaConditionalLogicalStatements(177);
		
		//JavaConditionalSwitchcase
		ajcal.JavaConditionalSwitchcase(age);
		
		//JavaConditionalwhileloops
		ajcal.JavaConditionalwhileloops(0);
		
		//JavaConditionalDoWhileloops
		ajcal.JavaConditionalDoWhileloops(100);
		
		ajcal.JavaConditionalForloops(50);
	
		//JavaConditionalBreakContinue - continue; break;
		ajcal.JavaConditionalBreakContinue(12);
		
	}

}
