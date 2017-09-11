package z_example.testZone.one;


//temp test zone - will be erased 
import java.util.Scanner;

public class Example1 {


	//constructor
//	public Example1() {
//		
//		Scanner game = new Scanner(System.in);
//
//		double num = 0;
//		double sum = 0;
//		int cnt = 0;
//
//		while (true) {
//		    System.out.println("Enter as many non-negative integers as you like ");
//		    System.out.println("one at a time and I will find the average");
//		    System.out.println("Enter done to stop entering numbers");
//
//		    double lowscore = Double.MAX_VALUE;
//		    double highscore = 0;
//
//		    System.out.print("enter number: ");
//		    String ans = game.next();
//		    while (!ans.equals("done")) {
//
//		        num = Double.parseDouble(ans);
//
//		        lowscore = Math.min(lowscore, num);
//		        highscore = Math.max(highscore, num);
//
//		        sum += num;
//		        cnt++;
//
//		        System.out.print("enter number: ");
//		        if (num > highscore) {
//		            highscore = num;
//		        }
//		        if (num < lowscore) {
//		            lowscore = num;
//		        }
//		        ans = game.next();
//		    }
//
//		    sum -= lowscore;
//		    sum -= highscore;
//
//		    System.out.println("Throwing out low score " + lowscore + " and high score " + highscore);
//		    System.out.println("Total Score " + sum + " count scores " + cnt + " avg score " + sum / cnt);
//
//		    System.out.println("Enter another contestant (Y/N)?");
//		    String str = game.next();
//		    if (!str.equalsIgnoreCase("Y")) {
//		    	System.out.println("i am exiting");
//		        break;
//		    }
//		    
//		}
//	}
	
	
	
	
//	public void Array2D() {
//	
//
//		String [][] array2DList = {{"i","am","nice"}, {"she", "is"}, {"you", "are"} };
//		
//		
////		for (int i = 0; i < array2DList.length; i++) {
////			System.out.println("");
////			
////			for (int j=0; j < array2DList[i].length ; j++) {
////				System.out.print(array2DList[i][j] + " , ");
////			}
////		}
//		
//
//		
//		//return 0 / true;
//		
//	}
	

	
	
	
	private void ArrayString2D() {
		
		String [][] stArray2D = {{"i","you","we","they"},{"am","are","is"},{"working","works", "worked"}};


		System.out.println("for loop... ");
		for (int x = 0; x < stArray2D.length; x++)
		{
			System.out.println("");
			for (int y=0; y < stArray2D[x].length; y++)
			{
				System.out.print(stArray2D[x][y] + " , ");
			}
		}

		
		String stText = "test";
		char [] letter;
		System.out.printf("\n\nstText.length() ==> " +  stText.length());
		letter = stText.toLowerCase().toCharArray();
		
		System.out.println();
		
		for (int i=0; i<letter.length; i++){
			System.out.print(" . " + letter[i]);
		}
		
		
		System.out.println("");
		for(char ch: letter) {
			System.out.print(" " + ch);
		}
		
		
		int idx = letter.length - 1;
		System.out.println("\n\nidx == " + idx + "   \n");
		
		
		for (; idx >= 0 ; idx--) {
			System.out.print(letter[idx] + "  ");
		}
		
//		System.out.println("enhanced for loop / for each loop");
//		for (String [] stX : stArray2D) {
//			System.out.println("");
//			for (String stY : stX)
//			{
//				System.out.print(stY + " , ");
//			}
//		}
			
				
	}
	
	
	
	
	
	
	
	
	
	public static void main(String [] args) {
		Example1 ex1 = new Example1();
		ex1.ArrayString2D();
	}
	

}
