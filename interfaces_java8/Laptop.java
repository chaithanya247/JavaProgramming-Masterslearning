package interfaces_java8;
//from java8 we can do implement in interface itself
//But the implement method need to either "defualt", "static"
//there is some change in access modifer in interface 
//if you not specify any access modifer before varible it will be in public
//ex: int a=10;
// if we wanted to specify defualt means we need specificaly wanted specify defualt vic versa in class
//ex: defualt int a;
public interface Laptop {
	
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	//this method goes to class they can able change the overide theimplement code and what the code is there inside the class will be display to user
	default void security() {
		System.out.println("please implement this");
		commoncode();
	}
	//if any onw can use the code then we use static
	static void aduio() {
		System.out.println("aduio implementation");
		commoncode();
	}
	//from java9 to reduce the code reuseablity inside the interface they introduce private method
	private static void commoncode() {
		System.out.println("common code");
		
	}

	

}
