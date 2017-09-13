package d_ClassAndObjects;

/**
 * 
 * Object Oriented Programming (OOP) - 
 *
 */

/***
 * class declaration
 */
public class A_OOP {
	
	// Global variable / attributes
	private String stFName = "";
	private String stLName = "";
	
	
	public String getStFName() {
		return stFName;
	}

	public void setStFName(String stFName) {
		this.stFName = stFName;
	}

	public String getStLName() {
		return stLName;
	}

	public void setStLName(String stLName) {
		this.stLName = stLName;
	}

	/****
	 * method no parameters
	 * return: void
	 */
	static void fnHello() {
		System.out.println("Hello...");
	}
	
	
	/****
	 * method with one parameter
	 * @param: NameParameters
	 * return: void
	 */
	static void fnHello(String NameParameters) 
	{
		System.out.println(NameParameters); 
	}
	
	/****
	 * 
	 * method return a value (double type)
	 * @param: price
	 * @return: total tax price
	 */

	private double sales_tax(double price)
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
		
		
		//declare an object "ap" of the class "A_OOP()"
		A_OOP ap = new A_OOP();
		A_OOP ap2 = new A_OOP();
		
		//"ap" is an object of type "A_OOP" (class) with a call to "fnHello()" method
		ap.fnHello();
		
		//you can write like that because fnHello() is a "static".
		fnHello(); //method/function name with parentheses.
		fnHello("argument");
		
		double price = 7000;
		System.out.println("price = " + price + " ,Tax == " + ap.sales_tax(price));
		
		//writing to object attributes
		ap.stFName = "ap === tea";
		ap2.stFName = "ap2 === coffie";
	
		//reading from object attributes
		System.out.println("object " + ap.stFName);
		System.out.println("object " + ap2.stFName);

		//getter and setter
		ap.setStFName("yaki");
		System.out.println("getStFName()=== "+ ap.getStFName());
	}

}
