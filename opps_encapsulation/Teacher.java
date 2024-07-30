package opps_encapsulation;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//encapsulations work below like this using getter and setter method .
		//normally we cannot set data directly to the variable using objects
		
		Student obj=new Student();
		obj.setId(10);
		obj.setAttended(false);
		System.out.println(obj.getId());
		System.out.println(obj.isAttended());
		
		//normall method if follw means it not satisfy the emcapsulation concept
//		obj.name="chaithanya";
//		obj.id=90;

	}

}
