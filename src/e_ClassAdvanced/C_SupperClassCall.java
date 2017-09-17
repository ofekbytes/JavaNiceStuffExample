package e_ClassAdvanced;


//SupperClass
class classA 
{
	classA()
	{
		System.out.println("Class-A");
	}
}


//SubClass
class classB extends classA 
{
	public classB() 
	{
		System.out.println("Class-B");
	}
	
}


//main
public class C_SupperClassCall 
{
	public static void main(String[] args) 
	{
		classB cb = new classB();
	}
}
