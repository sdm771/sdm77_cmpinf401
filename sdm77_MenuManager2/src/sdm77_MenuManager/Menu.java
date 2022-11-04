package sdm77_MenuManager;
/**
 * Class Menu
 * @author Stacey May 
 * Created: 10/11/2022
 *
 */
public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	public Menu(String name) {
		this.name = name;
	}
	
	public Menu(String name, Entree entree,Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		
	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	/**
	 * Method totalCalories
	 * @return sum of calories in menu
	 */
	
	public int totalCalories() {
		int total = 0;
		if (entree!=null) {
			total+=entree.getCalories();
		}
		if (side!=null) {
			total+=side.getCalories();
		}
		if (salad!=null) {
			total+=salad.getCalories();
		}
		if (dessert!=null) {
			total+=dessert.getCalories();
		}
		return total;
	}
	/**
	 * Method description
	 * @return descriptions of the menu
	 */
	
	public String description() {
		String menuTitle="";
		String entreeDesc="";
		String sideDesc="";
		String saladDesc="";
		String dessertDesc="";
		
		if(name!=null) {
			menuTitle=name + "\n";
		}
		
		if(entree==null) {
			entreeDesc="Entree: N/A" + "\n";
		}
		else {
			entreeDesc="Entree: "+entree.getName()+"."+ " " + entree.getDescription()+". "+ entree.getCalories()+"\n";
		}
		if(side==null) {
			sideDesc="Side: N/A" + "\n";
		}
		else {
			sideDesc="Side: "+side.getName()+"."+ " "+ side.getDescription()+". " + side.getCalories()+"\n";
		}
		if(salad==null) {
			saladDesc="Salad: N/A" + "\n";
		}
		else {
			saladDesc="Salad: "+salad.getName()+"."+ " " +salad.getDescription()+". "+ salad.getCalories()+"\n";
		}
		if(dessert==null) {
			dessertDesc="Dessert: N/A" + "\n";
		}
		else {
			dessertDesc="Dessert: "+dessert.getName()+"."+ " " +dessert.getDescription()+". "+ dessert.getCalories() +"\n";
		}
		return menuTitle +entreeDesc + sideDesc + saladDesc + dessertDesc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	
}
