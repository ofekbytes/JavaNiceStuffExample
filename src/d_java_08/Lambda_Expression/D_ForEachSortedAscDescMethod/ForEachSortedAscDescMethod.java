/**
 * 
 */
package d_java_08.Lambda_Expression.D_ForEachSortedAscDescMethod;

import java.util.ArrayList;
import java.util.List;


public class ForEachSortedAscDescMethod {

	// constructor
	public ForEachSortedAscDescMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		System.out.println("<1> Product List <'price'> - sorted - Ascending Order (a...z) ");

		products.stream()
			.sorted((first , last) -> (int) (first.getPrice() - last.getPrice()))
			.forEach(p -> {
				System.out.println(p.toString());
			});
		
		System.out.println("\n<2> Product List <'price'> - sorted - Descending Order (z...a) ");
		products.stream()
			.sorted((first , last) -> (int) (last.getPrice() - first.getPrice()))
			.forEach(p -> {
				System.out.println(p.toString());
			});
	}

}
