package e_ClassAdvanced.InnerClasses;

class Animal 
{

	//private variable/attribute
	private int intTestSpeed;
	

	Animal(int speed){
		intTestSpeed = speed;
		
		Speed s = new Speed();
		s.run();
	}

	
	//Speed Class
	private class Speed { 
		public void run() {
			System.out.println("Speed - run () is " + intTestSpeed);
		}
	} //Speed Class
	
}//Animal Class
