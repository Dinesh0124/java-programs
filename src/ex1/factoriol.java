package ex1;

public class factoriol {
public static void main(String[] args) {
	int n=5;
	System.out.println(facto(n));
}

public static int facto(int n) {
	int f=1;
	for (int i = 1; i <=n; i++) {
		f=f*i;
	}
	return f;
}
}
