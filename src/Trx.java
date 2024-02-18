

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Trx {

	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		String sname;
		System.out.println("enter name");
		sname=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db42","root","");
		String q="select * from student where name like '%"+sname+"%'";
		PreparedStatement psmt=conn.prepareStatement(q);
		ResultSet rs=psmt.executeQuery();
		while(rs.next()) {
			System.out.println("student id is:"+rs.getInt("roll"));
			System.out.println("student name is:"+rs.getString("name"));
			System.out.println("student dob is:"+rs.getString("dob"));
			System.out.println("student contact is:"+rs.getString("contact"));
			System.out.println("student email is:"+rs.getString("email"));
			
		}
	}

}
