/**
 * 
 */
package d_java_08.Lambda_Expression.A_ForEachMethod;

import java.util.ArrayList;
import java.util.List;


public class ForEachMethod {

	// constructor
	public ForEachMethod() {
			}

	public static void main(String[] args) {
		List <Product> products = new ArrayList();
				
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		
		System.out.println("Product List: (forEach) - print all the product list/ArrayList <'product.toString()'>  method ");
		products.forEach(product -> {
			System.out.println(product.toString());
		}
		);
	}

}
