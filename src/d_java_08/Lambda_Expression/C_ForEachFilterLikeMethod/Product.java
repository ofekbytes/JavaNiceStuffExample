package d_java_08.Lambda_Expression.C_ForEachFilterLikeMethod;

public class Product {

	private String id;
	private String name;
	private int model;
	private long price;
	private String color;
	private String manufacturer;
	
	/* 
	 * Product() constructor
	 */	
	public Product() {
	}
	
	/* 
	 * Product(...) constructor
	 */
	public Product(String id, String name, int model, long price, String color, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		this.manufacturer = manufacturer;
	}


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	/*
	 * toString() - convert local variable to String. 
	 */
	public String toString() {
		return " id:" + this.id + "," 
			+ "  name:" + this.name + ","  
			+ "  model:" + this.model + ","
			+ "  price:" + this.price  + ","
			+ "  color:" + this.color  + ","
			+ "  manufacturer:" + this.manufacturer;
	}

}
