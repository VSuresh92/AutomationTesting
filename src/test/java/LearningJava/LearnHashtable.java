package LearningJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class LearnHashtable {

	public static void main(String[] args) {
		
		Hashtable hb = new Hashtable();
		hb.put("Suresh", "value1");
		hb.put("Suji", "value2");
		hb.put("Sudhan", "value3");
		hb.put("Suruthi", "value4");
		hb.put("Suruthi", "value5");
		System.out.println("Hash map values are :"+hb);
		
		Hashtable ht = (Hashtable) hb.clone();
		System.out.println("Clone map values are :"+ht);
		
		System.out.println(ht.hashCode());
		
		if(ht.containsValue("value")) {
			System.out.println("Value available");
		}else {
			System.out.println("Value not available");
		}
		
		if(ht.containsKey("Suresh")) {
			System.out.println("Key available");
		}else {
			System.out.println("Key not available");
		}
		
		Enumeration e = ht.elements();
		while(e.hasMoreElements()) {
			
			System.out.println("Values availalbe in Hashtable are : "+e.nextElement());
			
		}
		
		Set s = ht.entrySet();
		System.out.println(s.toString());
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		
		String[] str = {};
		System.out.println(str.length);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println(map.size());
		

	}

}
