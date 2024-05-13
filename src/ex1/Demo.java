package ex1;

import java.util.Arrays;

public class Demo {
	
 public static void main(String[] args) {

int a[]= {10,20,30,20,30,50};
int pos=-1;int  num=0;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]==a[j]) {
			pos=j;
			num=a[i];
			System.err.println(num+" "+pos);
			break;
		}
	}
	
}

 }
}
