
public class PrintArrayElements {
	public static void main (String[] args) {
		int[] test = {7,8,9,13,6,8,10};
		printArrayElements(test,7);
	}
	//Task 2
	public static void printArrayElements(int a[],int index) {
		if(index == 1) {
			System.out.println(a[index-1]);
		}
		else {
			printArrayElements(a,index -1);
			System.out.println(a[index-1]);
		}
	}
}
