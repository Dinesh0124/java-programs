package arrays;

public class odd_or_even {
	
public static void main(String[] args) {
		int even=0;
		int odd=0;
		int [] a = {1,2,3,4,5,6,7,8};

	for (int i = 0; i<a.length;i++) {
		if (a[i]%2==0)
			even=even+a[i];
		else
			odd=odd+a[i];
	}
	System.out.println("even numbers : "+even);
	System.out.println("add numbers : "+odd);
	}

}
