
/**********
 *
 * B_javaBasicVariableMath.java
 * 
 *********/


package a_java_core.a_BasicEexample;


public class B_javaBasicVariableMath {

	
	/**********
	 * 
	 * PreFix PostFix Method
	 * 
	 * prefix - change the variable value and assign the new value to another variable
	 * postfix  - assign the variable old value to another variable and then change the variable value
	 * 
	 **********/
	public void methodPrePostFix(){
		//
		//++increment++
		//--decrement--		
		//
		//prefix
		int a = 2;
		int b = ++a; // a=3, b=3
		System.out.println("prefix >> a = 2, b = ++a ====> a== " + a + " b== " + b);
		//
		//postfix
		int c = 3;
		int d = c--; // d=3 c=2
		System.out.println("postfix >> c = 3, d = c-- ====> c== " + c + " d == " + d);	
	}

	
	
	/**********
	 * 
	 * Java Arithmetic Operators
	 * 
	 * +  addition
	 * -  subtraction 
	 * *  multiplication
	 * /  devision 
	 * %  modulo 
	 * 
	 **********/
	public void JavaArithmeticOperators()
	{
		
		System.out.println("\nJava Arithmetic Operators\n");
		
		System.out.println("6 + 2 = " + (6 + 2));
		System.out.println("6 - 2 = " + (6 - 2));
		System.out.println("6 * 2 = " + (6 * 2));
		System.out.println("6 / 2 = " + (6 / 2));
		System.out.println("6 % 2 = " + (6 % 2));
	}
	
	
	
	/**
	 * 
	 * Java Arithmetic Operators Shorthand
	 * +=   -=   *=   /=   %=   
	 * 
	 */
	public void JavaArithmeticOperatorsShorthand(int number)
	{
		System.out.println("\nJava Arithmetic Operators Short hand\n");
		System.out.println("number = " + number);
		
		// +=
		System.out.println(" number ("+ number +") += 2 ==> " + (number += 2));
		
		// -=
		System.out.println(" number ("+ number +") -= 3 ==> " + (number -= 3));

		// *=
		System.out.println(" number ("+ number +") *= 2 ==> " + (number *= 2));		

		// /=
		System.out.println(" number ("+ number +") /= 5 ==> " + (number /= 5));
		
		// %=
		System.out.println(" number ("+ number +") %= 2 ==> " + (number %= 2));
		
		//\n
		System.out.print("\n");
		
		// number++
		System.out.println(" number ("+ number +") ++ ==> " + (number++));
		
		// ++number
		System.out.println(" number ("+ number +") ++ ==> " + (++number));
		
		// number--
		System.out.println(" number ("+ number +") -- ==> " + (number--));
		
		// --number
		System.out.println(" number ("+ number +") -- ==> " + (--number));

		
		float flNumber = 0;
		int num1 = 10, num2 = 5;
		System.out.println("---------");
		System.out.println("*** modulo int to int ==> " + num1 + " / " + num2 + " === " + (num1 / num2 ) );
		System.out.println("*** modulo int to float ==> " + num1 + " / " + num2 + " === " + (flNumber = num1 / num2 ) );
		
	}

	
	
	/**
	 * 
	 * Java Arithmetic Operators Shorthand
	 * 
	 */
	public void JavaArithmeticOperatorsShorthand2(int number)
	{
		System.out.printf("\n\nJava Arithmetic Operators Short hand\n");
		System.out.printf("number = " + number);
		
		// +=
		System.out.printf("\n (%3d) number += 2 == %3d ", number, (number += 2));
		
		// -=
		System.out.printf("\n (%3d) number -= 3 == %3d ", number, (number -= 3));

		// *=
		System.out.printf("\n (%3d) number *= 2 == %3d ", number, (number *= 2));		

		// /=
		System.out.printf("\n (%3d) number /= 5 == %3d ", number, (number /= 5));
		
		// %=
		System.out.printf("\n (%3d) number %%= 2 == %3d ", number, number %2); //"%%" = $"
		
		
		System.out.printf("\n");

		// number++
		System.out.printf("\n (%3d)  number++ == %3d ", number, number++ );
		
		// ++number
		System.out.printf("\n (%3d)  ++number == %3d ", number, ++number );
		
		// number--
		System.out.printf("\n (%3d)  number-- == %3d ", number, number-- );

		// --number		
		System.out.printf("\n (%3d)  --number == %3d ", number, --number );
		
		System.out.printf("\n");
	}
	
	
	//main method
	public static void main(String[] args) {
//		//object
		B_javaBasicVariableMath b = new B_javaBasicVariableMath();
		
//		//JavaArithmetic Operators
		b.JavaArithmeticOperators();
		
//		//method Pre Post Fix
		b.methodPrePostFix();
		
		//Java Arithmetic Operators Shor thand
		b.JavaArithmeticOperatorsShorthand(10);
		
		//printf()  data sorting
		b.JavaArithmeticOperatorsShorthand2(8);
	}

}


