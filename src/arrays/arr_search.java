package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr_search 
{
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	int [] arr = {1,5,11,3,7,9,1,11,12,16,11};
	System.out.println("Enter the number");
	int n = s1.nextInt();
	int index = Indexof1(arr,n);
	
	System.out.println("first  "+index);
	System.out.println("last  "+lastIndexof(arr,n));
	
	System.out.println("enter the occ");
	int c = s1.nextInt();
	System.out.println("mid  "+occurance(arr,n,c));
	System.out.println("enter the position");
	int p = s1.nextInt();
	s1.close();
	deleteElementpos(arr,p);
	deleteElement(arr,n);
}
public static int  Indexof1(int[]arr ,int element)
{
	int pos =-1;
	for (int i=0;i<arr.length ;i++)
	{
		if (arr[i]== element)
		{
			pos =i;
			break;
		}
//		else 
//			System.out.println("Enter the crt num");
	}
	return pos;
}
public static int  lastIndexof(int[]arr ,int element)
{
	int pos =-1;
	for (int i=arr.length-1;i>=0 ;i--)
	{
		if (arr[i]== element)
		{
			pos =i;
			break;
		}
	}
	return pos;

}
static int  occurance(int[]arr ,int element,int occ )
{
	int pos =-1;
	int count=0;
	for (int i=0;i<arr.length ;i++)
	{
		if (arr[i]== element)
		{
			count++;
			if(count == occ)
			{pos =i;
				break;
			}
			
		}
	}
	return pos;

}
static void deleteElementpos(int []arr,int pos) {
	for(int i=pos;i<arr.length-1;i++) 
	{
		arr[i]=arr[i+1];
	}
	arr[arr.length-1]=0;
	System.out.println(Arrays.toString(arr));
	
}
static void deleteElement(int []arr,int element) {
	int pos = Indexof1(arr,element);
	if(pos>=0)
	{
		deleteElementpos(arr,pos);
	}
	else {
		System.out.println(element+"is not fount");
	}
	
	
	int pos1 =Indexof1(arr, element);
for (int i=0;i<arr.length ;i++)
{
		
		if (pos1!=-1)
		{
			for (int j=pos1;j<arr.length -1;j++)
			{
				arr[j]=arr[j+1];
				
			}
			arr[arr.length -1]=0;
		}
	}
System.out.println(arr);
}
}