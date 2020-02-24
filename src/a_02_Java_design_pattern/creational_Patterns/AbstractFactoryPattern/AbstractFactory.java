package a_02_Java_design_pattern.creational_Patterns.AbstractFactoryPattern;


/****
 * Step 5
 * Create an Abstract class to get factories for Color and Shape Objects. 
 */


/****
 * AbstractFactory.java
 */
public abstract class AbstractFactory 
{
   abstract Color getColor(String color);
   abstract Shape getShape(String shape);
}
