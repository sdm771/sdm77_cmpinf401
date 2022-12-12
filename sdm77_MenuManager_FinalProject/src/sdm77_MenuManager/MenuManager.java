package sdm77_MenuManager;
import java.util.ArrayList;
import java.util.Random;
/**
 * Class MenuManager
 * @author Stacey May 
 * Created: 11/17/2022
 */
public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	/**
	 * Class Constructor MenuManager
	 * @param dishesFile as a String
	 */

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem>menuItems=FileManager.readItems(dishesFile);
		for(int i =0;i<menuItems.size();i++) {
			if(menuItems.get(i) instanceof Entree) {
				entrees.add((Entree)menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Side) {
				sides.add((Side)menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Salad) {
				salads.add((Salad)menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Dessert) {
				desserts.add((Dessert)menuItems.get(i));
			}
		}

	}
	
	/**
	 * Method randomMenu
	 * @param name as a String
	 * @return a new menu object
	 */
	
	public Menu randomMenu(String name) {
		Random rand = new Random();
		Entree entree = entrees.get(rand.nextInt(entrees.size()));
		Side side = sides.get(rand.nextInt(sides.size()));
		Salad salad = salads.get(rand.nextInt(salads.size()));
		Dessert dessert = desserts.get(rand.nextInt(desserts.size()));
		
		Menu randomizedMenu = new Menu(name,entree,side,salad,dessert);
		return randomizedMenu;
	}
	

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}
