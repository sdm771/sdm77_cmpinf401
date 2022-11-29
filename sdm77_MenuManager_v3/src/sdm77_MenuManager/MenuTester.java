package sdm77_MenuManager;

import java.util.ArrayList;

/**
 * Class MenuTest
 * @author Stacey May 
 * @created: 11/1/2022
 *
 */
public class MenuTester{
	public static void main(String[] args){
		String fileName="data/dishes.txt";
		FileManager.readItems(fileName);
		/*String fileName = "data/dishes.txt";
		writeMenus(fileName,);
		/*MenuRandomize randomize = new MenuRandomize("data/dishes.txt");
		MenuManager randomMenu = new MenuRandomize("data/dishes.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories"+myMenu.totalCalories());*/
	}
}

