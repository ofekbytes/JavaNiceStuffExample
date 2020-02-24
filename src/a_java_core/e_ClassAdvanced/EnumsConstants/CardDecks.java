

package a_java_core.e_ClassAdvanced.EnumsConstants;

//public enum test { ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
public enum CardDecks { 
	ONE(1)
	,TWO(2) 
	,THREE(3) 
	,FOUR(4) 
	,FIVE(5) 
	,SIX(6) 
	,SEVEN(7) 
	,EIGHT(8) 
	,NINE(9)
	,TEN(10) 
	,JACK(11) 
	,QUEEN(12) 
	,KING(13)
	,ACE(14)
	,J(11) 
	,Q(12) 
	,K(13) 
	,A(14);
	
	
	private int value;

	
	private CardDecks(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}		 
	
}
