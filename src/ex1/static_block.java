package ex1;

public class static_block {
static int i;
{
	System.out.println("c");}

public static void main(String[] args) {
	
	System.out.println("d");
	new static_block();
	System.out.println(static_block.i);
	
	
}
}
