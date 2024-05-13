package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	Map m1=new HashMap();
	m1.put(1, "one");
	m1.put(2, "two");
	m1.put(3, "three");
	m1.put(4, "four");
	m1.put(5, "five");
	System.out.println(m1.remove(3));
	System.out.println(m1.size());
	System.out.println(m1.isEmpty());
	System.out.println(m1.get(2));
	System.out.println(m1.keySet());
	System.out.println(m1.values());
	System.out.println(m1.entrySet());
	System.out.println(m1.containsKey("3"));
	System.out.println(m1.containsValue("two"));
	Set key =m1.keySet();
	for (Object keys : key) {
		System.out.println(keys+"-->"+m1.get(keys));
	}
	System.out.println("-------------------------------------");
	Set ent=m1.entrySet();
	for (Object o1 : ent) {
		System.out.println(o1);
	}
}
}
