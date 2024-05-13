package string;

public class Multiple_letters {
public static void main(String[] args) {
	String s1 ="a3v3e3";
	int n =0;
	for (int i = 0; i < s1.length(); i++) {
		char ch =s1.charAt(i);
		if(ch>='0'&& ch<='9') {
			n=n*10+(int)ch-48;
			}
		else {
			while(n>0) {
				System.out.print(ch);
				n--;
			}
		}
	}
}


//ch-48

//ch-48 -->Number
//ch-32-->lowercase
//ch+32-->uppercase
}
