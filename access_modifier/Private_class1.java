package access_modifier;
//private->within the class
//outside class->we can't access the class

import javax.management.loading.PrivateClassLoader;

//a class can never be a private it public
public class Private_class1 {
	private int num=10;
	private Private_class1() {
		num=101;
	}
	private void print() {
		System.out.println(num);
	}
	public void abc() {
		print();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private_class1 obj=new Private_class1();
		obj.print();
	

	}

}
