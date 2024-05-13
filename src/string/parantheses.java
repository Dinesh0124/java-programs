package string;

public class parantheses {
	public static boolean parenthesess(String s1)
	{
		int i=-1;
	    char c[]=new char [s1.length()];
	    for(char ch:s1.toCharArray())
	    {
	    	if(ch=='('||ch=='{'||ch=='[')
	    	{
	    		c[++i]=ch;
	    	}
	    	else if((c[i]=='(' && ch==')') || (c[i]=='{' && ch=='}' )||(c[i]=='[' && ch==']'))
	    	{
	    		i--;
	    	}
	    	else
	    		return false;
	    	
	    	
	    }
	    return i==-1;
	    
	}
   public static void main(String[] args) {
	  String s1="{()}";
	   if(parenthesess(s1))
		   System.out.println("valid parntheses");
	   else
		   System.out.println("not parentheses");
}

}
