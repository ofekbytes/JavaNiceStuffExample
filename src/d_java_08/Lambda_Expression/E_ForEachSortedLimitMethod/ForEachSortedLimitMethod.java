/**
 * 
 */
package d_java_08.Lambda_Expression.E_ForEachSortedLimitMethod;

import java.util.ArrayList;
import java.util.List;


public class ForEachSortedLimitMethod {

	// constructor
	public ForEachSortedLimitMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton"));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton"));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia"));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung"));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell"));
		
		System.out.println("<1> Product List <'model'> - sorted - Ascending Order (a...z) and limited to 2 records");

		products.stream()
			.sorted((first , last) -> (int) (first.getModel() - last.getModel()))
			.limit(2)
			.forEach(p -> {
				System.out.println(p.toString());
			});
		
		System.out.println("\n<2> Product List <'model'> - sorted - Descending Order (z...a) and limited to 3 records");
		products.stream()
			.sorted((first , last) -> (int) (last.getModel() - first.getModel()))
			.limit(3)
			.forEach(p -> {
				System.out.println(p.toString());
			});
	}

}
