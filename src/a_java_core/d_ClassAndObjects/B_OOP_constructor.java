package a_java_core.d_ClassAndObjects;

public class B_OOP_constructor 
{

	private String FName = "";
	
	B_OOP_constructor() 
	{
		FName = "yaki";		
		System.out.println("FName === " + FName);
	}
	
	B_OOP_constructor(String fname) 
	{
		FName = fname;
		System.out.println("parameters + FName  === " + FName);
	}
	
	
	public static void main(String[] args) 
	{
		B_OOP_constructor boop = new B_OOP_constructor();
		B_OOP_constructor boopB = new B_OOP_constructor("eli");		
	}

}
