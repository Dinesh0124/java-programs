package ex1;

import java.util.Arrays;
import java.util.Iterator;

public class Twodarrayreverse {
public static void main(String[] args) {
	int a[][]= {{1,2,3,4},{5,3,7,9,3}};
	reverce(a);
}

private static void reverce(int[][] a) {
	for (int i = 0; i < a.length; i++) {
		int start=0;
		int end=a[i].length-1;
		while (start<end) {
			int temp=a[i][start];
			a[i][start]=a[i][end];
			a[i][end]=temp;
			start++;
			end--;
		}
	}
	for(int n[]:a) {
		System.out.println(Arrays.toString(n));
	}
	
}
}
