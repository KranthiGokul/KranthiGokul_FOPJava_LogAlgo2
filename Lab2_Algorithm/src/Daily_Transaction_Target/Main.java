package Daily_Transaction_Target;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numberOfTransactionDays;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of transaction days: ");
		numberOfTransactionDays = sc.nextInt();
		System.out.println("Enter the transaction value for " + numberOfTransactionDays +" days");
		int [] transactions = new int[numberOfTransactionDays];
		for(int i = 0; i < numberOfTransactionDays; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter number of targets: ");
		int targets = sc.nextInt();
		for(int i = 1; i <= targets; i++) {
			System.out.println("Please enter target " + i);
			int target = sc.nextInt();
			int flag = 0;
			int sum = 0;
			for(int j = 0;j < transactions.length; j++) {
				sum+=transactions[j];
				if(sum >= target) {
					flag = 1;
					System.out.println("Target achieved on day " + (j+1));
					break;
				}
			}
				if(flag == 0)
					System.out.println("Target not achieved");
		}
	}

}