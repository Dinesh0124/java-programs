package ex1;

import java.util.Arrays;

public class twodarraysort {
public static void main(String[] args) {
	int a[][]= {{2,4,3,5,6},{1,2,5,3,6}};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			for (int k = 0; k < a[i].length-1; k++) {
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
			if(a[i][0]>a[j+1][0]) {
				int temp[]=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int []b:a) {
		System.out.println(Arrays.toString(b));
	}
}
}
