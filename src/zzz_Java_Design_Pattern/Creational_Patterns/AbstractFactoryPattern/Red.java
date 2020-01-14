package zzz_Java_Design_Pattern.Creational_Patterns.AbstractFactoryPattern;

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