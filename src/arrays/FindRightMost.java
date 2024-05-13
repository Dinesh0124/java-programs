package arrays;

public class FindRightMost {
public static void main(String[] args) {
	int arr[]= {25,5,97,120,76};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(find(arr[i])>find(arr[j])) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int i : arr) {
		System.out.print(i+" ");
	}
}

private static int find(int arr) {
	return Integer.parseInt(Integer.toString(arr).substring(0,1));
	
}


}
