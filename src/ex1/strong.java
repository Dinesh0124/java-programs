package ex1;

public class strong {
	static int fact(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}
	static boolean strongs(int num){
		int temp=num,rev=0;
		while(num>0){
			int rem=num%10;
			rev=rev+fact(rem);
			num=num/10;
		}
		if(temp==rev){
		 return true;
		}
		else
			return false;

	}
	public static void main(String[] args) 
	{
		for(int r=100;r<=20000;r++){
		if(strongs(r)){
			System.out.println(r);
		}
		}
	}
}
