package string;

import java.util.Arrays;

public class RevStringArray {
public static void main(String[] args) {
	String []s = {"abc","madam","sir","hgj"};
	String[] result =new String[s.length];
	for(int i =0;i<s.length;i++) {
		String s1 = s[i];
		System.out.println(s1);
		String rev="";
		for (int j = s1.length()-1; j >=0 ; j--) {
		rev =rev+s1.charAt(j)	;
		}
		result[i]=rev;
	}
	System.out.println(Arrays.toString(result));
}
}
