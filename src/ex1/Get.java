package ex1;
public class Get {
	public static void main(String[] args) {
		int num=145;
		strong(num);
	}

	private static void strong(int num) {
		int rev=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			rev=rev+fact(rem);
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+"is strong");
		}
		else {
			System.out.println("noo");
		}

	}
	
	private static int fact(int rem) {
		int f=1;
		for(int i=1;i<=rem;i++) {
			f=f*i;
		}
		return f;
	}

}
