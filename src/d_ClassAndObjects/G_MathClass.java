package d_ClassAndObjects;

public class G_MathClass {

	public G_MathClass() {
		
	}

	public static void main(String[] args) 
	{
		double num1=33.3, num2=33.321;
		double dblMax=0, dblMin=0;

		
		//return max value of parameters
		dblMax = Math.max(num1,num2);
		System.out.println(dblMax);

		
		//return min value of parameters
		dblMin = Math.min(num1,num2);
		System.out.println(dblMin);		
		
		//TODO: MATH.* eample - more example/s.
//		Math.abs() - return absolute value
//		Math.ceil() - return round a floating point value up
//		Math.floor() - return round a floating point value down
//		Math.max() - return max value of parameters
//		Math.min() - return min value of parameters
//		Math.pow() - return power of second parameter
//		Math.sqrt() - return square root value 
//		Math.sin() - return sinus value
//		Math.cos() - return cosine value
		
	} //main

} //class
