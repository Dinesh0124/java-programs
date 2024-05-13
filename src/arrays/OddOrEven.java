package arrays;

public class OddOrEven {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,8,9};
	findodd(a);
	findeven(a);
	}

	private static void findeven(int[] a) {
		System.err.println("Even number :");
		for (int i : a) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}

	private static void findodd(int[] a) {
		System.err.println("Odd number: ");
		int count =0;
		for (int i : a) {
			if(i%2!=0) {
				System.out.print(i+" ");
				count++;
				
			}
		}
		System.out.println();
		//System.out.println(count+" Even nums are present in array");
		
	}
}
