package ex1;

import java.util.Stack;

import pattens.main1;

public class parentheessdemo {
public static void main(String[] args) {
	String s="{([])}";
	if(find(s)) {
		System.out.println("valide");
	}
	else {
		System.out.println("not valide");
	}
}
public static boolean find(String s) {
	Stack<Character> stack=new Stack();
	char ch[]=s.toCharArray();
	for(char c:ch) {
		if(c=='{'||c=='('||c=='[') {
			stack.push(c);
		}
		else if(c==')'&& !stack.isEmpty()&& stack.peek()=='(') {
			stack.pop();
		}
		else if(c=='}' && !stack.isEmpty()&& stack.peek()=='{') {
			stack.pop();
		}
		else if(c==']' && !stack.isEmpty()&& stack.peek()=='[') {
			stack.pop();
		}
		else {
			return false;
		}
	}
	return stack.isEmpty();
}
}
