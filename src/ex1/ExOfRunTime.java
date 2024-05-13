package ex1;
class a{
	static void m1(int a) {
		System.out.println("i am dinesh");
	}
}
class b extends a{
	static void m1(int a) {
		System.out.println("i am innocent");
	}
}
public class ExOfRunTime {
public static void main(String[] args) {
	a a1=new a();
	a1.m1(10);
	b b1 =new b();
	b1.m1(8);
}
}
