package arrays;

public class Max_num_by_sec_no {
	

	public static void main(String[] args) {
		int []a= {19,34,39,59,12,35,4,66,79,29,89,82};
		int max =0;
		int element=0;
		for (int i = 0; i < a.length; i++) {
//			int count =0;
//			int temp=a[i];
//			while(temp>0) {
//				count++;
//				temp/=10;
//			}
			if(a[i]>10) {
			if(a[i]%10>max) {
				max=a[i]%10;
				element=a[i];
			}}
		}
		System.out.println(element);
		

	
	
	
	
   }
}