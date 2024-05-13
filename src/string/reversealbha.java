package string;

public class reversealbha {

	
	
	public static void main(String[] args) {
	  
		String s = "Dinessh";
		
		System.out.println("Input::"+s);
		
		String rev = Reverse(s);
		System.out.println("Output::"+rev);
		
		
	}
	
	public static String Reverse(String s)
	{
	     char ch[]=s.toCharArray();
	     
	     int i=0;
	     int j=ch.length-1;
	     
	     while(i<j)
	     {
	    	 if(!vowel(ch[i]))
	    	 {
	    		 i++;
	    		 continue;
	    	 }
	    	 
	    	 if(!vowel(ch[j]))
	    	 {
	    		 j--;
	    		 continue;
	    	 }
	    	 
	    	 //System.out.println(j);
	    	 
	    	 char temp = ch[i];
	    	 ch[i]=ch[j];
	    	 ch[j]=temp;
	    	 
	    	 i++;
	    	 j--;
	     }
	     return String.valueOf(ch);
	}

	public  static boolean vowel(char c) {

		c=Character.toLowerCase(c);
		
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
	
	
	
}
