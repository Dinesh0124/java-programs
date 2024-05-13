package interviewqus;

import java.util.Arrays;

public class cafsinterviewqus {
public static void main(String[] args) {
	int[] numbers = new int[40];
    int[] divBy2 = new int[40];
    int[] divBy3 = new int[40];
    int[] divBy4 = new int[40];

    // Populate the numbers array with numbers 1 to 40
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i + 1;
    }
    System.out.println(Arrays.toString(numbers));

    // Find numbers divisible by 2, 3, and 4 and store them in respective arrays
    int index2 = 0, index3 = 0, index4 = 0;
    for (int num : numbers) {
        if (num % 2 == 0) {
            divBy2[index2++] = num;
        }
        if (num % 3 == 0) {
            divBy3[index3++] = num;
        }
        if (num % 4 == 0) {
            divBy4[index4++] = num;
        }
    }

    // Print the arrays
    System.out.println("Numbers divisible by 2:");
    printArray(divBy2, index2);

    System.out.println("Numbers divisible by 3:");
    printArray(divBy3, index3);

    System.out.println("Numbers divisible by 4:");
    printArray(divBy4, index4);
    
}
//Method to print the arrays
public static void printArray(int[] arr, int length) {
    for (int i = 0; i < length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();


}
}
