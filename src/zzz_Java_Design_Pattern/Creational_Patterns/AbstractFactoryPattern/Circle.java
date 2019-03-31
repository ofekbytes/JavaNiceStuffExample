package zzz_Java_Design_Pattern.Creational_Patterns.AbstractFactoryPattern;
/****
 * Step 2
 * Create concrete classes implementing the same interface. 
 */

/****
 * Circle.java
 */

public class Circle implements Shape
{

	@Override
	public void draw()
	{
		System.out.println("Inside Circle::draw() method.");
	}
	

}
