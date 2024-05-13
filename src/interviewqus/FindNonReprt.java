package interviewqus;

public class FindNonReprt {
public static void main(String[] args) {
	String s="malayalam";
	find(s);
}

private static void find(String s) {
	char c[]=s.toCharArray();
	for (int i = 0; i < c.length; i++) {
		if(c[i]!='\0') {
			int count=1;
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]='\0';
				}
			}
			if(count<=1) {
				System.out.print(c[i]);
			}
		}
	}
	
}
}
