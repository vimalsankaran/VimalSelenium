package selenium.task;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Ascending {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("JAVA",1);
		map.put("ABC",2);
		map.put("BYTE",3);
		map.put("PYTHON",6);
		map.put("RUBY",9);
		map.put("C",2);
		System.out.println("HashMap Ascending Order");
		System.out.println();
		System.out.println("Before Sorting:");
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Value:"+entry.getValue()+"   Key:"+entry.getKey());
		}
		Map<String, Integer> sortedmap = new TreeMap<String, Integer>(map);
		System.out.println();
		System.out.println("After Sorting");
		for(Map.Entry<String, Integer> entry1:sortedmap.entrySet()) {
			System.out.println("Value:"+entry1.getValue()+"   Key:"+entry1.getKey());
		}
	}

}
