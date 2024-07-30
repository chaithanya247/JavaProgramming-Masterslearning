package Strings;

public class Ass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a test String";
		String d[]=s.split(" ");
		String result="";
		System.out.println(d.length);
		for(int i=0;i<d.length;i++) {
			if(i%2==0) {
				
					result+=d[i].toUpperCase();
					
				}
			else {
				result+=d[i].toLowerCase();
				result+=" ";
				

				}
			 if (i < d.length - 1) {
	                result += " ";
	            }
				



			}
		System.out.println(result);

		}}


