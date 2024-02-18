
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
class Login{
	Scanner sc=new Scanner(System.in);
	public Login()throws Exception {
	    int op;
	    String msg;
	    System.out.println("Enter Choice:\n1.SignUp\n2.SignIn\n3.Exit");
	    op=sc.nextInt();
	    while(true) {
	        
	    switch(op) {
	        case 3:break;
	        case 1:
	            System.out.println("SignUp to Start a Chat");
	            String sname,semail,spass;
	            System.out.println("enter username");
	            sname=sc.next();
	           
	            System.out.println("enter password");
	            spass=sc.next();
	                            
	        
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
	            String q="insert into login(username,passw) values('"+sname+"','"+spass+"')";
	            PreparedStatement psmt=conn.prepareStatement(q);
	            int row=psmt.executeUpdate();
	            
	        case 2:
	            Scanner sc=new Scanner(System.in);
	            String user,msgs;
	            
	            System.out.println("enter username:");
	            user=sc.next();
	           // System.out.println("enter password:");
	            //pass=sc.next();
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("Enter Message:");
	            msgs = br.readLine();
	            
                //msgs=sc.nextLine();
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
	            String qt="insert into tdemlog(user,msg) values('"+user+"','"+msgs+"')";
	            String q2="select *from tdemlog";
	            PreparedStatement p=conn1.prepareStatement(qt);
                p.executeUpdate();
                
	            PreparedStatement pt=conn1.prepareStatement(q2);
	            ResultSet rs=pt.executeQuery();
	            
	           	            
                while(rs.next()) 
                {
                    System.out.println("@"+rs.getString("user")+":"+rs.getString("msg"));     
                }
                
	            }
	            
	            
	    break;
	    }
	    
	}
	}


