/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.B_ForEachFilterMethod;

import java.util.ArrayList;
import java.util.List;


public class ForEachMethod {

	// constructor
	public ForEachMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		
		System.out.println("Product List: (forEach) - filter with OR (||) condition");
		products.stream()
			.filter(p -> p.getId().equalsIgnoreCase("id-01") 
				      || p.getId().equalsIgnoreCase("id-03"))
			.forEach(p -> {
				System.out.println(p.toString());
			});
		
		System.out.println("");
		System.out.println("Product List: (forEach) - with AND (&&) condition");
		products.stream()
			.filter(p -> p.getPrice() > 1500 && p.getPrice() < 4000)
			.forEach(p -> {
				System.out.println(p.toString());
			});
	}

}
