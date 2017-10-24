package d_ClassAndObjects;

public class F_OOP_Reference_Type_simple 
{

	private int Age;
	

	public int getAge() 
	{	
		return Age;
	}


	public void setAge(int age) 
	{
		Age = age;
	}


	public static void main(String[] args) 
	{
		F_OOP_Reference_Type_simple object1 = new F_OOP_Reference_Type_simple();
		F_OOP_Reference_Type_simple object2 = new F_OOP_Reference_Type_simple();
		
		//print address of object1 and object2
		System.out.println("object 1, object2 - before reference type assigned");
		System.out.println("object 1 == " + object1);
		System.out.println("object 2 == " + object2);
																																																																																		
		/*** 
		 * output:
		 * object 1, object2 - before reference type assigned
		 * object 1 == d_ClassAndObjects.F_OOP_Reference_Type_simple@4f8e5cde 
		 * object 2 == d_ClassAndObjects.F_OOP_Reference_Type_simple@504bae78
		 */
		
		
		//Reference Types - set address of object2 in object1
		object1 = object2;

		//print address of object1 and object2
		System.out.println("object 1, object2 - after reference type assigned");
		System.out.println("object 1 == " + object1);
		System.out.println("object 2 == " + object2);

		
		/***
		 * output:
		 * object 1, object2 - after reference type assigned
		 * object 1 == d_ClassAndObjects.F_OOP_Reference_Type_simple@504bae78
		 * object 2 == d_ClassAndObjects.F_OOP_Reference_Type_simple@504bae78
		 */
		
		
		object1.setAge(22);		
		System.out.println("object1 = " + object1.getAge() + " >> object2 = " + object2.getAge());

		
		object2.setAge(44);		
		System.out.println("object1 = " + object1.getAge() + " >> object2 = " + object2.getAge());

	}

}
