package assignment;

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();

		if (marks >= 35) {
			if (marks >= 35 && marks < 70) {
				System.out.println("third class");
			} else if (marks >= 70 && marks <= 85) {
				System.out.println("second class");

			} else {
				System.out.println("first class");

			}
		} else {
			System.out.println("fail");
		}

	}
}
