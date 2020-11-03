package JavaSessions;

public class Exercise {

	public static void main(String[] args) {
		// toMakeFirstLetterAsCaps();
		// sortingArrays();
		printDuplicates();
	}

	public static void toMakeFirstLetterAsCaps() {

		String str = "LOtUS iS a FloWeR";
		String finalValue;
		String strSplit[] = str.split(" ");

		for (int i = 0; i < strSplit.length; i++) {

			finalValue = strSplit[i].substring(0, 1).toUpperCase()
					+ strSplit[i].substring(1, strSplit[i].length()).toLowerCase();
			;
			System.out.println(finalValue);

		}

	}

	public static void sortingArrays() {

		int value[] = new int[10];
		// Printing numbers in Ascending Order
		for (int i = 0; i < value.length; i++) {
			value[i] = i + 1;
			System.out.println(value[i]);
		}
		// Printing numbers in Descending Order
		for (int i = value.length - 1; i >= 0; i--) {
			value[i] = i + 1;
			System.out.println(value[i]);
		}

	}

	public static void printDuplicates() {
		String s = "SURESH";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate Value is " + ch[i]);
				}
			}

		}
	}

}
