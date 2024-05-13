package ex1;

import java.util.Stack;

public class parenthess {
public static boolean areParenthesesBalanced(String str) {
Stack<Character> stack = new Stack<>();
for (char c : str.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } 
	            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            }
	            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            }
	            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            }
	            else {
	                return false; // Unmatched closing parenthesis
	            }
	        }

	        return stack.isEmpty(); // Stack should be empty for balanced parentheses
	    }

	    public static void main(String[] args) {
			String s1="{()}";
			if(areParenthesesBalanced(s1)) {
				System.out.println("This is balance parentheses");
			}
			else
				System.out.println("non");
		}

}
