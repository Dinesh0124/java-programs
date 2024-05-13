package arrays;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size :: ");
		int[] arr = new int[s1.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of index ("+i+") :: ");
			arr[i]=s1.nextInt();
		}
		System.out.println("Enter the number");
		int a = s1.nextInt();
		s1.close();
		
		for (int x = 0; x < arr.length; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] + arr[y] == a) {
					System.out.println(arr[x] + " + " + arr[y] + "=" + a);

				}
			}
		}
	}

}
