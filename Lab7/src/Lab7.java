import java.util.Random;

import javax.swing.JOptionPane;

public class Lab7 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How many items are you going to enter?");
		int value = Integer.parseInt(input);
		double [] data = new double[value];
		Random randomValues= new Random();
		for(int i=0;i<value;i++) {
			data[i]=randomValues.nextDouble();
		}
		System.out.println("Array Values:");
		for(double x : data) {
			System.out.println(x + " ");
		}
		System.out.println("Maximum value of the array: " + max(data));
		System.out.println("Minimum value of the array: " + min(data));
		System.out.println("Sum of the values in the array: " + sum(data));
		System.out.println("Average of the values in the array: " + ave(data));
	}
	public static double max(double [] data ) {
		double maxValue = data[0];
		for(int i=0; i<data.length;i++) {
			if(maxValue<data[i]) {
				maxValue=data[i];
			}
		}
		return maxValue;
	}
	public static double min(double [] data ) {
		double minValue = data[0];
		for(int i=0;i<data.length;i++) {
			if(minValue>data[i]) {
				minValue=data[i];
			}
		}
		return minValue;
	}
	public static double sum(double [] data ) {
		double sum=0;
		for(int i=0;i<data.length;i++) {
			sum +=data[i];
		}
		return sum;
	}
	public static double ave(double [] data ) {
		double ave = sum(data)/data.length;
		return ave;
	}

}
