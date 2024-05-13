package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class one implements Comparable{
	int id;
	String name ;
	one(int id,String name){
		this.name=name;
		this.id=id;
	}

	
	@Override
	public String toString() {
		return "one [id=" + id + ", name=" + name + "]";
	}


	public int compareTo(Object o1) {
		one o=(one)o1;
			if(this.id>o.id) {return -1;}
		else
			return 1;
	}
}
public class comparableDemo {
public static void main(String[] args) {
	List<one> l=new ArrayList<one>();
	l.add(new one (0,"A"));
	l.add(new one (4,"b"));
	l.add(new one (1,"c"));
	l.add(new one (2,"d"));
	l.add(new one (3,"c"));
	Collections.sort(l);
	
	
	for(one e:l) {
		System.out.println(e);
	}
}
}
