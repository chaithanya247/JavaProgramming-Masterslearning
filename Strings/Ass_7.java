package Strings;

public class Ass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JavA5is&Su6p%eR";
		int uc=0;
		int lc=0;
		int sp=0;
		int dg=0;
//		System.out.println(s.);
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				dg+=1;
			}
			if(Character.isLowerCase(c)) {
				lc+=1;
			}
			if(Character.isUpperCase(c)) {
				uc+=1;
			}
			else if(!Character.isLetterOrDigit(c)) {
				sp+=1;
			}
		}
		System.out.println("sp"+sp);
		System.out.println("uc"+uc);
		System.out.println("lc"+lc);
		System.out.println("dg"+dg);




	}

}
