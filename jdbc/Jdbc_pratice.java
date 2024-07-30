package jdbc;
import java.sql.*;

public class Jdbc_pratice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//JDBC->java Database connectivity
		/*
		 * JDBC Steps: 1.Register the Driver 2.Get the Connection 3.Create the Statement
		 * Object 4.Execute the queries 5.Close the connection
		 * 
		 * Step1: We can register the Driver using DriverManger it provides 2 methods
		 * 1.class.forName(“drivername”) 2.DriverManger.registerDriver(driver-object)
		 * 
		 * Step2: We can establish the connection by following Connection
		 * variable_name=DriverManger.getConnection(url,username,password)
		 * 
		 * Step3: Statement stm=Variable_name.createStatement() Step4:
		 * Stm.executeUpdate(quary) / stm.excuteQuery(quary)
		 * 
		 * Step5: Variable_name.close()
		 */
		
		try {
		//step1:
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//step2:
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student" ,"root", "2472");
		
		
		//step3:
		
		Statement stm=con.createStatement();
		
		//step4:
		
		stm.executeUpdate("inster into student values(1,'chaithany')");
		
		//step5:
		con.close();
		}
		catch(Exception i) {
			System.out.println(i);
			
		}
			
		
		
		
				


	}

}
