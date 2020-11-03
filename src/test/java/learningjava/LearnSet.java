package learningjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "suresh";

		char[] ch = str.toCharArray();
		System.out.println(ch);

		// Set<Character> set=new HashSet<Character>();
		// Set<Character> set=new TreeSet<Character>();
		Set<String> set = new LinkedHashSet<String>();

		set.add("Suresh");
		set.add("Suresh");
		System.out.println(set);

		List<String> list = new LinkedList<String>();

		list.add("Suresh");
		list.add("Ajith");
		list.add("Suresh");

		List<String> list1 = new ArrayList<String>();

		list1.add("Suresh");
		list1.add("Ajith");

		/*
		 * for(Character c : ch) {
		 * 
		 * list.add(c);
		 * 
		 * }
		 */
		System.out.println(list);
		System.out.println(list1);

	}

}
