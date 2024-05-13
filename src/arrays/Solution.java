package arrays;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if(N%2==0&& N>=2 && N<=5){
            System.out.println("hii");
        }
        else if(N%2==0&& N>=6 && N<=20){
            System.out.println("hello");
        }
        else if(N%2==0 && N>20){
            System.out.println("Not");
        }
        else{
           System.out.println("never"); 
        }

        scanner.close();
    }
}
