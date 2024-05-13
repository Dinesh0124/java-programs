package ex1;

import java.util.Scanner;

public class CountTheDigit {
static void count_digits(int n) {
	int count=0;
	while(n>0){
		count++;
		n/=10;
	}
	System.out.println(count);
}
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the number");
	int digit =s1.nextInt();
	count_digits(digit);
	s1.close();
}
}
