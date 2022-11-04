package sdm77_MenuManager;

import java.io.BufferedReader;
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
	final static String SPLIT="@@";
	/**
	 * Method readEntrees
	 * @param fileName a String
	 * @return an ArrayList of entrees from a file
	 */
	
	public static ArrayList<Entree>readEntrees(String fileName){
		ArrayList<Entree>entrees = new ArrayList<Entree>();
		int index = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int firstBreak = line.indexOf(SPLIT);
				int secondBreak = line.indexOf(SPLIT,firstBreak +1);
				String entreeAdd=line.substring(0, firstBreak)+line.substring(firstBreak+2, secondBreak);
				//entrees.add(index, entreeAdd);
				index++;
			}
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return entrees;
	}
	/**
	 * Method readSides
	 * @param fileName a String
	 * @return an ArrayList of sides from a file
	 */
	
	public static ArrayList<Side>readSides(String fileName){
		ArrayList<Side>sides = new ArrayList<Side>();
		int index = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int firstBreak = line.indexOf(SPLIT);
				int secondBreak = line.indexOf(SPLIT,firstBreak +1);
				String sideAdd=line.substring(0, firstBreak)+line.substring(firstBreak+2, secondBreak);
				//sides.add(index, sideAdd);
				index++;
			}
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return sides;
	}
	/**
	 * Method readSalads
	 * @param fileName a String
	 * @return an ArrayList of salads from a file
	 */
	
	public static ArrayList<Salad>readSalads(String fileName){
		ArrayList<Salad>salads = new ArrayList<Salad>();
		int index = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int firstBreak = line.indexOf(SPLIT);
				int secondBreak = line.indexOf(SPLIT,firstBreak +1);
				String saladAdd=line.substring(0, firstBreak)+line.substring(firstBreak+2, secondBreak);
				//salads.add(index, saladAdd);
				index++;
			}
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return salads;
	}
	/**
	 * Method readDesserts
	 * @param fileName a String
	 * @return an ArrayList of desserts from a file
	 */
	
	public static ArrayList<Dessert>readDesserts(String fileName){
		ArrayList<Dessert>desserts = new ArrayList<Dessert>();
		int index = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine())!=null) {
				int firstBreak = line.indexOf(SPLIT);
				int secondBreak = line.indexOf(SPLIT,firstBreak +1);
				String dessertAdd=line.substring(0, firstBreak)+line.substring(firstBreak+2, secondBreak);
				//desserts.add(index, dessertAdd);
				index++;
			}
			br.close();
			fr.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return desserts;
	}
}
