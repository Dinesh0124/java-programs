package arrays;

import java.util.Arrays;

public class Mid_swap {
	public static void main(String[] args)
	{
		int a[]= {5,4,3,2,1,10,9,8,7,6};
		int b=0;
		for(int i =0;i<a.length/2;i++){
			for(int j=i+1;j<a.length/2;j++){
				if(a[i]>a[j]){
					b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
			}
			for(int j=a.length/2;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					b=a[j+1];
					a[j+1]=a[j];
					a[j]=b;
				}
			}
		}System.out.println(Arrays.toString(a));
		}
	}


