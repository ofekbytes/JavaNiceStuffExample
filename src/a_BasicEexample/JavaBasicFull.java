//package a_BasicEexample;
//
////import package
//import threadExample.*;
//import utility.counter;
//
////class: every line of code in java need to be in a "class".
////class "access modifiers" is public -or- default.
//// public - accessible by any other class
////   example: Public class javaScript{} 
//// default: class is accessible only by classes in the same package.(left blank)
////   example: class javaBasic{}
////classes are blue prints used to design objects that contain attributes (variables) and methods (functions).
////class is blueprint / descriptions/ definitions for an object -or for many objects.
//public class JavaBasicFull {
//	


////	//constructors "JavaBasic" - if not exits will be created by java automatically when object created. (all class has constructors)
////	public JavaBasicFull() {
////		//super();
////		System.out.println("constructor say i am the first");
////	}
////
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
////	
//


//
////	
////	
////	
////	/*
////	 * Getter , Setter
////	 */
////	public static int getIntCount() {
////		return intCount;
////	}
////
////	public static void setIntCount(int intCount) {
////		JavaBasicFull.intCount = intCount;
////	}
////
////	public int getAge() {
////		return age;
////	}
////
////	public void setAge(int age) {
////		this.age = age; //"this." refer to the current object.
////	}
////
////	public String getStDescribe() {
////		return StDescribe;
////	}
////	
////	public void setStDescribe(String stDescribe) {
////		StDescribe = stDescribe;
////	}
////	/**
////	 * /Getter , /Setter
////	 */
////	


//
////	
//////	"Math" class "Math.method"
////	public void MathMethod()
////	{
////		
////		System.out.println("\nMath.method: ");
////		System.out.println("Math.abs(10) ==> " + Math.abs(10)); //10
////		System.out.println("Math.abs(10) ==> " + Math.abs(-20)); //20
////		
////		System.out.println("Math.ceil(3.23) ==> " + Math.ceil(3.23)); //4
////		System.out.println("Math.floor(-3.23) ==> " + Math.floor(3.23)); //3
////		
////		System.out.println("Math.max(3,7) ==> " + Math.max(3,7)); //7
////		System.out.println("Math.min(5,3) ==> " + Math.min(5,3)); //3
////		
////		System.out.println("Math.pow(3,2) ==> " + Math.pow(3,2)); //9.0
////		
////		//Math.method more example
////		//Math.sqrt(), Math.sin(), Math.cos(), Math.PI(), Math.random()
////		
////	}
////	



////1>>	reference type	
//	static void methodChange (JavaBasicFull j) {
//		j.setAge(333);
//	}
//	


//	public static void BIP(){
//		System.out.print(" bip ");
//	}
//


//	//main method (function) with String Array parameters
//	public static void main(String[] args) {
//		
//		
//		JavaBasicFull jb = new JavaBasicFull(); // we created "new object" of a "class". "jb" object of a class "JavaBasic"
//		jb.age = 10; //access attributes ags=10;
//		System.out.println(jb.age);
//
////1>>	reference type (Array/String)
//		methodChange(jb);
//		System.out.println("reference type jb.age ===>> "+jb.age);
//		
//		
//		jb.grade = 65;
//		System.out.println("char value ==> 65 == " + jb.grade);
//
//		jb.grade = 66;
//		System.out.println("char value ==> 66 == " + jb.grade);
//
//		
// 	    intCount = 0;
//		intCount = intCount + 1;
//		System.out.println("\nStatic int intCount === " + jb.intCount);	  		   
//		
//		//Math class example
//		jb.MathMethod();
//		
//		//create new objec to class with static ( "counter,java" )
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
