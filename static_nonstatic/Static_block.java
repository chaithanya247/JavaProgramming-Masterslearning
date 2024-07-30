package static_nonstatic;

public class Static_block {
	//we access static in static only
	//we can access non static in static fields;
	//but we access static in non static fields;
	
	int i=10;
	public void print() {
		
	}
	//static block
	static {
		System.out.println("static block");
	}
	//non static block
	{
		System.out.println("non static block");

	}
	//constructor
	//constructor can not created with static. its only created with public,protect,pravite
	public Static_block() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		//when ever object created it automaticly excute the cunstructor before that it excuit non static varibles or blocks
		Static_block obj=new Static_block();
		//we can create object in these way also
		new Static_block().print();
		
		


	}

}
