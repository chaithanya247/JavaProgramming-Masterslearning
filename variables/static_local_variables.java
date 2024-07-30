package variables;

public class static_local_variables {
	static int id=22;//static variable
	String name="chai";//intance varable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;//local variable
		System.out.println(id);
		System.out.println(new static_local_variables().name);
		test1();
		static_local_variables ss=new static_local_variables();
		ss.result();

	}
	public static void test1() {
	System.out.println(id);
		
		
	}
	public void result() {
		System.out.println("hello this non static method ");
		
	}

}
