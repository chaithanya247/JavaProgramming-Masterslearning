package oops_inheritence;

public class developer extends Guest {
	
	public void write() {
		super.read();//super keyword used to acces parent behavour only if current class same variables or methods
		System.out.println("write");

	}
	public  void read() {
		System.out.println("this method called beacuse java check local method first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
