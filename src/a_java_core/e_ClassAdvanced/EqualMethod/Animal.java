package a_java_core.e_ClassAdvanced.EqualMethod;

class Animal 
{

	//private variable/attribute
	private int intTestSpeed;
	

	Animal(int speed) {
		intTestSpeed = speed;
	}



	
	//---------------------------
	
	/* equals() method, generating automatically
	 * "Source" --> "Generate hasCode() and equals()"
	 *  
	 *  when you implement "equals", you must implement "hashCode".
	 *  
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + intTestSpeed;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (intTestSpeed != other.intTestSpeed)
			return false;
		return true;
	}
	
	
	
	
	/***
	 * 
	 * "source" --> "Generate getter and Setter" 
	 */
	
	public int getIntTestSpeed() {
		return intTestSpeed;
	}


	public void setIntTestSpeed(int intTestSpeed) {
		this.intTestSpeed = intTestSpeed;
	}
	
}//Animal Class
