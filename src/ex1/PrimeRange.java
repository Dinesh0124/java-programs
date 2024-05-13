package ex1;

import java.util.Scanner;

public class PrimeRange {
static boolean PrimeRange1(int n) {
	int count =0;
	for(int i =1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
		if(count>2) {
			break;
		}
	}
	if(count==2) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
	Scanner s1 =new Scanner(System.in);
	System.out.println("Enter the Starting number");
	int a= s1.nextInt();
	System.out.println("Enter the Ending number");
	int b =s1.nextInt();
	s1.close();
	for (int i = a; i <= b; i++) {
		if(PrimeRange1(i)) {
			System.out.println(i);
		}
	}
}
}
