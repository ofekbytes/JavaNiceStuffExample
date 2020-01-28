/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.C_ForEachFilterLikeMethod;

import java.util.ArrayList;
import java.util.List;


public class ForEachFilterLikeMethod {

	// constructor
	public ForEachFilterLikeMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		System.out.println("<1> Product List - like search - search product name 'start with' <'mic'> some character/s : ");

		products.stream()
			.filter(p -> p.getName().startsWith("mic"))
			.forEach(p -> {
				System.out.println(p.toString());
			});		

		
		System.out.println("\n<2> Product List - like search - search product color 'end with' <'ck'> some character/s : ");
		
		products.stream()
			.filter(p -> p.getColor().endsWith("ck"))
			.forEach(p -> {
				System.out.println(p.toString());
			});

		
		System.out.println("\n<31> Product List - like search - search product manufacturer 'contains'  <'mil'>  some character/s : ");
		products.stream()
			.filter(p -> p.getManufacturer().contains("mil"))
			.forEach(p -> {
				System.out.println(p.toString());
			});
		
	}

}
