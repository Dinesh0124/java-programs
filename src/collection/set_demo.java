package collection;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class set_demo {
public static void main(String[] args) {
	Set<Integer> c1=new HashSet<Integer>();
	c1.add(1);
	c1.add(1);
	c1.add(2);
	c1.add(3);
	c1.add(-3);

	c1.add(4);
	c1.add(4);
	c1.add(0);
	c1.add(8);
	for(int dinesh:c1) {
		System.out.println(dinesh);
}
}
}
