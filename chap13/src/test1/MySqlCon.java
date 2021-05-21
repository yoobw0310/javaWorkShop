package test1;

import java.sql.*;
import java.util.*;  
class Employee {
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirtstName() {
		return firtstName;
	}
	public void setFirtstName(String firtstName) {
		this.firtstName = firtstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private int empNo;
	private String firtstName;
	private String gender;
	Employee(int empNo, String firstName, String gender) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.gender = gender;
	}
}
public class MySqlCon{  
	public static void main(String args[]){
		List<Employee> emps = new ArrayList<>();
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/employees","test","1234");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT emp_no,first_name, gender From employees.employees;");  
			while(rs.next())  {
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				emps.add(new Employee(rs.getInt(1),
						rs.getString(2),
						rs.getString(3)));
			}	
				con.close();  
		}catch(Exception e){ System.out.println(e);}  
		System.out.println(emps.size();
		for(Employee e : emps) {
			System.out.println(e.getEmpNo() + "," + e.getFirstName() 
			+ "," + e.getGender());
		}
	}
	
}
