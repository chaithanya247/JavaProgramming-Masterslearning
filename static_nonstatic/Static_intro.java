package static_nonstatic;

public class Static_intro {
	//object is used to allocat memory to variables and method
	//without allcoting the memory we can't access in main method
	//we can allocate memory without creating object by using "static"
	//finally we can allocate memory in 2 ways->1.objects & 2.static
	//jvm store memory in methed area when we use static 
	//jvm store memory in heap ares when we use object to allocate memory to varible
	//static is shared memory because jvm allocate memory for enter class once 
	//but for object  the memory is allocate for each object in heap memory
	//access static method and varible in below way
	static int number;
	public static void print() {
		System.out.println("this is static method");
	}
	//accessing non static method
	int i=10;
	public void hero() {
		System.out.println("this is non static method");
	}

	public static void main(String[] args) {
		// accessing static varible and method
		System.out.println(Static_intro.number);
		Static_intro.print();
		
		//accessing non static variable and method->we need to create object
		Static_intro obj= new Static_intro();
		System.out.println(obj.i);
		obj.hero();
		

		

	}

}
