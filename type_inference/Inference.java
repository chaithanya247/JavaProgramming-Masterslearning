package type_inference;

public class Inference {
	//var j=10// var can't use in global space

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var is keyword instead of datatype we use only in local variables not in gobal varible
		var i=10;//local variable
		System.out.println(i);
		
		//var is used at same time of initializer value to variable
		//without initializer  value it througs error as shown in the below
		//it throughs the error because at compile time based on the value in variable the compiler assign the datatype to the varible in below case in not have value instilization. 
		//the varible already space alication will excute at run time  
		//var u;
		//u=12;
		//using var at array we need to skip []
		var arr=new int [5];
		//we can not use like below
		//var ff[]= {1,2,3,6}
		//if the compiler don't know the value means at this places we don't use "var" keyword.
		//we not use var in passing pararmeter to method
		
		

	}

}
