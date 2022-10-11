package sdm77_MenuManager;
/**
 * Class MenuTest
 * @author Stacey May
 * Created 10/11/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		Entree e1 = new Entree("Roasted Chicken","With Mushrooms and Parmesan Risotto",200);
		Entree e2 = new Entree("NY Strip","14oz hand-cut New York Strip",450);
		Side side1 = new Side("Parmesan Truffle Fries","Freshly grated cheese and white truffle oil", 350);
		Salad salad1 = new Salad("Caesar Salad","A staeakhouse classic",180);
		Salad salad2 = new Salad("Field Greens Salad","Butter Leaf Lettuce, Tomatoes, Vinaigrette",210);
		Dessert d1= new Dessert("Coconut Cream Pie","With house made caramel sauce and a hint of rum",400);
		
		Menu menuTestOne = new Menu("Menu Test 1",e1,salad1);
		Menu menuTestTwo = new Menu("Menu Test 2", e2,side1,salad2,d1);
		
		System.out.println(menuTestOne.Description());
		System.out.println("Total Calories: "+menuTestOne.totalCalories());
		
		System.out.println(menuTestTwo.Description());
		System.out.println("Total Calories: "+menuTestTwo.totalCalories());
		
		
	}

}
