package arrays;

public class max_array {
public static void main(String[] args) {
	int []a= {1,2,3,4,1,2,3,5,5,6,5,7,4,3,10,9,8,11};
	int fmax=0,fmin=Integer.MAX_VALUE;
	int smax=0,smin=Integer.MAX_VALUE;
	int tmax=0,tmin=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++){
		if(fmax<a[i]) {
			tmax=smax;
			smax=fmax;
			fmax=a[i];
		}
		else if (smax<a[i] && a[i]!=fmax) {
			tmax=smax;
			smax=a[i];
		}
		else if (tmax<a[i] && a[i]!=fmax && a[i]!=smax) {
			tmax=a[i];
		}
		//find minimum
		if(fmin>a[i]) {
			tmin=smin;
			smin=fmin;
			fmin=a[i];
		}
		else if (smin>a[i] && a[i]!=fmin) {
			tmin=smin;
			smin=a[i];
		}else if (tmin>a[i] && a[i]!=fmin && a[i]!=smin) {
			tmin=a[i];
		}
		
	}
	int res=tmax-tmin;
	
	System.out.println("1st max "+fmax);
	System.out.println("2nd max "+smax);
	System.out.println("3th max "+tmax);
	System.out.println("1th min "+fmin);
	System.out.println("2nd min "+smin);
	System.out.println("3th min "+tmin);
	System.out.println("3rd min - 3rd max  = "+res);
	
}
}
