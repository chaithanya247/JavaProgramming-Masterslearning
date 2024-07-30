package variables;

public class nonstatic_instacevariable {
	int id=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can directly access the variable id because it is not static variable. so we need to create instance
		nonstatic_instacevariable iv =new nonstatic_instacevariable();
		System.out.println("instance variable access :"+iv.id);

	}

}
