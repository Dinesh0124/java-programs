package interviewqus;

import java.util.Arrays;

public class merge2array {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,10,11};
	int c[]=new int [a.length+b.length];
	for (int i = 0,k=0; i < c.length; i++) {
		if(i<a.length) {
			c[i]=a[i];
		}
		else if(k<b.length) {
			c[i]=b[k++];
		}
	}
	System.out.println(Arrays.toString(c));
}
}
