package d_ClassAndObjects;

/**
 * 
 * Object Oriented Programming (OOP) - 
 *
 */
public class A_OOP {
	
	private String stName = "" ;
	
	//method without parameters
	static void fnHello() {
		System.out.println("Hello...");
	}
	
	//method with parameter
	static void fnHello(String NameParameters) 
	{
		System.out.println(NameParameters); 
	}
	
	double sales_tax(double price)
	{
	    return 0.10 * price;
	}
	
	/**
	 * constructor 
	 */
	public A_OOP(){
		
	}
	
	/** 
	 *  main()
	 */
	public static void main(String [] args) {
		
		//no need to write like that because fnHello() is a "static".
		A_OOP ap = new A_OOP();
		ap.fnHello();
		
		fnHello(); //method/function name with parentheses.
		fnHello("argument");
		
		double price = 7000;
		System.out.println("price = " + price + " ,Tax == " + ap.sales_tax(price));
	}

}
