package arrays;

import java.util.Arrays;

public class program1 {

	public static void main(String[] args) {
		int []a = {1,2,3,1,2,5,2,1,1,3,4,2,2,6,6,2,6,2,6,5,8};
		for (int i = 0; i<a.length;i++) {
			if (a[i]!=0&&a[i]%2==0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j]) 
					{
						for(int k=j--;k<a.length-1;k++)
					   {
						a[k]=a[k+1];
						}
				    a[a.length-1]=0;
					}
				}
		    }
		}
		System.out.println(Arrays.toString(a));
	}

}
