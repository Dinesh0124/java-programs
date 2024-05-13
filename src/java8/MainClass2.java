package java8;
interface durai{
	boolean  m1(int a,int b);
}

public class MainClass2 {
	public static void main(String[] args) {
		durai d2=(a,b)->a<b;
		d2.m1(2, 5);	
	

}
}
