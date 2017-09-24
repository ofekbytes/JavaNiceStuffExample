package e_ClassAdvanced.castingExample;

class Dog extends Animal {

	/***
	 * SubClass extends SupperClass Animal
	 */
	
	public void walk(){
		System.out.println("Dog Walk");
	}
	
	//Constructor
	Dog() 
	{
		age = 12;
		animalType = "Dog";
	}
}
