/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.D_ForEachSortedAscDescMethod;

import java.util.ArrayList;
import java.util.List;

import zzzz_Java_8.Lambda_Expression.A_ForEachMethod.Product;

public class ForEachSortedAscDescMethod {

	// constructor
	public ForEachSortedAscDescMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		System.out.println("Product List - sorted - Ascending Order (a...z) ");

		products.stream()
			.sorted((p1 , p2) -> (int) (p1.getPrice() - p2.getPrice()))
			.forEach(p -> {
				System.out.println(p.toString());
			});
		
		System.out.println("\nProduct List - sorted - Descending Order (z...a) ");
		products.stream()
			.sorted((p1 , p2) -> (int) (p2.getPrice() - p1.getPrice()))
			.forEach(p -> {
				System.out.println(p.toString());
			});
	}

}
