package sdm77_MenuManager;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class FileManger
 * @author Stacey May 
 * @created: 11/1/2022
 *
 */
public class FileManager {
	String fileName = "data/dishes.txt";
	final static String SPLIT="@@";
	/**
	 * Method readItems
	 * @param fileName a String
	 * @return an ArrayList of menu items from a file
	 */

	public static ArrayList<MenuItem>readItems(String fileName){
		ArrayList<String> dishes = new ArrayList<String>();
		ArrayList<MenuItem>menuItems = new ArrayList<MenuItem>();
		String line = null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine())!=null) {
				dishes.add(line);
			}
			for(String lines:dishes) {
				String[]marker = lines.split("@@");
				if(marker[1].equalsIgnoreCase("entree")) {
					Entree entree = new Entree(marker[0],marker[2],Integer.valueOf(marker[3]),Double.valueOf(marker[4]));
					menuItems.add(entree);
				}
				else if (marker[1].equalsIgnoreCase("side")) {
					Side side = new Side(marker[0],marker[2],Integer.valueOf(marker[3]),Double.valueOf(marker[4]));
					menuItems.add(side);
				}
				else if (marker[1].equalsIgnoreCase("salad")) {
					Salad salad = new Salad(marker[0],marker[2],Integer.valueOf(marker[3]),Double.valueOf(marker[4]));
					menuItems.add(salad);
				}
				else if(marker[1].equalsIgnoreCase("dessert")) {
					Dessert des = new Dessert(marker[0],marker[2],Integer.valueOf(marker[3]),Double.valueOf(marker[4]));
					menuItems.add(des);
				}
			}
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return menuItems;
	}
	/**
	 * Method writeMenu
	 * @param fileName as a String 
	 * @param menus as an ArrayList
	 */
	public static void writeMenus(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw =  new BufferedWriter(fw);
			for (int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).description()+"\n"+
						"Calorie Total: "+menus.get(i).totalCalories()+"\n"+
						"Total price: "+menus.get(i).totalPrice()+"\n");
				bw.newLine();
			}
			bw.close();
			fw.close();	
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
