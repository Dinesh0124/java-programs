package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class demo {
public static void main(String[] args) {
	List <Integer>n =new ArrayList();
	n.add(1);
	n.add(2);
	n.add(3);
	n.add(4);
	n.add(5);
	
	ListIterator i1=n.listIterator();
	while (i1.hasNext()) {
		int i =  (int) i1.next();
		System.out.println(i);
	}
	
}
}
