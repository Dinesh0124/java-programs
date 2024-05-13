package arrays;

public class mergesort {
public static void main(String[] args) {
	int a []= {12,45,97,87};
	int b[]= {23,5,6};
	int c[]=new int [a.length+b.length];
	int n=0;
	for (int i = 0; i < a.length; i++) {
		c[n++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[n++]=b[i];
	}
	
	sort(c);
}

private static void sort(int[] c) {
	for (int i = 0; i < c.length; i++) {
		for (int j = i+1; j < c.length; j++) {
			if(c[i]>c[j]) {
				int temp=c[j];
				c[j]=c[i];
				c[i]=temp;
			}
		}
	}
	for(int k:c) {System.out.print(k+" ");}
	
	
	
}
}
