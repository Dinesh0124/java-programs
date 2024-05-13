package ex1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class c1 implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Integer a= (Integer)o1;
		Integer b= (Integer)o2;
		if(a>b) {
			return 1;
		}
		else if(a<b) {
			return -1;
		}
		else
			return 0;
	}
}
public class comparatorDemo {
public static void main(String[] args) {
	Set<Integer> s1 =new TreeSet<Integer>(new c1());
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(3);
	s1.add(2);
	s1.add(100);
	for(Object o:s1) {
		System.out.println(o);
	}
}
}
