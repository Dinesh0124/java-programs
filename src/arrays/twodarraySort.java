package arrays;

import java.util.Arrays;

public class twodarraySort {
public static void main(String[] args) {
	int a[][]= {{1,9,8},{7,8,6},{4,8,9,5},{2,8,9},{1,4,3}};
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			for (int k = 0;  k< a[i].length-1; k++) {
				if(a[i][k]>a[i][k+1]) {
					int temp=a[i][k];
					a[i][k]=a[i][k+1];
					a[i][k+1]=temp;
					
				} 
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if(a[j][0]>a[j+1][0]) {
				int temp[]=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	
	for(int n[]:a) {
		System.out.println(Arrays.toString(n));
	}
}
}
