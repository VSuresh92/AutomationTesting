package learningjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		// Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Vignesh", 125);
		map.put("Vijay", 168);
		map.put("Arun", 150);
		map.put("Arunkumar", 256);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}