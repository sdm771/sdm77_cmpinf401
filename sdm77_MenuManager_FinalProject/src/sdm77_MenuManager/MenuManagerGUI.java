package sdm77_MenuManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 * Class MenuManagerGUI
 * @author Stacey May
 * Created 12/10/2022
 */

public class MenuManagerGUI {
	private JFrame mainWindow, childWindow;
	private JPanel pnlBuildMenu, pnlGenerateMenu, pnlCreatedMenus;
	private JComboBox cboEntree, cboSide, cboSalad, cboDessert;
	private JLabel lblEntree, lblSide, lblSalad, lblDessert, lblChildEntree, lblChildSide,lblChildSalad,lblChildDessert, lblTotCals,lblTotPrice;
	private JButton btnCreateMenu, btnGenRandomMenu, btnDetails, btnDeleteAll, btnSaveToFile;
	private JList<String> menusCreated;
	private JTextArea txtEntree, txtSide,txtSalad,txtDessert;
	private JTextField txtCalories, txtPrice;
	private DefaultListModel<String> defaultList = new DefaultListModel<>();
	private ArrayList<Menu> menus = new ArrayList<Menu>();

	public static void main(String[] args) {
		MenuManagerGUI menugui = new MenuManagerGUI();
	}
	/**
	 * Class Constructor MenuManagerGUI
	 * Creates a MenuManger Object and loads data from the dishes file
	 * Initializes and places all graphic components 
	 * Loads ArrayLists of MenuManager objects into the respective comboboxes
	 */
	public MenuManagerGUI() {
		MenuManager menuman = new MenuManager ("data/dishes.txt");

		//creating main window
		this.mainWindow = new JFrame("Menu Manager");
		mainWindow.setBounds(100, 100, 800, 450);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.getContentPane().setLayout(null);

		//Build your own menu panel
		pnlBuildMenu = new JPanel();
		pnlBuildMenu.setLayout(null);
		pnlBuildMenu.setBorder(BorderFactory.createTitledBorder("Build your own Menu"));
		pnlBuildMenu.setBounds(10, 10, mainWindow.getWidth()/2-10, 300);
		mainWindow.getContentPane().add(pnlBuildMenu);
		//adding labels
		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(60,35,60,30);
		this.pnlBuildMenu.add(lblEntree);
		lblSide = new JLabel("Side");
		lblSide.setBounds(60,85,60,30);
		this.pnlBuildMenu.add(lblSide);
		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(60,135,60,30);
		this.pnlBuildMenu.add(lblSalad);
		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(60, 190, 60, 30);
		this.pnlBuildMenu.add(lblDessert);
		//button for creating menu
		btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.setBounds(60, 240, 270, 40);
		btnCreateMenu.setBorder(new LineBorder(Color.DARK_GRAY));
		/**
		 * btnCreateMenu when clicked on takes the selected elements from the comboboxes and ads them to the Jlist on the right side
		 */
		btnCreateMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputMenuName = JOptionPane.showInputDialog("Please input a name for the created menu.");
				if (inputMenuName == null) {
					JOptionPane.showMessageDialog(null, "A name for the menu is required.");
					return;
				}
				Entree entree = (Entree)cboEntree.getSelectedItem();
				Side side=(Side)cboSide.getSelectedItem();
				Salad salad = (Salad)cboSalad.getSelectedItem();
				Dessert dessert = (Dessert)cboDessert.getSelectedItem();
				Menu menu = new Menu(inputMenuName,entree,side,salad,dessert);
				menus.add(menu);
				defaultList.addElement(menu.getName());
				menusCreated.setModel(defaultList);
			}
		});
		this.pnlBuildMenu.add(btnCreateMenu);
		//adding combo boxes
		cboEntree = new JComboBox(menuman.getEntrees().toArray());
		cboEntree.setBounds(125, 35, 200, 50);
		this.pnlBuildMenu.add(cboEntree);
		cboSide = new JComboBox(menuman.getSides().toArray());
		cboSide.setBounds(125, 85, 200, 50);
		this.pnlBuildMenu.add(cboSide);
		cboSalad = new JComboBox(menuman.getSalads().toArray());
		cboSalad.setBounds(125, 135, 200, 50);
		this.pnlBuildMenu.add(cboSalad);
		cboDessert = new JComboBox(menuman.getDesserts().toArray());
		cboDessert.setBounds(125, 185, 200, 50);
		this.pnlBuildMenu.add(cboDessert);
		
		//generate a menu panel
		pnlGenerateMenu =  new JPanel();
		pnlGenerateMenu.setLayout(null);
		pnlGenerateMenu.setBorder(BorderFactory.createTitledBorder("Or generate a Menu"));
		pnlGenerateMenu.setBounds(10, 310, mainWindow.getWidth()/2-10, 100);
		mainWindow.getContentPane().add(pnlGenerateMenu);
		//button for generating a random menu 
		btnGenRandomMenu = new JButton("Generate a Random Menu");
		btnGenRandomMenu.setBounds(60, 38, 270, 40);
		btnGenRandomMenu.setBorder(new LineBorder(Color.DARK_GRAY));
		this.pnlGenerateMenu.add(btnGenRandomMenu);
		/**
		 * btnGenRandomMenu asks for users input of the name of the menu 
		 * Uses randomMenu to generate a random menu generated in the JList on the right side
		 */
		btnGenRandomMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputMenuNameRand = JOptionPane.showInputDialog("Please input a name for the random menu.");
				if (inputMenuNameRand == null) {
					JOptionPane.showMessageDialog(null, "A name for the menu is required.");
					return;
				}
				Menu menu = menuman.randomMenu(inputMenuNameRand);
				menus.add(menu);
				defaultList.addElement(menu.getName());
				menusCreated.setModel(defaultList);
			}
		});
		//created menus panel
		pnlCreatedMenus =  new JPanel();
		pnlCreatedMenus.setLayout(null);
		pnlCreatedMenus.setBorder(BorderFactory.createTitledBorder("Created Menus:"));
		pnlCreatedMenus.setBounds(pnlBuildMenu.getWidth()+20, 10,mainWindow.getWidth()/2-20, 400);
		mainWindow.getContentPane().add(pnlCreatedMenus);
		//creating buttons 
		btnDetails = new JButton("Details");
		btnDetails.setBounds(20, 338, 100, 40);
		btnDetails.setBorder(new LineBorder(Color.DARK_GRAY));
		this.pnlCreatedMenus.add(btnDetails);
		/**
		 * btnDetails displays a secondary window contains the details of the menu selected
		 */
		btnDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = menusCreated.getSelectedIndex();
				if (index == -1) {
					JOptionPane.showMessageDialog(null, "Please select a menu to see its detials.");
				}
				Menu selectedMenu = menus.get(index);
				createChildWindow(selectedMenu);
			}
		});

		btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.setBounds(140, 338, 100, 40);
		btnDeleteAll.setBorder(new LineBorder(Color.RED));
		this.pnlCreatedMenus.add(btnDeleteAll);
		/**
		 * btnDeleteAll removes all of the menu elements from the list on the right
		 */
		btnDeleteAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				defaultList.removeAllElements();
				JOptionPane.showMessageDialog(null, "All Menus are deleted."+"\n"+ "To exit hit the red button in the left corner or continue to make new menus!");
			}
		});
		btnSaveToFile = new JButton("Save to file");
		btnSaveToFile.setBounds(260, 338,100, 40);
		btnSaveToFile.setBorder(new LineBorder(Color.GREEN));
		this.pnlCreatedMenus.add(btnSaveToFile);
		/**
		 * btnSaveToFile writes to a file with all of created menus in the list
		 */
		btnSaveToFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenus("data/menus.txt", menus);
				JOptionPane.showMessageDialog(null, "The menus created are saves in the menus.txt file."+"\n"+ "To Exit hit the red arrow or you may continue to create more menus!");
				defaultList.removeAllElements();
			}
		});
		//adding Jlist area
		menusCreated = new JList(defaultList);
		menusCreated.setBounds(20, 30, 340, 300);
		menusCreated.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		menusCreated.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		menusCreated.setVisibleRowCount(12);
		this.pnlCreatedMenus.add(menusCreated);

		mainWindow.setVisible(true);
	}
	/**
	 * Method createChildWindow
	 * @param menu
	 * Takes the menu selected and displays the details on a secondary window 
	 */
	private void createChildWindow(Menu menu) {
		childWindow = new JFrame("Menu: " +menu.getName());
		childWindow.setBounds(100, 100, 800, 450);
		childWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		childWindow.getContentPane().setLayout(null);

		//creating labels
		lblChildEntree = new JLabel("Entree");
		lblChildEntree.setBounds(40,10,60,30);
		childWindow.getContentPane().add(lblChildEntree);
		lblChildSide = new JLabel("Side");
		lblChildSide.setBounds(40,110,60,30);
		childWindow.getContentPane().add(lblChildSide);
		lblChildSalad = new JLabel("Salad");
		lblChildSalad.setBounds(40,190,60,30);
		childWindow.getContentPane().add(lblChildSalad);
		lblChildDessert = new JLabel("Dessert");
		lblChildDessert.setBounds(40,270,60,30);
		childWindow.getContentPane().add(lblChildDessert);
		lblTotCals = new JLabel("Total Calories");
		lblTotCals.setBounds(40,340,150,30);
		childWindow.getContentPane().add(lblTotCals);
		lblTotPrice = new JLabel("Total Price:  $");
		lblTotPrice.setBounds(40,380,150,30);
		childWindow.getContentPane().add(lblTotPrice);
		//Creating text areas & adding the content
		txtEntree = new JTextArea();
		String entreedesc= menu.getEntree().getName()+"\n"
				+menu.getEntree().getDescription()
				+"\n"+ "Calories: "+menu.getEntree().getCalories()+
				"\n"+"Price: $ "+menu.getEntree().getPrice();
		txtEntree = new JTextArea(entreedesc);
		txtEntree.setBounds(100, 10, 650, 85);
		txtEntree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtEntree.setLineWrap(true);
		txtEntree.setWrapStyleWord(true);
		txtEntree.setEditable(false);
		childWindow.getContentPane().add(txtEntree);
		txtSide = new JTextArea();
		String sidedesc= menu.getSide().getName()+"\n"
				+menu.getSide().getDescription()
				+"\n"+ "Calories: "+menu.getSide().getCalories()+
				"\n"+"Price: $ "+menu.getSide().getPrice();
		txtSide = new JTextArea(sidedesc);
		txtSide.setBounds(100, 110, 650, 65);
		txtSide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtSide.setLineWrap(true);
		txtSide.setWrapStyleWord(true);
		txtSide.setEditable(false);
		childWindow.getContentPane().add(txtSide);
		txtSalad = new JTextArea();
		String saladdesc= menu.getSalad().getName()+"\n"
				+menu.getSalad().getDescription()
				+"\n"+ "Calories: "+menu.getSalad().getCalories()+
				"\n"+"Price: $ "+menu.getSalad().getPrice();
		txtSalad = new JTextArea(saladdesc);
		txtSalad.setBounds(100, 190, 650, 65);
		txtSalad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtSalad.setLineWrap(true);
		txtSalad.setWrapStyleWord(true);
		txtSalad.setEditable(false);
		childWindow.getContentPane().add(txtSalad);
		txtDessert = new JTextArea();
		String desdesc= menu.getDessert().getName()+"\n"
				+menu.getDessert().getDescription()
				+"\n"+ "Calories: "+menu.getDessert().getCalories()+
				"\n"+"Price: $ "+menu.getDessert().getPrice();
		txtDessert= new JTextArea(desdesc);
		txtDessert.setBounds(100, 270, 650, 65);
		txtDessert.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtDessert.setLineWrap(true);
		txtDessert.setWrapStyleWord(true);
		txtDessert.setEditable(false);
		childWindow.getContentPane().add(txtDessert);
		txtCalories = new JTextField();
		String totcalories = String.valueOf(menu.totalCalories());
		txtCalories = new JTextField(totcalories);
		txtCalories.setBounds(160, 340, 110, 30);
		txtCalories.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtCalories.setEditable(false);
		childWindow.getContentPane().add(txtCalories);
		txtPrice = new JTextField();
		String totprice = String.valueOf(menu.totalPrice());
		txtPrice = new JTextField(totprice);
		txtPrice.setBounds(160, 380, 110, 30);
		txtPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		txtPrice.setEditable(false);
		childWindow.getContentPane().add(txtPrice);


		childWindow.setVisible(true);
	}
}
