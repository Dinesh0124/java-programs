package arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int [] a= {2,4,6,8,5};
		
		int k=a.length-1;int  b=0;
		for(int i=0;i<a.length/2;i++) {
			
			b=a[i];
		  a[i]=a[k];
		    a[k]=b;
		   k--;
		}
		System.out.println(Arrays.toString(a));
	}

}
