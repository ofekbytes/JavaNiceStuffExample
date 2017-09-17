package e_ClassAdvanced;

//SupperClass
class Animal 
{
	protected int age;
	
	public void walk()
	{
		System.out.println("Animal Walk All Day " + age);
	}

}


//SubClass
class Cat extends Animal 
{
	Cat() 
	{
		age = 4;
	}
}


class B_AnimalMainClass 
{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.age = 10;
		c.walk(); //SuperClass method.
	}
}
