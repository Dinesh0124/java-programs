package arrays;

public class min_arr {
	public static void main(String[] args) {
		int []a= {1,2,2,3,9,0,4,5,5,6};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if (a[i]<smin)
			{
				smin=a[i];
				
			}
		}System.out.println("1st min  "+fmin);
		System.out.println("2nd min  "+smin);
		
	}

}
