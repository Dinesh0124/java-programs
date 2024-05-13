package ex1;

public class Fibonacy {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	int num =9;
	System.out.print(a+" ");
	System.out.print(b+" ");
	num=num-2;
	while(num>0) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		num--;
	}
}
}
