package access_modifier;
//we can access public varible ,method within a same class,inhereted class,diff class inside same package,diff class inside diff package,
public class Public_class1 {
	public int num=101;
	public Public_class1(int num) {
		this.num=num;
		System.out.println(num);
		
	}
	public void print() {
		System.out.println(num);

		
	}
	

	private void abc() {
		print();
		
	}

}
