package pattens;

public class triagle_pattens {
public static void main(String[] args) {
	int n=1;
	
	for (int i = 0; i < 5; i++) {
		
		for (int j = 5; j >= i; j--) {
			System.out.print("*");
		}
		for (int k = 0,m=1; k < n; k++,m++) {
			System.out.print(m+" ");
			
		}
		System.out.println();
		n++;
	}
}
}
