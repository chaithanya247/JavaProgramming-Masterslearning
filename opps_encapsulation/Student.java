package opps_encapsulation;
//encapsulation->is mechanism of wrapping of data(varaible) and code acting on the data (methods) together as single unit. 
public class Student {
	private int id;
	private String name;
	private boolean  isAttended;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAttended() {
		return isAttended;
	}
	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
	}
	

	

}
