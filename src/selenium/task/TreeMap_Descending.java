package selenium.task;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Descending {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>(Collections.reverseOrder());
		map.put("JAVA",1);
		map.put("ABC",2);
		map.put("BYTE",3);
		map.put("PYTHON",6);
		map.put("RUBY",9);
		map.put("C",2);
		System.out.println("TreeMap Descending:");
		System.out.println();
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Value:"+entry.getValue()+"   Key:"+entry.getKey());
		}
	}

}
