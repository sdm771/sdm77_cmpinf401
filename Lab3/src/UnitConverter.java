import javax.swing.JOptionPane;
public class UnitConverter {

	public static void main(String[] args) {
		String cm = "cm";
		String in = "in";
		String yd = "yd";
		String m = "m";
		String oz ="oz";
		String gm = "gm";
		String lb ="lb";
		String kg = "kg";
		String userInput = JOptionPane.showInputDialog("Please enter a distance or weight amount (number amount followed by a unit of measure): ");
		int lengthDouble=userInput.length();
		int lenOfSpace;
		lenOfSpace=userInput.indexOf(" ");
		String number= userInput.substring(0,lenOfSpace);
		String unit = userInput.substring(lenOfSpace +1,lengthDouble);
		double num = Double.parseDouble(number);
		//gets the number and unit separated into a double and a string 
		
		if (unit.equals(cm)){
			double convertToIn =num / 2.54;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToIn + " " + in);
		}
		else if (unit.equals(in)) {
			double convertToCm =num * 2.54;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToCm + " " + cm);
		}
		else if (unit.equals(yd)) {
			double convertToM =num / 1.094;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToM + " " + m);
		}
		else if (unit.equals(m)) {
			double convertToYd =num * 1.094;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToYd + " " + yd);
		}
		else if (unit.equals(oz)) {
			double convertToGm =num * 28.35;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToGm + " " + gm);
		}
		else if (unit.equals(gm)) {
			double convertToOz =num / 28.35;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToOz + " " + oz);
		}
		else if (unit.equals(lb)) {
			double convertToKg =num / 2.205;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToKg + " " + kg);
		}
		else if (unit.equals(kg)) {
			double convertToLb =num * 2.205;
			JOptionPane.showMessageDialog(null, userInput + " = " + convertToLb + " " + lb);
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter a new distance or weight amount.");
		}
			
	}
	
}
