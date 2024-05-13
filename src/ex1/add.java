package ex1;


import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=s1.nextInt();
		System.out.println("Enter the 2nd number");
		int b=s1.nextInt();
		s1.close();
		while(a>0) {
			b++;
			a--;
		}System.out.println("a + b ="+a);
		
	}

	
}
