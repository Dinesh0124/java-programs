package string;

import java.util.Scanner;

public class palin {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the name");
	String s=s1.next();
	String s2="";
	for (int i = s.length()-1; i >=0 ; i--) {
		s2=s2+s.charAt(i);
	}
	System.out.println(s2);
	
	
}
}
