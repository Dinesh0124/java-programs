package string;

public class Reverse_string {
public static void main(String[] args) {
	String s1 ="dinesh";
	Reverse_string v1= new Reverse_string();
	v1.stringrev(s1);
	
}
 void stringrev(String s){
	for (int i = s.length()-1; i >=0; i--) {
		System.out.print(s.charAt(i));
	}
}
}
