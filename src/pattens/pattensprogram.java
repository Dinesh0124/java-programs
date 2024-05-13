package pattens;

public class pattensprogram {
public static void main(String[] args) {
	int n=7;
	for (int i = 1; i <= n; i++) {
		for (int j = i; j >=1 ; j--) {
			int num=n-j+1;
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
}
