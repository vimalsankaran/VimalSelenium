package selenium.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Descending {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("JAVA");
		set.add("ABC");
		set.add("BYTE");
		set.add("PYTHON");
		set.add("RUBY");
		set.add("C");
		System.out.println("Set Descending Order");
		System.out.println();
		System.out.println("Before Sorting:");
		System.out.println(set);
		
		ArrayList<String> list= new ArrayList<String>(set);
		list.sort(Collections.reverseOrder());
		System.out.println("Reverse Order:");
		System.out.println(list);
	}

}
