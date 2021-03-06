package a_02_Java_design_pattern.creational_Patterns.AbstractFactoryPattern;

/****
 * Step 2
 * Create concrete classes implementing the same interface. 
 */

/****
 * Square.java
 */
public class Square implements Shape
{

	@Override
	public void draw()
	{
		System.out.println("Inside Square::draw() method.");
	}
	

}
