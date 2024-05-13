package interviewqus;

public class countdigitIn2Array {
public static void main(String[] args) {
	int a[]= {1,2,4,5,6};
	int b[]= {2,5,6};
	int n=0;
	for(int i:a) {
		n+=i;
	}
	for(int j:b) {
		n+=j;
	}
	System.out.println(n);
}
}
