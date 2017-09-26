package e_ClassAdvanced.AnonymousClasses;

public class AnonymousClassesMain 
{
	//main method + override walk() method
	public static void main(String[] args) 
	{
		Animal an = new Animal() {
			@Override public void walk() 
			{
				System.out.println("Not Original: override the walk() method");
			}
		}; //object animal
		
		//call method walk();
		an.walk();
		
		
		//object to a class without @override
		Animal an2 = new Animal();
		an2.walk();
			
		
	} //main
}//class
