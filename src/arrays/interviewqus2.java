package arrays;

public class interviewqus2 {
public static void main(String[] args) {
	int coin =20;
	int ice[]= {10,5,1,2,7};
	int count =0;
	for(int a:ice) {
		
		if(coin>=a) {
			for (int i = a; i > 0; i--) {
				coin--;
				//System.out.println(coin);
			}
			count++;
		}
	}
	System.out.println(count+" ice can bye");
}
}
