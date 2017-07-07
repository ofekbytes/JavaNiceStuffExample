package a_BasicEexample;

import javax.swing.border.EmptyBorder;

public class E_mathPackage {

	public E_mathPackage() {
	}

	public void MathMethod() {

		System.out.println("\nMath.method: ");
		System.out.println("Math.abs(10) ==> " + Math.abs(10)); //10
		System.out.println("Math.abs(10) ==> " + Math.abs(-20)); //20
		
		System.out.println("Math.ceil(3.23) ==> " + Math.ceil(3.23)); //4
		System.out.println("Math.floor(-3.23) ==> " + Math.floor(3.23)); //3
		
		System.out.println("Math.max(3,7) ==> " + Math.max(3,7)); //7
		System.out.println("Math.min(5,3) ==> " + Math.min(5,3)); //3
		
		System.out.println("Math.pow(3,2) ==> " + Math.pow(3,2)); //9.0
		
		/******
		 * Math.method more example
		 * Math.sqrt(), Math.sin(), Math.cos(), Math.PI(), Math.random()
		 */	
	}
	
	
	/****
	 * 
	 * Generate Random Number
	 * @param intMaxNumber - max number to generate a random number
	 * 
	 */
	public void GenerateRandomNumber(int intMaxNumber)
	{
		int intRandomNumber= 0;
		intMaxNumber ++;
		
		intRandomNumber = (int) (Math.random()* intMaxNumber);
		
		System.out.println("\nRandom number is (0-" + intMaxNumber + " == " + intRandomNumber);
	}
				
	
	public static void main(String[] args) {
		
	E_mathPackage emp = new E_mathPackage();
	
	emp.MathMethod();
	emp.GenerateRandomNumber(42);
	emp.GenerateRandomNumber(42);

	}

}
