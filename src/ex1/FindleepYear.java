package ex1;

import java.util.Scanner;

public class FindleepYear {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in); 
	System.out.println("Enter The Year");
	int year =s1.nextInt();
	s1.close();
	if(findleep(year)) {
		System.out.println(year +"is LeepYear");
	}
	else {
		System.out.println(year+"is Not a LeepYear");
	}
}

private static boolean findleep(int year) {
	return (year%4==0&&year%100!=0 ||year%400==0);
	
}
}
