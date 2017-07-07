package a_BasicEexample;

public class F_JavaBasicMethod {

	/**
	 * Methods examples
	 */
	
	
   	/***
   	 * method with NO parameters
   	 */
	public void methodCalling()	{
		System.out.println("this is a method without parameters");
	}

	
    /***
     * method with one parameters
     * @param parameterOne 
     */
	public void methodCalling(int parameterOne){
		System.out.println("method with a parameters , parameterOne >> " +  parameterOne);
	}
	
	
    /***
     * method + 2 parameters
     * @param parameterOne
     * @param parameterTwo
     */
	public void methodCalling(int parameterOne, int parameterTwo){
		System.out.println("method with a parameters , parameterOne >> " +  parameterOne + " , "+ parameterTwo);
		System.out.println(parameterOne + " +  " +  parameterTwo + " === " + (parameterOne + parameterTwo));
	}
	
	
	//public generalDeteals(String firstName, String MiddelName, String LastName, int identificationCard)
	public void generalDeteals(int id)
	{
		System.out.println("id number: " + id);
	}
	
	public void generalDeteals(int id, String lastName)
	{
		System.out.println("id number: " + id + " LastName: " + lastName);
	}

	public void generalDeteals(int id, String lastName, String FirstName)
	{
		System.out.println("id number: " + id + " LastName: " + lastName + " FirstName: " + FirstName);
	}

	
	//constructor
	public F_JavaBasicMethod() {
		methodCalling();
		methodCalling(22);
		methodCalling(21,12);
		
		generalDeteals(1234567);
		generalDeteals(1234567,"levi");
		generalDeteals(1234567,"levi","avi");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F_JavaBasicMethod fjbm = new F_JavaBasicMethod();
		

	}

}
