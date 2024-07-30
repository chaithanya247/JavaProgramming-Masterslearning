package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
	public static void main(String[] args) {
		boolean arr[]=new boolean[5];
		boolean arr1[]=new boolean[arr.length];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values:");
		for(int i=0;i<5;i++) {
			boolean input=sc.nextBoolean();
			arr[i]=input;
			
		}
		for(int i=0;i<5;i++) {
			arr1[i]=arr[4-i];
		}
		System.out.println("result="+Arrays.toString(arr1));

	}

}
