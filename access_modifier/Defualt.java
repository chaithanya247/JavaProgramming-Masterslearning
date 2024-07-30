package access_modifier;
//defualt can be accessed in same class,inhertated class in same packages,different class in same package, but not in different pakage
// class aslo can be defualt modifer
//constructor also be defualt
class Defualt {
	//if we not specify any modifier then it knowns as defualt modifer
	int i=10;
	private void print() {
		System.out.println(i);
	}
	public void abc() {
		print();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
