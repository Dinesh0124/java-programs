package ex1;

import java.util.Scanner;

public class find_big_num {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=s1.nextInt();
		System.out.println("Enter the 2nd number");
		int b=s1.nextInt();
		System.out.println("Enter the 3rd number");
		int c=s1.nextInt();
		s1.close();
		int d=(a>b)&&(a>c)?a:(b>c)?b:c;
		System.out.println(d);
	}

}
