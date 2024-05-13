package arrays;

public class occarance {
public static void main(String[] args) {
	int []a = {1,2,3,4,1,1,1,2,3,4,5,67,3};
	boolean []b =new boolean[a.length];
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
	}
}
}
