package arrays;

import java.util.Scanner;

public class first_element 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int [] arr = {1,5,11,3,7,8,1,11,12,16,11};
		System.out.println("Enter the number");
		int n = s1.nextInt();
		s1.close();
		int index = Indexof(arr,n);
		System.out.println("first: "+index);	
	}
	public static int  Indexof(int[]arr ,int element)
	{
		int pos =-1;
		for (int i=0;i<arr.length ;i++)
		{
			if (arr[i]== element)
			{
				pos =i;
				break;
			}
		}
		return pos;
	}

}
