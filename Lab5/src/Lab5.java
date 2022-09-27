import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Random randomRoll = new Random();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter the number of rolls desired:");
			int inputRolls = input.nextInt();
			RollDice(inputRolls, randomRoll);
			System.out.println("Do you want to contine? Please enter yes if so.");
			
			Scanner input2 = new Scanner(System.in);
			String inputAnswer = input2.nextLine();
			
			if(inputAnswer.equalsIgnoreCase("yes")) {
				continue;
			}
			else {
				break;
			}	
		}
	}
	
	public static void RollDice(int numRolls, Random randomRoll) {
		int dice1;
		int dice2;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;
		
		for(int i=0;i<numRolls;i++) {
			dice1=randomRoll.nextInt(6)+1;
			dice2=randomRoll.nextInt(6)+1;
			if (dice1 + dice2 == 2) {
				count2++;
			}
			else if (dice1 + dice2 ==3) {
				count3++;
			}
			else if (dice1 + dice2 ==4) {
				count4++;
			}
			else if (dice1 + dice2 ==5) {
				count5++;
			}
			else if (dice1 + dice2 ==6) {
				count6++;
			}
			else if (dice1 + dice2 ==7) {
				count7++;
			}
			else if (dice1 + dice2 ==8) {
				count8++;
			}
			else if (dice1 + dice2 ==9) {
				count9++;
			}	
			else if (dice1 + dice2 ==10) {
				count10++;
			}
			else if (dice1 + dice2 ==11) {
				count11++;
			}
			else if (dice1 + dice2 ==12) {
				count12++;
			}
	
		}
		System.out.println("Number of times 2 occurred:"+count2+" and its fraction="+count2+"/"+numRolls);
		System.out.println("Number of times 3 occurred:"+count3+" and its fraction="+count3+"/"+numRolls);
		System.out.println("Number of times 4 occurred:"+count4+" and its fraction="+count4+"/"+numRolls);
		System.out.println("Number of times 5 occurred:"+count5+" and its fraction="+count5+"/"+numRolls);
		System.out.println("Number of times 6 occurred:"+count6+" and its fraction="+count6+"/"+numRolls);
		System.out.println("Number of times 7 occurred:"+count7+" and its fraction="+count7+"/"+numRolls);
		System.out.println("Number of times 8 occurred:"+count8+" and its fraction="+count8+"/"+numRolls);
		System.out.println("Number of times 9 occurred:"+count9+" and its fraction="+count9+"/"+numRolls);
		System.out.println("Number of times 10 occurred:"+count10+" and its fraction="+count10+"/"+numRolls);
		System.out.println("Number of times 11 occurred:"+count11+" and its fraction="+count11+"/"+numRolls);
		System.out.println("Number of times 12 occurred:"+count12+" and its fraction="+count12+"/"+numRolls);
		
	}

}
