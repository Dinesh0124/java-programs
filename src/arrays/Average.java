package arrays;

public class Average {
public static void main(String[] args) {
	int a []= {1,2,4,5,7,33,2,3,32,2};
	int sum=0;int count=0;
	for (int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		count++;
	}
	System.out.println(sum/count);
}
}