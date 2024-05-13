package pattens;


public class revercepyramit {
public static void main(String[] args) {
	int n=7;
	for (int i = 1; i <=n; i++) {
		for (int j = n; j >i; j--) {
			System.out.print(" ");
		}
		int temp=1;
		for (int k = 1; k <=i; k++) {
			int num=n-temp+1;
			temp++;
			System.out.print(num+" ");
			
		}
		System.out.println();
	}
}
}
