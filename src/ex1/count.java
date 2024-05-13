package ex1;

import java.util.Scanner;

public class count {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		int temp = num,rev = 0;
		while(num>0){
			int rem =num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp){
			System.out.println("This is palintrome");
		}
		else{
			System.out.println("not palintrome");
		}
	}}
