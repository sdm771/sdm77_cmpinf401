
public class Task3 {
	public static void main (String[] args) {
		int a[] = {1, 2, 3};
		printCombos(a, "", 0, 2);
		System.out.println("-----------------");
		int b[] = {2, 3, 7, 8, 9};
		printCombos(b, "", 0, 3);
	}
	//Task 3
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if(k == 0) {
			System.out.println(out);
			return;
		}
		else {
			for(int i = startIndex; i<=a.length-k; i++) {
				out += a[i] + " ";
				printCombos(a,out,i+1,k-1);
				out = out.substring(0,out.length()-2);
			}
		}
	}
}
