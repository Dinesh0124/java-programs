package string;

public class mul_letter {
public static void main(String[] args) {
	String s1 ="a2s2d3 ";
	char c =' ';
	int num =0;
	for (char ch :s1.toCharArray()) {
		
		if(ch>='0'&& ch<='9') {
			num=num*10+(int)(ch-48);
			//System.out.println((int)(ch-48));
			}
		else {
			for (int i = 1; i <=num; i++) {
				System.out.print(c);
			}c=ch;
			num=0;
		}
		}
	
	}
}	
