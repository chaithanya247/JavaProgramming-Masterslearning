package Strings;

public class Strings_Intro {
	//since generally we are not creating object for primitive datatypes
	//string is non primitive data type
	//string is class not reserved key word
	//string also known as literal
	//string can you create in two ways in below
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		
		String s3="hello";
		String s2=new String("hello");
		String s4=new String("hello");

		System.out.println(s1==s2);//false becuse the memory stored different when we assing value directly to varible instead of object formart
		System.out.println(s1==s3);//ture because same format of assigning in s1 and s3
		System.out.println(s2==s4);//false even though the are create in object format and have same data. the address while be different for each object 
		
		//if we compare "==" the comparision while be done for address not for data to compare the data the below method is used
		//to compare the data we use "var1.equals(var2)".
		System.out.println(s1.equals(s4));//true->its compare the data




}
}
