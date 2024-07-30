package oops_abstraction;
//abstraction ->is process of hinding the implemented details and showing only functionality to the user
// we can implement 100% of abstraction using interface before java8 through interfaces
//after java7 we have option to code implement details within interface. so we can not achevice 100% of abstraction
//diff between encapsulation and abstraction
//encapsulation wrapper the data in single unit but if crate object we can see the implementation 
//but in abstraction we create object but it point to interface  as shown in the below so that we can hide implement details like this


public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj=new Dell();
		obj.copy();
		//if create like this it will show implement details
		Dell obj1=new Dell();
		obj1.copy();//press f3
		

	}

}
