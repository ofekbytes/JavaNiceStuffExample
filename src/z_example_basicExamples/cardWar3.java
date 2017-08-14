package z_example_basicExamples;

public class cardWar3 {
	
	//card value (1-14)
	private static final int j = 10; //jack
	private static final int q = 11; //queen
	private static final int k = 12; //king
	private static final int a = 13; //ace
	//private static final int J = 14; //Jocker

	
	//total score
	private static int playerOneTotalScore = 0;
	private static int playerTwoTotalScore = 0;
	private static int TotalGameRounds = 0;
	
	//total game - find the minimum card available. 
	private void setTotalGameRounds(String player1, String player2) {
		
		
		if (player1.length() <= player2.length()) {
			TotalGameRounds = player1.length();
		}
		else
		{
			TotalGameRounds = player2.length();
		}
	}
	

	private int getTotalGameRounds() {
		return TotalGameRounds;
	}
	
	
	private void setPlayer1() 
	{
		playerOneTotalScore++;
	}

	private int getPlayer1() {
		return playerOneTotalScore;
	}
	

	private void setPlayer2() 
	{
		playerTwoTotalScore++;
	}

	private int getPlayer2() {
		return playerTwoTotalScore;
	}

	
	private int getTotalGameScore()
	{
		
		System.out.printf("\n\nScore:");
		System.out.printf("\nTotal Game Rounds = %d", getTotalGameRounds());
		System.out.printf("\nplayer One Total Score = %d point/s", getPlayer1());
		System.out.printf("\nplayer Two Total Score = %d point/s", getPlayer2());
		
		if (getPlayer1() > getPlayer2()){
			System.out.printf("\nPlayer One Is The \"Winner\""); 
			System.out.printf("\nPlayer One have " + getPlayer1());
			return getPlayer1();
		}
		else if (getPlayer1() < getPlayer2()){
			System.out.printf("\nPlayer Two Is The \"Winner\"");
			System.out.printf("\nPlayer Two have " + getPlayer2());			
			return getPlayer2();
		}
		else
			return 999; //if equal reutrn 0
	}

		
	public int fncharToInt(char character)
	{
		int charToNumber=0;
		
		switch (character) {
		case '1':
			charToNumber = 1;
			break;
		case '2':
			charToNumber = 2;
			break;
		case '3':
			charToNumber = 3;
			break;
		case '4':
			charToNumber = 4;
			break;
		case '5':
			charToNumber = 5;
			break;
		case '6':
			charToNumber = 6;
			break;
		case '7':
			charToNumber = 7;
			break;
		case '8':
			charToNumber = 8;
			break;
		case '9':
			charToNumber = 9;
			break;
		case 'j': //prince
			charToNumber = 10;
			break;
		case 'q': //queen
			charToNumber = 11;
			break;
		case 'k': //king
			charToNumber = 12;
			break;
		case 'a': //ace
			charToNumber = 13;
			break;			
		default: //space or other value
			charToNumber = 0;
		}
		
		return charToNumber;
	}
	 
	
	public int fnCheckWin(char chPlayer1, char chPlayer2) {
		
		int intPlayer1=0;
		int intPlayer2=0;
		
		intPlayer1 = fncharToInt(chPlayer1);
		intPlayer2 = fncharToInt(chPlayer2);
		
		if (intPlayer1 > intPlayer2) {
			setPlayer1();
		}
		else if (intPlayer1 < intPlayer2) {
			setPlayer2();
		}
		
						
		return 0;
	}
	
	
	//
    //
    //
	public int solution(String A, String B) {
		int win = 0;
		char [] chPlayerA;
		char [] chPlayerB;

	
     	//value null ?  
		if (A == null || B == null) {
			System.out.println("Error: no Card available (NULL)");
			return 0;
		}
	
		//set total game round/s
		setTotalGameRounds(A,B);
		
		//if no playing card available exit
		if (getTotalGameRounds() == 0) {
			System.out.println("Error: no Card available (0 Cards)");
			return win;
		}		
	
		//dispaly/print player cards
		System.out.println("-----");
		System.out.println("Player #1 cards: " + A);
		System.out.println("Player #2 cards: " + B);
		
		//cut the cards into array
		chPlayerA = A.toLowerCase().toCharArray();
		chPlayerB = B.toLowerCase().toCharArray();
		
		//check card by card who is bigger
		for (int index=0; index < getTotalGameRounds(); index++) {
			fnCheckWin(chPlayerA[index], chPlayerB[index]);
		}	
		
		//set the winner value
		win = getTotalGameScore();
		
		//return the winner value
		return win;
		
	}//setTotalGameRounds
	
	

	public static void main(String[] args) {

		cardWar3 cw = new cardWar3();
		int win = cw.solution("91q","23j");
    
	}

		
}
