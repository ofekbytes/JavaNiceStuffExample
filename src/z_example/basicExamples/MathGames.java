package z_example.basicExamples;

public class MathGames {
	

	/***
	 * 
	 * 1..10
	 * 10.20
	 * 20..30
	 * 90..100
	 * ..count..
	 */	
	public void MathOneToCoutTable(int count) {
		
		int index=0;
		int breakpoint = 10;
		int counter = 0;
		
		System.out.println("100 board table");
		
		for (index=1; index<=count; index++)
		{
			if (breakpoint == counter) {
				System.out.println("");
				counter = 0;
			}
			
			if (index > 0 && index < 10) 
				System.out.print("   " + index); // 3x space/s

				
			if (index >= 10)
				System.out.print("  " + index); // 2x space/s
		
			counter++;
		}
		System.out.println("\n");	
	}

	
	/***
	 * 
	 * @param count
	 */
	public void MathConnectionPanel(int count) {
		/***
		 *  0 .. 10
		 *  + 0..9
		 *  0
		 *  . 1..10
		 *  . 2..11
		 *  . 3..12
		 *  . 4..13
		 *  .
		 *  9
		 */
		
	}
	
	
	/***
	 * space alignment method/function
	 * @param number - receive a number and make the proper space alignment
	 */
	public void fnPrint(int number) {
	
		if (number == 0) {
			System.out.print("    X");
		}
		
//		//1 digit number space
		if (number > 0 && number <= 9) 
			System.out.print("    " + number); // 3x space/s

		
//		//2 digit number space
		if (number >= 10 && number <= 99)
			System.out.print("   " + number); // 2x space/s

		
//		//2 digit number space
		if (number >= 100 && number <= 999)
			System.out.print("  " + number); // 2x space/s
	}


	
	
	/***
	 * 
	 * @param count - total number (default 10x10 = 100)
	 */
	
	public void MathMultiplicationTable(int count) {
		

		System.out.println("\nMultiplication table \n");
		
		// header - 1..max
		for (int header = 0; header <= count; header++) {		
			fnPrint(header);	
		}
	
		
//		//table + left header
		for (int x=1; x<= count; x++) {
//			//left header 
			System.out.println("");			
			fnPrint(x);
			
			
//			//table MathMultiplication Table
			for (int y=x; y<=x*count; y=y+x)
			{	
				fnPrint(y);
			}
		}		
	}
	
	
	public MathGames() {
		
	}

	public static void main(String[] args) {
		
		MathGames mt = new MathGames();
		
		mt.MathOneToCoutTable(100);
		
		mt.MathConnectionPanel(9);
		
		mt.MathMultiplicationTable(10);
	}

}
