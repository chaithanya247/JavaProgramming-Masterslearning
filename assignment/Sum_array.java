package assignment;

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int i=sc.nextInt();
		
		int sum=0;
		
		int arr[]=new int[i];
		System.out.println("enter the 5 values to array");
		for(int y=0;y<i;y++) {
			
			int in=sc.nextInt();
			arr[y]=in;
			
			
		}
		for(int j=0;j<i;j++) {
			sum=sum+arr[j];
			
			
		}
		System.out.println(sum);
		

	}

}
