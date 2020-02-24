package a_02_Java_design_pattern.creational_Patterns.AbstractFactoryPattern;

/**** 
 * Step4
 * 
 * Create concrete classes implementing the same interface.
 */


/****
 * Red.java
 */
public class Red implements Color 
{
   @Override
   public void fill() 
   {
	   System.out.println("Inside Red::fill() method.");
   }
}