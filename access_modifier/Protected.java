package access_modifier;
//we can't create class as Protected
//protected->inside the class,differ class within package,inhertent class ,differnt package only in inherdent class or sub class
//difference between defualt and protected is ->protect allow to use in sub class but defualt does not allow

public class Protected {
	protected int i=66;
	protected Protected() {
		i=88;
	}
	protected void hero() {
		System.out.println(i);
	}
	private void kk() {
		hero();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
