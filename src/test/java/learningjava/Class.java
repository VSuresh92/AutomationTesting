package learningjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicate();
	}

	public static void findDuplicate() {
		int i = 1;
		String str = "HEXAWARE";
		char[] ch = str.toCharArray();

		Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();
		// Map<Character, Integer> obj = new HashMap<Character,Integer>();
		// Map<Character, Integer> obj = new TreeMap<Character,Integer>();

		for (char c : ch) {
			if (obj.containsKey(c)) {
				obj.put(c, obj.get(c) + 1);
				// obj.put(c, i+1);
			} else {
				obj.put(c, 1);
			}
		}
		System.out.println(obj);

	}

}
