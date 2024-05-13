package arrays;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
			int []arr = {1,2,3,1,2,5,2,1,6,5,8};
			removeduplicate(arr);
		}
static void removeduplicate(int[]arr) {
	int[]result=new int [arr.length];
	int pos =0;
	for(int ele :  arr) 
	{
		int  flag=0;
		for(int j=0;j<pos;j++) {
			if(ele==result[j]) {
				flag=1;
				break;
			}
			}
			if(flag==0) {
				result[pos]=ele;
				pos++;
			}
		}
	System.out.println(Arrays.toString(result));

		
}}