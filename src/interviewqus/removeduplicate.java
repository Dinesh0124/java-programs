package interviewqus;

import java.util.Arrays;
import java.util.Iterator;

public class removeduplicate {
public static void main(String[] args) {
	int arr []= {1,2,3,1,1,1,2,5,2,1};
	oii(arr);
	}
static void oii(int []arr)
{
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i]!=0)
		{
		for (int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				for(int k=j;k<arr.length-1;k++)
				{
		             arr[k]=arr[k+1];
		        }
				arr[arr.length -1]=0;
				j--;
				
			}
		}
	  }
     }
//System.out.println(Arrays.toString(arr));
int count=0;
for(int x:arr) {
	if(x!=0) {
		count++;}}
int []br=new int[count];
//System.out.println(Arrays.toString(br));
for(int k =0;k<br.length;k++) {
	br[k]=arr[k];}
System.err.println(Arrays.toString(br));
//int a[]= {'a','b','c'};
//System.out.println(a);
}
}


