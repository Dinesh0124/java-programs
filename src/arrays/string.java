package arrays;

import java.util.Arrays;

public class string {
	public static void main(String[] args) {
		String s ="malayalam";
		char []a=s.toCharArray();
		boolean []b =new boolean[a.length];
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<a.length;i++)
			
		{
			if  (b[i]==true) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j]) {
					b[j]=true;
					count++;
				}
			}System.out.println(a[i] + "--->"+count);
			if(count==1) {
				System.out.println("distinct---> "+a[i]);
			}
		}
	}
	}
	
		
		

