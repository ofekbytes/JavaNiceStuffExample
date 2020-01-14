package zzz_Java_Design_Pattern.Creational_Patterns.AbstractFactoryPattern;

/****
 * Step 2
 * Create concrete classes implementing the same interface. 
 */

/****
 * Rectangle.java
 */
public class Rectangle implements Shape
{

	@Override
	public void draw()
	{
		System.out.println("Inside Rectangle::draw() method.");
	}
	

}
