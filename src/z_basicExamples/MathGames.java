package z_basicExamples;

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
	 * 
	 * @param count - total number (default 10x10 = 100)
	 */
	public void MathMultiplicationTable(int count) {
		

		System.out.println("\nMultiplication table \n");
		
		// header - 1..max
		for (int header = 0; header <= count; header++) {
	
			if (header == 0) {
				System.out.print("   X");
			}
			
//			//header 1 digit number space
			if (header > 0 && header < 10) 
				System.out.print("   " + header); // 3x space/s

//			//header 2 digit number space
			if (header >= 10)
				System.out.print("  " + header); // 2x space/s
		}
		
		
//		//table + left header
		for (int x=1; x<=10; x++)
		{
//			//left header 
			System.out.println("");
			
//			//left header 1 digit number space
			if (x < 10)
			  System.out.print("   " + x);
			
//			//left header 2 digit number space
			if (x >= 10) 
			  System.out.print("  " + x);
			
			
//			//table MathMultiplication Table
			for (int y=x; y<=x*10; y=y+x)
			{
//				//MathMultiplication Table with 1 digit space
				if (y > 0 && y < 10) 
					System.out.print("   " + y); 
	
//				//MathMultiplication Table with 2 digit space				
				if (y >= 10)
					System.out.print("  " + y); 
			}
		}		
		System.out.println("\n");
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
