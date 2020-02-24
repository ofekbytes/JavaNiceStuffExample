package a_java_core.e_ClassAdvanced.castingExample;

class Cat extends Animal {

	/***
	 * SubClass extends SupperClass Animal
	 */
	public void walk(){
		System.out.println("Cat Walk");
	}
	
	//Constructor
	Cat() 
	{
		age = 7;
		animalType = "cat";
	}
}
