package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Exception was 2 types
//1.checked exception(compile-time exception)->IOException(fileNotfoundException), SQLException
//2.unchecked exception(runtime exception)->indexOutOfBoundsexception,NullPointerException,ArithmeticException


public class Program1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("program started");
		int num1=10;
		int num2=0;
		int result=0;
		//to handle the java itself for checked exception we use throws key to handle compile time exception
		//below was the example
		//without throw key word the program throughs the esception
		File file=new File("C:\\Users\\saiha\\Downloads\\L05TolerantIR.ppt");
		FileInputStream fis=new FileInputStream(file);
		System.out.println(fis);
		
		
		
		
		
		
		
		try {
		result=num1/num2;
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
			System.out.println("yy"+ex.toString());
			//throw is used to stop the excution through java by throwing exception
			throw ex;
			//the code after throw key does't excute
			//System.out.println("yy"+ex.toString());
			
			
		}
		//finally is used to excuted the code even exception occur or not
		finally {
			System.out.println("finnaly block");

			
		}
		System.out.println("output is:"+result);
		System.out.println("program excution end");

	}

}
