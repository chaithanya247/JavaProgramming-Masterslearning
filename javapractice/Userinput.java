package javapractice;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("what was your name");
		String name=sc.nextLine();
		System.out.printf("hey %s, how are \n you?",name);
		String status=sc.nextLine();
		System.out.println("what is your age");
		int age=sc.nextInt();
		System.out.println("thanks for your information");
		sc.close();
	}

}
