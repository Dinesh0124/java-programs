package interviewqus;

public class stringprogram {
public static void main(String[] args) {
	String s1="abcdefchiaj";
	char c[]=s1.toCharArray();
	
	for (int i = 0; i < s1.length(); i++) {
		int count =1;
		if(c[i]!='\0') {
		for(int j=i+1;j<s1.length();j++) {
			if(c[i]==c[j]) {
				c[j]='\0';
				count++;
			}
			
		}
		System.out.println(c[i]+"==> "+count);
	}	
		
		
		
		
	}
	
}
}
