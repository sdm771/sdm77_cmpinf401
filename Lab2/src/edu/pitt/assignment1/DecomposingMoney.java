package edu.pitt.assignment1;
import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		String inputAmt = JOptionPane.showInputDialog("Enter an amount fom 1 dollar to 9999 dollars: ");
		int amt = Integer.parseInt(inputAmt);
		int grands = amt / 1000;
		int grandsRem = amt % 1000;
		int bens = grandsRem / 100;
		int bensRem = grandsRem % 100;
		int saw = bensRem /10;
		int dollars = bensRem % 10;
		
		JOptionPane.showMessageDialog(null, grands + " Grands" + "\n" + bens + " Benjamins" + "\n" + 
		saw + " Sawbucks" + "\n" + dollars + " Dollars");
	}
}
