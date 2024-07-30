package Strings;

public class Ass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String d[]=s.split(" ");
		String result="";
		System.out.println(d.length);
		for(int i=0;i<d.length;i++) {
			for(int j=d[i].length()-1;j>=0;j--) {
				result+=d[i].charAt(j);
			
		}result+=" ";
			
		

	}
		System.out.println(result);

}
}
