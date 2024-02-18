import java.util.*;
import java.time.*;
import java.sql.*; 
public class Harbour {
	public Harbour()throws Exception{
		Scanner sc=new Scanner(System.in);
		int ds1,ds2;
		String sname;
		//LocalTime l = LocalTime.now();
        //Time ts = Time.valueOf(l);    		
	System.out.println("Enter Source Station:");
	sname=sc.next();
	//Trains t=new Trains();
		//int tp=t.ddd;
		//String sname=t.sname;
		//System.out.println(ddd);
/*pn-cst d*/		if((sname.matches("(?i)"+"pa(.*)")))  //if src station is panvel
		{
		    System.out.println("To:\n1.CSTM\n2.Thane\n3.Andheri");
		    ds1=sc.nextInt();
		
		    switch(ds1) 
		    {
		    case 1:    
		    System.out.println("panvl");
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
		    String q="select * from tdemopc  where (sst like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%' OR ims14 like '%"+sname+"%' OR ims15 like '%"+sname+"%' OR ims16 like '%"+sname+"%' OR ims17 like '%"+sname+"%' OR ims18 like '%"+sname+"%' OR ims19 like '%"+sname+"%' OR ims20 like '%"+sname+"%' OR ims21 like '%"+sname+"%' OR ims22 like '%"+sname+"%' OR ims23 like '%"+sname+"%') ORDER BY times";
		    PreparedStatement psmt=conn.prepareStatement(q);
		    ResultSet rs=psmt.executeQuery();
		   while(rs.next()) 
		   {
		    Time tim=rs.getTime("times");  Time ti1=rs.getTime("tims1"); Time ti2=rs.getTime("tims2"); Time ti3=rs.getTime("tims3");
		    Time ti4=rs.getTime("tims4"); Time ti5=rs.getTime("tims5"); Time ti6=rs.getTime("tims6"); Time ti7=rs.getTime("tims7");
		    Time ti8=rs.getTime("tims8"); Time ti9=rs.getTime("tims9"); Time ti10=rs.getTime("tims10"); Time ti11=rs.getTime("tims11");
		    Time ti12=rs.getTime("tims12"); Time ti13=rs.getTime("tims13"); Time ti14=rs.getTime("tims14"); Time ti15=rs.getTime("tims15");
			Time ti16=rs.getTime("tims16"); Time ti17=rs.getTime("tims17"); Time ti18=rs.getTime("tims18"); Time ti19=rs.getTime("tims19");
			Time ti20=rs.getTime("tims20"); Time ti21=rs.getTime("tims21"); Time ti22=rs.getTime("tims22"); Time ti23=rs.getTime("tims23");
			Time ti24=rs.getTime("tims24");
			LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);	
            String y=rs.getString("sst"),y1=rs.getString("ims1"),y2=rs.getString("ims2"),y3=rs.getString("ims3"),y4=rs.getString("ims4"), y5=rs.getString("ims5"), y6=rs.getString("ims6"),y7=rs.getString("ims7"),y8=rs.getString("ims8"), y9=rs.getString("ims9"),y10=rs.getString("ims10"),y11=rs.getString("ims11"),y12=rs.getString("ims12"),y13=rs.getString("ims13"),y14=rs.getString("ims14"),y15=rs.getString("ims15"),y16=rs.getString("ims16"),y17=rs.getString("ims17"),y18=rs.getString("ims18"),y19=rs.getString("ims19"),y20=rs.getString("ims20"),y21=rs.getString("ims21"),y22=rs.getString("ims22"),y23=rs.getString("ims23"),y24=rs.getString("dst");
            if((y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && ti8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && ti9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && ti10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && ti11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && ti12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && ti13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && ti14.after(t1))||(y15.matches("(?i)"+sname+"(.*)") && ti15.after(t1))||(y16.matches("(?i)"+sname+"(.*)") && ti16.after(t1))||(y17.matches("(?i)"+sname+"(.*)") && ti17.after(t1))||(y18.matches("(?i)"+sname+"(.*)") && ti18.after(t1))||(y19.matches("(?i)"+sname+"(.*)") && ti19.after(t1))||(y20.matches("(?i)"+sname+"(.*)") && ti20.after(t1))||(y21.matches("(?i)"+sname+"(.*)") && ti21.after(t1))||(y22.matches("(?i)"+sname+"(.*)") && ti22.after(t1))||(y23.matches("(?i)"+sname+"(.*)") && ti23.after(t1))) 
            {
            System.out.println(rs.getString("sst")+"-"+rs.getString("dst")+" AT "+rs.getTime("times"));
            System.out.println(rs.getString("sst")+rs.getTime("times")+"-->"+rs.getString("ims1")+rs.getTime("tims1")+"-->"+rs.getString("ims2")+rs.getTime("tims2")+"-->"+rs.getString("ims3")+rs.getTime("tims3")+"-->"+rs.getString("ims4")+rs.getTime("tims4")+"-->"+rs.getString("ims5")+rs.getTime("tims5")+"-->"+rs.getString("ims6")+rs.getTime("tims6")+"-->"+rs.getString("ims7")+rs.getTime("tims7")+"-->"+rs.getString("ims8")+rs.getTime("tims8")+"-->"+rs.getString("ims9")+rs.getTime("tims9")+"-->"+rs.getString("ims10")+rs.getTime("tims10")+"-->"+rs.getString("ims11")+rs.getTime("tims11")+"-->"+rs.getString("ims12")+rs.getTime("tims12")+"-->"+rs.getString("ims13")+rs.getTime("tims13")+"-->"+rs.getString("ims14")+rs.getTime("tims14")+"-->"+rs.getString("ims15")+rs.getTime("tims15")+"-->"+rs.getString("ims16")+rs.getTime("tims16")+"-->"+rs.getString("ims17")+rs.getTime("tims17")+"-->"+rs.getString("ims18")+rs.getTime("tims18")+"-->"+rs.getString("ims19")+rs.getTime("tims19")+"-->"+rs.getString("ims20")+rs.getTime("tims20")+"-->"+rs.getString("ims21")+rs.getTime("tims21")+"-->"+rs.getString("ims22")+rs.getTime("tims22")+"-->"+rs.getString("ims23")+rs.getTime("tims23")+"-->"+rs.getString("dst")+rs.getTime("tims24"));
			
		   }}
		   break;
/*done*/		case 2:     //else if(y.equals("thane")) done {
		        Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                String q1="select * from routpa  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' ORDER BY tims";
                PreparedStatement psmt1=conn1.prepareStatement(q1);
                ResultSet rs1=psmt1.executeQuery();
                while(rs1.next()) 
                {
                    Time tim1=rs1.getTime("tims"); Time td1=rs1.getTime("td1"); Time td2=rs1.getTime("td2"); Time td3=rs1.getTime("td3");
                    Time td4=rs1.getTime("td4"); Time td5=rs1.getTime("td5"); Time td6=rs1.getTime("td6"); Time td7=rs1.getTime("td7");
                    Time td8=rs1.getTime("td8"); Time td9=rs1.getTime("td9"); Time td10=rs1.getTime("td10"); Time td11=rs1.getTime("td11");
                    Time td12=rs1.getTime("td12"); Time td13=rs1.getTime("td13"); 
                    LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc); 
                    String z=rs1.getString("src"); String z1=rs1.getString("im1"); String z2=rs1.getString("im2"); String z3=rs1.getString("im3"); String z4=rs1.getString("im4"); String z5=rs1.getString("im5"); String z6=rs1.getString("im6"); String z7=rs1.getString("im7"); String z8=rs1.getString("im8"); String z9=rs1.getString("im9"); String z10=rs1.getString("im10"); String z11=rs1.getString("im11"); String z12=rs1.getString("im12"); String z13=rs1.getString("dst");                                 
                    
                    if((z.matches("(?i)"+sname+"(.*)") && tim1.after(t1)) || (td1.after(t1)&& z1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && z2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& z3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& z4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& z5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& z6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& z7.matches("(?i)"+sname+"(.*)")) || (td8.after(t1)&& z8.matches("(?i)"+sname+"(.*)")) || (td9.after(t1)&& z9.matches("(?i)"+sname+"(.*)")) || (td10.after(t1)&& z10.matches("(?i)"+sname+"(.*)")) || (td11.after(t1)&& z11.matches("(?i)"+sname+"(.*)")) || (td12.after(t1)&& z12.matches("(?i)"+sname+"(.*)")) || (td13.after(t1)&& z13.matches("(?i)"+sname+"(.*)"))) 
                    {
                    System.out.println(rs1.getString("src")+"-"+rs1.getString("dst")+" AT "+rs1.getTime("tims"));
                    System.out.println(rs1.getString("src")+rs1.getTime("tims")+"-->"+rs1.getString("im1")+rs1.getTime("td1")+"-->"+rs1.getString("im2")+rs1.getTime("td2")+"-->"+rs1.getString("im3")+rs1.getTime("td3")+"-->"+rs1.getString("im4")+rs1.getTime("td4")+"-->"+rs1.getString("im5")+rs1.getTime("td5")+"-->"+rs1.getString("im6")+rs1.getTime("td6")+"-->"+rs1.getString("im7")+rs1.getTime("td7")+"-->"+rs1.getString("im8")+rs1.getTime("td8")+"-->"+rs1.getString("im9")+rs1.getTime("td9")+"-->"+rs1.getString("im10")+rs1.getTime("td10")+"-->"+rs1.getString("im11")+rs1.getTime("td11")+"-->"+rs1.getString("im12")+rs1.getTime("td12")+"-->"+rs1.getString("dst")+rs1.getTime("td13"));
                     }
                    }
                    break;
                case 3:  /*pn to andh done*/
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connp=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                    String qp="select * from tdempta  where src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%' OR im22 like '%"+sname+"%' OR im23 like '%"+sname+"%' ORDER BY stm";
                    PreparedStatement psmtp=connp.prepareStatement(qp);
                    ResultSet rsp=psmtp.executeQuery();
                    while(rsp.next()) 
                    {
                        Time tim1=rsp.getTime("stm"); Time td1=rsp.getTime("tm1"); Time td2=rsp.getTime("tm2"); Time td3=rsp.getTime("tm3");
                        Time td4=rsp.getTime("tm4"); Time td5=rsp.getTime("tm5"); Time td6=rsp.getTime("tm6"); Time td7=rsp.getTime("tm7");
                        Time td8=rsp.getTime("tm8"); Time td9=rsp.getTime("tm9"); Time td10=rsp.getTime("tm10"); Time td11=rsp.getTime("tm11");
                        Time td12=rsp.getTime("tm12"); Time td13=rsp.getTime("tm13"); Time td14=rsp.getTime("tm14"); Time td15=rsp.getTime("tm15"); 
                        Time td16=rsp.getTime("tm16"); Time td17=rsp.getTime("tm17"); Time td18=rsp.getTime("tm18"); Time td19=rsp.getTime("tm19");
                        Time td20=rsp.getTime("tm20"); Time td21=rsp.getTime("tm21"); Time td22=rsp.getTime("tm22"); Time td23=rsp.getTime("tm23");
                        Time td24=rsp.getTime("tm24");
                        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc); 
                        String z=rsp.getString("src"); String z1=rsp.getString("im1"); String z2=rsp.getString("im2"); String z3=rsp.getString("im3"); String z4=rsp.getString("im4"); String z5=rsp.getString("im5"); String z6=rsp.getString("im6"); String z7=rsp.getString("im7"); String z8=rsp.getString("im8"); String z9=rsp.getString("im9"); String z10=rsp.getString("im10"); String z11=rsp.getString("im11"); String z12=rsp.getString("im12"); String z14=rsp.getString("im14"); String z13=rsp.getString("im13"); String z15=rsp.getString("im15");String z16=rsp.getString("im16");String z17=rsp.getString("im17");String z18=rsp.getString("im18");String z23=rsp.getString("im23");String z24=rsp.getString("dst");String z22=rsp.getString("im22");String z21=rsp.getString("im21");String z20=rsp.getString("im20");String z19=rsp.getString("im19");                                 
                        
                        if((z.matches("(?i)"+sname+"(.*)") && tim1.after(t1)) || (td1.after(t1)&& z1.matches("(?i)"+sname+"(.*)")) || (td2.after(t1) && z2.matches("(?i)"+sname+"(.*)")) || (td3.after(t1)&& z3.matches("(?i)"+sname+"(.*)")) ||(td4.after(t1)&& z4.matches("(?i)"+sname+"(.*)")) || (td5.after(t1)&& z5.matches("(?i)"+sname+"(.*)")) || (td6.after(t1)&& z6.matches("(?i)"+sname+"(.*)")) || (td7.after(t1)&& z7.matches("(?i)"+sname+"(.*)")) || (td8.after(t1)&& z8.matches("(?i)"+sname+"(.*)")) || (td9.after(t1)&& z9.matches("(?i)"+sname+"(.*)")) || (td10.after(t1)&& z10.matches("(?i)"+sname+"(.*)")) || (td11.after(t1)&& z11.matches("(?i)"+sname+"(.*)")) || (td12.after(t1)&& z12.matches("(?i)"+sname+"(.*)")) || (td13.after(t1)&& z13.matches("(?i)"+sname+"(.*)"))|| (td14.after(t1)&& z14.matches("(?i)"+sname+"(.*)"))|| (td15.after(t1)&& z15.matches("(?i)"+sname+"(.*)"))|| (td16.after(t1)&& z16.matches("(?i)"+sname+"(.*)"))|| (td17.after(t1)&& z17.matches("(?i)"+sname+"(.*)"))|| (td18.after(t1)&& z18.matches("(?i)"+sname+"(.*)"))|| (td19.after(t1)&& z19.matches("(?i)"+sname+"(.*)"))|| (td20.after(t1)&& z20.matches("(?i)"+sname+"(.*)"))|| (td21.after(t1)&& z21.matches("(?i)"+sname+"(.*)"))|| (td22.after(t1)&& z22.matches("(?i)"+sname+"(.*)"))|| (td23.after(t1)&& z23.matches("(?i)"+sname+"(.*)"))) 
                        {
                        System.out.println(rsp.getString("src")+"-"+rsp.getString("dst")+" AT "+rsp.getTime("stm"));
                        System.out.println(rsp.getString("src")+rsp.getTime("stm")+"-->"+rsp.getString("im1")+rsp.getTime("tm1")+"-->"+rsp.getString("im2")+rsp.getTime("tm2")+"-->"+rsp.getString("im3")+rsp.getTime("tm3")+"-->"+rsp.getString("im4")+rsp.getTime("tm4")+"-->"+rsp.getString("im5")+rsp.getTime("tm5")+"-->"+rsp.getString("im6")+rsp.getTime("tm6")+"-->"+rsp.getString("im7")+rsp.getTime("tm7")+"-->"+rsp.getString("im8")+rsp.getTime("tm8")+"-->"+rsp.getString("im9")+rsp.getTime("tm9")+"-->"+rsp.getString("im10")+rsp.getTime("tm10")+"-->"+rsp.getString("im11")+rsp.getTime("tm11")+"-->"+rsp.getString("im12")+rsp.getTime("tm12")+"-->"+rsp.getString("im13")+rsp.getTime("tm13")+"-->"+rsp.getString("im14")+rsp.getTime("tm14")+"-->"+rsp.getString("im15")+rsp.getTime("tm15")+"-->"+rsp.getString("im16")+rsp.getTime("tm16")+"-->"+rsp.getString("im17")+rsp.getTime("tm17")+"-->"+rsp.getString("im18")+rsp.getTime("tm18")+"-->"+rsp.getString("im19")+rsp.getTime("tm19")+"-->"+rsp.getString("im20")+rsp.getTime("tm20")+"-->"+rsp.getString("im21")+rsp.getTime("tm21")+"-->"+rsp.getString("im22")+rsp.getTime("tm22")+"-->"+rsp.getString("im23")+rsp.getTime("tm23")+"-->"+rsp.getString("dst")+rsp.getTime("tm24"));
                         }
                        }
                        break;
                    
	                }
		 }  
		
/*other than panvel*/		else if((sname.matches("(?i)"+"khan(.*)"))||(sname.matches("(?i)"+"man(.*)"))||(sname.matches("(?i)"+"khar(.*)"))||(sname.matches("(?i)"+"be(.*)"))||(sname.matches("(?i)"+"sea(.*)"))||(sname.matches("(?i)"+"ne(.*)"))||(sname.matches("(?i)"+"jui(.*)"))||(sname.matches("(?i)"+"sanp(.*)"))||(sname.matches("(?i)"+"vas(.*)"))||(sname.matches("(?i)"+"mank(.*)"))||(sname.matches("(?i)"+"go(.*)"))||(sname.matches("(?i)"+"che(.*)"))||(sname.matches("(?i)"+"ti(.*)"))||(sname.matches("(?i)"+"ku(.*)"))||(sname.matches("(?i)"+"chun(.*)"))||(sname.matches("(?i)"+"gt(.*)"))||(sname.matches("(?i)"+"vad(.*)")))  //if src not panvl
{
    
    
    System.out.println("To:\n1.CSMT\n2.Panvel\n3.Andheri");
    ds2=sc.nextInt();
    
    switch(ds2) {
    case 1:    /*to csmt*/
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
    String q="select * from tdemopc  where (sst like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%' OR ims14 like '%"+sname+"%' OR ims15 like '%"+sname+"%' OR ims16 like '%"+sname+"%' OR ims17 like '%"+sname+"%' OR ims18 like '%"+sname+"%' OR ims19 like '%"+sname+"%' OR ims20 like '%"+sname+"%' OR ims21 like '%"+sname+"%' OR ims22 like '%"+sname+"%' OR ims23 like '%"+sname+"%') ORDER BY times";
    PreparedStatement psmt=conn.prepareStatement(q);
    ResultSet rs=psmt.executeQuery();
    while(rs.next()) 
    {
        Time tim=rs.getTime("times");  Time ti1=rs.getTime("tims1"); Time ti2=rs.getTime("tims2"); Time ti3=rs.getTime("tims3");
        Time ti4=rs.getTime("tims4"); Time ti5=rs.getTime("tims5"); Time ti6=rs.getTime("tims6"); Time ti7=rs.getTime("tims7");
        Time ti8=rs.getTime("tims8"); Time ti9=rs.getTime("tims9"); Time ti10=rs.getTime("tims10"); Time ti11=rs.getTime("tims11");
        Time ti12=rs.getTime("tims12"); Time ti13=rs.getTime("tims13"); Time ti14=rs.getTime("tims14"); Time ti15=rs.getTime("tims15");
        Time ti16=rs.getTime("tims16"); Time ti17=rs.getTime("tims17"); Time ti18=rs.getTime("tims18"); Time ti19=rs.getTime("tims19");
        Time ti20=rs.getTime("tims20"); Time ti21=rs.getTime("tims21"); Time ti22=rs.getTime("tims22"); Time ti23=rs.getTime("tims23");
        Time ti24=rs.getTime("tims24");
        LocalTime loc = LocalTime.now();
        Time t1 = Time.valueOf(loc);
    
    String y=rs.getString("sst"),y1=rs.getString("ims1"),y2=rs.getString("ims2"),y3=rs.getString("ims3"),y4=rs.getString("ims4"),y5=rs.getString("ims5"), y6=rs.getString("ims6"),y7=rs.getString("ims7"),y8=rs.getString("ims8"), y9=rs.getString("ims9"),y10=rs.getString("ims10"),y11=rs.getString("ims11"),y12=rs.getString("ims12"),y13=rs.getString("ims13"),y14=rs.getString("ims14"),y15=rs.getString("ims15"),y16=rs.getString("ims16"),y17=rs.getString("ims17"),y18=rs.getString("ims18"),y19=rs.getString("ims19"),y20=rs.getString("ims20"),y21=rs.getString("ims21"),y22=rs.getString("ims22"),y23=rs.getString("ims23"),y24=rs.getString("dst");
    
    
       if((y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && ti8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && ti9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && ti10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && ti11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && ti12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && ti13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && ti14.after(t1))||(y15.matches("(?i)"+sname+"(.*)") && ti15.after(t1))||(y16.matches("(?i)"+sname+"(.*)") && ti16.after(t1))||(y17.matches("(?i)"+sname+"(.*)") && ti17.after(t1))||(y18.matches("(?i)"+sname+"(.*)") && ti18.after(t1))||(y19.matches("(?i)"+sname+"(.*)") && ti19.after(t1))||(y20.matches("(?i)"+sname+"(.*)") && ti20.after(t1))||(y21.matches("(?i)"+sname+"(.*)") && ti21.after(t1))||(y22.matches("(?i)"+sname+"(.*)") && ti22.after(t1))||(y23.matches("(?i)"+sname+"(.*)") && ti23.after(t1))) 
    {
       
        System.out.println(rs.getString("sst")+"-"+rs.getString("dst")+" AT "+rs.getTime("times"));
        System.out.println(rs.getString("sst")+rs.getTime("times")+"-->"+rs.getString("ims1")+rs.getTime("tims1")+"-->"+rs.getString("ims2")+rs.getTime("tims2")+"-->"+rs.getString("ims3")+""+rs.getTime("tims3")+"-->"+rs.getString("ims4")+""+rs.getTime("tims4")+"-->"+rs.getString("ims5")+""+rs.getTime("tims5")+"-->"+rs.getString("ims6")+rs.getTime("tims6")+"-->"+rs.getString("ims7")+rs.getTime("tims7")+"-->"+rs.getString("ims8")+rs.getTime("tims8")+"-->"+rs.getString("ims9")+""+rs.getTime("tims9")+"-->"+rs.getString("ims10")+""+rs.getTime("tims10")+"-->"+rs.getString("ims11")+""+rs.getTime("tims11")+"-->"+rs.getString("ims12")+""+rs.getTime("tims12")+"-->"+rs.getString("ims13")+""+rs.getTime("tims13")+"-->"+rs.getString("ims14")+""+rs.getTime("tims14")+"-->"+rs.getString("ims15")+""+rs.getTime("tims15")+"-->"+rs.getString("ims16")+""+rs.getTime("tims16")+"-->"+rs.getString("ims17")+""+rs.getTime("tims17")+"-->"+rs.getString("ims18")+""+rs.getTime("tims18")+"-->"+rs.getString("ims19")+""+rs.getTime("tims19")+"-->"+rs.getString("ims20")+""+rs.getTime("tims20")+"-->"+rs.getString("ims21")+""+rs.getTime("tims21")+"-->"+rs.getString("ims22")+""+rs.getTime("tims22")+"-->"+rs.getString("ims23")+""+rs.getTime("tims23")+"-->"+rs.getString("dst")+""+rs.getTime("tims24"));
    }}
break;
		case 2:
		
            System.out.println(sname);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
            String q1="select * from tdemocp  where (sst like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%' OR im22 like '%"+sname+"%' OR im23 like '%"+sname+"%') ORDER BY tims";
            PreparedStatement psmt2=conn2.prepareStatement(q1);
            ResultSet rs3=psmt2.executeQuery();
            while(rs3.next()) 
            {
                Time tim=rs3.getTime("tims");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
                Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
                Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
                Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
                Time tc14=rs3.getTime("tc14"); Time tc15=rs3.getTime("tc15"); Time tc16=rs3.getTime("tc16"); Time tc17=rs3.getTime("tc17");
                Time tc18=rs3.getTime("tc18"); Time tc19=rs3.getTime("tc19"); Time tc20=rs3.getTime("tc20"); Time tc21=rs3.getTime("tc21");
                Time tc22=rs3.getTime("tc22"); Time tc23=rs3.getTime("tc23");
                 
                LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("im14"),b15=rs3.getString("im15"),b16=rs3.getString("im16"),b17=rs3.getString("im17"),b18=rs3.getString("im18"),b19=rs3.getString("im19"),b20=rs3.getString("im20"),b21=rs3.getString("im21"),b22=rs3.getString("im22"),b23=rs3.getString("im23"),b24=rs3.getString("dst");
                if((b.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(tc14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))||(tc15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(tc16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(tc17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(tc18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(tc19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(tc20.after(t1)&& b20.matches("(?i)"+sname+"(.*)"))||(tc21.after(t1)&& b21.matches("(?i)"+sname+"(.*)"))||(tc22.after(t1)&& b22.matches("(?i)"+sname+"(.*)"))||(tc23.after(t1)&& b23.matches("(?i)"+sname+"(.*)")))
                {
                   
                    System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
                    System.out.println(rs3.getString("sst")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("im6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("im14")+""+rs3.getTime("tc14")+"-->"+rs3.getString("im15")+""+rs3.getTime("tc15")+"-->"+rs3.getString("im16")+""+rs3.getTime("tc16")+"-->"+rs3.getString("im17")+""+rs3.getTime("tc17")+"-->"+rs3.getString("im18")+""+rs3.getTime("tc18")+"-->"+rs3.getString("im19")+""+rs3.getTime("tc19")+"-->"+rs3.getString("im20")+""+rs3.getTime("tc20")+"-->"+rs3.getString("im21")+""+rs3.getTime("tc21")+"-->"+rs3.getString("im22")+""+rs3.getTime("tc22")+"-->"+rs3.getString("im23")+""+rs3.getTime("tc23")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc24"));
                 }
            }
            break; 
					case 3://to andheri
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn4=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                    String q2="select * from  tdemocdhn  where (src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%') ORDER BY tm";
                    PreparedStatement psmt4=conn4.prepareStatement(q2);
                    ResultSet rs4=psmt4.executeQuery();
                    while(rs4.next()) 
                    {
                        Time tim=rs4.getTime("tm");    Time tm1=rs4.getTime("tm1"); Time tm2=rs4.getTime("tm2");
                        Time tm3=rs4.getTime("tm3"); Time tm4=rs4.getTime("tm4"); Time tm5=rs4.getTime("tm5"); Time tm6=rs4.getTime("tm6");
                        Time tm7=rs4.getTime("tm7"); Time tm8=rs4.getTime("tm8");Time tm9=rs4.getTime("tm9"); Time tm10=rs4.getTime("tm10");
                        Time tm11=rs4.getTime("tm11"); Time tm12=rs4.getTime("tm12"); Time tm13=rs4.getTime("tm13"); Time tm14=rs4.getTime("tm14"); Time tm15=rs4.getTime("tm15"); Time tm16=rs4.getTime("tm16"); Time tm17=rs4.getTime("tm17"); Time tm18=rs4.getTime("tm18"); Time tm19=rs4.getTime("tm19"); Time tm20=rs4.getTime("tm20"); Time tm21=rs4.getTime("tm21"); Time tm22=rs4.getTime("tm22");
                        Time tm142=rs4.getTime("tm14"); LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                        String c=rs4.getString("src"),c1=rs4.getString("im1"),c2=rs4.getString("im2"),c3=rs4.getString("im3"),c4=rs4.getString("im4"), c5=rs4.getString("im5"), c6=rs4.getString("im6"),c7=rs4.getString("im7"),c8=rs4.getString("im8"), c9=rs4.getString("im9"),c10=rs4.getString("im10"),c11=rs4.getString("im11"),c12=rs4.getString("im12"),c13=rs4.getString("im13"),c14=rs4.getString("im14"),c15=rs4.getString("im15"),c16=rs4.getString("im16"),c17=rs4.getString("im17"),c18=rs4.getString("im18"),c19=rs4.getString("im19"),c20=rs4.getString("im20"),c21=rs4.getString("im21"),c22=rs4.getString("dst");
                        if((c.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tm1.after(t1)&& c1.matches("(?i)"+sname+"(.*)")) || (tm2.after(t1) && c2.matches("(?i)"+sname+"(.*)")) || (tm3.after(t1)&& c3.matches("(?i)"+sname+"(.*)")) ||(tm4.after(t1)&& c4.matches("(?i)"+sname+"(.*)")) || (tm5.after(t1)&& c5.matches("(?i)"+sname+"(.*)")) || (tm6.after(t1)&& c6.matches("(?i)"+sname+"(.*)")) || (tm7.after(t1)&& c7.matches("(?i)"+sname+"(.*)")) || (tm8.after(t1)&& c8.matches("(?i)"+sname+"(.*)")) ||(tm9.after(t1)&& c9.matches("(?i)"+sname+"(.*)")) || (tm10.after(t1)&& c10.matches("(?i)"+sname+"(.*)")) ||(tm11.after(t1)&& c11.matches("(?i)"+sname+"(.*)")) ||(tm12.after(t1)&& c12.matches("(?i)"+sname+"(.*)")) ||(tm13.after(t1)&& c13.matches("(?i)"+sname+"(.*)"))||(tm142.after(t1)&& c14.matches("(?i)"+sname+"(.*)"))||(tm15.after(t1)&& c15.matches("(?i)"+sname+"(.*)"))||(tm16.after(t1)&& c16.matches("(?i)"+sname+"(.*)"))||(tm17.after(t1)&& c17.matches("(?i)"+sname+"(.*)"))||(tm18.after(t1)&& c18.matches("(?i)"+sname+"(.*)"))||(tm19.after(t1)&& c19.matches("(?i)"+sname+"(.*)"))||(tm20.after(t1)&& c20.matches("(?i)"+sname+"(.*)"))||(tm21.after(t1)&& c21.matches("(?i)"+sname+"(.*)")))
                        {
                           
                            System.out.println(rs4.getString("src")+"-"+rs4.getString("dst")+" AT "+rs4.getTime("tm"));
                            System.out.println(rs4.getString("src")+rs4.getTime("tm")+"-->"+rs4.getString("im1")+rs4.getTime("tm1")+"-->"+rs4.getString("im2")+rs4.getTime("tm2")+"-->"+rs4.getString("im3")+""+rs4.getTime("tm3")+"-->"+rs4.getString("im4")+""+rs4.getTime("tm4")+"-->"+rs4.getString("im5")+""+rs4.getTime("tm5")+"-->"+rs4.getString("im6")+rs4.getTime("tm6")+"-->"+rs4.getString("im7")+rs4.getTime("tm7")+"-->"+rs4.getString("im8")+rs4.getTime("tm8")+"-->"+rs4.getString("im9")+""+rs4.getTime("tm9")+"-->"+rs4.getString("im10")+""+rs4.getTime("tm10")+"-->"+rs4.getString("im11")+""+rs4.getTime("tm11")+"-->"+rs4.getString("im12")+""+rs4.getTime("tm12")+"-->"+rs4.getString("im13")+""+rs4.getTime("tm13")+"-->"+rs4.getString("im14")+""+rs4.getTime("tm14")+"-->"+rs4.getString("im15")+""+rs4.getTime("tm15")+"-->"+rs4.getString("im16")+""+rs4.getTime("tm16")+"-->"+rs4.getString("im17")+""+rs4.getTime("tm17")+"-->"+rs4.getString("im18")+""+rs4.getTime("tm18")+"-->"+rs4.getString("im19")+""+rs4.getTime("tm19")+"-->"+rs4.getString("im20")+""+rs4.getTime("tm20")+"-->"+rs4.getString("im21")+""+rs4.getTime("tm21")+"-->"+rs4.getString("dst")+""+rs4.getTime("tm22"));
                         }
                    }
						
					break;			
			}}
else if((sname.matches("(?i)"+"sew(.*)"))||(sname.matches("(?i)"+"co(.*)"))||(sname.matches("(?i)"+"re(.*)"))||(sname.matches("(?i)"+"do(.*)"))||(sname.matches("(?i)"+"sand(.*)"))||(sname.matches("(?i)"+"mas(.*)")))
{   
    System.out.println("To:\n1.CSMT\n2.Panvel/Andheri"); //add 
    ds2=sc.nextInt();           
    switch(ds2) {
        case 1:   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
        String q="select * from tdemopc  where (sst like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%' OR ims14 like '%"+sname+"%' OR ims15 like '%"+sname+"%' OR ims16 like '%"+sname+"%' OR ims17 like '%"+sname+"%' OR ims18 like '%"+sname+"%' OR ims19 like '%"+sname+"%' OR ims20 like '%"+sname+"%' OR ims21 like '%"+sname+"%' OR ims22 like '%"+sname+"%' OR ims23 like '%"+sname+"%') ORDER BY times";
        PreparedStatement psmt=conn.prepareStatement(q);
        ResultSet rs=psmt.executeQuery();
        while(rs.next()) 
        {
            Time tim=rs.getTime("times");  Time ti1=rs.getTime("tims1"); Time ti2=rs.getTime("tims2"); Time ti3=rs.getTime("tims3");
            Time ti4=rs.getTime("tims4"); Time ti5=rs.getTime("tims5"); Time ti6=rs.getTime("tims6"); Time ti7=rs.getTime("tims7");
            Time ti8=rs.getTime("tims8"); Time ti9=rs.getTime("tims9"); Time ti10=rs.getTime("tims10"); Time ti11=rs.getTime("tims11");
            Time ti12=rs.getTime("tims12"); Time ti13=rs.getTime("tims13"); Time ti14=rs.getTime("tims14"); Time ti15=rs.getTime("tims15");
            Time ti16=rs.getTime("tims16"); Time ti17=rs.getTime("tims17"); Time ti18=rs.getTime("tims18"); Time ti19=rs.getTime("tims19");
            Time ti20=rs.getTime("tims20"); Time ti21=rs.getTime("tims21"); Time ti22=rs.getTime("tims22"); Time ti23=rs.getTime("tims23");
            Time ti24=rs.getTime("tims24");
            LocalTime loc = LocalTime.now();
            Time t1 = Time.valueOf(loc);

   String y=rs.getString("src"),y1=rs.getString("ims1"),y2=rs.getString("ims2"),y3=rs.getString("ims3"),y4=rs.getString("ims4"),y5=rs.getString("ims5"), y6=rs.getString("ims6"),y7=rs.getString("ims7"),y8=rs.getString("ims8"), y9=rs.getString("ims9"),y10=rs.getString("ims10"),y11=rs.getString("ims11"),y12=rs.getString("ims12"),y13=rs.getString("ims13"),y14=rs.getString("ims14"),y15=rs.getString("ims15"),y16=rs.getString("ims16"),y17=rs.getString("ims17"),y18=rs.getString("ims18"),y19=rs.getString("ims19"),y20=rs.getString("ims20"),y21=rs.getString("ims21"),y22=rs.getString("ims22"),y23=rs.getString("ims23"),y24=rs.getString("dst");
   if((y.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (ti1.after(t1)&& y1.matches("(?i)"+sname+"(.*)")) || (ti2.after(t1) && y2.matches("(?i)"+sname+"(.*)")) || (ti3.after(t1)&& y3.matches("(?i)"+sname+"(.*)")) ||(ti4.after(t1)&& y4.matches("(?i)"+sname+"(.*)")) || (ti5.after(t1)&& y5.matches("(?i)"+sname+"(.*)")) || (ti6.after(t1)&& y6.matches("(?i)"+sname+"(.*)")) || (ti7.after(t1)&& y7.matches("(?i)"+sname+"(.*)"))||(y8.matches("(?i)"+sname+"(.*)") && ti8.after(t1))||(y9.matches("(?i)"+sname+"(.*)") && ti9.after(t1))||(y10.matches("(?i)"+sname+"(.*)") && ti10.after(t1))||(y11.matches("(?i)"+sname+"(.*)") && ti11.after(t1))||(y12.matches("(?i)"+sname+"(.*)") && ti12.after(t1))||(y13.matches("(?i)"+sname+"(.*)") && ti13.after(t1))||(y14.matches("(?i)"+sname+"(.*)") && ti14.after(t1))||(y15.matches("(?i)"+sname+"(.*)") && ti15.after(t1))||(y16.matches("(?i)"+sname+"(.*)") && ti16.after(t1))||(y17.matches("(?i)"+sname+"(.*)") && ti17.after(t1))||(y18.matches("(?i)"+sname+"(.*)") && ti18.after(t1))||(y19.matches("(?i)"+sname+"(.*)") && ti19.after(t1))||(y20.matches("(?i)"+sname+"(.*)") && ti20.after(t1))||(y21.matches("(?i)"+sname+"(.*)") && ti21.after(t1))||(y22.matches("(?i)"+sname+"(.*)") && ti22.after(t1))||(y23.matches("(?i)"+sname+"(.*)") && ti23.after(t1))) 
   {
    System.out.println(rs.getString("sst")+"-"+rs.getString("dst")+" AT "+rs.getTime("times"));
    System.out.println(rs.getString("sst")+rs.getTime("times")+"-->"+rs.getString("ims1")+rs.getTime("tims1")+"-->"+rs.getString("ims2")+rs.getTime("tims2")+"-->"+rs.getString("ims3")+""+rs.getTime("tims3")+"-->"+rs.getString("ims4")+""+rs.getTime("tims4")+"-->"+rs.getString("ims5")+""+rs.getTime("tims5")+"-->"+rs.getString("ims6")+rs.getTime("tims6")+"-->"+rs.getString("ims7")+rs.getTime("tims7")+"-->"+rs.getString("ims8")+rs.getTime("tims8")+"-->"+rs.getString("ims9")+""+rs.getTime("tims9")+"-->"+rs.getString("ims10")+""+rs.getTime("tims10")+"-->"+rs.getString("ims11")+""+rs.getTime("tims11")+"-->"+rs.getString("ims12")+""+rs.getTime("tims12")+"-->"+rs.getString("ims13")+""+rs.getTime("tims13")+"-->"+rs.getString("ims14")+""+rs.getTime("tims14")+"-->"+rs.getString("ims15")+""+rs.getTime("tims15")+"-->"+rs.getString("ims16")+""+rs.getTime("tims16")+"-->"+rs.getString("ims17")+""+rs.getTime("tims17")+"-->"+rs.getString("ims18")+""+rs.getTime("tims18")+"-->"+rs.getString("ims19")+""+rs.getTime("tims19")+"-->"+rs.getString("ims20")+""+rs.getTime("tims20")+"-->"+rs.getString("ims21")+""+rs.getTime("tims21")+"-->"+rs.getString("ims22")+""+rs.getTime("tims22")+"-->"+rs.getString("ims23")+""+rs.getTime("tims23")+"-->"+rs.getString("dst")+""+rs.getTime("tims24"));
   }}
break;
    case 2: //oto andheri/pnvl
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connd=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
    String q1="select * from tdemocp  where (sst like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%' OR im22 like '%"+sname+"%' OR im23 like '%"+sname+"%') ORDER BY tims";
    String qa="select * from tdemcta  where (src like '%"+sname+"%' OR ims1 like '%"+sname+"%' OR ims2 like '%"+sname+"%' OR ims3 like '%"+sname+"%' OR ims4 like '%"+sname+"%' OR ims5 like '%"+sname+"%' OR ims6 like '%"+sname+"%' OR ims7 like '%"+sname+"%' OR ims8 like '%"+sname+"%' OR ims9 like '%"+sname+"%' OR ims10 like '%"+sname+"%' OR ims11 like '%"+sname+"%' OR ims12 like '%"+sname+"%' OR ims13 like '%"+sname+"%') ORDER BY st";
    
    PreparedStatement psm=connd.prepareStatement(q1);
    PreparedStatement psa=connd.prepareStatement(qa);
    
    ResultSet rs3=psm.executeQuery();
    ResultSet rs33=psa.executeQuery();
    
    while(rs3.next()) 
    {
        Time tim=rs3.getTime("tims");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
        Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
        Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
        Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
        Time tc14=rs3.getTime("tc14"); Time tc15=rs3.getTime("tc15"); Time tc16=rs3.getTime("tc16"); Time tc17=rs3.getTime("tc17");
        Time tc18=rs3.getTime("tc18"); Time tc19=rs3.getTime("tc19"); Time tc20=rs3.getTime("tc20"); Time tc21=rs3.getTime("tc21");
        Time tc22=rs3.getTime("tc22"); Time tc123=rs3.getTime("tc23");
         
        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
        String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("im14"),b15=rs3.getString("im15"),b16=rs3.getString("im16"),b17=rs3.getString("im17"),b18=rs3.getString("im18"),b19=rs3.getString("im19"),b20=rs3.getString("im20"),b21=rs3.getString("im21"),b22=rs3.getString("im22"),b23=rs3.getString("im23"),b24=rs3.getString("dst");
        if((b.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(tc14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))||(tc15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(tc16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(tc17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(tc18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(tc19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(tc20.after(t1)&& b20.matches("(?i)"+sname+"(.*)"))||(tc21.after(t1)&& b21.matches("(?i)"+sname+"(.*)"))||(tc22.after(t1)&& b22.matches("(?i)"+sname+"(.*)"))||(tc123.after(t1)&& b23.matches("(?i)"+sname+"(.*)")))
        {
           
            System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
            System.out.println(rs3.getString("sst")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("im6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("im14")+""+rs3.getTime("tc14")+"-->"+rs3.getString("im15")+""+rs3.getTime("tc15")+"-->"+rs3.getString("im16")+""+rs3.getTime("tc16")+"-->"+rs3.getString("im17")+""+rs3.getTime("tc17")+"-->"+rs3.getString("im18")+""+rs3.getTime("tc18")+"-->"+rs3.getString("im19")+""+rs3.getTime("tc19")+"-->"+rs3.getString("im20")+""+rs3.getTime("tc20")+"-->"+rs3.getString("im21")+""+rs3.getTime("tc21")+"-->"+rs3.getString("im22")+""+rs3.getTime("tc22")+"-->"+rs3.getString("im23")+""+rs3.getTime("tc23")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc24"));
         }
    }
    while(rs33.next()) 
    {
        Time st=rs33.getTime("st");    Time tc1=rs33.getTime("ts1"); Time tc2=rs33.getTime("ts2");
        Time tc3=rs33.getTime("ts3"); Time tc4=rs33.getTime("ts4"); Time tc5=rs33.getTime("ts5"); Time tc6=rs33.getTime("ts6");
        Time tc7=rs33.getTime("ts7"); Time tc8=rs33.getTime("ts8");Time tc9=rs33.getTime("ts9"); Time tc10=rs33.getTime("ts10");
        Time tc11=rs33.getTime("ts11"); Time tc12=rs33.getTime("ts12"); Time tc13=rs33.getTime("ts13"); 
      
         
        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
        String b=rs33.getString("src"),b1=rs33.getString("ims1"),b2=rs33.getString("ims2"),b3=rs33.getString("ims3"),b4=rs33.getString("ims4"), b5=rs33.getString("ims5"), b6=rs33.getString("ims6"),b7=rs33.getString("ims7"),b8=rs33.getString("ims8"), b9=rs33.getString("ims9"),b10=rs33.getString("ims10"),b11=rs33.getString("ims11"),b12=rs33.getString("ims12"),b13=rs33.getString("ims13"),b14=rs33.getString("dst");
        if((b.matches("(?i)"+sname+"(.*)") && st.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)")))
        {
           
            System.out.println(rs33.getString("src")+"-"+rs33.getString("dst")+" AT "+rs33.getTime("st"));
            System.out.println(rs33.getString("src")+rs33.getTime("st")+"-->"+rs33.getString("ims1")+rs33.getTime("tc1")+"-->"+rs33.getString("ims2")+rs33.getTime("tc2")+"-->"+rs33.getString("ims3")+""+rs33.getTime("tc3")+"-->"+rs33.getString("ims4")+""+rs33.getTime("tc4")+"-->"+rs33.getString("ims5")+""+rs33.getTime("tc5")+"-->"+rs33.getString("ims6")+rs33.getTime("tc6")+"-->"+rs33.getString("ims7")+rs33.getTime("tc7")+"-->"+rs33.getString("ims8")+rs33.getTime("tc8")+"-->"+rs33.getString("ims9")+""+rs33.getTime("tc9")+"-->"+rs33.getString("ims10")+""+rs33.getTime("tc10")+"-->"+rs33.getString("ims11")+""+rs33.getTime("tc11")+"-->"+rs33.getString("ims12")+""+rs33.getTime("tc12")+"-->"+rs33.getString("ims13")+""+rs33.getTime("tc13")+"-->"+rs33.getString("dst")+""+rs33.getTime("tc14"));                    }
    }
    
    break;  
  }}
		    
/*csmt to pnvl done*/ else if((sname.matches("(?i)"+"cs(.*)"))) {    
                    
                    //csmt to pnvl
                    System.out.println("To:\n1.Panvel");
                    ds1=sc.nextInt();
                    switch(ds1) {
                    case 1:    
                    System.out.println("hi");
                    System.out.println(sname);
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
                    String q1="select * from tdemocp  where (sst like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%' OR im13 like '%"+sname+"%' OR im14 like '%"+sname+"%' OR im15 like '%"+sname+"%' OR im16 like '%"+sname+"%' OR im17 like '%"+sname+"%' OR im18 like '%"+sname+"%' OR im19 like '%"+sname+"%' OR im20 like '%"+sname+"%' OR im21 like '%"+sname+"%' OR im22 like '%"+sname+"%' OR im23 like '%"+sname+"%') ORDER BY tims";
                    PreparedStatement psmt=conn.prepareStatement(q1);
                    ResultSet rs3=psmt.executeQuery();
                    while(rs3.next()) 
                    {
                        Time tim=rs3.getTime("tims");    Time tc1=rs3.getTime("tc1"); Time tc2=rs3.getTime("tc2");
                        Time tc3=rs3.getTime("tc3"); Time tc4=rs3.getTime("tc4"); Time tc5=rs3.getTime("tc5"); Time tc6=rs3.getTime("tc6");
                        Time tc7=rs3.getTime("tc7"); Time tc8=rs3.getTime("tc8");Time tc9=rs3.getTime("tc9"); Time tc10=rs3.getTime("tc10");
                        Time tc11=rs3.getTime("tc11"); Time tc12=rs3.getTime("tc12"); Time tc13=rs3.getTime("tc13"); 
                        Time tc14=rs3.getTime("tc14"); Time tc15=rs3.getTime("tc15"); Time tc16=rs3.getTime("tc16"); Time tc17=rs3.getTime("tc17");
                        Time tc18=rs3.getTime("tc18"); Time tc19=rs3.getTime("tc19"); Time tc20=rs3.getTime("tc20"); Time tc21=rs3.getTime("tc21");
                        Time tc22=rs3.getTime("tc22"); Time tc23=rs3.getTime("tc23");
                         
                        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
                        String b=rs3.getString("sst"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"), b5=rs3.getString("im5"), b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("im13"),b14=rs3.getString("im14"),b15=rs3.getString("im15"),b16=rs3.getString("im16"),b17=rs3.getString("im17"),b18=rs3.getString("im18"),b19=rs3.getString("im19"),b20=rs3.getString("im20"),b21=rs3.getString("im21"),b22=rs3.getString("im22"),b23=rs3.getString("im23"),b24=rs3.getString("dst");
                        if((b.matches("(?i)"+sname+"(.*)") && tim.after(t1)) || (tc1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tc2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tc3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tc4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tc5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tc6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tc7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tc8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tc9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tc10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tc11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tc12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")) ||(tc13.after(t1)&& b13.matches("(?i)"+sname+"(.*)"))||(tc14.after(t1)&& b14.matches("(?i)"+sname+"(.*)"))||(tc15.after(t1)&& b15.matches("(?i)"+sname+"(.*)"))||(tc16.after(t1)&& b16.matches("(?i)"+sname+"(.*)"))||(tc17.after(t1)&& b17.matches("(?i)"+sname+"(.*)"))||(tc18.after(t1)&& b18.matches("(?i)"+sname+"(.*)"))||(tc19.after(t1)&& b19.matches("(?i)"+sname+"(.*)"))||(tc20.after(t1)&& b20.matches("(?i)"+sname+"(.*)"))||(tc21.after(t1)&& b21.matches("(?i)"+sname+"(.*)"))||(tc22.after(t1)&& b22.matches("(?i)"+sname+"(.*)"))||(tc23.after(t1)&& b23.matches("(?i)"+sname+"(.*)")))
                        {
                           
                            System.out.println(rs3.getString("sst")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
                            System.out.println(rs3.getString("sst")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tc1")+"-->"+rs3.getString("im2")+rs3.getTime("tc2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tc3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tc4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tc5")+"-->"+rs3.getString("im6")+rs3.getTime("tc6")+"-->"+rs3.getString("im7")+rs3.getTime("tc7")+"-->"+rs3.getString("im8")+rs3.getTime("tc8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tc9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tc10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tc11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tc12")+"-->"+rs3.getString("im13")+""+rs3.getTime("tc13")+"-->"+rs3.getString("im14")+""+rs3.getTime("tc14")+"-->"+rs3.getString("im15")+""+rs3.getTime("tc15")+"-->"+rs3.getString("im16")+""+rs3.getTime("tc16")+"-->"+rs3.getString("im17")+""+rs3.getTime("tc17")+"-->"+rs3.getString("im18")+""+rs3.getTime("tc18")+"-->"+rs3.getString("im19")+""+rs3.getTime("tc19")+"-->"+rs3.getString("im20")+""+rs3.getTime("tc20")+"-->"+rs3.getString("im21")+""+rs3.getTime("tc21")+"-->"+rs3.getString("im22")+""+rs3.getTime("tc22")+"-->"+rs3.getString("im23")+""+rs3.getTime("tc23")+"-->"+rs3.getString("dst")+""+rs3.getTime("tc24"));
                         }
                    }
                    break;             
                   
                }
                    }
/*t to p dn*/else if((sname.matches("(?i)"+"th(.*)"))) {    
    //thane to panvel
    System.out.println("To:\n1.Panvel");
    ds1=sc.nextInt();
    
    switch(ds1) {
    case 1:    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindic","root","");
    String q1="select * from tdemtp  where (src like '%"+sname+"%' OR im1 like '%"+sname+"%' OR im2 like '%"+sname+"%' OR im3 like '%"+sname+"%' OR im4 like '%"+sname+"%' OR im5 like '%"+sname+"%' OR im6 like '%"+sname+"%' OR im7 like '%"+sname+"%' OR im8 like '%"+sname+"%' OR im9 like '%"+sname+"%' OR im10 like '%"+sname+"%' OR im11 like '%"+sname+"%' OR im12 like '%"+sname+"%') ORDER BY tims";
    PreparedStatement psmt=conn.prepareStatement(q1);
    ResultSet rs3=psmt.executeQuery();
    while(rs3.next()) 
    {
        Time tti=rs3.getTime("tims");    Time tt1=rs3.getTime("tt1"); Time tt2=rs3.getTime("tt2");
        Time tt3=rs3.getTime("tt3"); Time tt4=rs3.getTime("tt4"); Time tt5=rs3.getTime("tt5"); Time tt6=rs3.getTime("tt6");
        Time tt7=rs3.getTime("tt7"); Time tt8=rs3.getTime("tt8");Time tt9=rs3.getTime("tt9"); Time tt10=rs3.getTime("tt10");
        Time tt11=rs3.getTime("tt11"); Time tt12=rs3.getTime("tt12"); Time tt13=rs3.getTime("tt13"); 
        
        LocalTime loc = LocalTime.now(); Time t1 = Time.valueOf(loc);    
        String b=rs3.getString("src"),b1=rs3.getString("im1"),b2=rs3.getString("im2"),b3=rs3.getString("im3"),b4=rs3.getString("im4"),b5=rs3.getString("im5"),b6=rs3.getString("im6"),b7=rs3.getString("im7"),b8=rs3.getString("im8"), b9=rs3.getString("im9"),b10=rs3.getString("im10"),b11=rs3.getString("im11"),b12=rs3.getString("im12"),b13=rs3.getString("dst");
        if((b.matches("(?i)"+sname+"(.*)") && tti.after(t1)) || (tt1.after(t1)&& b1.matches("(?i)"+sname+"(.*)")) || (tt2.after(t1) && b2.matches("(?i)"+sname+"(.*)")) || (tt3.after(t1)&& b3.matches("(?i)"+sname+"(.*)")) ||(tt4.after(t1)&& b4.matches("(?i)"+sname+"(.*)")) || (tt5.after(t1)&& b5.matches("(?i)"+sname+"(.*)")) || (tt6.after(t1)&& b6.matches("(?i)"+sname+"(.*)")) || (tt7.after(t1)&& b7.matches("(?i)"+sname+"(.*)")) || (tt8.after(t1)&& b8.matches("(?i)"+sname+"(.*)")) ||(tt9.after(t1)&& b9.matches("(?i)"+sname+"(.*)")) || (tt10.after(t1)&& b10.matches("(?i)"+sname+"(.*)")) ||(tt11.after(t1)&& b11.matches("(?i)"+sname+"(.*)")) ||(tt12.after(t1)&& b12.matches("(?i)"+sname+"(.*)")))
        {
           
            System.out.println(rs3.getString("src")+"-"+rs3.getString("dst")+" AT "+rs3.getTime("tims"));
            System.out.println(rs3.getString("src")+rs3.getTime("tims")+"-->"+rs3.getString("im1")+rs3.getTime("tt1")+"-->"+rs3.getString("im2")+rs3.getTime("tt2")+"-->"+rs3.getString("im3")+""+rs3.getTime("tt3")+"-->"+rs3.getString("im4")+""+rs3.getTime("tt4")+"-->"+rs3.getString("im5")+""+rs3.getTime("tt5")+"-->"+rs3.getString("im6")+rs3.getTime("tt6")+"-->"+rs3.getString("im7")+rs3.getTime("tt7")+"-->"+rs3.getString("im8")+rs3.getTime("tt8")+"-->"+rs3.getString("im9")+""+rs3.getTime("tt9")+"-->"+rs3.getString("im10")+""+rs3.getTime("tt10")+"-->"+rs3.getString("im11")+""+rs3.getTime("tt11")+"-->"+rs3.getString("im12")+""+rs3.getTime("tt12")+"-->"+rs3.getString("dst")+""+rs3.getTime("tt13"));
         }
    }
    break;            
   
    }}
    
		
			
		}

    private String String(String sname) {
        // TODO Auto-generated method stub
        return null;
    }
}
