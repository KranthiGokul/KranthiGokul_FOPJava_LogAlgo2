package Currency_Denominations;

public class NoteCount {
	public void counting(int[] currency, int amount) {
		int[] notes = new int[currency.length];
		int sum = 0;
		for (int i = 0; i < currency.length; i++) {
			notes[i] = amount / currency[i];
			amount %= currency[i];
			sum += notes[i];
		}
		for (int i = 0; i < currency.length; i++) {
			System.out.println(notes[i] + " X " + currency[i]);
		}
		System.out.println("TOtal number on notes: " + sum);
	}

}
