package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {
public static void main(String[] args) {
	int a[][]=new int [2][2];
	int b[][]=new int [2][2];
	Scanner s= new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter "+(i+1)+" row");
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=s.nextInt();
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println("enter "+(i+1)+" row");
		for (int j = 0; j < b[i].length; j++) {
			b[i][j]=s.nextInt();
		}
	}
	int c[][]=new int [2][2];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			c[i][j]=a[i][j]*b[i][j];
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(Arrays.toString(c[i]));
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(Arrays.toString(a[i]));
//	}
//	for (int i = 0; i < b.length; i++) {
//		System.out.println(Arrays.toString(b[i]));
//	}
}
}
