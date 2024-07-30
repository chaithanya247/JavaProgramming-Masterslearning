package Strings;

import java.util.Scanner;

public class Ass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String in=sc.nextLine();
		System.out.println("enter the target");
		String target=sc.nextLine();
		char c=target.charAt(0);
		char arr[]=in.toCharArray();
		int count=0;
		for(char i:arr) {
			if(i==c) {
				count+=1;
				
			}
		}
		System.out.println(count);

	}

}
