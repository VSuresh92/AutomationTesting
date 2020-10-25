package learningjava;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class InterviewQuestions {

	@Test
	public void triggerTest() {
		// getLongestSubstring();
		// numberDivisibleBy(50);
		numberMultipleBy(20);
	}

	// Get the length of longest substring and print that substring
	public int getLongestSubstring() {

		String input = "abbabcdebabcedfb";
		int start = 0;
		int end = 0;
		String output = "";
		int ln = input.length();
		int ans = 0;
		for (int i = 0; i < ln; i++) {
			for (int j = i; j < ln; j++) {
				if (allUnique(input, i, j)) {
					ans = Math.max(ans, j - i);
					start = i;
					end = j;

				}

			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end);
			}

		}
		System.out.println(ans);
		System.out.println(output);
		return ans;

	}

	public boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return true;
	}

	// Print number divisible by 3 & 5
	public void numberDivisibleBy(int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println("Number divisible by 3 " + i);
			}
			if (i % 5 == 0) {
				System.out.println("Number divisible by 5 " + i);
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number divisible by 3 & 5 " + i);

			}
		}

	}

	// Print number multiple by 3 & 5
	public void numberMultipleBy(int n) {

		int three = 3;
		int five = 5;
		for (int i = 1; i <= n; i++) {

			if (i == three) {
				three = three + 3;
				System.out.println("\"Number Multiple of #3 " + i);
			}
			if (i == five) {
				five = five + 5;
				System.out.println("\"Number Multiple of #5 " + i);
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Number Multiple of #3 & #5 " + i);
			}

		}

	}

}
