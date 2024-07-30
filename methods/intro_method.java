package methods;

public class intro_method {
	//void is used when we are not writtening any value from the methed
	int currentBalance=1000;
	public static void greet() {
		System.out.println("Hello welcome to the banking");
		
	}
	public void deposit(int amount) {
		//in java we can access static varible in non static method
		//but we can't access non-static method inside static method vice-versa 
		currentBalance=currentBalance+amount;
		System.out.println("ammount deposite successfully ="+amount+"  available total balance ="+currentBalance);
		
	}
	public void withdrawal(int amount) {
		currentBalance-=amount;
		System.out.println("ammount deposite successfully ="+amount+"  available total balance ="+currentBalance);

		
	}
	public int currentblance() {
	
		return currentBalance;
	
	}
	public static void main(String[] args) {
		greet();
		intro_method obj1=new intro_method();
		obj1.deposit(100);
		obj1.withdrawal(200);
		System.out.println(obj1.currentblance());
		
		
		
		
		
	}

}
