package d_ClassAndObjects;

//F_OOP_Reference_Type.java
//F_Person.java

public class F_OOP_Reference_Type {

	
	private static void Birthday(F_Person p) {
		//change value using reference type to class F_Person.
		p.setAge(p.getAge() + 22);
	}
	
	
	public static void main(String[] args) {
		F_Person f;
		f = new F_Person();
		f.setFName("lee");
		f.setFName("you");
		f.setAge(44);
		System.out.println("Age == " + f.getAge()); //44
		
		//send (reference type) a F_Person object as a parameter to a method.
		Birthday(f);
		System.out.println("Age == " + f.getAge()); //66

	}

}
