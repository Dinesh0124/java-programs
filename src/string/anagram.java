package string;

import java.util.Arrays;

public class anagram {
public static void main(String[] args) {
	String s1="dinesh";
	String s2="hsenid";
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	
	
//	Arrays.sort(c1);
//	Arrays.sort(c2);
	
	tosort(c1);
	tosort(c2);
	
	if(Arrays.equals(c1, c2)) {
		System.out.println("This is anagram");
	}
	else
		System.out.println("not a anagram");
	
	
	
}
private static void tosort(char[] c) {
	for (int i = 0; i < c.length; i++) {
		for (int j = i+1; j < c.length; j++) {
			if(c[i]>c[j]) {
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
	}
	System.out.println(c);
}
}
