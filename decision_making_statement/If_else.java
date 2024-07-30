package decision_making_statement;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		//normal if else 
		if(i<10) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

		}
		//nested if else
		String intial_exam="pass";
		if(intial_exam=="pass") {
			String round1="pass";
			if(round1=="pass") {
				System.out.println("selected");
			}
			else {
				System.out.println("fail in round 1");
			}
			
		}
		else {
			System.out.println("fail");
		}

	}

}
