package ex1;

class myexception extends Exception{
	myexception(){
		System.out.println("Exception is process");
	}
}
public class exceptionDemo {
	public static void main(String[] args)throws myexception {
		int num =12;
		chech(num);
	}

	private static void chech(int num)throws myexception {
		if(num>20) {
			System.out.println("hiii user");
		}
		else {
			throw new myexception();
		}
		
	}

}
