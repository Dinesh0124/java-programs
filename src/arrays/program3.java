package arrays;

import java.util.Scanner;

public class program3 {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the size");
	int []a=new int[s1.nextInt()];
	for (int i = 0; i < a.length; i++) {
		a[i]=s1.nextInt();
	}
	for(int x=0,y=a.length-1;x<a.length;x++,y--) {
		System.out.println(a[x]+"-->"+a[y]);
	}s1.close();
	}
}
