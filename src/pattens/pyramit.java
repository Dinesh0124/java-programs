package pattens;

public class pyramit {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		for (int j = 5; j > i; j--) {
			System.out.print(".");
		}
		for (int k = 0; k <=i; k++) {
			System.out.print("*");
		}
		for (int c = 0; c < i; c++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
//	for (int a = 0; a < 5; a++) {
//		for (int b = 0; b <a ; b++) {
//			System.out.print(".");
//		}
//		
//		for (int c = 0; c<5-a; c++) {
//			System.out.print("*");
//		}
//		for (int d = 0; d < 5-a; d++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//	}
}
}
