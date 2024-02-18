import java.io.*;
import java.util.*;
import java.time.*;
import java.sql.*; 
public class Trains {
    
	public static void main(String[] args)throws Exception{
	    
		Scanner sc=new Scanner(System.in);
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        
		int line,ds1,ds2,ddd=10;
		String sname;
		LocalTime l = LocalTime.now();
        Time ts = Time.valueOf(l);    
        System.out.println(ts);
		while(true) {
		System.out.println("@ WELCOME TO M-INDICATOR @");
		System.out.println("Enter Source Station:"); 
		sname=br.readLine();
		System.out.println("Select Option as: \n1.Western\n2.Harbour\n3.Central\n4.Chat\n5.Exit");
		line=sc.nextInt();
		
		if(line==5) {break;}
		switch(line) 
		{
		case 4:
		    new Login();
		    break;
		case 2:
		    new Harbour();
		    break;
		case 3:
		    new Central();
		    break;
		case 1:
		//System.out.println("Enter Source Station:");
		//sname=sc.next();
		if((sname.matches("(?i)"+"daha(.*)"))) {
		    System.out.println("To:\n1.Churchgate");
            ds1=sc.nextInt();
        
            switch(ds1) 
            {
            case 1:    
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mindic","root","");
      
            String qn3="select * from tdemodc  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' ORDER BY td";
            PreparedStatement ps1=conn.prepareStatement(qn3);
            ResultSet rs11=ps1.executeQuery("select * from tdemodc");
        
          
            while(rs11.next()) 
            {
                Time td=rs11.getTime("td");  Time td1=rs11.getTime("td1"); Time td2=rs11.getTime("td2"); Time td3=rs11.getTime("td3");
                Time td4=rs11.getTime("td4"); Time td5=rs11.getTime("td5"); Time td6=rs11.getTime("td6"); Time td7=rs11.getTime("td7");
                Time td8=rs11.getTime("td8"); Time td9=rs11.getTime("td9"); Time td10=rs11.getTime("td10"); Time td11=rs11.getTime("td11");
                Time td12=rs11.getTime("td12"); Time td13=rs11.getTime("td13"); Time t14=rs11.getTime("td14"); LocalTime loc = LocalTime.now();
                Time t1 = Time.valueOf(loc); Time td15=rs11.getTime("td15"); Time td16=rs11.getTime("td16");
            

                String x=rs11.getString("src"),x1=rs11.getString("im1"),x2=rs11.getString("im2"),x3=rs11.getString("im3"),x4=rs11.getString("im4"),x5=rs11.getString("im5"), x6=rs11.getString("im6"),x7=rs11.getString("im7"),x8=rs11.getString("im8"), x9=rs11.getString("im9"),x10=rs11.getString("im10"),x11=rs11.getString("im11"),x12=rs11.getString("im12"),x13=rs11.getString("im13"),x14=rs11.getString("im14"),x15=rs11.getString("im15");
                
                
                   if((x.matches("(?i)"+sname+"(.*)") && td.after(t1)) || (td1.after(t1)&& x1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && x2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& x3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& x4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& x5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& x6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& x7.matches("(?i)"+sname+"(.*)"))||(x8.matches("(?i)"+sname+"(.*)") && td8.after(t1))||(x9.matches("(?i)"+sname+"(.*)") && td9.after(t1))||(x10.matches("(?i)"+sname+"(.*)") && td10.after(t1))||(x11.matches("(?i)"+sname+"(.*)") && td11.after(t1))||(x12.matches("(?i)"+sname+"(.*)") && td12.after(t1))||(x13.matches("(?i)"+sname+"(.*)") && td13.after(t1))||(x14.matches("(?i)"+sname+"(.*)") && t14.after(t1))||(x15.matches("(?i)"+sname+"(.*)") && td15.after(t1))) 
                {
               
                System.out.println(rs11.getString("src")+"-"+rs11.getString("dst")+" AT "+rs11.getTime("td"));
                System.out.println(rs11.getString("src")+rs11.getTime("td")+"-->"+rs11.getString("im1")+rs11.getTime("td1")+"-->"+rs11.getString("im2")+rs11.getTime("td2")+"-->"+rs11.getString("im3")+""+rs11.getTime("td3")+"-->"+rs11.getString("im4")+""+rs11.getTime("td4")+"-->"+rs11.getString("im5")+""+rs11.getTime("td5")+"-->"+rs11.getString("im6")+rs11.getTime("td6")+"-->"+rs11.getString("im7")+rs11.getTime("td7")+"-->"+rs11.getString("td8")+rs11.getTime("td8")+"-->"+rs11.getString("im9")+""+rs11.getTime("td9")+"-->"+rs11.getString("im10")+""+rs11.getTime("td10")+"-->"+rs11.getString("im11")+""+rs11.getTime("td11")+"-->"+rs11.getString("im12")+""+rs11.getTime("td12")+"-->"+rs11.getString("im13")+""+rs11.getTime("td13")+"-->"+rs11.getString("im14")+""+rs11.getTime("td14")+"-->"+rs11.getString("im15")+""+rs11.getTime("td15")+"-->"+rs11.getString("dst")+""+rs11.getTime("td16"));
                }
             }
            
		}
		}
		else if((sname.matches("(?i)"+"vi(.*)"))||(sname.matches("(?i)"+"pal(.*)"))||(sname.matches("(?i)"+"boi(.*)"))||(sname.matches("(?i)"+"van(.*)"))||(sname.matches("(?i)"+"um(.*)"))||(sname.matches("(?i)"+"sap(.*)"))||(sname.matches("(?i)"+"kel(.*)"))||(sname.matches("(?i)"+"vai(.*)")))  //if src station is virar
		{
		    System.out.println("To:\n1.Churchgate\n2.Dahanu");
		    ds1=sc.nextInt();
		
		    switch(ds1) 
		    {
		    case 1:    
		  
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
		    
		    String q="select * from tdemo1  where src like '%"+sname+"%' ORDER BY times";
		    String qn3="select * from tdemodc  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' ORDER BY td";
		    String qn="select * from tdemovbs  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' ORDER BY tims";
		   
		    PreparedStatement psmt=conn.prepareStatement(q);
		    PreparedStatement pm=conn.prepareStatement(qn3);
		    ResultSet rs11=pm.executeQuery();
		    PreparedStatement ps1=conn.prepareStatement(qn);
		    ResultSet rs=psmt.executeQuery();
	        ResultSet rs1=ps1.executeQuery();
	       
		   while(rs.next()) 
		   {
		    Time tim=rs.getTime("times");  Time ti1=rs.getTime("tims1"); Time ti2=rs.getTime("tims2"); Time ti3=rs.getTime("tims3");
		    Time ti4=rs.getTime("tims4"); Time ti5=rs.getTime("tims5"); Time ti6=rs.getTime("tims6"); Time ti7=rs.getTime("tims7");
		    Time ti8=rs.getTime("tims8"); Time ti9=rs.getTime("tims9"); Time ti10=rs.getTime("tims10"); Time ti11=rs.getTime("tims11");
		    Time ti12=rs.getTime("tims12"); Time ti13=rs.getTime("tims13"); Time ti14=rs.getTime("tims14");	    
		    
		    LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);	
            String y=rs.getString("src"),y1=rs.getString("ims1"),y2=rs.getString("ims2"),y3=rs.getString("ims3"),y4=rs.getString("ims4"),       y5=rs.getString("ims5"), y6=rs.getString("ims6"),y7=rs.getString("ims7"),y8=rs.getString("ims8"), y9=rs.getString("ims9"),y10=rs.getString("ims10"),y11=rs.getString("ims11"),y12=rs.getString("ims12"),y13=rs.getString("ims13"),y14=rs.getString("ims14");    
            
            if((y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && ti8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && ti9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && ti10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && ti11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && ti12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && ti13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && ti14.after(t1))) 
            {
            System.out.println(rs.getString("src")+"-"+rs.getString("ims14")+" AT "+rs.getTime("times"));
            System.out.println(rs.getString("src")+rs.getTime("times")+"-->"+rs.getString("ims1")+rs.getTime("tims1")+"-->"+rs.getString("ims2")+rs.getTime("tims2")+"-->"+rs.getString("ims3")+rs.getTime("tims3")+"-->"+rs.getString("ims4")+rs.getTime("tims4")+"-->"+rs.getString("ims5")+rs.getTime("tims5")+"-->"+rs.getString("ims6")+rs.getTime("tims6")+"-->"+rs.getString("ims7")+rs.getTime("tims7")+"-->"+rs.getString("ims8")+rs.getTime("tims8")+"-->"+rs.getString("ims9")+rs.getTime("tims9")+"-->"+rs.getString("ims10")+rs.getTime("tims10")+"-->"+rs.getString("ims11")+rs.getTime("tims11")+"-->"+rs.getString("ims12")+rs.getTime("tims12")+"-->"+rs.getString("ims13")+rs.getTime("tims13")+"-->"+rs.getString("ims14")+rs.getTime("tims14"));
			
		   }
            }
		   while(rs11.next()) 
           {
               Time td=rs11.getTime("td");  Time td1=rs11.getTime("td1"); Time td2=rs11.getTime("td2"); Time td3=rs11.getTime("td3");
               Time td4=rs11.getTime("td4"); Time td5=rs11.getTime("td5"); Time td6=rs11.getTime("td6"); Time td7=rs11.getTime("td7");
               Time td8=rs11.getTime("td8"); Time td9=rs11.getTime("td9"); Time td10=rs11.getTime("td10"); Time td11=rs11.getTime("td11");
               Time td12=rs11.getTime("td12"); Time td13=rs11.getTime("td13"); Time t14=rs11.getTime("td14"); LocalTime loc = LocalTime.now();
               Time t1 = Time.valueOf(loc); Time td15=rs11.getTime("td15"); Time td16=rs11.getTime("td16");
           

               String x=rs11.getString("src"),x1=rs11.getString("im1"),x2=rs11.getString("im2"),x3=rs11.getString("im3"),x4=rs11.getString("im4"),x5=rs11.getString("im5"), x6=rs11.getString("im6"),x7=rs11.getString("im7"),x8=rs11.getString("im8"), x9=rs11.getString("im9"),x10=rs11.getString("im10"),x11=rs11.getString("im11"),x12=rs11.getString("im12"),x13=rs11.getString("im13"),x14=rs11.getString("im14"),x15=rs11.getString("im15");
               
               
                  if((x.matches("(?i)"+sname+"(.*)") && td.after(t1)) || (td1.after(t1)&& x1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && x2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& x3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& x4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& x5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& x6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& x7.matches("(?i)"+sname+"(.*)"))||(x8.matches("(?i)"+sname+"(.*)") && td8.after(t1))||(x9.matches("(?i)"+sname+"(.*)") && td9.after(t1))||(x10.matches("(?i)"+sname+"(.*)") && td10.after(t1))||(x11.matches("(?i)"+sname+"(.*)") && td11.after(t1))||(x12.matches("(?i)"+sname+"(.*)") && td12.after(t1))||(x13.matches("(?i)"+sname+"(.*)") && td13.after(t1))||(x14.matches("(?i)"+sname+"(.*)") && t14.after(t1))||(x15.matches("(?i)"+sname+"(.*)") && td15.after(t1))) 
               {
              
               System.out.println(rs11.getString("src")+"-"+rs11.getString("dst")+" AT "+rs11.getTime("td"));
               System.out.println(rs11.getString("src")+rs11.getTime("td")+"-->"+rs11.getString("im1")+rs11.getTime("td1")+"-->"+rs11.getString("im2")+rs11.getTime("td2")+"-->"+rs11.getString("im3")+""+rs11.getTime("td3")+"-->"+rs11.getString("im4")+""+rs11.getTime("td4")+"-->"+rs11.getString("im5")+""+rs11.getTime("td5")+"-->"+rs11.getString("im6")+rs11.getTime("td6")+"-->"+rs11.getString("im7")+rs11.getTime("td7")+"-->"+rs11.getString("td8")+rs11.getTime("td8")+"-->"+rs11.getString("im9")+""+rs11.getTime("td9")+"-->"+rs11.getString("im10")+""+rs11.getTime("td10")+"-->"+rs11.getString("im11")+""+rs11.getTime("td11")+"-->"+rs11.getString("im12")+""+rs11.getTime("td12")+"-->"+rs11.getString("im13")+""+rs11.getTime("td13")+"-->"+rs11.getString("im14")+""+rs11.getTime("td14")+"-->"+rs11.getString("im15")+""+rs11.getTime("td15")+"-->"+rs11.getString("dst")+""+rs11.getTime("td16"));
               }
            }
		   while(rs1.next()) //borivali slow
           {
                       
            Time tms=rs1.getTime("tims");  Time ti121=rs1.getTime("ts1"); Time ti21=rs1.getTime("ts2"); Time ti31=rs1.getTime("ts3");
            Time ti41=rs1.getTime("ts4"); Time ti51=rs1.getTime("ts5"); Time ti61=rs1.getTime("ts6"); Time ti71=rs1.getTime("ts7");
            
            
            LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);    
            
            String p=rs1.getString("src"),p1=rs1.getString("im1"),p2=rs1.getString("im2"),p3=rs1.getString("im3"),p4=rs1.getString("im4"),p5=rs1.getString("im5"), p6=rs1.getString("im6"),p7=rs1.getString("dst"); 
            if((p.matches("(?i)"+sname+"(.*)") && tms.after(t1))|| (p1.matches("(?i)"+sname+"(.*)") && ti121.after(t1))||(p2.matches("(?i)"+sname+"(.*)") && ti21.after(t1))||(p3.matches("(?i)"+sname+"(.*)") && ti31.after(t1))||(p4.matches("(?i)"+sname+"(.*)") && ti41.after(t1))||(p5.matches("(?i)"+sname+"(.*)") && ti51.after(t1))||(p6.matches("(?i)"+sname+"(.*)") && ti61.after(t1)))
            {
                System.out.println(rs1.getString("src")+"-"+rs1.getString("dst")+" AT "+rs1.getTime("tims"));
             System.out.println(rs1.getString("src")+rs1.getTime("tims")+"-->"+rs1.getString("im1")+rs1.getTime("ts1")+"-->"+rs1.getString("im2")+rs1.getTime("ts2")+"-->"+rs1.getString("im3")+rs1.getTime("ts3")+"-->"+rs1.getString("im4")+rs1.getTime("ts4")+"-->"+rs1.getString("im5")+rs1.getTime("ts5")+"-->"+rs1.getString("im6")+rs1.getTime("ts6")+"-->"+rs1.getString("dst")+rs1.getTime("ts7"));
             
                
            }
            }
		   break;
		    case 2:
		        Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conns=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
	             String q1="select * from routsd1  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' ORDER BY tim1";
	             String q22="select * from  tdemocdhn  where (src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%') ORDER BY tm";
	             PreparedStatement pts=conns.prepareStatement(q22);
	             ResultSet rs4=pts.executeQuery();
	             PreparedStatement pq1=conns.prepareStatement(q1);
	            ResultSet rs21=pq1.executeQuery("Select * from routsd1");
	            while(rs4.next()) 
	            {
	                Time tim=rs4.getTime("tm");    Time tm1=rs4.getTime("tm1"); Time tm2=rs4.getTime("tm2");
	                Time tm3=rs4.getTime("tm3"); Time tm4=rs4.getTime("tm4"); Time tm5=rs4.getTime("tm5"); Time tm6=rs4.getTime("tm6");
	                Time tm7=rs4.getTime("tm7"); Time tm8=rs4.getTime("tm8");Time tm9=rs4.getTime("tm9"); Time tm10=rs4.getTime("tm10");
	                Time tm11=rs4.getTime("tm11"); Time tm12=rs4.getTime("tm12"); Time tm13=rs4.getTime("tm13"); Time tm14=rs4.getTime("tm14"); Time tm15=rs4.getTime("tm15"); Time tm16=rs4.getTime("tm16"); Time tm17=rs4.getTime("tm17"); Time tm18=rs4.getTime("tm18"); Time tm19=rs4.getTime("tm19"); Time tm20=rs4.getTime("tm20"); Time tm21=rs4.getTime("tm21"); Time tm22=rs4.getTime("tm22");
	                Time tm141=rs4.getTime("tm14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
	                String c=rs4.getString("src"),c1=rs4.getString("im1"),c2=rs4.getString("im2"),c3=rs4.getString("im3"),c4=rs4.getString("im4"), c5=rs4.getString("im5"), c6=rs4.getString("im6"),c7=rs4.getString("im7"),c8=rs4.getString("im8"), c9=rs4.getString("im9"),c10=rs4.getString("im10"),c11=rs4.getString("im11"),c12=rs4.getString("im12"),c13=rs4.getString("im13"),c14=rs4.getString("im14"),c15=rs4.getString("im15"),c16=rs4.getString("im16"),c17=rs4.getString("im17"),c18=rs4.getString("im18"),c19=rs4.getString("im19"),c20=rs4.getString("im20"),c21=rs4.getString("im21"),c22=rs4.getString("dst");
	                if((c.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tm1.after(t1)&& c1.matches("(?i)"+sname+"(.*)")) || (tm2.after(t1) && c2.matches("(?i)"+sname+"(.*)")) || (tm3.after(t1)&& c3.matches("(?i)"+sname+"(.*)")) ||(tm4.after(t1)&& c4.matches("(?i)"+sname+"(.*)")) || (tm5.after(t1)&& c5.matches("(?i)"+sname+"(.*)")) || (tm6.after(t1)&& c6.matches("(?i)"+sname+"(.*)")) || (tm7.after(t1)&& c7.matches("(?i)"+sname+"(.*)")) || (tm8.after(t1)&& c8.matches("(?i)"+sname+"(.*)")) ||(tm9.after(t1)&& c9.matches("(?i)"+sname+"(.*)")) || (tm10.after(t1)&& c10.matches("(?i)"+sname+"(.*)")) ||(tm11.after(t1)&& c11.matches("(?i)"+sname+"(.*)")) ||(tm12.after(t1)&& c12.matches("(?i)"+sname+"(.*)")) ||(tm13.after(t1)&& c13.matches("(?i)"+sname+"(.*)"))||(tm141.after(t1)&& c14.matches("(?i)"+sname+"(.*)"))||(tm15.after(t1)&& c15.matches("(?i)"+sname+"(.*)"))||(tm16.after(t1)&& c16.matches("(?i)"+sname+"(.*)"))||(tm17.after(t1)&& c17.matches("(?i)"+sname+"(.*)"))||(tm18.after(t1)&& c18.matches("(?i)"+sname+"(.*)"))||(tm19.after(t1)&& c19.matches("(?i)"+sname+"(.*)"))||(tm20.after(t1)&& c20.matches("(?i)"+sname+"(.*)"))||(tm21.after(t1)&& c21.matches("(?i)"+sname+"(.*)")))
	                {
	                   
	                    System.out.println(rs4.getString("src")+"-"+rs4.getString("dst")+" AT "+rs4.getTime("tm"));
	                    System.out.println(rs4.getString("src")+rs4.getTime("tm")+"-->"+rs4.getString("im1")+rs4.getTime("tm1")+"-->"+rs4.getString("im2")+rs4.getTime("tm2")+"-->"+rs4.getString("im3")+""+rs4.getTime("tm3")+"-->"+rs4.getString("im4")+""+rs4.getTime("tm4")+"-->"+rs4.getString("im5")+""+rs4.getTime("tm5")+"-->"+rs4.getString("im6")+rs4.getTime("tm6")+"-->"+rs4.getString("im7")+rs4.getTime("tm7")+"-->"+rs4.getString("im8")+rs4.getTime("tm8")+"-->"+rs4.getString("im9")+""+rs4.getTime("tm9")+"-->"+rs4.getString("im10")+""+rs4.getTime("tm10")+"-->"+rs4.getString("im11")+""+rs4.getTime("tm11")+"-->"+rs4.getString("im12")+""+rs4.getTime("tm12")+"-->"+rs4.getString("im13")+""+rs4.getTime("tm13")+"-->"+rs4.getString("im14")+""+rs4.getTime("tm14")+"-->"+rs4.getString("im15")+""+rs4.getTime("tm15")+"-->"+rs4.getString("im16")+""+rs4.getTime("tm16")+"-->"+rs4.getString("im17")+""+rs4.getTime("tm17")+"-->"+rs4.getString("im18")+""+rs4.getTime("tm18")+"-->"+rs4.getString("im19")+""+rs4.getTime("tm19")+"-->"+rs4.getString("im20")+""+rs4.getTime("tm20")+"-->"+rs4.getString("im21")+""+rs4.getTime("tm21")+"-->"+rs4.getString("dst")+""+rs4.getTime("tm22"));
	                 }
	            }
	                 
	            
	            while(rs21.next()) 
	            {
	                Time tim1=rs21.getTime("tim1"); Time td1=rs21.getTime("td1"); Time td2=rs21.getTime("td2"); Time td3=rs21.getTime("td3");
	                Time td4=rs21.getTime("td4"); Time td5=rs21.getTime("td5"); Time td6=rs21.getTime("td6"); Time td7=rs21.getTime("td7");
	                LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc); 
	                String z=rs21.getString("src"); String z1=rs21.getString("im1"); String z2=rs21.getString("im2"); String z3=rs21.getString("im3"); String z4=rs21.getString("im4"); String z5=rs21.getString("im5"); String z6=rs21.getString("im6"); String z7=rs21.getString("im7");
	                
	                if((z.matches("(?i)"+sname+"(.*)") && tim1.after(t1)) || (td1.after(t1)&& z1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && z2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& z3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& z4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& z5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& z6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& z7.matches("(?i)"+sname+"(.*)"))) 
	                {
	                System.out.println(rs21.getString("src")+"-"+rs21.getString("dst")+" AT "+rs21.getTime("tim1"));
	                System.out.println(rs21.getString("src")+rs21.getTime("tim1")+"-->"+rs21.getString("im1")+rs21.getTime("td1")+"-->"+rs21.getString("im2")+rs21.getTime("td2")+"-->"+rs21.getString("im3")+rs21.getTime("td3")+"-->"+rs21.getString("im4")+rs21.getTime("td4")+"-->"+rs21.getString("im5")+rs21.getTime("td5")+"-->"+rs21.getString("im6")+rs21.getTime("td6")+"-->"+rs21.getString("im7")+rs21.getTime("td7")+"-->"+rs21.getString("dst")+rs21.getTime("td8"));
	                 }
	                }
	            break;
	         }
		 }  
		
/*otv*/		else if((sname.matches("(?i)"+"va(.*)"))||(sname.matches("(?i)"+"nai(.*)"))||(sname.matches("(?i)"+"bh(.*)"))||(sname.matches("(?i)"+"mi(.*)"))||(sname.matches("(?i)"+"dahi(.*)"))||(sname.matches("(?i)"+"bo(.*)"))||(sname.matches("(?i)"+"an(.*)"))||(sname.matches("(?i)"+"ba(.*)"))||(sname.matches("(?i)"+"da(.*)"))||(sname.matches("(?i)"+"gr(.*)"))||(sname.matches("(?i)"+"ma(.*)"))||(sname.matches("(?i)"+"mu(.*)"))||(sname.matches("(?i)"+"charn(.*)"))||(sname.matches("(?i)"+"maha(.*)"))||(sname.matches("(?i)"+"lo(.*)"))||(sname.matches("(?i)"+"pr(.*)"))||(sname.matches("(?i)"+"mat(.*)"))||(sname.matches("(?i)"+"mahim(.*)"))||(sname.matches("(?i)"+"kha(.*)"))||(sname.matches("(?i)"+"vi(.*)"))||(sname.matches("(?i)"+"jo(.*)"))||(sname.matches("(?i)"+"go(.*)"))||(sname.matches("(?i)"+"ram(.*)"))||(sname.matches("(?i)"+"mal(.*)"))||(sname.matches("(?i)"+"kan(.*)"))/*(y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)")) || (ti8.after(t1)&& y8.matches("(?i)"+sname+"(.*)")) ||(ti9.after(t1)&& y9.matches("(?i)"+sname+"(.*)")) || (ti10.after(t1)&& y10.matches("(?i)"+sname+"(.*)")) ||(ti11.after(t1)&& y11.matches("(?i)"+sname+"(.*)")) ||(ti12.after(t1)&& y12.matches("(?i)"+sname+"(.*)")) ||(ti13.after(t1)&& y13.matches("(?i)"+sname+"(.*)"))*/)  //if src not virar
		{
		    
		    
		    System.out.println("To:\n1.Churchgate\n2.Virar/Dahanu");
	        ds2=sc.nextInt();
	        
	        switch(ds2) {
	        case 1:    
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
	        String q="select * from tdemo1  where (src like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%' OR ims14 like '%"+sname+"%') ORDER BY times";
	        String qn1="select * from tdemovbs  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' ORDER BY tims";
	        String qn3="select * from tdemodc  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' ORDER BY td";
            
	        PreparedStatement pt=conn.prepareStatement(q);
	        PreparedStatement pmt=conn.prepareStatement(qn1);
	        PreparedStatement pss=conn.prepareStatement(qn3);
            
	        ResultSet rs=pt.executeQuery();
	        ResultSet rs11=pss.executeQuery();
	        ResultSet rs41=pmt.executeQuery();
	        while(rs.next()) 
	        {
	            Time tim=rs.getTime("times");  Time ti1=rs.getTime("tims1"); Time ti2=rs.getTime("tims2"); Time ti3=rs.getTime("tims3");
	            Time ti4=rs.getTime("tims4"); Time ti5=rs.getTime("tims5"); Time ti6=rs.getTime("tims6"); Time ti7=rs.getTime("tims7");
	            Time ti8=rs.getTime("tims8"); Time ti9=rs.getTime("tims9"); Time ti10=rs.getTime("tims10"); Time ti11=rs.getTime("tims11");
	            Time ti12=rs.getTime("tims12"); Time ti13=rs.getTime("tims13"); Time ti14=rs.getTime("tims14"); LocalTime loc = LocalTime.now();
	            Time t1 = Time.valueOf(loc);
		    

	            String y=rs.getString("src"),y1=rs.getString("ims1"),y2=rs.getString("ims2"),y3=rs.getString("ims3"),y4=rs.getString("ims4"),       y5=rs.getString("ims5"), y6=rs.getString("ims6"),y7=rs.getString("ims7"),y8=rs.getString("ims8"), y9=rs.getString("ims9"),y10=rs.getString("ims10"),y11=rs.getString("ims11"),y12=rs.getString("ims12"),y13=rs.getString("ims13"),y14=rs.getString("ims14");
	            
	            
	               if((y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && ti8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && ti9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && ti10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && ti11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && ti12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && ti13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && ti14.after(t1))) 
	            {
			   
			    System.out.println(rs.getString("src")+"-"+rs.getString("ims14")+" AT "+rs.getTime("times"));
		        System.out.println(rs.getString("src")+rs.getTime("times")+"-->"+rs.getString("ims1")+rs.getTime("tims1")+"-->"+rs.getString("ims2")+rs.getTime("tims2")+"-->"+rs.getString("ims3")+""+rs.getTime("tims3")+"-->"+rs.getString("ims4")+""+rs.getTime("tims4")+"-->"+rs.getString("ims5")+""+rs.getTime("tims5")+"-->"+rs.getString("ims6")+rs.getTime("tims6")+"-->"+rs.getString("ims7")+rs.getTime("tims7")+"-->"+rs.getString("ims8")+rs.getTime("tims8")+"-->"+rs.getString("ims9")+""+rs.getTime("tims9")+"-->"+rs.getString("ims10")+""+rs.getTime("tims10")+"-->"+rs.getString("ims11")+""+rs.getTime("tims11")+"-->"+rs.getString("ims12")+""+rs.getTime("tims12")+"-->"+rs.getString("ims13")+""+rs.getTime("tims13")+"-->"+rs.getString("ims14")+""+rs.getTime("tims14"));
	            }
	         }
	        while(rs11.next()) 
            {
                Time td=rs11.getTime("td");  Time td1=rs11.getTime("td1"); Time td2=rs11.getTime("td2"); Time td3=rs11.getTime("td3");
                Time td4=rs11.getTime("td4"); Time td5=rs11.getTime("td5"); Time td6=rs11.getTime("td6"); Time td7=rs11.getTime("td7");
                Time td8=rs11.getTime("td8"); Time td9=rs11.getTime("td9"); Time td10=rs11.getTime("td10"); Time td11=rs11.getTime("td11");
                Time td12=rs11.getTime("td12"); Time td13=rs11.getTime("td13"); Time t14=rs11.getTime("td14"); LocalTime loc = LocalTime.now();
                Time t1 = Time.valueOf(loc); Time td15=rs11.getTime("td15"); Time td16=rs11.getTime("td16");
            

                String x=rs11.getString("src"),x1=rs11.getString("im1"),x2=rs11.getString("im2"),x3=rs11.getString("im3"),x4=rs11.getString("im4"),x5=rs11.getString("im5"), x6=rs11.getString("im6"),x7=rs11.getString("im7"),x8=rs11.getString("im8"), x9=rs11.getString("im9"),x10=rs11.getString("im10"),x11=rs11.getString("im11"),x12=rs11.getString("im12"),x13=rs11.getString("im13"),x14=rs11.getString("im14"),x15=rs11.getString("im15");
                
                
                   if((x.matches("(?i)"+sname+"(.*)") && td.after(t1)) || (td1.after(t1)&& x1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && x2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& x3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& x4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& x5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& x6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& x7.matches("(?i)"+sname+"(.*)"))||(x8.matches("(?i)"+sname+"(.*)") && td8.after(t1))||(x9.matches("(?i)"+sname+"(.*)") && td9.after(t1))||(x10.matches("(?i)"+sname+"(.*)") && td10.after(t1))||(x11.matches("(?i)"+sname+"(.*)") && td11.after(t1))||(x12.matches("(?i)"+sname+"(.*)") && td12.after(t1))||(x13.matches("(?i)"+sname+"(.*)") && td13.after(t1))||(x14.matches("(?i)"+sname+"(.*)") && t14.after(t1))||(x15.matches("(?i)"+sname+"(.*)") && td15.after(t1))) 
                {
               
                System.out.println(rs11.getString("src")+"-"+rs11.getString("dst")+" AT "+rs11.getTime("td"));
                System.out.println(rs11.getString("src")+rs11.getTime("td")+"-->"+rs11.getString("im1")+rs11.getTime("td1")+"-->"+rs11.getString("im2")+rs11.getTime("td2")+"-->"+rs11.getString("im3")+""+rs11.getTime("td3")+"-->"+rs11.getString("im4")+""+rs11.getTime("td4")+"-->"+rs11.getString("im5")+""+rs11.getTime("td5")+"-->"+rs11.getString("im6")+rs11.getTime("td6")+"-->"+rs11.getString("im7")+rs11.getTime("td7")+"-->"+rs11.getString("td8")+rs11.getTime("td8")+"-->"+rs11.getString("im9")+""+rs11.getTime("td9")+"-->"+rs11.getString("im10")+""+rs11.getTime("td10")+"-->"+rs11.getString("im11")+""+rs11.getTime("td11")+"-->"+rs11.getString("im12")+""+rs11.getTime("td12")+"-->"+rs11.getString("im13")+""+rs11.getTime("td13")+"-->"+rs11.getString("im14")+""+rs11.getTime("td14")+"-->"+rs11.getString("im15")+""+rs11.getTime("td15")+"-->"+rs11.getString("dst")+""+rs11.getTime("td16"));
                }
             }
	        while(rs41.next()) //borivali slow
	           {
	                       
	            Time tms=rs41.getTime("tims");  Time ti121=rs41.getTime("ts1"); Time ti21=rs41.getTime("ts2"); Time ti31=rs41.getTime("ts3");
	            Time ti41=rs41.getTime("ts4"); Time ti51=rs41.getTime("ts5"); Time ti61=rs41.getTime("ts6"); Time ti71=rs41.getTime("ts7");
	            
	            
	            LocalTime loc = LocalTime.now();
	            Time t1 = Time.valueOf(loc);    
	            
	            String p=rs41.getString("src"),p1=rs41.getString("im1"),p2=rs41.getString("im2"),p3=rs41.getString("im3"),p4=rs41.getString("im4"),p5=rs41.getString("im5"), p6=rs41.getString("im6"),p7=rs41.getString("dst");	             
	            
	            if((p.matches("(?i)"+sname+"(.*)") && tms.after(t1))|| (p1.matches("(?i)"+sname+"(.*)") && ti121.after(t1))||(p2.matches("(?i)"+sname+"(.*)") && ti21.after(t1))||(p3.matches("(?i)"+sname+"(.*)") && ti31.after(t1))||(p4.matches("(?i)"+sname+"(.*)") && ti41.after(t1))||(p5.matches("(?i)"+sname+"(.*)") && ti51.after(t1))||(p6.matches("(?i)"+sname+"(.*)") && ti61.after(t1)))
	            {
	                System.out.println(rs41.getString("src")+"-"+rs41.getString("dst")+" AT "+rs41.getTime("tims"));
	             System.out.println(rs41.getString("src")+rs41.getTime("tims")+"-->"+rs41.getString("im1")+rs41.getTime("ts1")+"-->"+rs41.getString("im2")+rs41.getTime("ts2")+"-->"+rs41.getString("im3")+rs41.getTime("ts3")+"-->"+rs41.getString("im4")+rs41.getTime("ts4")+"-->"+rs41.getString("im5")+rs41.getTime("ts5")+"-->"+rs41.getString("im6")+rs41.getTime("ts6")+"-->"+rs41.getString("dst")+rs41.getTime("ts7"));
	             
	                
	            }
	            }
	        
		break;
		
	        case 2: //c to v
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
        String q1="select * from tdemocv  where (sst like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR i6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%') ORDER BY tims";
        String q2="select * from tdemocb  where sr like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%' OR ims14 like '%"+sname+"%' OR ims15 like '%"+sname+"%' OR ims16 like '%"+sname+"%' OR ims17 like '%"+sname+"%' OR ims18 like '%"+sname+"%' OR ims19 like '%"+sname+"%' OR ims20 like '%"+sname+"%' ORDER BY tm";
        String q12="select * from  tdemocdhn  where (src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%') ORDER BY tm";
        PreparedStatement pt1=conn2.prepareStatement(q1);
        
        PreparedStatement pst=conn2.prepareStatement(q2);
        PreparedStatement ps=conn2.prepareStatement(q12);
        
        ResultSet rs3=pt1.executeQuery();
        ResultSet rs31=pst.executeQuery();
        ResultSet rs4=ps.executeQuery();
        while(rs3.next()) 
        {
            Time tim=rs3.getTime("tims");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
            Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
            Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
            Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
            Time tc14=rs3.getTime("tc14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
            String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("i6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("dst");
            if((b.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)")))
            {
               
                System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
                System.out.println(rs3.getString("sst")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("i6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc14"));
             }
        }
        while(rs31.next()) //c to borivali slow
        {
            Time tm=rs31.getTime("tm"); Time ta1=rs31.getTime("ta1"); Time ta2=rs31.getTime("ta2");
            Time ta3=rs31.getTime("ta3"); Time ta4=rs31.getTime("ta4"); Time ta5=rs31.getTime("ta5"); Time ta6=rs31.getTime("ta6");
            Time ta7=rs31.getTime("ta7"); Time ta8=rs31.getTime("ta8");Time ta9=rs31.getTime("ta9"); Time ta10=rs31.getTime("ta10");
            Time ta11=rs31.getTime("ta11"); Time ta12=rs31.getTime("ta12"); Time ta13=rs31.getTime("ta13");
            Time ta15=rs31.getTime("ta15"); 
            Time ta16=rs31.getTime("ta16"); Time ta17=rs31.getTime("ta17");
            Time ta18=rs31.getTime("ta18"); Time ta19=rs31.getTime("ta19"); Time ta20=rs31.getTime("ta20");
            
            Time ta14=rs31.getTime("ta14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
            String b=rs31.getString("sr"),b1=rs31.getString("ims1"),b2=rs31.getString("ims2"),b3=rs31.getString("ims3"),b4=rs31.getString("ims4"), b5=rs31.getString("ims5"), b6=rs31.getString("ims6"),b7=rs31.getString("ims7"),b8=rs31.getString("ims8"), b9=rs31.getString("ims9"),b10=rs31.getString("ims10"),b11=rs31.getString("ims11"),b12=rs31.getString("ims12"),b13=rs31.getString("ims13"),b14=rs31.getString("ims14"),b15=rs31.getString("ims15"),b16=rs31.getString("ims16"),b17=rs31.getString("ims17"),b18=rs31.getString("ims18"),b19=rs31.getString("ims19"),b20=rs31.getString("ims20"),b21=rs31.getString("dst");
            if((b.matches("(?i)"+sname+"(.*)") && tm.after(t1)) || (ta1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (ta2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (ta3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(ta4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (ta5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (ta6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (ta7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (ta8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(ta9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (ta10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(ta11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(ta12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(ta13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(ta14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))|| (ta15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(ta16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(ta17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(ta18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(ta19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(ta20.after(t1)&& b20.matches("(?i)"+sname+"(.*)")))
            {
               
                System.out.println(rs31.getString("sr")+"-"+rs31.getString("dst")+" AT "+rs31.getTime("tm"));
                System.out.println(rs31.getString("sr")+rs31.getTime("tm")+"-->"+rs31.getString("ims1")+rs31.getTime("ta1")+"-->"+rs31.getString("ims2")+rs31.getTime("ta2")+"-->"+rs31.getString("ims3")+""+rs31.getTime("ta3")+"-->"+rs31.getString("ims4")+""+rs31.getTime("ta4")+"-->"+rs31.getString("ims5")+""+rs31.getTime("ta5")+"-->"+rs31.getString("ims6")+rs31.getTime("ta6")+"-->"+rs31.getString("ims7")+rs31.getTime("ta7")+"-->"+rs31.getString("ims8")+rs31.getTime("ta8")+"-->"+rs31.getString("ims9")+""+rs31.getTime("ta9")+"-->"+rs31.getString("ims10")+""+rs31.getTime("ta10")+"-->"+rs31.getString("ims11")+""+rs31.getTime("ta11")+"-->"+rs31.getString("ims12")+""+rs31.getTime("ta12")+"-->"+rs31.getString("ims13")+""+rs31.getTime("ta13")+"-->"+rs31.getString("ims14")+""+rs31.getTime("ta14")+"-->"+rs31.getString("ims15")+""+rs31.getTime("ta15")+"-->"+rs31.getString("ims15")+"-->"+rs31.getString("ims16")+""+rs31.getTime("ta16")+"-->"+rs31.getString("ims17")+""+rs31.getTime("ta17")+"-->"+rs31.getString("ims18")+""+rs31.getTime("ta18")+"-->"+rs31.getString("ims19")+""+rs31.getTime("ta19")+"-->"+rs31.getString("ims20")+""+rs31.getTime("ta20")+"-->"+rs31.getString("dst")+""+rs31.getTime("ta21"));
             }
        }
        while(rs4.next()) 
        {
            Time tim=rs4.getTime("tm");    Time tm1=rs4.getTime("tm1"); Time tm2=rs4.getTime("tm2");
            Time tm3=rs4.getTime("tm3"); Time tm4=rs4.getTime("tm4"); Time tm5=rs4.getTime("tm5"); Time tm6=rs4.getTime("tm6");
            Time tm7=rs4.getTime("tm7"); Time tm8=rs4.getTime("tm8");Time tm9=rs4.getTime("tm9"); Time tm10=rs4.getTime("tm10");
            Time tm11=rs4.getTime("tm11"); Time tm12=rs4.getTime("tm12"); Time tm13=rs4.getTime("tm13"); Time tm14=rs4.getTime("tm14"); Time tm15=rs4.getTime("tm15"); Time tm16=rs4.getTime("tm16"); Time tm17=rs4.getTime("tm17"); Time tm18=rs4.getTime("tm18"); Time tm19=rs4.getTime("tm19"); Time tm20=rs4.getTime("tm20"); Time tm21=rs4.getTime("tm21"); Time tm22=rs4.getTime("tm22");
            Time tm141=rs4.getTime("tm14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
            String c=rs4.getString("src"),c1=rs4.getString("im1"),c2=rs4.getString("im2"),c3=rs4.getString("im3"),c4=rs4.getString("im4"), c5=rs4.getString("im5"), c6=rs4.getString("im6"),c7=rs4.getString("im7"),c8=rs4.getString("im8"), c9=rs4.getString("im9"),c10=rs4.getString("im10"),c11=rs4.getString("im11"),c12=rs4.getString("im12"),c13=rs4.getString("im13"),c14=rs4.getString("im14"),c15=rs4.getString("im15"),c16=rs4.getString("im16"),c17=rs4.getString("im17"),c18=rs4.getString("im18"),c19=rs4.getString("im19"),c20=rs4.getString("im20"),c21=rs4.getString("im21"),c22=rs4.getString("dst");
            if((c.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tm1.after(t1)&& c1.matches("(?i)"+sname+"(.*)")) || (tm2.after(t1) && c2.matches("(?i)"+sname+"(.*)")) || (tm3.after(t1)&& c3.matches("(?i)"+sname+"(.*)")) ||(tm4.after(t1)&& c4.matches("(?i)"+sname+"(.*)")) || (tm5.after(t1)&& c5.matches("(?i)"+sname+"(.*)")) || (tm6.after(t1)&& c6.matches("(?i)"+sname+"(.*)")) || (tm7.after(t1)&& c7.matches("(?i)"+sname+"(.*)")) || (tm8.after(t1)&& c8.matches("(?i)"+sname+"(.*)")) ||(tm9.after(t1)&& c9.matches("(?i)"+sname+"(.*)")) || (tm10.after(t1)&& c10.matches("(?i)"+sname+"(.*)")) ||(tm11.after(t1)&& c11.matches("(?i)"+sname+"(.*)")) ||(tm12.after(t1)&& c12.matches("(?i)"+sname+"(.*)")) ||(tm13.after(t1)&& c13.matches("(?i)"+sname+"(.*)"))||(tm141.after(t1)&& c14.matches("(?i)"+sname+"(.*)"))||(tm15.after(t1)&& c15.matches("(?i)"+sname+"(.*)"))||(tm16.after(t1)&& c16.matches("(?i)"+sname+"(.*)"))||(tm17.after(t1)&& c17.matches("(?i)"+sname+"(.*)"))||(tm18.after(t1)&& c18.matches("(?i)"+sname+"(.*)"))||(tm19.after(t1)&& c19.matches("(?i)"+sname+"(.*)"))||(tm20.after(t1)&& c20.matches("(?i)"+sname+"(.*)"))||(tm21.after(t1)&& c21.matches("(?i)"+sname+"(.*)")))
            {
               
                System.out.println(rs4.getString("src")+"-"+rs4.getString("dst")+" AT "+rs4.getTime("tm"));
                System.out.println(rs4.getString("src")+rs4.getTime("tm")+"-->"+rs4.getString("im1")+rs4.getTime("tm1")+"-->"+rs4.getString("im2")+rs4.getTime("tm2")+"-->"+rs4.getString("im3")+""+rs4.getTime("tm3")+"-->"+rs4.getString("im4")+""+rs4.getTime("tm4")+"-->"+rs4.getString("im5")+""+rs4.getTime("tm5")+"-->"+rs4.getString("im6")+rs4.getTime("tm6")+"-->"+rs4.getString("im7")+rs4.getTime("tm7")+"-->"+rs4.getString("im8")+rs4.getTime("tm8")+"-->"+rs4.getString("im9")+""+rs4.getTime("tm9")+"-->"+rs4.getString("im10")+""+rs4.getTime("tm10")+"-->"+rs4.getString("im11")+""+rs4.getTime("tm11")+"-->"+rs4.getString("im12")+""+rs4.getTime("tm12")+"-->"+rs4.getString("im13")+""+rs4.getTime("tm13")+"-->"+rs4.getString("im14")+""+rs4.getTime("tm14")+"-->"+rs4.getString("im15")+""+rs4.getTime("tm15")+"-->"+rs4.getString("im16")+""+rs4.getTime("tm16")+"-->"+rs4.getString("im17")+""+rs4.getTime("tm17")+"-->"+rs4.getString("im18")+""+rs4.getTime("tm18")+"-->"+rs4.getString("im19")+""+rs4.getTime("tm19")+"-->"+rs4.getString("im20")+""+rs4.getTime("tm20")+"-->"+rs4.getString("im21")+""+rs4.getTime("tm21")+"-->"+rs4.getString("dst")+""+rs4.getTime("tm22"));
             }
        }
        break;      
		
		}}
		    
/*c to v*/                else if((sname.matches("(?i)"+"ch(.*)"))) {    
                    
                    
                    System.out.println("To:\n1.Virar/Dahanu");
                    ds1=sc.nextInt();
                    
                    switch(ds1) {
                    case 1:   /*ch to rar */ 
                  
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                    String q1="select * from tdemocv  where sst like '%"+sname+"%' ORDER BY tims";
                    PreparedStatement psmt=conn.prepareStatement(q1);
                    ResultSet rs3=psmt.executeQuery();
                    while(rs3.next()) 
                    {
                        Time tim=rs3.getTime("tims");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
                        Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
                        Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
                        Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
                        Time tc14=rs3.getTime("tc14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                        String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("i6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("dst");
                        if((b.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)")))
                        {
                           
                            System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
                            System.out.println(rs3.getString("sst")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("i6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc14"));
                         }
                    }
                    break;               
                   
                }
                    }
                    }     
			}
		}

    //public String sname;

    //public String sname;

   	
		}

