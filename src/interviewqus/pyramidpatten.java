package interviewqus;

public class pyramidpatten {
public static void main(String[] args) {
	String a="*";
	int n=5;
	for (int i = 1; i <= n; i++) {
		for (int j = n; j > i; j--) {
			System.out.print(".");
		}
		for (int k = 0; k <2*i-1 ; k++) {
			System.out.print(a);
		}
		System.out.println();
	}
}
}
