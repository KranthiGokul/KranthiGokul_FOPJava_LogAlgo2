package Currency_Denominations;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numberOfNotes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number on notes in your country: ");
		numberOfNotes = sc.nextInt();
		int[] currency = new int[numberOfNotes];
		System.out.println("Enter the " + numberOfNotes + " denomination values.");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
		System.out.println("Before sorting " + Arrays.toString(currency));
		MergeSort ms = new MergeSort();
		ms.sort(currency, 0, currency.length - 1);
		System.out.println("After sorting " + Arrays.toString(currency));
		System.out.println("Please enter the amount to be exchanged: ");
		int amount = sc.nextInt();
		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);
	}

}
