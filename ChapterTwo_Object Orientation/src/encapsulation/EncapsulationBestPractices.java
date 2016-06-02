package encapsulation;

/**
 * 
 * Keep instance variables protected (with an access modifier, often private).<br>
 * 
 * Make public accessor methods, and force calling code to use those methods
 * rather than directly accessing the instance variable. These so-called
 * accessor methods allow users of your class to set a variable’s value or get a
 * variable’s value.<br>
 * 
 * For these accessor methods, use the most common naming convention of
 * set<someProperty> and get<someProperty>.
 * 
 */
public class EncapsulationBestPractices {

	private String size;

	private String name;

	private String color;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
