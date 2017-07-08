package d_ClassAndObjects;

/**
 * 
 * Object Oriented Programming (oop) - 
 *
 */
public class A_OOP {
	
	private String stName = "" ;
	
	static void fnHello() {
		System.out.println("Hello...");
	}
	
	/**
	 * constructor 
	 */
	public A_OOP(){
		
	}
	
	public static void main(String [] args) {
		
		//no need to write like that because fnHello() is a "static".
		A_OOP ap = new A_OOP();
		ap.fnHello();
		
		fnHello(); //method/function name with parentheses.
		
	}

}
