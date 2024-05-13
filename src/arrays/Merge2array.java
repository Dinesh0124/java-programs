package arrays;
import java.util.Arrays;
public class Merge2array {
	public static void main(String[] args) {
	int []a= {5,4,4,4,3,2,1};
	int []b= {7,6,8,4,9};
	int []c = new int[a.length+b.length];
	for (int i = 0,k=0; i < c.length; i++)
	{
		if(i<a.length)
			c[i]=a[i];
		else if(k<b.length)
			c[i]=b[k++];
	}
	for(int x=0;x<c.length;x++) {
		for(int y=x+1;y<c.length;y++){
			if(c[x]>c[y]){
				int h=c[y];
				c[y]=c[x];
				c[x]=h;
			}
		}
	}
	for(int x=0;x<c.length;x++){
		if(c[x]!=0){
			for(int y=x+1;y<c.length;y++){
				if(c[x]==c[y]){
					for(int k=y--;k<c.length-1;k++){
			             c[k]=c[k+1];
			             }
					c[c.length -1]=0;				
				}
			}
		}
	 }
	System.out.println(Arrays.toString(c));
	}
}
