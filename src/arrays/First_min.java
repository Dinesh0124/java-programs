package arrays;

import java.util.ArrayList;
import java.util.List;

public class First_min {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(30);

		boolean[] b=new boolean[l.size()];
		for(int i=0;i<l.size();i++){
			int count =1;
			if(b[i]!=true) {
			for(int j=i+1;j<l.size();j++){
				if(l.get(i)==l.get(j)){
					b[j]=true;
					count++;
			}
			
		}
			if(count==1) {
				System.out.println(l.get(i));
			}
		}
          
	
	}
}
}
