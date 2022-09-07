package edu.pitt.assignment1;

import javax.swing.JOptionPane;
import java.lang.Math.*;

public class AreaPerimeter {

	public static void main(String[] args) {
		String inputRadius = JOptionPane.showInputDialog("Enter the size of the radius: ");
		double radius = Double.parseDouble(inputRadius);
		double areaR = Math.PI * Math.pow(radius, 2);
		double perimeterR = 2 * Math.PI * radius;
		double x = areaR * 100;
		double num = Math.round (Math.round(x));
		double area = num /100;
		double y = perimeterR * 100;
		double num2 = Math.round (Math.round(y));
		double perimeter = num2/100;
		JOptionPane.showMessageDialog(null, "The circle with a radius of " + radius + " has an area of " + area + " and a perimeter of " + perimeter + ".");
	}

}
