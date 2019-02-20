package g_Java_Design_Pattern.Creational_Patterns.FactoryPattern;

/****
 * FactoryPatternDemo.java
 */


/****
 * Step 4
 * Use the Factory to get object of concrete class by passing an information such as type.
 */

public class FactoryPattern 
{

   public static void main(String[] args) 
   {
	   
	  ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");
    
      //call draw method of circle
      shape3.draw();

      
      Shape shape4 = shapeFactory.getShape("NAN");
      shape4.draw();
      
   }//main
   
} //class
