package g_Java_Design_Pattern.Creational_Patterns.FactoryPattern;

/****
 * Rectangle.java
 */


/****
 * Step 2 
 * Create concrete classes implementing the same interface.
 */


public class Rectangle implements Shape 
{

   @Override
   public void draw() 
   {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
