package z_example_basicExamples;

public class cardWar {
	
	//card value (1-14)
	private static final int j = 10; //jack
	private static final int q = 11; //queen
	private static final int k = 12; //king
	private static final int a = 13; //ace
	//private static final int J = 14; //Jocker

	
	public int fncharToInt(char character)
	{
		
		return 1;
	}
	 
	
	public int fnCheckWin(char chPlayer1, char cdPlayer2) {
		
		int intPlayer1=0;
		int intPlayer2=0;
		
		intPlayer1 = Integer.parseUnsignedInt(chPlayer1);
				
		return 0;
	}
	
	
	public int solution(String cardsOfPlayerA, String cardsOfPlayerB) {
		int win = 0;
		char [] chA;
		char [] chB;

		
		chA = cardsOfPlayerA.toCharArray();
		chB = cardsOfPlayerB.toCharArray();
		
		System.out.println("cards Of Player A: ");
		for (char ch: chA) {
			//system.mout.printf("%c", char); %d ...
			//TODO method of the command printf.
		}
		
		return win;
	}
	
	
	public cardWar() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {

		int number = 9;
		
		System.out.printf("j=%d, q=%d, k=%d, a=%d", j,q,k,a);
		

	    if (number > j)
	    	System.out.printf("\nnumber=%d bigger then j=%d", number, j);
	    
	    if (j > number)
	    	System.out.printf("\nnumber=%d smaller then j=%d", number, j);
	    	
	    System.out.println("\n\nthe end");
	    
	}

}
