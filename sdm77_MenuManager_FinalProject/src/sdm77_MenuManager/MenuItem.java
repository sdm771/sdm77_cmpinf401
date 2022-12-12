package sdm77_MenuManager;
/**
 * Class Menu Item
 * @author Stacey May
 * Created 11/17/2022
 */
public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;
	/**
	 * Class Constructor MenuItem
	 * @param name as a String
	 * @param desc as a String
	 * @param cal as an int
	 * @param price as a double
	 */
	public MenuItem(String name, String desc, int cal, double price) {
		this.name=name;
		this.description=desc;
		this.calories=cal;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name;
	}


}
