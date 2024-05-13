package arrays;
public class PrimeNumber {
	public static void main(String[] args)
	{
		int a1[] = {1,2,3,4,5,9,8,7,99,66,55,123,9,876,7,6};
		for(int g=0;g<a1.length;g++) 
		{
		int count =0;
		 for (int i =1;i<=a1.length;i++)
		   {
			 if (a1[g] % i==0)
	     	    { 
		    count++;
			 if (count>2)
			  {
				break;
			  }
		    }
		}
		if (count==2)
		System.out.println(a1[g]+"   is prime no");
//		else
//			System.out.println(a1[g]+"   is not prime no");
	}
			}
	
		
}