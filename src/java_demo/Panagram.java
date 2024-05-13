package java_demo;

import java.util.Arrays;

public class Panagram {
public static void main(String[] args) {
	String s="the  quick brown fox jumps over the lazy dog";
	s=s.toLowerCase();
	char []c = new char [26];
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z') {
			int j=ch-97;
			c[j]=ch;
		}
	}
	System.out.println(Arrays.toString(c));
	boolean rev =true;
	for(char ch:c) {
		if(ch=='\0') {
			rev=false;
			break;
		}
	}
	if(rev) {
		System.out.println("This String is pangram");
	}
	else
		System.err.println("This String is Not Pangram");
}
}
