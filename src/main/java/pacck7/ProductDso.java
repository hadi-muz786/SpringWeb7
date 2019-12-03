package pacck7;

public class ProductDso {

	private String name;
	private String colour;
	private String Brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	@Override
	public String toString() {
		return "ProductDso [name=" + name + ", colour=" + colour + ", Brand=" + Brand + "]";
	}

}
