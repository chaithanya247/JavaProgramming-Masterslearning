package assignment;
import java.util.Arrays;
import java.util.Scanner;

public class Array_add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr1[] = new String[3];
        String arr2[] = new String[3];
        
        System.out.println("Enter first array elements:");
        for (int i = 0; i < 3; i++) {
            String input1 = sc.nextLine();
            arr1[i] = input1;
        }

        System.out.println("Enter second array elements:");
        for (int j = 0; j < 3; j++) {
            String input2 = sc.nextLine();
            arr2[j] = input2;
        }

        String result[] = new String[arr1.length + arr2.length];
        for (int j = 0; j < 3; j++) {
            result[j] = arr1[j];
        }
        for (int k = 3; k < 6; k++) {
        for (int j = 0; j < 3; j++) {
            
                result[k] = arr2[k-3];
            }
        }
        System.out.println("Array elements: " + Arrays.toString(result));
        System.out.println("Array elements: " + Arrays.toString(arr1));

    }
}
