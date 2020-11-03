package learningjava;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Freshworks extends ParentClass {

	// Object instance creation

	// Can create instance of child class using parent class

	// ParentClass obj = new ParentClass();
	// ParentClass obj1 = new Freshworks();

	// Cannot create instance of parent class using child class

	// Freshworks obj3 = new ParentClass();

	/* This function is used to check whether the strings are ANAGRAM or not */

	public boolean isStringAnagram(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < s1.length(); i++) {
			if (c1[i] != c2[i]) {
				System.out.println("Character not matched: " + c1[i] + " " + c2[i]);
				return false;
			} else
				System.out.println("Character matched: " + c1[i] + " " + c2[i]);

		}
		return true;
	}

	public void checkAnagramString(String s1, String s2) {

		if (isStringAnagram(s1, s2)) {
			System.out.println("Given Strings are Anagram");
		} else {
			System.out.println("Given Strings are not Anagram");
		}

	}

	/* This function is used to copy two arrays. */
	public void copyArrayValues() {

		int temp;
		int c1[] = { 1, 2, 3, 4, 5 };
		int c2[] = { 6, 7, 8, 9, 10 };

		if (c1.length == c2.length) {
			for (int i = 0; i < c1.length; i++) {
				temp = c1[i];
				c1[i] = c2[i];
				c2[i] = temp;
				System.out.println("After swap: c1 " + c1[i] + " & c2 " + c2[i] + "");
			}
		} else
			System.out.println("Array counts are not matched");
	}

	/*
	 * This function is used to sorting an array in ascending and descending order
	 * using single loop
	 */
	public void sortingArray() {

		int arr[] = { 10, 24, 15, 66, 78, 34 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}

		System.out.println("Arrays in ascending order: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}

		System.out.println("Arrays in descending order: " + Arrays.toString(arr));

	}

	public String swapStrings(String str) {
		{

			// Checking if string is null
			// or empty then return str
			if (str == null || str.isEmpty())
				return str;

			int len = str.length();

			// Creating a StringBuffer object with
			// length of the string passed as a parameter
			StringBuffer sb = new StringBuffer(len);

			// Traverse the string and append
			// the character in the StringBuffer
			// object in reverse order
			for (int i = 0; i < len - 1; i += 2) {
				sb.append(str.charAt(i + 1));
				sb.append(str.charAt(i));
			}

			// Checking if the string has
			// odd number of characters
			// then append the last character
			// into StringBuffer object
			if (len % 2 != 0) {
				sb.append(str.charAt(len - 1));
			}
			System.out.println(sb.toString());
			// Converting the StringBuffer
			// into the string and return
			return sb.toString();
		}

	}

	public void convertCharToString(char ch[]) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());
		System.out.println(Arrays.toString(ch));
		System.out.println(String.valueOf(ch));

	}

	public void stringConversion() {
		int n = 100;
		String str = "geekss@for@geekss@43@34@12";
		String s = String.valueOf(n);
		System.out.println(s);
		System.out.println(Integer.parseInt(s));

		String[] arrOfStr = str.split("@", 6);

		for (String a : arrOfStr)
			System.out.println(a);
	}

	public static boolean onlyDigits(String str) {
		// Regex to check string
		// contains only digits
		String regex = "[0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null) {
			return false;
		}

		// Find match between given string
		// and regular expression
		// using Pattern.matcher()
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}

	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter)));
	}

	public static void main(String[] args) {
		char ch[] = { 'a', 'g', 'r' };
		Freshworks fw = new Freshworks();
		// fw.checkAnagramString("SURESHH", "RESSUHU");
		// fw.copyArrayValues();
		// fw.sortingArray();
		// fw.swapStrings("Suresh");
		// fw.convertCharToString(ch);
		fw.stringConversion();

	}

}
