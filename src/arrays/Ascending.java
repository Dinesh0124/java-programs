package arrays;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int [] a= {1,6,2,5,3};
		
		for(int i =0;i<a.length;i++)
		{
			int b=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
			}
		}
			System.out.println(Arrays.toString(a));
		}
}

