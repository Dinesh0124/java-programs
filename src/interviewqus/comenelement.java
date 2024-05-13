package interviewqus;

public class comenelement {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int b[]= {2,3,4,1,6};
	int c[]= {3,4,7,8,1};
	int d[]=new int [b.length];
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			if(a[i]==a[j]) {
				if(a[i]==c[j]) {
					d[i]=a[i];
				}
			}
			
		}
	}
}
}
