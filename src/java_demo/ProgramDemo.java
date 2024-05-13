package java_demo;

import java.util.Scanner;

public class ProgramDemo {

public static void main(String[] args) {
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enthe the Input");
		int n=s.nextInt();
		switch(n) {
		case 1:
		int a=10;
		int b=20;
		System.out.println(a+b);
		break;
		
		
		case 2: 
			int a1=10;
			int b1=20;
			System.out.println(a1-b1);
			break;
		case 3:
			int a11=10;
			int b5=20;
			System.out.println(a11*b5);
			break;
		default:
			
			System.out.println("Plz Enter the crt Input");
		}
//		System.out.println(a);
//		int a=20;
//		System.out.println(a);
//		System.out.println(ProgramDemo.a);
	}
	
}
}
