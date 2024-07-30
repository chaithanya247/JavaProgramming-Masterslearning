package assignment;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2!=0) {
			System.out.println("Given number is odd");
		}
		else {
			System.out.println("given num is even");
		}
		sc.close();
	}

}
