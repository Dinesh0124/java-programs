package arrays;

import java.util.Arrays;

public class delete_all_element 
{
public static void main(String[] args) 
  {
	int arr[]= {1,2,3,4,5,1,6,1,7,9,8};
	System.out.println(Arrays.toString(arr));
	int ele =1;
	for (int i=0;i<arr.length ;i++)
	{
			int pos =Indexof(arr , ele);
			if (pos!=-1)
			{
				for (int j=pos;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
					
				}
				arr[arr.length -1]=0;
			}
		}
	System.out.println(Arrays.toString(arr));
	}
public static int  Indexof(int[] arr ,int element)
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

