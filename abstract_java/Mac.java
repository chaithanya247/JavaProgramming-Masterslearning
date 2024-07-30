package abstract_java;

public abstract class Mac implements Laptops{
	
	public void copy() {
		
	}
	//if we are not implementing method in abstract class the we need to specify using abstract key as shown in thae below
	//we can't create object to the abstract class
	public abstract void paste();
	public abstract void cut();

}
