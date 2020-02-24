package a_02_Java_design_pattern.creational_Patterns.FactoryPattern;

/****
 * Circle.java
 */


/****
 * Step 2 
 * Create concrete classes implementing the same interface.
 */


public class Circle implements Shape 
{

   @Override
   public void draw() 
   {
	   System.out.println("Inside Circle::draw() method.");   
   }
	
}

