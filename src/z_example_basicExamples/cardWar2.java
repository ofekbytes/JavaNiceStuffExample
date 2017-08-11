package z_example_basicExamples;

public class cardWar2 {
	
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

		
	 
	
	public int fnCheckWin(char chPlayer1, char chPlayer2) {
		
		int intPlayer1=0;
		int intPlayer2=0;
		
	
		if (intPlayer1 < intPlayer2) {
			setPlayer1();
		}
		else if (intPlayer1 > intPlayer2) {
			setPlayer2();
		}
		
		
		//System.out.printf("\nplayer #1 = %d player #2 = %d ", intPlayer1 ,intPlayer2);
				
		return 0;
	}
	
	
	//convert character from smaller to bigger
	public char chConvert(char charSource){
		char charTarget = charSource;
		
		switch (charSource) 
		{
			case j:
				charSource = 'a';
				break;
			case q:
				charSource = 'b';
				break;			
			case k:
				charSource = 'c';
				break;
			case a:
				charSource = 'd';
				break;
			default:
				charSource = '0';
		}
		
		return charTarget;
	}
	
	
	public int solution(String cardsOfPlayerA, String cardsOfPlayerB) {
		int win = 0;
		char [] chPlayerA;
		char [] chPlayerB;
 
		

		setTotalGameRounds(cardsOfPlayerA,cardsOfPlayerB);
		
		if (getTotalGameRounds() == 0) 
			return win;
		
		//display player cards
		System.out.println("-----");
		System.out.println("Player #1 cards: " + cardsOfPlayerA);
		System.out.println("Player #2 cards: " + cardsOfPlayerB);
		
		
		//split the string to char so we can view the cards one by one
		chPlayerA = cardsOfPlayerA.toLowerCase().toCharArray();
		chPlayerB = cardsOfPlayerB.toLowerCase().toCharArray();

		
		//TODO think on converting character (by value) j=a, q=b, k=c, a=d
		
		
		for (int index=0; index < getTotalGameRounds(); index++) {
			
			//convert - because we working with char 'a' is small then 'k'
			chPlayerA[index] = chConvert (chPlayerA[index]);
			chPlayerB[index] = chConvert (chPlayerB[index]);
			if (chPlayerA[index] > chPlayerB[index]) {
				setPlayer1();
			}
			else
			{
				setPlayer2();
			}
		}
		

		win = getTotalGameScore();
		
		
		return win;
	}
	
	
	
	public static void main(String[] args) {

		cardWar2 cw = new cardWar2();
		int win = cw.solution("14j","23kd");
		System.out.println("\n winner result = " + win);
	    System.out.println("\n\n--The-End--");    
	}

}
