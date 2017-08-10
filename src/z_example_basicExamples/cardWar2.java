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
	
	
	private void setTotalGameRounds(int number) {
		
		TotalGameRounds=number;		
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
		
		if (intPlayer1 < intPlayer2) {
			setPlayer1();
		}
		else if (intPlayer1 > intPlayer2) {
			setPlayer2();
		}
		
		
		//System.out.printf("\nplayer #1 = %d player #2 = %d ", intPlayer1 ,intPlayer2);
				
		return 0;
	}
	
	
	public int test(int name)
	{
		
		return 0;
	}
	
	
	public int solution(String cardsOfPlayerA, String cardsOfPlayerB) {
		int win = 0;
		char [] chA;
		char [] chB;
		int  [] test = new int [cardsOfPlayerA.length()]; 
		
		for (int i=0; i < cardsOfPlayerA.length(); i++) {
			if (Integer.parseInt(cardsOfPlayerA.toLowerCase().subSequence(i, i+1).toString()) > 0 && Integer.parseInt(cardsOfPlayerA.toLowerCase().subSequence(i, i+1).toString()) < 10) {
				test[i] = Integer.parseInt(cardsOfPlayerA.toLowerCase().subSequence(i, i+1).toString());				
			}


			
			System.out.println(cardsOfPlayerA.subSequence(i, i+1));
			System.out.println(">> " + test[i]);
		}
		
		
		if ((cardsOfPlayerA == null) ||  
			(cardsOfPlayerB == null) || 
			(cardsOfPlayerA.length() == 0) || 
			(cardsOfPlayerB.length() == 0)) 
		{
			
			System.out.println("\nError: player #1 or player #2 without any playing cards");
			
			return 0;
		}
		System.out.println("-----");
		System.out.println("Player #1 cards: " + cardsOfPlayerA);
		System.out.println("Player #2 cards: " + cardsOfPlayerB);
		
		
		chA = cardsOfPlayerA.toLowerCase().toCharArray();
		chB = cardsOfPlayerB.toLowerCase().toCharArray();

		
//		test[0] = (int) chA[0];
//		test[1] = (int) chB[0];
//		System.out.println("int = " + test[0] + " \n " + test[1]);

		
		//if player 1 have more or equal total of card as player 2  
		if (cardsOfPlayerA.length() >= cardsOfPlayerB.length()){
			setTotalGameRounds(cardsOfPlayerA.length()); 
			for (int index = 0; index < cardsOfPlayerA.length(); index++) {
				fnCheckWin(chA[index], chB[index]);
			}
				
		}
		else
		{
			//if player 2 have more total of card then player 1
			for (int index = 0; index < cardsOfPlayerB.length(); index++) {
				setTotalGameRounds(cardsOfPlayerB.length());
				fnCheckWin(chA[index], chB[index]);
			}
			
		}
		
		win = getTotalGameScore();
		
		return win;
	}
	
	
	
	public static void main(String[] args) {

		cardWar2 cw = new cardWar2();
		int win = cw.solution("12a","23J");
		//System.out.println("\winner result = " + win);
	    System.out.println("\n\n--The-End--");    
	}

}
