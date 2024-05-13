package arrays;

public class highest_number 
{
	public static void main(String[] args) {
		
	
int a []= {2,3,3,1,4,5,8,5,9};
//
//Arrays.
//for(int c : a)
//{
//System.out.println(c);	
//}
		int b = 0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(b<a[i])
				{
				b=a[i];
//				a[i]=a[j];
//				a[j]=a[j+1];
				}
			}
		}
		System.out.println("highest number ="+b);

	}}
