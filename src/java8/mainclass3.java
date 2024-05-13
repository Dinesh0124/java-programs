package java8;
enum days
{
DURAI,DINISH,VISHNU,abdullah
}

public class mainclass3 {

public static void main(String[] args) {
//	Runnable r1 = ()->System.out.println("hi");{
//	Thread t1 = new Thread(r1);
//	t1.start();
//	}
	
	
	
	for(days d1:days.values()) 
	{
		System.out.println(d1);
	}
	}
}

