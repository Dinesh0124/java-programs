package ex1;

public class object_demo {
public static void main(String[] args) {
	Object o1= new Object();
	Object o2= new Object();
	System.out.println(o1.equals(o2));
	if(o1==o2) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
}
}
