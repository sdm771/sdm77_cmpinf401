package sdm77_MenuManager;

import java.util.ArrayList;
/**
 * Class MenuRandomize
 * @author Stacey May 
 * @created: 11/1/2022
 *
 */

public class MenuRandomize {
	private ArrayList<Entree>entrees = new ArrayList<Entree>();
	private ArrayList<Side>sides = new ArrayList<Side>();
	private ArrayList<Salad>salads = new ArrayList<Salad>();
	private ArrayList<Dessert>desserts = new ArrayList<Dessert>();
	
	public MenuRandomize(String entreeFile,String sideFile,String saladFile,String dessertFile) {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	/**
	 * Method randomMenu
	 * @return a Menu object of random dishes
	 */
	
	public Menu randomMenu() {
		Menu randomMenu = new Menu("Menu");
		randomMenu.setEntree(entrees.get( (int) (entrees.size() * Math.random() )));
		randomMenu.setSide(sides.get( (int) (sides.size() * Math.random() )));
		randomMenu.setSalad(salads.get( (int) (salads.size() * Math.random() )));
		randomMenu.setDessert(desserts.get( (int) (desserts.size() * Math.random() )));
		return randomMenu;
	}
}
