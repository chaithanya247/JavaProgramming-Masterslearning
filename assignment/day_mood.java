package assignment;

import java.util.Scanner;

public class day_mood {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the day");
		String mood =sc.nextLine();
		if(mood.equals("sunday") || mood.equals("satday")) {
			System.out.println("pandago");
		}
		else {
			System.out.println("dandago");
		}
		
		
		
	}

}
