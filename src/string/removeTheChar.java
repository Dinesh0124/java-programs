package string;

import java.util.Arrays;

public class removeTheChar {
public static void main(String[] args) {
	String s="dhinesh";
	char c='h';
	char ch[]=s.toCharArray();
	for (int j = 0; j < ch.length; j++) {
		int pos= find(ch,c);
		if(pos!=-1) {
			for (int i = pos; i < ch.length-1; i++) {
				ch[i]=ch[i+1];
			}
			ch[ch.length-1]='\0';
			
		}
	}
	System.out.println(Arrays.toString(ch));
}

private static int find(char[] ch, char c) {
	int pos=-1;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]==c) {
			pos=i;
			break;
		}
	}
	return pos;
}
}
