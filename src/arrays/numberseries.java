package arrays;

public class numberseries {
public static void main(String[] args) {
	int a[]= {5};
	number(a);
}

private static void number(int[] a) {
	for(int n:a) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			}
		}
	
}
}
