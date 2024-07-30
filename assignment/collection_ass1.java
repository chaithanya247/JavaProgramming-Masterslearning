package assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class collection_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>vc=new Vector<>();
		int count=0;
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 6 element:");
		/*
		 * //sum and avg 
		 * for(int i=1;i<=6;i++) { 
		 * int r=sc.nextInt(); 
		 * vc.add(r); 
		 * sum+=r;
		 * count+=1;
		 *  } 
		 * int avg=sum/count;
		 * 
		 * System.out.println("sum"+sum); System.out.println("avg"+avg);
		 */
//even sum
		/*
		 * for(int i=1;i<=6;i++) { int r=sc.nextInt(); if(r%2==0) { sum+=r; }
		 * System.out.println(sum); }
		 */
//split the list
		ArrayList<Integer> al= new ArrayList<>();
		al.add(4);
		al.add(9);
		al.add(8);
		al.add(5);
		al.add(0);
		al.add(10);
		ArrayList<Integer> fl= new ArrayList<>();
		ArrayList<Integer> ll= new ArrayList<>();
		ArrayList<Integer> merge= new ArrayList<>();

		int div=al.size()/2;
		System.out.println(div);
		for(int i=0;i<al.size();i++) {
			if(i<div) {
				fl.add(al.get(i));
			}
			else {
				ll.add(al.get(i));
			}
			
			
		}
		System.out.println(fl);
		System.out.println(ll);
		merge.addAll(fl);
		merge.addAll(ll);
		System.out.println(merge);




		


		
		

	}

}
