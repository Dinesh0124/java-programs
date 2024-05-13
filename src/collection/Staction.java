package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import arrays.string;

public class Staction {
public static void main(String[] args) {
	List<String> li = new LinkedList<String>();
	li.add("aa");
	li.add("bb");
	li.add("cc");
	li.add("dd");
	li.add("ee");
	
	Scanner s1 =new Scanner(System.in);
	System.out.println("enter the sp");
	String sp =s1.next();
	System.out.println("enter the ep");
	String ep =s1.next();
	if(li.indexOf(sp)<li.indexOf(ep)) {
	int ticket = Math.abs((li.indexOf(sp)- li.indexOf(ep))*5);
	System.out.println("you have to pay "+ticket);
	System.out.println("no of staction"+Math.abs(li.indexOf(sp)- li.indexOf(ep)));
	}
	else
		System.out.println("enter the crt staction");
}
}
