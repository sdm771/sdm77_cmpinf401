package edu.pitt.assignment1;

import javax.swing.JOptionPane;
import java.lang.Math.*;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		String inputOne = JOptionPane.showInputDialog("Enter the size of side a: ");
		String inputTwo = JOptionPane.showInputDialog("Enter the size of side b: ");
		double sideOne = Double.parseDouble(inputOne);
		double sideTwo = Double.parseDouble(inputTwo);
		double sideThree;
		sideThree = Math.sqrt(Math.pow(sideOne, 2.0)+ Math.pow(sideTwo, 2));
		double c = sideThree * 100;
		double num = Math.round (Math.round(c));
		double hypotenuse = num /100;
		JOptionPane.showMessageDialog(null, "The Hypotenuse is " + hypotenuse );
	}
}
