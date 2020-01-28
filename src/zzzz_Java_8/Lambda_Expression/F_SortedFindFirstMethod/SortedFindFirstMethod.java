/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.F_SortedFindFirstMethod;

import java.util.ArrayList;
import java.util.List;


public class SortedFindFirstMethod {

	// constructor
	public SortedFindFirstMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		System.out.println("Product List <'price'> - sorted - Ascending Order (a...z) and findFirst records");

		Product Output1 = products.stream()
			.sorted((p1 , p2) -> (int) (p1.getPrice() - p2.getPrice()))
			.findFirst()
			.get();
		System.out.println(Output1.toString());
		
		System.out.println("\nProduct List <'price'> - sorted - Descending Order (z...a) and findFirst records");
		Product Output2 = products.stream()
			.sorted((p1 , p2) -> (int) (p2.getPrice() - p1.getPrice()))
			.findFirst()
			.get();
		System.out.println(Output2.toString());
		
		System.out.println("\nProduct List <'id'> - filter and findFirst records");
		Product Output3 = products.stream()
			.filter(p -> p.getId().equalsIgnoreCase("id-02"))
			.findFirst()
			.get();
		
		System.out.println(Output3.toString());
	}

	
}
