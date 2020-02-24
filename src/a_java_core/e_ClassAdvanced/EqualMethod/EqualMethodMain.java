package a_java_core.e_ClassAdvanced.EqualMethod;

public class EqualMethodMain 
{

	public static void main(String[] args) 
	{
		Animal a = new Animal(120);
		Animal b = new Animal(120);
		
		
		System.out.println("a == b ?? ==  " + (a == b)); //== false
		
		
		//equals () method
		System.out.println("a.equals(b); == " + a.equals(b)); //== true
		
	} //main
}//class
