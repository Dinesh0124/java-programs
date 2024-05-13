package arrays;

public class addthedig {
public static void main(String[] args) {
	int a []= {1,2,3};
	add(a);
}

private static int add(int[] a) {
	int n=0;
	for (int i : a) {
		n+=i;
		
	}
	System.out.println(n);
	return n;
	
	
}

}

