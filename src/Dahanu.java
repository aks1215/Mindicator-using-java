import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalTime;

public class Dahanu {

    public Dahanu() {
        // TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
        String q1="select * from routsd  where sst like '%"+sname+"%' ORDER BY time1";
        PreparedStatement psmt1=conn1.prepareStatement(q1);
        ResultSet rs1=psmt1.executeQuery();
        while(rs1.next()) 
        {
            Time tim=rs1.getTime("time1");           
            LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);    
            String y=rs1.getString("sst");
            if(tim.after(t1)) 
            {
                
            if(y.equals("virar")) {
                System.out.println(rs1.getString("sst")+"-"+rs1.getString("dst")+" AT "+rs1.getTime("time1"));
            
                String q2="select * from routsd";
                PreparedStatement psmt2=conn1.prepareStatement(q2);
                ResultSet rs2=psmt2.executeQuery();
          
                while(rs2.next())
                {
                    Time t2=rs2.getTime("time1"); 
                    if(t2.equals(tim)) {
                    System.out.println(rs2.getString("sst")+"-->"+rs2.getString("im1")+"-->"+rs2.getString("im2")+"-->"+rs2.getString("im3")+"-->"+rs2.getString("im4")+"-->"+rs2.getString("im5")+
                            "-->"+rs2.getString("im6")+"-->"+rs2.getString("im7")+"-->"+rs2.getString("dst"));
                }
                
            }
            
            }
            break;
        }
        
        
        }
    }

}
