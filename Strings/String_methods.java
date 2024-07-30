package Strings;

import java.util.Arrays;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HelLo";
		String s2=" hello";
		String s3="o HEL^Lo";
		String s4="hello chaithanya reddy your most talented person in the world";
		char arr1[]= {'c','f','r'};
		int arr2[]= {1,2,3,45,6};
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//ture ->it ignore upper and lower case
		System.out.println(s1.contains("lL"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("H"));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.length());
		System.out.println(s2.trim().length());
		char arr[]=s1.toCharArray();
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr2));
		System.out.println(s1.indexOf("y"));// if the given word not presented in string means it write -1
		System.out.println(s3.lastIndexOf("o"));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(3,7));
		System.out.println(Arrays.toString(s4.split(" ")));
		System.out.println(Arrays.toString(s3.split("\\^")));
		System.out.println(s1.charAt(4));
		System.out.println(s3.replace("^", ""));
		//coverting string to integer
		String a="178";
		int i=Integer.valueOf(a);
		System.out.println(a);
		//coverting integer to string
		int b=190;
		String d=String.valueOf(b);
		String c1;
		String c2=" ";
		String c3="";


		System.out.println(c2.length());
		System.out.println(c2.isEmpty());
		System.out.println(c2.isBlank());













		






	}

}
