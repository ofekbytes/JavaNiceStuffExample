package a_java_core.e_ClassAdvanced.EnumsConstants;



public class EnumsConstantsMain 
{


	public static void main(String[] args) {		
	
		CardDecks s = null;
		
		System.out.println("s variable value is ===>  " + s);
		
		System.out.println("s.ONE.getValue() > s.TWO.getValue() ===> "); 
		System.out.println(s.K.getValue() > s.Q.getValue());
		
		
		System.out.print("value is === ");
		CardDecks selected =  CardDecks.EIGHT;	
		switch(selected) {
		case EIGHT:
			System.out.print("8");
			break;

		default:
			System.out.println("Default");
		}
		 
		

	}

}
