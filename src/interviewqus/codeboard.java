package interviewqus;

public class codeboard {
public static void main(String[] args) {
	String a="codeboard";
	print(a);
}
static void print(String s) {
		for(int i=0;i<s.length();i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
				
			}
			System.out.println();
		
		}
}
}
