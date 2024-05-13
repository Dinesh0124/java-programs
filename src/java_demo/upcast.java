package java_demo;
abstract class animal{
	abstract void macksound();
}
class dog extends animal{
	void macksound() {
		System.out.println("oii");
	}
}
class cat extends animal{
	void macksound() {
		System.out.println("hii");
	}

}
public class upcast {
public static void main(String[] args) {
	animal a=new dog();
	animal b=new cat();
	a.macksound();
	//b.macksound();
}
}
