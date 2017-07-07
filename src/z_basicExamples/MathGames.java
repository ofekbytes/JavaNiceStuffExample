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
	 * @param count
	 */
	public void MathMultiplicationTable(int count) {
		
		int x=0, y=0;
		
		//TODO 2 
		/** 1. create table border 0..10 (horizontal, vertical)
		 *  2. create 2 argument for method/function 
		 */
		
		System.out.println("\nMultiplication table");
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
