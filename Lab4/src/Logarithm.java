import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		String inputX = JOptionPane.showInputDialog("Please enter a value for the log");
		double x = Double.parseDouble(inputX);
		int i = 0;
		
		while( x <= 0) {
			String inputX2 = JOptionPane.showInputDialog("Please enter a value greater than 0 for the log");
			x = Double.parseDouble(inputX2);
			
		}
		String inputBase = JOptionPane.showInputDialog("Please enter a value for the base");
		double baseValue = Double.parseDouble(inputBase);
		
		while(baseValue<=1) {
			String inputBase2 = JOptionPane.showInputDialog("Please enter a value greater than 1 for the base");
			baseValue = Double.parseDouble(inputBase2);
		}
		double quotient=x;
		while (quotient>=baseValue) {
			quotient=quotient/baseValue;
			i++;
		}
		JOptionPane.showMessageDialog(null,"The floor of the log with a base of " + baseValue + " and a value of " + x + " is " + i + ".");	
	}

}
