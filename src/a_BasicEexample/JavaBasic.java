//package a_BasicEexample;
//
//import package "threadExample"
//import threadExample.*;
//import utility.MathMethod;
//import utility.counter;
//import utility.util;
//
////class: public/private
//public class JavaBasic {
//	 // attributes / variable declaration
//	public static int intCount = 0;	//static - belongs to the class, no need for instance of the class. create instance static.
//	private int age;	//ini - integer
//	private String StDescribe;	// String sequence of characters.
//	private boolean flage = false;
//	private char grade = 'A';
//	private static final double PI = 3.1415929; //constant
//	

//	//constructors "JavaBasic"
//	public JavaBasic() {
//		// super constructor
//		//super();
//		System.out.println("constructor say i am the first");
//	}
//
//	public JavaBasic(int a, int b){
//		System.out.println("constructor a + b ==>  " + (a + b));
//	}


////	/**
////	 * Methods examples
////	 */
//////	method with NO parameters
////	public void methodCalling()	{
////		System.out.println("this is a method without parameters");
////	}
////
//////	method with one parameters
////	public void methodCalling(int parameterOne){
////		System.out.println("method with a parameters , parameterOne >> " +  parameterOne);
////	}
////	
//////	method + 2 parameters
////	public void methodCalling(int parameterOne, int parameterTwo){
////		System.out.println("method with a parameters , parameterOne >> " +  parameterOne + " , "+ parameterTwo);
////	}
//

//
//	
//	/*
//	 * Getter , Setter
//	 */
//	public static int getIntCount() {
//		return intCount;
//	}
//
//	public static void setIntCount(int intCount) {
//		JavaBasic.intCount = intCount;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age; //"this." refer to the current object.
//	}
//
//	public String getStDescribe() {
//		return StDescribe;
//	}
//	
//	public void setStDescribe(String stDescribe) {
//		StDescribe = stDescribe;
//	}
//	/**
//	 * /Getter , /Setter
//	 */
//	
//	
//	
////1>>	//reference type 	
//	static void methodChange (JavaBasic j, int value) {
//		j.age = value;
//		
//	//	j.setAge(333);
//	}
//	
//	public static void BIP(){
//		System.out.print(" bip ");
//	}
//
//	
//	
//	//main method (function) with String Array parameters
//	public static void main(String[] args) {
//		//variable
//		//object of our class "jb" "jb2"
//		JavaBasic jb = new JavaBasic(); // we created "new object" of a "class". "jb" object of a class "JavaBasic" (constructor)
//		JavaBasic jb2 = new JavaBasic(11,22); //constructor with 2 parameters/arguments
//		
//		jb.age = 10; //access attributes ags=10;
//		System.out.println("jb.age ===> "  + jb.age);
//		
//		
//		
////11>   //before reference change		
////		System.out.println("reference type jb.age ===>> "+jb.age);
//		
////1>>	//reference type (with Parameters / Arguments inside: "(jb,1)" )
//		methodChange(jb, 1);
//		System.out.println("reference type jb.age ===>> "+jb.age);
//		
//
////1>>	//reference type (Array/String)
//		methodChange(jb, 221);
//		System.out.println("reference type jb.age ===>> "+jb.age);
//		
//		
//		
// 	    intCount = 0;
//		intCount = intCount + 1;
//		System.out.println("\nStatic int intCount === " + jb.intCount);	  		   
//		
//		
//		//object to Math class example
//		MathMethod m = new MathMethod();
//		
//		//prefix/postfix (increment/decrement)
//		m.methodPrePostFix();
//		
//		//random number
//		m.GenerateRandomNumber(66);
//		
//		
//		//object to class with static
//		counter c1 = new counter();
//		counter c2 = new counter();
//		
//		System.out.println("static counter total COUNT ==> " + c1.COUNT + " " + counter.COUNT);
//		
//		BIP(); BIP();
//		
//		System.out.println("\nPI ==> " + PI);
//		
//		
//		//package import and using class
//		javaThread j = new javaThread("");
//		j.setPuStName("nice to have");
//		System.out.println("import threadExample.*; >>>  " + j.getPuStName());
//		
//	}
//}
//
//
