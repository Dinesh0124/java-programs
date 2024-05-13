package pattens;

public class diamond {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int k=n;k>=n-i;k--) {
				System.out.print(" ");
			}
		
			for(int j=n-1;j>i;j--) {
				System.out.print("* ");
		}
			
			System.out.println();
	}
	}
}
