package arrays;

import java.util.Arrays;

public class interviewqus1 {
public static void main(String[] args) {
	int a[]= {1,-2,3,4,-1,2,1,-5,4,-2};
	int b[]=new int[a.length];
	int c[]=new int[a.length];
	int k=0;
	int j=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>0) {
		    b[k]=a[i];
			k++;
			System.out.println(Arrays.toString(b));
		}
		else {
			c[j]=a[i];
			System.out.println(Arrays.toString(c));
		}
	}
	int g=0;
	for(int num1:b) {
		g=g+num1;
		}
	System.out.println(g);
	int h=0;
	for(int num2:c) {
		h=h+num2;
		}
	System.out.println(h);
	int sum=g+h;
	System.out.println(sum);
	
	System.err.println("wrong ");
}
}
