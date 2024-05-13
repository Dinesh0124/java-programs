package ex1;

public class stringpalindrome {
public static void main(String[] args) {
String s1 ="eye";
int a=0;
int b=s1.length()-1;
boolean res =true;
while(a<=b) {
	if(s1.charAt(a)!=s1.charAt(b)) {
		res=false;
		break;
		
	}
	a++;
	b--;
}
if(res) {
	System.out.println("its ok");
}
else
	System.out.println("not ok");

//String s2="";
//for (int i = s1.length()-1; i >=0 ; i--) {
//	s2=s2+s1.charAt(i);
//}
//if (s1.equals(s2)) {
//	System.out.println("its ok");
//}
//else
//	System.out.println("not ok");
}
}
